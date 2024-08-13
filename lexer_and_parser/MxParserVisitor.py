# Generated from ./MxParser.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MxParser import MxParser
else:
    from MxParser import MxParser

# This class defines a complete generic visitor for a parse tree produced by MxParser.

class MxParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MxParser#program.
    def visitProgram(self, ctx:MxParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#type.
    def visitType(self, ctx:MxParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#arrayUnit.
    def visitArrayUnit(self, ctx:MxParser.ArrayUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#typename.
    def visitTypename(self, ctx:MxParser.TypenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#variableConstructor.
    def visitVariableConstructor(self, ctx:MxParser.VariableConstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#variableDef.
    def visitVariableDef(self, ctx:MxParser.VariableDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#constant.
    def visitConstant(self, ctx:MxParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expression.
    def visitExpression(self, ctx:MxParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#statement.
    def visitStatement(self, ctx:MxParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#emptyStatement.
    def visitEmptyStatement(self, ctx:MxParser.EmptyStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#blockStatement.
    def visitBlockStatement(self, ctx:MxParser.BlockStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#continueStatement.
    def visitContinueStatement(self, ctx:MxParser.ContinueStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#breakStatement.
    def visitBreakStatement(self, ctx:MxParser.BreakStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#returnStatement.
    def visitReturnStatement(self, ctx:MxParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#whileStatement.
    def visitWhileStatement(self, ctx:MxParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#elseStatement.
    def visitElseStatement(self, ctx:MxParser.ElseStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#ifStatement.
    def visitIfStatement(self, ctx:MxParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#forStatement.
    def visitForStatement(self, ctx:MxParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionStatement.
    def visitExpressionStatement(self, ctx:MxParser.ExpressionStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#parameterList1.
    def visitParameterList1(self, ctx:MxParser.ParameterList1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#parameterList2.
    def visitParameterList2(self, ctx:MxParser.ParameterList2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#functionDef.
    def visitFunctionDef(self, ctx:MxParser.FunctionDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#classConstructor.
    def visitClassConstructor(self, ctx:MxParser.ClassConstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#classDef.
    def visitClassDef(self, ctx:MxParser.ClassDefContext):
        return self.visitChildren(ctx)



del MxParser