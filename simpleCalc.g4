grammar simpleCalc;

/* A grammar for arithmetic expressions */

start   : e=expr EOF ;

expr	: e1=expr op=MULT e2=expr # Multiplication
	| e1=expr op=ADDITION e2=expr # Addition
	| c=FLOAT     	      # Constant
	| x=ID		      # Variable
	| '(' e=expr ')'      # Parenthesis
	;
	
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;
ADDITION : '+' | '-' ;
MULT: '*' | '/';
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
