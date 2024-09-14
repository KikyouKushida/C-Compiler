# Generated from MxParser.g4 by ANTLR 4.13.1
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


    # Enter a parse tree produced by MxParser#expressionLogicAnd.
    def enterExpressionLogicAnd(self, ctx:MxParser.ExpressionLogicAndContext):
        pass

    # Exit a parse tree produced by MxParser#expressionLogicAnd.
    def exitExpressionLogicAnd(self, ctx:MxParser.ExpressionLogicAndContext):
        pass


    # Enter a parse tree produced by MxParser#expressionArrayUnit.
    def enterExpressionArrayUnit(self, ctx:MxParser.ExpressionArrayUnitContext):
        pass

    # Exit a parse tree produced by MxParser#expressionArrayUnit.
    def exitExpressionArrayUnit(self, ctx:MxParser.ExpressionArrayUnitContext):
        pass


    # Enter a parse tree produced by MxParser#expressionAssign.
    def enterExpressionAssign(self, ctx:MxParser.ExpressionAssignContext):
        pass

    # Exit a parse tree produced by MxParser#expressionAssign.
    def exitExpressionAssign(self, ctx:MxParser.ExpressionAssignContext):
        pass


    # Enter a parse tree produced by MxParser#expressionMemberVisit.
    def enterExpressionMemberVisit(self, ctx:MxParser.ExpressionMemberVisitContext):
        pass

    # Exit a parse tree produced by MxParser#expressionMemberVisit.
    def exitExpressionMemberVisit(self, ctx:MxParser.ExpressionMemberVisitContext):
        pass


    # Enter a parse tree produced by MxParser#expressionTrinocular.
    def enterExpressionTrinocular(self, ctx:MxParser.ExpressionTrinocularContext):
        pass

    # Exit a parse tree produced by MxParser#expressionTrinocular.
    def exitExpressionTrinocular(self, ctx:MxParser.ExpressionTrinocularContext):
        pass


    # Enter a parse tree produced by MxParser#expressionBitwiseXor.
    def enterExpressionBitwiseXor(self, ctx:MxParser.ExpressionBitwiseXorContext):
        pass

    # Exit a parse tree produced by MxParser#expressionBitwiseXor.
    def exitExpressionBitwiseXor(self, ctx:MxParser.ExpressionBitwiseXorContext):
        pass


    # Enter a parse tree produced by MxParser#expressionBitwiseShift.
    def enterExpressionBitwiseShift(self, ctx:MxParser.ExpressionBitwiseShiftContext):
        pass

    # Exit a parse tree produced by MxParser#expressionBitwiseShift.
    def exitExpressionBitwiseShift(self, ctx:MxParser.ExpressionBitwiseShiftContext):
        pass


    # Enter a parse tree produced by MxParser#expressionBitwiseOr.
    def enterExpressionBitwiseOr(self, ctx:MxParser.ExpressionBitwiseOrContext):
        pass

    # Exit a parse tree produced by MxParser#expressionBitwiseOr.
    def exitExpressionBitwiseOr(self, ctx:MxParser.ExpressionBitwiseOrContext):
        pass


    # Enter a parse tree produced by MxParser#expressionPreSelfDecrement.
    def enterExpressionPreSelfDecrement(self, ctx:MxParser.ExpressionPreSelfDecrementContext):
        pass

    # Exit a parse tree produced by MxParser#expressionPreSelfDecrement.
    def exitExpressionPreSelfDecrement(self, ctx:MxParser.ExpressionPreSelfDecrementContext):
        pass


    # Enter a parse tree produced by MxParser#expressionSufSelfIncrement.
    def enterExpressionSufSelfIncrement(self, ctx:MxParser.ExpressionSufSelfIncrementContext):
        pass

    # Exit a parse tree produced by MxParser#expressionSufSelfIncrement.
    def exitExpressionSufSelfIncrement(self, ctx:MxParser.ExpressionSufSelfIncrementContext):
        pass


    # Enter a parse tree produced by MxParser#expressionLogicNot.
    def enterExpressionLogicNot(self, ctx:MxParser.ExpressionLogicNotContext):
        pass

    # Exit a parse tree produced by MxParser#expressionLogicNot.
    def exitExpressionLogicNot(self, ctx:MxParser.ExpressionLogicNotContext):
        pass


    # Enter a parse tree produced by MxParser#expressionArithmeticOp1.
    def enterExpressionArithmeticOp1(self, ctx:MxParser.ExpressionArithmeticOp1Context):
        pass

    # Exit a parse tree produced by MxParser#expressionArithmeticOp1.
    def exitExpressionArithmeticOp1(self, ctx:MxParser.ExpressionArithmeticOp1Context):
        pass


    # Enter a parse tree produced by MxParser#expressionArithmeticOp2.
    def enterExpressionArithmeticOp2(self, ctx:MxParser.ExpressionArithmeticOp2Context):
        pass

    # Exit a parse tree produced by MxParser#expressionArithmeticOp2.
    def exitExpressionArithmeticOp2(self, ctx:MxParser.ExpressionArithmeticOp2Context):
        pass


    # Enter a parse tree produced by MxParser#expressionAdd.
    def enterExpressionAdd(self, ctx:MxParser.ExpressionAddContext):
        pass

    # Exit a parse tree produced by MxParser#expressionAdd.
    def exitExpressionAdd(self, ctx:MxParser.ExpressionAddContext):
        pass


    # Enter a parse tree produced by MxParser#expressionNew.
    def enterExpressionNew(self, ctx:MxParser.ExpressionNewContext):
        pass

    # Exit a parse tree produced by MxParser#expressionNew.
    def exitExpressionNew(self, ctx:MxParser.ExpressionNewContext):
        pass


    # Enter a parse tree produced by MxParser#expressionCompare1.
    def enterExpressionCompare1(self, ctx:MxParser.ExpressionCompare1Context):
        pass

    # Exit a parse tree produced by MxParser#expressionCompare1.
    def exitExpressionCompare1(self, ctx:MxParser.ExpressionCompare1Context):
        pass


    # Enter a parse tree produced by MxParser#expressionCompare2.
    def enterExpressionCompare2(self, ctx:MxParser.ExpressionCompare2Context):
        pass

    # Exit a parse tree produced by MxParser#expressionCompare2.
    def exitExpressionCompare2(self, ctx:MxParser.ExpressionCompare2Context):
        pass


    # Enter a parse tree produced by MxParser#expressionLogicOr.
    def enterExpressionLogicOr(self, ctx:MxParser.ExpressionLogicOrContext):
        pass

    # Exit a parse tree produced by MxParser#expressionLogicOr.
    def exitExpressionLogicOr(self, ctx:MxParser.ExpressionLogicOrContext):
        pass


    # Enter a parse tree produced by MxParser#expressionFunctionCall.
    def enterExpressionFunctionCall(self, ctx:MxParser.ExpressionFunctionCallContext):
        pass

    # Exit a parse tree produced by MxParser#expressionFunctionCall.
    def exitExpressionFunctionCall(self, ctx:MxParser.ExpressionFunctionCallContext):
        pass


    # Enter a parse tree produced by MxParser#expressionBracket.
    def enterExpressionBracket(self, ctx:MxParser.ExpressionBracketContext):
        pass

    # Exit a parse tree produced by MxParser#expressionBracket.
    def exitExpressionBracket(self, ctx:MxParser.ExpressionBracketContext):
        pass


    # Enter a parse tree produced by MxParser#expressionBitwiseAnd.
    def enterExpressionBitwiseAnd(self, ctx:MxParser.ExpressionBitwiseAndContext):
        pass

    # Exit a parse tree produced by MxParser#expressionBitwiseAnd.
    def exitExpressionBitwiseAnd(self, ctx:MxParser.ExpressionBitwiseAndContext):
        pass


    # Enter a parse tree produced by MxParser#expressionBitwiseNot.
    def enterExpressionBitwiseNot(self, ctx:MxParser.ExpressionBitwiseNotContext):
        pass

    # Exit a parse tree produced by MxParser#expressionBitwiseNot.
    def exitExpressionBitwiseNot(self, ctx:MxParser.ExpressionBitwiseNotContext):
        pass


    # Enter a parse tree produced by MxParser#expressionIdentifier.
    def enterExpressionIdentifier(self, ctx:MxParser.ExpressionIdentifierContext):
        pass

    # Exit a parse tree produced by MxParser#expressionIdentifier.
    def exitExpressionIdentifier(self, ctx:MxParser.ExpressionIdentifierContext):
        pass


    # Enter a parse tree produced by MxParser#expressionSufSelfDecrement.
    def enterExpressionSufSelfDecrement(self, ctx:MxParser.ExpressionSufSelfDecrementContext):
        pass

    # Exit a parse tree produced by MxParser#expressionSufSelfDecrement.
    def exitExpressionSufSelfDecrement(self, ctx:MxParser.ExpressionSufSelfDecrementContext):
        pass


    # Enter a parse tree produced by MxParser#expressionConstant.
    def enterExpressionConstant(self, ctx:MxParser.ExpressionConstantContext):
        pass

    # Exit a parse tree produced by MxParser#expressionConstant.
    def exitExpressionConstant(self, ctx:MxParser.ExpressionConstantContext):
        pass


    # Enter a parse tree produced by MxParser#expressionSubtract.
    def enterExpressionSubtract(self, ctx:MxParser.ExpressionSubtractContext):
        pass

    # Exit a parse tree produced by MxParser#expressionSubtract.
    def exitExpressionSubtract(self, ctx:MxParser.ExpressionSubtractContext):
        pass


    # Enter a parse tree produced by MxParser#expressionThis.
    def enterExpressionThis(self, ctx:MxParser.ExpressionThisContext):
        pass

    # Exit a parse tree produced by MxParser#expressionThis.
    def exitExpressionThis(self, ctx:MxParser.ExpressionThisContext):
        pass


    # Enter a parse tree produced by MxParser#expressionPreSelfIncrement.
    def enterExpressionPreSelfIncrement(self, ctx:MxParser.ExpressionPreSelfIncrementContext):
        pass

    # Exit a parse tree produced by MxParser#expressionPreSelfIncrement.
    def exitExpressionPreSelfIncrement(self, ctx:MxParser.ExpressionPreSelfIncrementContext):
        pass


    # Enter a parse tree produced by MxParser#arrayConstant.
    def enterArrayConstant(self, ctx:MxParser.ArrayConstantContext):
        pass

    # Exit a parse tree produced by MxParser#arrayConstant.
    def exitArrayConstant(self, ctx:MxParser.ArrayConstantContext):
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


    # Enter a parse tree produced by MxParser#formatStr.
    def enterFormatStr(self, ctx:MxParser.FormatStrContext):
        pass

    # Exit a parse tree produced by MxParser#formatStr.
    def exitFormatStr(self, ctx:MxParser.FormatStrContext):
        pass



del MxParser