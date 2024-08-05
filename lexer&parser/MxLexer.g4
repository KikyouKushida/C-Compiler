lexer grammar MxLexer;


//Basic types int Mx language
Int: 'int';
Void: 'void';
Bool: 'bool';
String: 'string';


New: 'new';
Class: 'class';
This: 'this';

True: 'true';
False: 'false';
Null: 'null';

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



