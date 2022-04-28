/**
 * Lexer grammar for UPPAAL NTA definitions.
 */
lexer grammar NTALexer;

// Default "mode": Everything outside of a tag

COMMENT			:	'<!--' .*? '-->'    ->  skip ;
CDATA			:	'<![CDATA[' .*? ']]>' ;

DTD				:	'<!' .*? '>'		->  skip ;
EntityRef		:	'&' Name ';';
CharRef			:	'&#' DIGIT+ ';'
				|	'&#x' HEXDIGIT+ ';'
				;


SEA_WS			:	(' '|'\t'|'\r'? '\n')+ ;

OPEN_DECLARATION:	'<' [ \t\r\n]* 'declaration' [ \t\r\n]* '>' -> pushMode(EXPRESSION) ;

OPEN_PARAMETER	:   '<' [ \t\r\n]* 'parameter' [ \t\r\n]* '>'   -> pushMode(EXPRESSION) ;

OPEN_GUARD		:   LBLSTART GUARD LBLCOORD [ \t\r\n]* '>'      -> pushMode(EXPRESSION) ;

OPEN_SYNC       :   LBLSTART SYNCHRONIZE LBLCOORD [ \t\r\n]* '>'-> pushMode(EXPRESSION) ;

OPEN_LBLTR      :   LBLSTART ASSIGNMENT LBLCOORD [ \t\r\n]* '>' -> pushMode(EXPRESSION) ;

OPEN_SELECT     :   LBLSTART SELECT LBLCOORD [ \t\r\n]* '>'     -> pushMode(EXPRESSION) ;

OPEN_INV        :   LBLSTART INVARIANT LBLCOORD [ \t\r\n]* '>'  -> pushMode(EXPRESSION) ;

OPEN_SYSTEM		:	'<' [ \t\r\n]* 'system' [ \t\r\n]* '>'      -> pushMode(EXPRESSION) ;

OPEN			:	'<' 				                        -> pushMode(INSIDE) ;
OPENSLASH		:	'</'				                        -> pushMode(INSIDE) ;
XMLDeclOpen		:	'<?xml' S 			                        -> pushMode(INSIDE) ;

SPECIAL_OPEN	:	'<?' Name 			                        -> more, pushMode(PROC_INSTR) ;

TEXT			:	~[<&]+ ;

fragment
LBLSTART        :   '<' [ \t\r\n]*'label' [ \t\r\n]+ 'kind' [ \t\r\n]* '=' [ \t\r\n]* ;
fragment
LBLCOORD        :   ( [ \t\r\n]* 'x' [ \t\r\n]* '=' [ \t\r\n]* '"' ('-')? DIGIT+ '"' [ \t\r\n]* Y [ \t\r\n]* '=' [ \t\r\n]* '"' ('-')? DIGIT+ '"')?
                ;

mode PROC_INSTR ;
PI				:	'?>'				->	popMode ;
IGNORE			:	.					->	more ;

// Everything inside of a tag.
mode INSIDE;

NTA				:	'nta' ;
DECLARATION		:	'declaration' ;
TEMPLATE		:	'template' ;
LOCATION		:	'location' ;
NAME			:	'name' ;
COLOR			:	'color' ;
X				:	'x' ;
Y				:	'y' ;
ID				:	'id' ;
TRANSITION		:	'transition' ;
SOURCE			:	'source' ;
TARGET			:	'target' ;
NAIL			:	'nail' ;
FORMULA			:	'formula' ;
LABEL			:	'label';
INIT			:	'init' ;
BRANCHPOINT		:	'branchpoint' ;
COMMITTED		:	'committed' ;
URGENTTAG       :   'urgent' ;
SYSTEM			:	'system' ;
QUERIES			:	'queries' ;
QUERY			:	'query' ;
QUERY_COMMENT	:	'comment' ;
// Label kinds
KIND			:	'kind' ;
INVARIANT		:	'"invariant"' ;
SYNCHRONIZE		:	'"synchronisation"' ;
GUARD			:	'"guard"' ;
ASSIGNMENT		:	'"assignment"' ;
SELECT			:	'"select"' ;

// Reference
REF				:	'ref' ;


CLOSE			:	'>'					->	popMode ;
SPECIAL_CLOSE	:	'?>'				->	popMode ;
SLASH_CLOSE		:	'/>'				->	popMode ;
//SLASH			:	'/' ;
EQUALS			:	'=' ;
STRING			:	'"' ~[<"]* '"'
				|	'\'' ~[<']* '\''
				;
Name			:	NameStartChar NameChar* ;
S				:	[ \t\r\n]			->	skip ;

fragment
HEXDIGIT		:	[a-fA-F0-9] ;

fragment
DIGIT			:	[0-9] ;

fragment
NameChar		:	NameStartChar
				|	'-' | '.' | DIGIT
				|	'\u00B7'
				|	'\u0300'..'\u036F'
				|	'\u203F'..'\u2040'
				;

fragment
NameStartChar	:	[a-zA-Z]
				|	'\u2070'..'\u218F'
				|	'\u2C00'..'\u2FEF'
				|	'\u3001'..'\uD7FF'
				|	'\uF900'..'\uFDCF'
				|	'\uFDF0'..'\uFFFD'
				;


//------------------- Everything inside of the declatarion tag ------------
mode EXPRESSION ;

BLOCKCOMMENT	:	'/*' .*? '*/'			-> skip ;
INLINECOMMENT	:	'//' ~[<\r\n]+			-> skip	;
NAT				:	[0-9]+ ;

CLOSE_DECLARATION:	'</'[ \t\r\n]* 'declaration' [ \t\r\n]* '>'	->	popMode ;

CLOSE_LABEL         :   '</' [ \t\r\n]* 'label' [ \t\r\n]* '>'      -> popMode ;

CLOSE_PARAMETER     :   '</' [ \t\r\n]* 'parameter' [ \t\r\n]* '>'  -> popMode ;

CLOSE_SYSTEM	:	'</' [ \t\r\n]* 'system' [ \t\r\n]* '>'	-> popMode ;

TRASH             :   [ \t\r\n]				-> skip ;

// Prefixes
URGENT			:	'urgent' ;
BROADCAST		:	'broadcast' ;
META			:	'meta' ;
CONST			:	'const' ;

// Atomic types
INT				:	'int' ;
CLOCK			:	'clock' ;
CHANNEL			:	'chan' ;
BOOL			:	'bool' ;
DOUBLE			:	'double' ;
SCALAR			:	'scalar' ;
STRUCT			:	'struct' ;
TYPEDEF			:	'typedef' ;
PRIORITY        :   'priority' ;
DEFAULT         :   'default' ;

// Syntactic sugar and literal expressions
APOSTROPHE		:	'\'' ;
OPEN_PARENTHESIS:	'(' ;
CLOSE_PARENTESIS:	')' ;
OPEN_BRACKET	:	'[' ;
CLOSE_BRACKET	:	']' ;

OPEN_CURLYBRACKET	:	'{' ;
CLOSE_CURLYBRACKET	:	'}' ;

DOT				:	'.' ;
COMMA			:	',' ;
COLON			:	':' ;
SEMICOLON		:	';' ;
QUESTION		:	'?'	;

INCREMENT		:	'++' ;
DECREMENT		:	'--' ;
SYSTEMEXPR      :   'system' ;
// Operations
ASSIGN			:	'='
				|	':='
				|	'+='
				| 	'-='
				| 	'*='
				| 	'/='
				| 	'%='
            	| '|=' | '&=' | '^=' | '<<=' | '>>='
            	;

NOT             :   'not';
SNOT            :   '!';

ADD				:	'+' ;
MINUS			:	'-' ;

// Binary ops
LESS			:	'&lt;' ;
LESSEQ			:	'&lt;=' ;
EQ				:	'==' ;
NOTEQ			:	'!=' ;
GREATEEQ		:	'&gt;=' ;
GREATER			:	'&gt;' ;
PROD			:	'*' ;
DIV				:	'&#8725;' ; // Code for /
MOD				:	'%' ;
BITOR			:	'|' ;
BITAND			:	'&amp;' ;
XOR				:	'^' ;
RSHIFT			:	'&gt;&gt;' ;
LSHIFT			:	'&lt;&lt;' ;
LAND			:	'&amp;&amp;' ;
LOR				:	'||' ;
AND				:	'and' ;
OR				:	'or' ;
IMPLY			:	'imply' ;
MIN				:	'&lt;?' ;
MAX				:	'&gt;?' ;


// Functions
FORALL			:	'forall' ;
EXISTS			:	'exists' ;
SUM				:	'sum' ;
DEADLOCK		:	'deadlock' ;
TRUE			:	'true' ;
FALSE			:	'false' ;


// Functions
FOR				:	'for' ;
WHILE			:	'while' ;
DO				:	'do' ;
IF				:	'if' ;
ELSE			:	'else' ;
RETURN			:	'return' ;

GANTT           :   'gantt' ;

IDENTIFIER		:	[a-zA-Z_]([a-zA-Z0-9_])* ;
