parser grammar MxParser;
options {
  tokenVocab = MxLexer;
}

program: (variableDef | classDef | functionDef)* EOF;

type: Int | Bool | String | Void | Identifier;
arrayUnit: LeftBracket expression? RightBracket;
typename: type arrayUnit*;

variableConstructor: name = Identifier (Assign expression)?;
variableDef: typename variableConstructor (Comma variableConstructor)* Semicolon;
constant: Integer | Cstring | True_ | False_ | Null;

expression:
  expression LeftParenthesis parameterList2? RightParenthesis                 #expressionFunctionCall
  | expression arrayUnit+                              #expressionArrayUnit
  | expression SelfIncrement                          #expressionSufSelfIncrement
  | expression SelfDecrement                          #expressionSufSelfDecrement
  | expression Member member = Identifier             #expressionMemberVisit
  | LeftParenthesis expression RightParenthesis       #expressionBracket
  | SelfIncrement expression                          #expressionPreSelfIncrement
  | SelfDecrement expression                          #expressionPreSelfDecrement
  | Add expression                                    #expressionAdd
  | Substract expression                              #expressionSubtract
  | New type arrayUnit* (LeftParenthesis RightParenthesis)?                    #expressionNew
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
//   | expression Comma expression                       #expressionComma
  ;


arrayConstant:
  True_ | False_ | Integer | Cstring 
  | LeftBrace arrayConstant (Comma arrayConstant)* RightBrace; 



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


emptyStatement: Semicolon;
blockStatement: LeftBrace statement* RightBrace;
continueStatement: Continue Semicolon;
breakStatement: Break Semicolon;
returnStatement: Return (expression)? Semicolon;
whileStatement: While LeftParenthesis expression RightParenthesis Body = statement;
elseStatement: Else Body = statement;
ifStatement: If LeftParenthesis expression RightParenthesis Body = statement (elseStatement)?;
forStatement: For LeftParenthesis Initialization = statement? Condition = expression? Semicolon Step = expression? RightParenthesis Body = statement;
expressionStatement: expression Semicolon;


parameterList1: typename variableConstructor (Comma typename variableConstructor)*;
parameterList2: expression (Comma expression)*;
functionDef:
  typename name = Identifier LeftParenthesis parameterList1? RightParenthesis blockStatement;

classConstructor: name = Identifier LeftParenthesis RightParenthesis blockStatement;
classDef: 
  Class name = Identifier LeftBrace
    (
      variableDef
      | functionDef
      | classConstructor
    )*
  
  RightBrace Semicolon;

formatStr: FormatStrSingle | (FormatStrBegin expression (FormatStrBody expression)* FormatStrEnd);

