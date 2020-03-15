
grammar Protocol;

/*
 * Parser Rules
 */

pc 			        : line+ EOF;

line				: KW COLON assignment
					| assignment
					| WS
					;

assignment			: (TYPE cs)+(SEMI line)*
					| var = VAR+(line)*
					| (VAR COLON cs)+(SEMI line)*
					| (VAR (STAR)* ARROW (STAR)* VAR COLON cs)
					| VAR ('weakly')* 'authenticates' VAR 'on' VAR (line)*
					| VAR 'secret' 'between' cs
					| 'where' VAR NEQ VAR
					;

cs					: ('{|' VAR '|}')*(VAR | VAR '(' cs ')' )+(',' ('{|' cs '|}')*(VAR | VAR '(' cs ')'))*(line)*
					;

/*
 * Lexer Rules
 */


KW 			: ([Pp][Rr][Oo][Tt][Oo][Cc][Oo][Ll]|[Tt][Yy][Pp][Ee][Ss]|[Kk][Nn][Oo][Ww][Ll][Ee][Dd][Gg][Ee]|[Aa][Cc][Tt][Ii][Oo][Nn][Ss]|[Gg][Oo][Aa][Ll][Ss])+;

TYPE		: ([Aa][Gg][Ee][Nn][Tt]|[Nn][Uu][Mm][Bb][Ee][Rr]|[Ff][Uu][Nn][Cc][Tt][Ii][Oo][Nn]|[Ss][Yy][Mm][Mm][Ee][Tt][Rr][Ii][Cc][_][Kk][Ee][Yy])+;



COLON: ':';
fragment COMMA: ',';
EQ: '=';
fragment DASH: '-';
STAR: '*';
NEQ: '!=';
SEMI: ';';
HASH: '#';
ARROW: '->';


VAR : [a-zA-Z]+[0-9a-zA-Z]*;

NUM : ('0'..'9')+ ( '.' ('0'..'9')+)?  ('E' ('+'|'-')? ('0'..'9')+ )? ;

COMMENT: '#' ~[\r\n]* -> skip;


WS: 				 [ \t\r\n]+ -> skip ;

