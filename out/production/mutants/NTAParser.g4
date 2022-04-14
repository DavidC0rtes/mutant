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
			|	UNARY expr
			|	expr ('+'|'-'|'*'|'&#8725;'|'%'|'and'|'or'|'imply'
					|'=='|'&lt;'| LESSEQ |'!='|GREATEEQ|'&gt;'|'|'|'^'|RSHIFT
					|LSHIFT|'&&'| MIN | MAX |'||') expr
			|	expr '?' expr ':' expr
			|	expr '.' IDENTIFIER
			|	expr '(' arguments ')'
			|	(MINUS|ADD)  expr
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

forLoop		:	'for' '(' expr ';' expr ';' expr ')' statement ;
iteration 	:	'for' '(' IDENTIFIER ':' type ')' statement ;
whileLoop	:	'while' '(' expr ')' statement ;
doWhileLoop	:	'do' statement 'while' '(' expr ')' ';' ;
ifStatement	:	'if' '(' expr ')' statement ('else' statement) ;
returnStmnt	:	'return' expr? ';' ;

// --------------------------- Templates ----------------------------------
template	:	'<' 'template' '>' misc* templateBody '</' 'template' '>' ;

templateBody:	(name misc*)?
				(parameter misc*)?
				(declaration misc*)?
				((location misc*) | (branchpoint misc*))+
				initRef misc*
				(transition misc*)*
				;

location	:	'<' 'location' id coord '>'
					misc* (name misc*)? (labelLoc misc*)? (commited misc*)?
				'</' 'location' '>' ;

labelLoc	:	'<' 'label' ('kind' EQUALS 'invariant') coord? '>' misc* expr '</' 'label' '>' ;

initRef		:	'<' 'init' 'ref' EQUALS STRING '/>' ;
branchpoint	:	'<' 'branchpoint' 'id' EQUALS STRING
					coord? '>' misc*
				'</' 'branchpoint' '>' ;

commited	:	'<' 'commited' '/>' ;
name		:	'<' 'name' coord? '>' anything '</' 'name' '>' ;
color       :   'color' EQUALS STRING;
coord		:	('x'|'y') '=' STRING ('x'|'y') '=' STRING ;
id			:	'id' '=' STRING ;

// Transitions

transition	:	'<' 'transition' color? '>' misc*
					source misc* target misc*
					(	labelTransit misc*

					)*
					(nail misc)*
				'</' 'transition' '>'
			;

source		:	'<' 'source' 'ref' '=' STRING '/>' ;
target		:	'<' 'target' 'ref' '=' STRING '/>' ;
labelTransit:	'<' 'label' ('kind' EQUALS ('guard'|'synchronisation'|'assignment'|'select')) coord? '>'
						misc* expr
				'</' 'label' '>'
			;

anything    :   chardata?
            	((reference | CDATA | PI | COMMENT) chardata?)* ;

// System definition
system		:	OPEN_SYSTEM (process+ misc*) (systemDecl misc*) CLOSE_SYSTEM
			;

process		:	IDENTIFIER ASSIGN IDENTIFIER '(' arguments ')' ';' ;
systemDecl	:	SYSTEMEXPR IDENTIFIER ((',' | '<') IDENTIFIER)* ';' ;

nail		:	'<' 'nail' coord '/>' ;

queries		:	'<' 'queries' '>' misc* (query misc*)* '</' 'queries' '>' ;

query		:	'<' 'query' '>' misc*
					(formula misc*)? (comment misc*)?
				'</' 'query' '>'
			;

formula		:	'<' 'formula' '>' anything '</' 'formula' '>' ;

comment		:	'<' 'comment' '>' anything '</' 'comment' '>' ;

