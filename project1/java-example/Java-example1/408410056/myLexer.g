lexer grammar myLexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
DEFINE : '#define';
INCLUDE   : '#include';
HEADER :(LETTER)*'.h';

/*variable type */
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
DOUBLE_TYPE : 'double';
LONG_TYPE : 'long';
CONST_TYPE : 'const';
SIGNED : 'signed';
UNSIGNED : 'unsigned';
STRUCT : 'struct';

EEOF : 'EOF';
NULL : 'NULL';

/*condition */
FOR : 'for';
CONTINUE : 'continue';
WHILE_    : 'while';
SWITCH    : 'switch';
CASE      : 'case';
BREAK     : 'break';
DEFAULT   : 'default';
IF        : 'if';
ELSE_IF   : 'elseif';
ELSE      : 'else';

/*function */
RETURNN    : 'return' ;
SCANF : 'scanf('(options{greedy=false;}: .)*')';
PRINTF : 'printf('(options{greedy=false;}: .)*')'';';
SIZEOF: 'sizeof('(options{greedy=false;}: .)*')';
MAIN_     : 'main('(options{greedy=false;}: .)*')';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/ 
PLUS: '+';
MINUS: '-';
MOD: '%';
POW: '^';
SINGLE_EQ : '=';
EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
LPAREN : '(';
RPAREN : ')';
LSQUARE : '[';
RSQUARE : ']';
LCURLY : '{';
RCURLY : '}';
LESS : '<';
MOREE : '>';
SQUOTATION : '\'';
DQUOTATION : '"';
HASHTAG : '#';
SLASH : '/';
ANTI_SLASH : '\\';
AND : '&&' | '&';
OR : '||' | '|';
ASTERISK : '*';
TILDE :'~';
DOLLAR : '$';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';


DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 
STRING : '"'(options{greedy=false;}: .)*'"';

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';

NEW_LINE: '\n';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';
fragment SPECIAL : '!'..'/' | ':'..'@' | '['..'`' | '{'..'~';

WS  : (' '|'\r'|'\t')+;
