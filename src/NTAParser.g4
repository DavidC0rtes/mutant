/**
 * Parser grammar for UPPAAL NTA models.
 */

parser grammar NTAParser ;
options { tokenVocab=NTALexer; }

model		:	prolog? misc* nta misc* ;
prolog		:	XMLDeclOpen attribute* SPECIAL_CLOSE ;

element		:	'<' Name attribute* '>' content '</' Name '>'
			|	'<' Name attribute* '/>'
			;

content		:	chardata?
				((element | reference | CDATA | PI | COMMENT) chardata?)* ;

reference	:	EntityRef | CharRef ;

attribute	:	Name EQUALS STRING ;

chardata	:	TEXT | SEA_WS
			;

misc		:	COMMENT | PI | SEA_WS ;

nta			:	'<' 'nta' '>' misc*
					declaration misc*
					(template misc*)+
					system misc*
					(queries misc*)?
				'</' 'nta' '>' ;

declaration	:	OPEN_DECLARATION declarations* CLOSE_DECLARATION ;

declarations:	variableDecl	# VarDecl
			|	typeDecl		# TypeDeclaration
			|	function		# FunDecl
			|   chanPriority    # ChannelPriority
			;

expr		:	IDENTIFIER
			|	NAT
			|	DOT
			|	expr '[' expr ']'
			|	expr '\''
			|	'(' expr ')'
			|	expr '++' | '++' expr
			|	expr '--' | '--' expr
			|	expr ASSIGN expr
			|	(MINUS|ADD|'!'|'not') expr
			|	expr ('+'|'-'|'*'|'&#8725;'|'%'|'and'|'or'|'imply'
					|'=='|'&lt;'| LESSEQ |'!='|GREATEEQ|'&gt;'|'|'|'^'|RSHIFT
					|LSHIFT|LAND| MIN | MAX |'||') expr
			|	expr '?' expr ':' expr
			|   expr ('?'|'!')
			|	expr '.' IDENTIFIER
			|	expr '(' arguments ')'
			|	expr (MINUS|ADD) expr
			|	'forall' '(' IDENTIFIER ':' type ')' expr
			|	'exists' '(' IDENTIFIER ':' type ')' expr
			|	'sum' '(' IDENTIFIER ':' type ')' expr
			|	'deadlock' | TRUE | FALSE
			;

arguments	:	(expr (',' expr)*)? ;

variableDecl:	type variableID (',' variableID)* ';' ;

type		:	prefix? typeID ;

prefix		:	URGENT
			|	BROADCAST
			|	META
			|	CONST
			;

typeID		:	IDENTIFIER
			|	INT
			|	CLOCK
			|	CHANNEL
			|	BOOL
			|	DOUBLE
			|	INT '[' expr ',' expr ']'
			|	SCALAR '[' expr ']'
			|	STRUCT '{' fieldDecl+ '}'
			;

fieldDecl	:	type IDENTIFIER arrayDecl* (',' IDENTIFIER arrayDecl*)* ';' ;

arrayDecl	:	'[' expr ']'
			|	'[' type ']'
			;

variableID	:	IDENTIFIER (arrayDecl*) (ASSIGN initialiser)? ;

initialiser	:	expr
			|	'{' initialiser (',' initialiser)* '}'
			;

typeDecl	:	TYPEDEF type IDENTIFIER arrayDecl* (',' IDENTIFIER arrayDecl*)* ';' ;


function	:	type IDENTIFIER '(' parameters* ')' block ;

paramTag    :   OPEN_PARAMETER parameters CLOSE_PARAMETER ;

parameters	:	parameter (',' parameter)* ;

parameter	:	type BITAND? IDENTIFIER arrayDecl* ;

block		:	'{' localDecl* statement* '}' ;

localDecl	:	typeDecl | variableDecl ;

statement	:	block | SEMICOLON
			|	expr ';'
			|	forLoop
			|	iteration
			|	whileLoop
			|	doWhileLoop
			|	ifStatement
			|	returnStmnt
			;

chanPriority:   CHANNEL 'priority' (chanExpr | 'default') ((','|'&lt;') (chanExpr | 'default'))* ';' ;
chanExpr    :   IDENTIFIER
            |   chanExpr '[' expr ']'
            ;

forLoop		:	'for' '(' expr ';' expr ';' expr ')' statement ;
iteration 	:	'for' '(' IDENTIFIER ':' type ')' statement ;
whileLoop	:	'while' '(' expr ')' statement ;
doWhileLoop	:	'do' statement 'while' '(' expr ')' ';' ;
ifStatement	:	'if' '(' expr ')' statement ('else' statement)? ;
returnStmnt	:	'return' expr? ';' ;

// --------------------------- Templates ----------------------------------
template	:	'<' 'template' '>' misc* templateBody '</' 'template' '>' ;

templateBody:	(name misc*)?
				(paramTag misc*)?
				(declaration misc*)?
				((location misc*) | (branchpoint misc*))+
				initRef misc*
				(transition misc*)*
			;

location	:	'<' 'location' id coord color?'>'
					misc* (name misc*)? (labelLoc misc*)? (commited misc*)?
					(urgent misc*)?
				'</' 'location' '>' ;

labelLoc	:	OPEN_INV misc* expr CLOSE_LABEL ;

initRef		:	'<' 'init' 'ref' EQUALS STRING '/>' ;
branchpoint	:	'<' 'branchpoint' 'id' EQUALS STRING
					coord? '>' misc*
				'</' 'branchpoint' '>' ;

commited	:	'<' 'committed' '/>' ;
urgent      :   '<' URGENTTAG '/>' ;
name		:	'<' 'name' coord? '>' anything '</' 'name' '>' ;
color       :   'color' EQUALS STRING;
coord		:	('x'|'y') '=' STRING ('x'|'y') '=' STRING ;
id			:	'id' '=' STRING ;

// Transitions

transition	:	'<' 'transition' color? '>' misc*
					(source misc*) (target misc*)
					( labelUpdate misc*
					| labelSelect misc*
					| labelGuard misc*
					| labelSync misc*)*
					(nail misc)*
				'</' 'transition' '>'
			;

source		:	'<' 'source' 'ref' '=' STRING '/>' ;
target		:	'<' 'target' 'ref' '=' STRING '/>' ;

// Types of edges (selections, guards, synchronisation, updates).

labelUpdate :	OPEN_LBLTR misc* expr (',' expr)* CLOSE_LABEL ;

labelGuard  :   OPEN_GUARD misc* expr CLOSE_LABEL ;

labelSync   :   OPEN_SYNC misc* expr ('?'|'!') CLOSE_LABEL ;

labelSelect :   OPEN_SELECT misc* selectList CLOSE_LABEL ;

selectList  :   IDENTIFIER ':' type
            |   selectList ',' IDENTIFIER ':' type
            ;

anything    :   chardata?
            	((reference | CDATA | PI | COMMENT) chardata?)* ;

// System definition and Gantt Charts
system		:	OPEN_SYSTEM
                    (declarations misc*)* (process+ misc*)? (systemDecl misc*) (ganttDecl misc*)?
                CLOSE_SYSTEM
			;

process		:	IDENTIFIER ASSIGN IDENTIFIER '(' arguments ')' ';' ;

systemDecl	:	SYSTEMEXPR IDENTIFIER ((',' | '<') IDENTIFIER)* ';' ;

ganttDecl   :   'gantt' '{' .*? '}' ;

// Queries, nails and misc.
nail		:	'<' 'nail' coord '/>' ;

queries		:	'<' 'queries' '>' misc* (query misc*)* '</' 'queries' '>' ;

query		:	'<' 'query' '>' misc*
					(formula misc*)? (comment misc*)?
				'</' 'query' '>'
			;

formula		:	'<' 'formula' '>' anything '</' 'formula' '>' ;

comment		:	'<' 'comment' '>' anything '</' 'comment' '>' ;
