lexer grammar MxLexer;


//Basic types int Mx language
Int: 'int';
Void: 'void';
Bool: 'bool';
String: 'string';


New: 'new';
Class: 'class';
This: 'this';

True_: 'true';
False_: 'false';
Null: 'null';

For: 'for';
If: 'if';
Else: 'else';
Else_if: 'else if';
Break: 'break';
Continue: 'continue';
While: 'while';

Return: 'return';

Identifier: [a-zA-Z][a-zA-Z0-9_]*;
Integer: [1-9][0-9]* | '0';

Greater: '>';
Less: '<';
GreaterEqual: '>=';
LessEqual: '<=';
Equal: '==';
NotEqual: '!=';
BitwiseAnd: '&';
BitwiseOr: '|';
BitwiseXor: '^';
BitwiseNot: '~';
BitwiseRightShift: '>>';
BitwiseLeftShift: '<<';
LogicAnd: '&&';
LogicOr: '||';
LogicNot: '!';



Assign: '=';
SelfIncrement: '++';
SelfDecrement: '--'; 

RightParenthesis: ')';
LeftParenthesis: '(';
RightBracket: ']';
LeftBracket: '[';
RightBrace: '}';
LeftBrace: '{';


Add: '+';
Substract: '-';
Multiply: '*';
Divide: '/';
Mod: '%';

Colon: ':';
QuestionMark: '?';
Semicolon: ';';
Comma: ',';
Member: '.';

WhiteSpace: [ \t\r\n]+ -> skip;

fragment PrintableChar : [\u0020-\u007E];
fragment EscapeChar: '\\\\' | '\\n' | '\\"';
Cstring : '"' (PrintableChar | EscapeChar)*? '"';

fragment FormatStrChar:
    ~[\u0000-\u001F\u007F"\\$]
    | '\\\\'
    | '\\n'
    | '\\"'
    | '$$'
    ;


CommentLine: '//' ~[\r\n]* -> skip;
CommentBlock: '/*' .*? '*/' -> skip;
//Comment is learned from conless's repositories

FormatStrSingle: 'f"' FormatStrChar* '"';

FormatStrBegin: 'f"' FormatStrChar* '$';
FormatStrBody: '$' FormatStrChar* '$';
FormatStrEnd: '$' FormatStrChar* '"';




