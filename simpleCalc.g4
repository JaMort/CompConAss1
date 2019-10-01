grammar simpleCalc;

/* A grammar for arithmetic expressions */

start   : (s+=sequence)* (as+=assign)* e=expr EOF ;

command : a=assign  #Cassign
	| e=expr #Cexpr
	;
assign  : x=ID '=' e=expr ;
sequence : '{'(c+=command ';')+'}' ;

expr	: c=FLOAT     	      # Constant
	| x=ID       	      # Variable
	| '(' e=expr ')'      # Parenthesis
    | e1=expr op=MULT e2=expr # Multiplication
	| e1=expr op=ADDITION e2=expr # Addition
	;
	
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;
ADDITION : ('+'|'-') ;
MULT: ('*'|'/');
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
