parser grammar MxParser;
options {
  tokenVocab = MxLexer;
}

program: (variableDef | classDef | functionDef)* EOF;

type: Int | Bool | String | Void | Identifier;
arrayUnit: ('[' Integer? ']')+;
typename: type arrayUnit*;

variableConstructor: name = Identifier ('=' expression)?;
variableDef: typename variableConstructor (',' variableConstructor)*;
constant: Integer | Cstring | True | False | Null;

expression:
  New type arrayUnit* ('(' ')')?          
  | constant               
  | This
  | Identifier
  | BitwiseNot expression
  | Substract expression
  | LogicNot expression
  | SelfIncrement expression
  | expression SelfIncrement
  | SelfDecrement expression
  | expression SelfDecrement
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
  | LeftParenthesis expression RightParenthesis
  
  | Identifier arrayUnit
  | expression '(' parameterList2? ')'
  | expression Member member = Identifier
  | <assoc = right> expression Assign expression;



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
whileStatement: '(' expression ')' '{' (statement*) '}';
elseStatement: Else statement;
ifStatement: If '(' expression ')' statement (elseStatement)?;
forStatement: For '(' Initialization = statement? Condition = expressionStatement? Step = expressionStatement ')';
expressionStatement: expression ';';


parameterList1: typename variableConstructor (',' typename variableConstructor)*;
parameterList2: variableConstructor (',' variableConstructor)*;
functionDef:
  typename name = Identifier '(' parameterList1? ')' blockStatement;

classConstructor: name = Identifier '(' ')' blockStatement;
classDef: 
  Class name = Identifier '{'
    (
      variableDef ';'
      | functionDef
      | classConstructor
    )*
  
  '}' ';';
