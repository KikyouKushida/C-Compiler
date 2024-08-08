// Generated from ./MxParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#arrayUnit}.
	 * @param ctx the parse tree
	 */
	void enterArrayUnit(MxParser.ArrayUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#arrayUnit}.
	 * @param ctx the parse tree
	 */
	void exitArrayUnit(MxParser.ArrayUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(MxParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(MxParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#variableConstructor}.
	 * @param ctx the parse tree
	 */
	void enterVariableConstructor(MxParser.VariableConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#variableConstructor}.
	 * @param ctx the parse tree
	 */
	void exitVariableConstructor(MxParser.VariableConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void enterVariableDef(MxParser.VariableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void exitVariableDef(MxParser.VariableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MxParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MxParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(MxParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(MxParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MxParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MxParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MxParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MxParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MxParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MxParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MxParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MxParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(MxParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(MxParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MxParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MxParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#parameterList1}.
	 * @param ctx the parse tree
	 */
	void enterParameterList1(MxParser.ParameterList1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#parameterList1}.
	 * @param ctx the parse tree
	 */
	void exitParameterList1(MxParser.ParameterList1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#parameterList2}.
	 * @param ctx the parse tree
	 */
	void enterParameterList2(MxParser.ParameterList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#parameterList2}.
	 * @param ctx the parse tree
	 */
	void exitParameterList2(MxParser.ParameterList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(MxParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(MxParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(MxParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(MxParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MxParser.ClassDefContext ctx);
}