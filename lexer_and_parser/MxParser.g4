parser grammar MxParser;
options {
  tokenVocab = MxLexer;
}

program: (variableDef | classDef | functionDef)* EOF;

type: Int | Bool | String | Void | Identifier;
arrayUnit: ('[' expression? ']')+;
typename: type arrayUnit*;

variableConstructor: New? name = Identifier ('=' expression)?;
variableDef: typename variableConstructor (',' variableConstructor)* ';';
constant: Integer | Cstring | True_ | False_ | Null;

expression:
  expression '(' parameterList2? ')'
  | expression arrayUnit
  | expression SelfIncrement
  | expression SelfDecrement
  | expression Member member = Identifier
  | LeftParenthesis expression RightParenthesis
  | SelfIncrement expression
  | SelfDecrement expression
  | Add expression
  | Substract expression
  | New type arrayUnit* ('(' ')')?          
  | constant               
  | This
  | Identifier
  | BitwiseNot expression
  | LogicNot expression
  | expression op = (Multiply | Divide | Mod) expression
  | expression op = (Add | Substract) expression
  | expression op = (BitwiseLeftShift | BitwiseRightShift) expression
  | expression op = (Less | Greater | LessEqual | GreaterEqual) expression
  | expression op = (Equal | NotEqual) expression
  | expression op = BitwiseAnd expression
  | expression op = BitwiseXor expression
  | expression op = BitwiseOr expression
  | expression op = LogicAnd expression
  | expression op = LogicOr expression
  | <assoc = right> a = expression op1 = QuestionMark b = expression op2 = Colon c = expression
  | <assoc = right> expression Assign expression
  | expression Comma expression;



statement:
  blockStatement 
  | forStatement
  | ifStatement
  | whileStatement 
  | continueStatement 
  | breakStatement
  | emptyStatement
  | returnStatement
  | expressionStatement
  | variableDef ;


emptyStatement: ';';
blockStatement: '{' statement* '}';
continueStatement: Continue ';';
breakStatement: Break ';';
returnStatement: Return (expression)? ';';
whileStatement: While '(' expression ')' Body = statement;
elseStatement: Else Body = statement;
ifStatement: If '(' expression ')' Body = statement (elseStatement)?;
forStatement: For '(' Initialization = statement? Condition = expression? ';' Step = expression? ')' Body = statement;
expressionStatement: expression ';';


parameterList1: typename variableConstructor (',' typename variableConstructor)*;
parameterList2: expression (',' expression)*;
functionDef:
  typename name = Identifier '(' parameterList1? ')' blockStatement;

classConstructor: name = Identifier '(' ')' blockStatement;
classDef: 
  Class name = Identifier '{'
    (
      variableDef
      | functionDef
      | classConstructor
    )*
  
  '}' ';';
