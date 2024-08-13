# Generated from ./MxParser.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MxParser import MxParser
else:
    from MxParser import MxParser

# This class defines a complete listener for a parse tree produced by MxParser.
class MxParserListener(ParseTreeListener):

    # Enter a parse tree produced by MxParser#program.
    def enterProgram(self, ctx:MxParser.ProgramContext):
        pass

    # Exit a parse tree produced by MxParser#program.
    def exitProgram(self, ctx:MxParser.ProgramContext):
        pass


    # Enter a parse tree produced by MxParser#type.
    def enterType(self, ctx:MxParser.TypeContext):
        pass

    # Exit a parse tree produced by MxParser#type.
    def exitType(self, ctx:MxParser.TypeContext):
        pass


    # Enter a parse tree produced by MxParser#arrayUnit.
    def enterArrayUnit(self, ctx:MxParser.ArrayUnitContext):
        pass

    # Exit a parse tree produced by MxParser#arrayUnit.
    def exitArrayUnit(self, ctx:MxParser.ArrayUnitContext):
        pass


    # Enter a parse tree produced by MxParser#typename.
    def enterTypename(self, ctx:MxParser.TypenameContext):
        pass

    # Exit a parse tree produced by MxParser#typename.
    def exitTypename(self, ctx:MxParser.TypenameContext):
        pass


    # Enter a parse tree produced by MxParser#variableConstructor.
    def enterVariableConstructor(self, ctx:MxParser.VariableConstructorContext):
        pass

    # Exit a parse tree produced by MxParser#variableConstructor.
    def exitVariableConstructor(self, ctx:MxParser.VariableConstructorContext):
        pass


    # Enter a parse tree produced by MxParser#variableDef.
    def enterVariableDef(self, ctx:MxParser.VariableDefContext):
        pass

    # Exit a parse tree produced by MxParser#variableDef.
    def exitVariableDef(self, ctx:MxParser.VariableDefContext):
        pass


    # Enter a parse tree produced by MxParser#constant.
    def enterConstant(self, ctx:MxParser.ConstantContext):
        pass

    # Exit a parse tree produced by MxParser#constant.
    def exitConstant(self, ctx:MxParser.ConstantContext):
        pass


    # Enter a parse tree produced by MxParser#expression.
    def enterExpression(self, ctx:MxParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MxParser#expression.
    def exitExpression(self, ctx:MxParser.ExpressionContext):
        pass


    # Enter a parse tree produced by MxParser#statement.
    def enterStatement(self, ctx:MxParser.StatementContext):
        pass

    # Exit a parse tree produced by MxParser#statement.
    def exitStatement(self, ctx:MxParser.StatementContext):
        pass


    # Enter a parse tree produced by MxParser#emptyStatement.
    def enterEmptyStatement(self, ctx:MxParser.EmptyStatementContext):
        pass

    # Exit a parse tree produced by MxParser#emptyStatement.
    def exitEmptyStatement(self, ctx:MxParser.EmptyStatementContext):
        pass


    # Enter a parse tree produced by MxParser#blockStatement.
    def enterBlockStatement(self, ctx:MxParser.BlockStatementContext):
        pass

    # Exit a parse tree produced by MxParser#blockStatement.
    def exitBlockStatement(self, ctx:MxParser.BlockStatementContext):
        pass


    # Enter a parse tree produced by MxParser#continueStatement.
    def enterContinueStatement(self, ctx:MxParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by MxParser#continueStatement.
    def exitContinueStatement(self, ctx:MxParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by MxParser#breakStatement.
    def enterBreakStatement(self, ctx:MxParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by MxParser#breakStatement.
    def exitBreakStatement(self, ctx:MxParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by MxParser#returnStatement.
    def enterReturnStatement(self, ctx:MxParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by MxParser#returnStatement.
    def exitReturnStatement(self, ctx:MxParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by MxParser#whileStatement.
    def enterWhileStatement(self, ctx:MxParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by MxParser#whileStatement.
    def exitWhileStatement(self, ctx:MxParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by MxParser#elseStatement.
    def enterElseStatement(self, ctx:MxParser.ElseStatementContext):
        pass

    # Exit a parse tree produced by MxParser#elseStatement.
    def exitElseStatement(self, ctx:MxParser.ElseStatementContext):
        pass


    # Enter a parse tree produced by MxParser#ifStatement.
    def enterIfStatement(self, ctx:MxParser.IfStatementContext):
        pass

    # Exit a parse tree produced by MxParser#ifStatement.
    def exitIfStatement(self, ctx:MxParser.IfStatementContext):
        pass


    # Enter a parse tree produced by MxParser#forStatement.
    def enterForStatement(self, ctx:MxParser.ForStatementContext):
        pass

    # Exit a parse tree produced by MxParser#forStatement.
    def exitForStatement(self, ctx:MxParser.ForStatementContext):
        pass


    # Enter a parse tree produced by MxParser#expressionStatement.
    def enterExpressionStatement(self, ctx:MxParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by MxParser#expressionStatement.
    def exitExpressionStatement(self, ctx:MxParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by MxParser#parameterList1.
    def enterParameterList1(self, ctx:MxParser.ParameterList1Context):
        pass

    # Exit a parse tree produced by MxParser#parameterList1.
    def exitParameterList1(self, ctx:MxParser.ParameterList1Context):
        pass


    # Enter a parse tree produced by MxParser#parameterList2.
    def enterParameterList2(self, ctx:MxParser.ParameterList2Context):
        pass

    # Exit a parse tree produced by MxParser#parameterList2.
    def exitParameterList2(self, ctx:MxParser.ParameterList2Context):
        pass


    # Enter a parse tree produced by MxParser#functionDef.
    def enterFunctionDef(self, ctx:MxParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by MxParser#functionDef.
    def exitFunctionDef(self, ctx:MxParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by MxParser#classConstructor.
    def enterClassConstructor(self, ctx:MxParser.ClassConstructorContext):
        pass

    # Exit a parse tree produced by MxParser#classConstructor.
    def exitClassConstructor(self, ctx:MxParser.ClassConstructorContext):
        pass


    # Enter a parse tree produced by MxParser#classDef.
    def enterClassDef(self, ctx:MxParser.ClassDefContext):
        pass

    # Exit a parse tree produced by MxParser#classDef.
    def exitClassDef(self, ctx:MxParser.ClassDefContext):
        pass





del MxParser