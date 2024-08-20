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
  expression '(' parameterList2? ')'                  #expressionFunctionCall
  | expression arrayUnit                              #expressionArrayUnit
  | expression SelfIncrement                          #expressionSufSelfIncrement
  | expression SelfDecrement                          #expressionSufSelfDecrement
  | expression Member member = Identifier             #expressionMemberVisit
  | LeftParenthesis expression RightParenthesis       #expressionBracket
  | SelfIncrement expression                          #expressionPreSelfIncrement
  | SelfDecrement expression                          #expressionPreSelfDecrement
  | Add expression                                    #expressionAdd
  | Substract expression                              #expressionSubtract
  | New type arrayUnit* ('(' ')')?                    #expressionNew
  | value = constant                                  #expressionConstant
  | This                                               #expressionThis
  | Identifier                                        #expressionIdentifier
  | BitwiseNot expression                             #expressionBitwiseNot  
  | LogicNot expression                               #expressionLogicNot
  | expression op = (Multiply | Divide | Mod) expression  #expressionArithmeticOp1
  | expression op = (Add | Substract) expression          #expressionArithmeticOp2
  | expression op = (BitwiseLeftShift | BitwiseRightShift) expression #expressionBitwiseShift
  | expression op = (Less | Greater | LessEqual | GreaterEqual) expression #expressionCompare1
  | expression op = (Equal | NotEqual) expression     #expressionCompare2
  | expression op = BitwiseAnd expression             #expressionBitwiseAnd
  | expression op = BitwiseXor expression             #expressionBitwiseXor
  | expression op = BitwiseOr expression              #expressionBitwiseOr
  | expression op = LogicAnd expression               #expressionLogicAnd
  | expression op = LogicOr expression                #expressionLogicOr
  | <assoc = right> a = expression op1 = QuestionMark b = expression op2 = Colon c = expression #expressionTrinocular
  | <assoc = right> expression Assign expression      #expressionAssign
  | expression Comma expression                       #expressionComma
  ;



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
