parser grammar MxParser;
options {
    tokenVocab = MxLexer;
}

program: (variableDef | classDef | functionDef)* EOF;

type: Int | Bool | String | Void | Identifier;
arrayUnit: ('[' Integer? ']')*;
typename: type arrayUnit*;

variableConstructor: name = Identifier ('=' expression)?;
variableDef: typename variableConstructor (',' variableConstructor)*;

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
blockStatement: '{' (statement*)? '}';
continueStatement: Continue ';';
breakStatement: Break ';';
returnStatement: Return (expression)? ';';
whileStatement: '(' expression ')' '{' (statement*)? '}';
elseStatement: Else statement;
ifStatement: If '(' expression ')' Statement (elseStatement)?;
forStatement: For '(' Initialization = statement? Condition = expressionStatement? Step = expressionStatement ')';
expressionStatement: expression ';';