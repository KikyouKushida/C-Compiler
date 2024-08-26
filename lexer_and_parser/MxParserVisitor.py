# Generated from MxParser.g4 by ANTLR 4.13.1
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


    # Visit a parse tree produced by MxParser#expressionLogicAnd.
    def visitExpressionLogicAnd(self, ctx:MxParser.ExpressionLogicAndContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionArrayUnit.
    def visitExpressionArrayUnit(self, ctx:MxParser.ExpressionArrayUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionAssign.
    def visitExpressionAssign(self, ctx:MxParser.ExpressionAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionMemberVisit.
    def visitExpressionMemberVisit(self, ctx:MxParser.ExpressionMemberVisitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionTrinocular.
    def visitExpressionTrinocular(self, ctx:MxParser.ExpressionTrinocularContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionBitwiseXor.
    def visitExpressionBitwiseXor(self, ctx:MxParser.ExpressionBitwiseXorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionBitwiseShift.
    def visitExpressionBitwiseShift(self, ctx:MxParser.ExpressionBitwiseShiftContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionBitwiseOr.
    def visitExpressionBitwiseOr(self, ctx:MxParser.ExpressionBitwiseOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionPreSelfDecrement.
    def visitExpressionPreSelfDecrement(self, ctx:MxParser.ExpressionPreSelfDecrementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionSufSelfIncrement.
    def visitExpressionSufSelfIncrement(self, ctx:MxParser.ExpressionSufSelfIncrementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionLogicNot.
    def visitExpressionLogicNot(self, ctx:MxParser.ExpressionLogicNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionArithmeticOp1.
    def visitExpressionArithmeticOp1(self, ctx:MxParser.ExpressionArithmeticOp1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionArithmeticOp2.
    def visitExpressionArithmeticOp2(self, ctx:MxParser.ExpressionArithmeticOp2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionAdd.
    def visitExpressionAdd(self, ctx:MxParser.ExpressionAddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionNew.
    def visitExpressionNew(self, ctx:MxParser.ExpressionNewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionCompare1.
    def visitExpressionCompare1(self, ctx:MxParser.ExpressionCompare1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionCompare2.
    def visitExpressionCompare2(self, ctx:MxParser.ExpressionCompare2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionLogicOr.
    def visitExpressionLogicOr(self, ctx:MxParser.ExpressionLogicOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionFunctionCall.
    def visitExpressionFunctionCall(self, ctx:MxParser.ExpressionFunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionBracket.
    def visitExpressionBracket(self, ctx:MxParser.ExpressionBracketContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionBitwiseAnd.
    def visitExpressionBitwiseAnd(self, ctx:MxParser.ExpressionBitwiseAndContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionBitwiseNot.
    def visitExpressionBitwiseNot(self, ctx:MxParser.ExpressionBitwiseNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionIdentifier.
    def visitExpressionIdentifier(self, ctx:MxParser.ExpressionIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionSufSelfDecrement.
    def visitExpressionSufSelfDecrement(self, ctx:MxParser.ExpressionSufSelfDecrementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionConstant.
    def visitExpressionConstant(self, ctx:MxParser.ExpressionConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionSubtract.
    def visitExpressionSubtract(self, ctx:MxParser.ExpressionSubtractContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionThis.
    def visitExpressionThis(self, ctx:MxParser.ExpressionThisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MxParser#expressionPreSelfIncrement.
    def visitExpressionPreSelfIncrement(self, ctx:MxParser.ExpressionPreSelfIncrementContext):
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