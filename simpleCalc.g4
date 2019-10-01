grammar simpleCalc;

/* A grammar for arithmetic expressions */

start   : (s+=sequence)* (as+=assign)* (cn+=conditional)* e=expr EOF ;

command : a=assign  #Cassign
	| e=expr #Cexpr
	;
assign  : x=ID '=' e=expr ;
sequence : '{'(c+=command ';')+'}' ;

conditional : 'if' '(' (c1=condition) (
'||' c2+=condition)* ')' 'then' s=sequence #ORif
		| 'if' '(' (c1=condition) ('&&' c2+=condition)* ')' 'then' s=sequence #ANDif
		| 'if' '(' (c1=condition) ('||' c2+=condition)* ')' 'then' s1=sequence 'else' s2=sequence #ORifelse
		| 'if' '(' (c1=condition) ('&&' c2+=condition)* ')' 'then' s1=sequence 'else' s2=sequence #ANDifelse
		;

condition : e1=expr '==' e2=expr #Equals 
		| e1=expr '!=' e2=expr #Notequals
		| e1=expr '>' e2=expr #Greater
		| e1=expr '>=' e2=expr #GreaterEquals
		| e1=expr '<' e2=expr #Lesser
		| e1=expr '<=' e2=expr #LesserEquals
		;

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
