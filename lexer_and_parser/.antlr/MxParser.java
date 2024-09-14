// Generated from /home/remosk/compiler/lexer_and_parser/MxParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Void=2, Bool=3, String=4, New=5, Class=6, This=7, True_=8, False_=9, 
		Null=10, For=11, If=12, Else=13, Else_if=14, Break=15, Continue=16, While=17, 
		Return=18, Identifier=19, Integer=20, Greater=21, Less=22, GreaterEqual=23, 
		LessEqual=24, Equal=25, NotEqual=26, BitwiseAnd=27, BitwiseOr=28, BitwiseXor=29, 
		BitwiseNot=30, BitwiseRightShift=31, BitwiseLeftShift=32, LogicAnd=33, 
		LogicOr=34, LogicNot=35, Assign=36, SelfIncrement=37, SelfDecrement=38, 
		RightParenthesis=39, LeftParenthesis=40, RightBracket=41, LeftBracket=42, 
		RightBrace=43, LeftBrace=44, Add=45, Substract=46, Multiply=47, Divide=48, 
		Mod=49, Colon=50, QuestionMark=51, Semicolon=52, Comma=53, Member=54, 
		WhiteSpace=55, Cstring=56, CommentLine=57, CommentBlock=58, FormatStrSingle=59, 
		FormatStrBegin=60, FormatStrBody=61, FormatStrEnd=62;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_arrayUnit = 2, RULE_typename = 3, 
		RULE_variableConstructor = 4, RULE_variableDef = 5, RULE_constant = 6, 
		RULE_expression = 7, RULE_arrayConstant = 8, RULE_statement = 9, RULE_emptyStatement = 10, 
		RULE_blockStatement = 11, RULE_continueStatement = 12, RULE_breakStatement = 13, 
		RULE_returnStatement = 14, RULE_whileStatement = 15, RULE_elseStatement = 16, 
		RULE_ifStatement = 17, RULE_forStatement = 18, RULE_expressionStatement = 19, 
		RULE_parameterList1 = 20, RULE_parameterList2 = 21, RULE_functionDef = 22, 
		RULE_classConstructor = 23, RULE_classDef = 24, RULE_formatStr = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "arrayUnit", "typename", "variableConstructor", "variableDef", 
			"constant", "expression", "arrayConstant", "statement", "emptyStatement", 
			"blockStatement", "continueStatement", "breakStatement", "returnStatement", 
			"whileStatement", "elseStatement", "ifStatement", "forStatement", "expressionStatement", 
			"parameterList1", "parameterList2", "functionDef", "classConstructor", 
			"classDef", "formatStr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'void'", "'bool'", "'string'", "'new'", "'class'", "'this'", 
			"'true'", "'false'", "'null'", "'for'", "'if'", "'else'", "'else if'", 
			"'break'", "'continue'", "'while'", "'return'", null, null, "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'&'", "'|'", "'^'", "'~'", "'>>'", "'<<'", 
			"'&&'", "'||'", "'!'", "'='", "'++'", "'--'", "')'", "'('", "']'", "'['", 
			"'}'", "'{'", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'?'", "';'", 
			"','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Void", "Bool", "String", "New", "Class", "This", "True_", 
			"False_", "Null", "For", "If", "Else", "Else_if", "Break", "Continue", 
			"While", "Return", "Identifier", "Integer", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "BitwiseAnd", "BitwiseOr", "BitwiseXor", 
			"BitwiseNot", "BitwiseRightShift", "BitwiseLeftShift", "LogicAnd", "LogicOr", 
			"LogicNot", "Assign", "SelfIncrement", "SelfDecrement", "RightParenthesis", 
			"LeftParenthesis", "RightBracket", "LeftBracket", "RightBrace", "LeftBrace", 
			"Add", "Substract", "Multiply", "Divide", "Mod", "Colon", "QuestionMark", 
			"Semicolon", "Comma", "Member", "WhiteSpace", "Cstring", "CommentLine", 
			"CommentBlock", "FormatStrSingle", "FormatStrBegin", "FormatStrBody", 
			"FormatStrEnd"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MxParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MxParser.EOF, 0); }
		public List<VariableDefContext> variableDef() {
			return getRuleContexts(VariableDefContext.class);
		}
		public VariableDefContext variableDef(int i) {
			return getRuleContext(VariableDefContext.class,i);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524382L) != 0)) {
				{
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52);
					variableDef();
					}
					break;
				case 2:
					{
					setState(53);
					classDef();
					}
					break;
				case 3:
					{
					setState(54);
					functionDef();
					}
					break;
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MxParser.Int, 0); }
		public TerminalNode Bool() { return getToken(MxParser.Bool, 0); }
		public TerminalNode String() { return getToken(MxParser.String, 0); }
		public TerminalNode Void() { return getToken(MxParser.Void, 0); }
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524318L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayUnitContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MxParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayUnit; }
	}

	public final ArrayUnitContext arrayUnit() throws RecognitionException {
		ArrayUnitContext _localctx = new ArrayUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LeftBracket);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72164694417737632L) != 0)) {
				{
				setState(65);
				expression(0);
				}
			}

			setState(68);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypenameContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ArrayUnitContext> arrayUnit() {
			return getRuleContexts(ArrayUnitContext.class);
		}
		public ArrayUnitContext arrayUnit(int i) {
			return getRuleContext(ArrayUnitContext.class,i);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket) {
				{
				{
				setState(71);
				arrayUnit();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableConstructorContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MxParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableConstructor; }
	}

	public final VariableConstructorContext variableConstructor() throws RecognitionException {
		VariableConstructorContext _localctx = new VariableConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((VariableConstructorContext)_localctx).name = match(Identifier);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(78);
				match(Assign);
				setState(79);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public List<VariableConstructorContext> variableConstructor() {
			return getRuleContexts(VariableConstructorContext.class);
		}
		public VariableConstructorContext variableConstructor(int i) {
			return getRuleContext(VariableConstructorContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(MxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxParser.Comma, i);
		}
		public VariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDef; }
	}

	public final VariableDefContext variableDef() throws RecognitionException {
		VariableDefContext _localctx = new VariableDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			typename();
			setState(83);
			variableConstructor();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(84);
				match(Comma);
				setState(85);
				variableConstructor();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(MxParser.Integer, 0); }
		public TerminalNode Cstring() { return getToken(MxParser.Cstring, 0); }
		public TerminalNode True_() { return getToken(MxParser.True_, 0); }
		public TerminalNode False_() { return getToken(MxParser.False_, 0); }
		public TerminalNode Null() { return getToken(MxParser.Null, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594038978304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLogicAndContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicAnd() { return getToken(MxParser.LogicAnd, 0); }
		public ExpressionLogicAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArrayUnitContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ArrayUnitContext> arrayUnit() {
			return getRuleContexts(ArrayUnitContext.class);
		}
		public ArrayUnitContext arrayUnit(int i) {
			return getRuleContext(ArrayUnitContext.class,i);
		}
		public ExpressionArrayUnitContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAssignContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(MxParser.Assign, 0); }
		public ExpressionAssignContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMemberVisitContext extends ExpressionContext {
		public Token member;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Member() { return getToken(MxParser.Member, 0); }
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public ExpressionMemberVisitContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionTrinocularContext extends ExpressionContext {
		public ExpressionContext a;
		public Token op1;
		public ExpressionContext b;
		public Token op2;
		public ExpressionContext c;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(MxParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(MxParser.Colon, 0); }
		public ExpressionTrinocularContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseXorContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitwiseXor() { return getToken(MxParser.BitwiseXor, 0); }
		public ExpressionBitwiseXorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseShiftContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitwiseLeftShift() { return getToken(MxParser.BitwiseLeftShift, 0); }
		public TerminalNode BitwiseRightShift() { return getToken(MxParser.BitwiseRightShift, 0); }
		public ExpressionBitwiseShiftContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseOrContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitwiseOr() { return getToken(MxParser.BitwiseOr, 0); }
		public ExpressionBitwiseOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPreSelfDecrementContext extends ExpressionContext {
		public TerminalNode SelfDecrement() { return getToken(MxParser.SelfDecrement, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPreSelfDecrementContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSufSelfIncrementContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SelfIncrement() { return getToken(MxParser.SelfIncrement, 0); }
		public ExpressionSufSelfIncrementContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLogicNotContext extends ExpressionContext {
		public TerminalNode LogicNot() { return getToken(MxParser.LogicNot, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionLogicNotContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArithmeticOp1Context extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(MxParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(MxParser.Divide, 0); }
		public TerminalNode Mod() { return getToken(MxParser.Mod, 0); }
		public ExpressionArithmeticOp1Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArithmeticOp2Context extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(MxParser.Add, 0); }
		public TerminalNode Substract() { return getToken(MxParser.Substract, 0); }
		public ExpressionArithmeticOp2Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAddContext extends ExpressionContext {
		public TerminalNode Add() { return getToken(MxParser.Add, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAddContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNewContext extends ExpressionContext {
		public TerminalNode New() { return getToken(MxParser.New, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ArrayUnitContext> arrayUnit() {
			return getRuleContexts(ArrayUnitContext.class);
		}
		public ArrayUnitContext arrayUnit(int i) {
			return getRuleContext(ArrayUnitContext.class,i);
		}
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public ExpressionNewContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCompare1Context extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Less() { return getToken(MxParser.Less, 0); }
		public TerminalNode Greater() { return getToken(MxParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(MxParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MxParser.GreaterEqual, 0); }
		public ExpressionCompare1Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCompare2Context extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(MxParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MxParser.NotEqual, 0); }
		public ExpressionCompare2Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLogicOrContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicOr() { return getToken(MxParser.LogicOr, 0); }
		public ExpressionLogicOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public ParameterList2Context parameterList2() {
			return getRuleContext(ParameterList2Context.class,0);
		}
		public ExpressionFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBracketContext extends ExpressionContext {
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public ExpressionBracketContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseAndContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitwiseAnd() { return getToken(MxParser.BitwiseAnd, 0); }
		public ExpressionBitwiseAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseNotContext extends ExpressionContext {
		public TerminalNode BitwiseNot() { return getToken(MxParser.BitwiseNot, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionBitwiseNotContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIdentifierContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public ExpressionIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSufSelfDecrementContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SelfDecrement() { return getToken(MxParser.SelfDecrement, 0); }
		public ExpressionSufSelfDecrementContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionConstantContext extends ExpressionContext {
		public ConstantContext value;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSubtractContext extends ExpressionContext {
		public TerminalNode Substract() { return getToken(MxParser.Substract, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionThisContext extends ExpressionContext {
		public TerminalNode This() { return getToken(MxParser.This, 0); }
		public ExpressionThisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPreSelfIncrementContext extends ExpressionContext {
		public TerminalNode SelfIncrement() { return getToken(MxParser.SelfIncrement, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPreSelfIncrementContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParenthesis:
				{
				_localctx = new ExpressionBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(LeftParenthesis);
				setState(97);
				expression(0);
				setState(98);
				match(RightParenthesis);
				}
				break;
			case SelfIncrement:
				{
				_localctx = new ExpressionPreSelfIncrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(SelfIncrement);
				setState(101);
				expression(22);
				}
				break;
			case SelfDecrement:
				{
				_localctx = new ExpressionPreSelfDecrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(SelfDecrement);
				setState(103);
				expression(21);
				}
				break;
			case Add:
				{
				_localctx = new ExpressionAddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(Add);
				setState(105);
				expression(20);
				}
				break;
			case Substract:
				{
				_localctx = new ExpressionSubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(Substract);
				setState(107);
				expression(19);
				}
				break;
			case New:
				{
				_localctx = new ExpressionNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(New);
				setState(109);
				type();
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						arrayUnit();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(116);
					match(LeftParenthesis);
					setState(117);
					match(RightParenthesis);
					}
					break;
				}
				}
				break;
			case True_:
			case False_:
			case Null:
			case Integer:
			case Cstring:
				{
				_localctx = new ExpressionConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				((ExpressionConstantContext)_localctx).value = constant();
				}
				break;
			case This:
				{
				_localctx = new ExpressionThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(This);
				}
				break;
			case Identifier:
				{
				_localctx = new ExpressionIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(Identifier);
				}
				break;
			case BitwiseNot:
				{
				_localctx = new ExpressionBitwiseNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(BitwiseNot);
				setState(124);
				expression(14);
				}
				break;
			case LogicNot:
				{
				_localctx = new ExpressionLogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(LogicNot);
				setState(126);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionArithmeticOp1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(130);
						((ExpressionArithmeticOp1Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
							((ExpressionArithmeticOp1Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionArithmeticOp2Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(133);
						((ExpressionArithmeticOp2Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
							((ExpressionArithmeticOp2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionBitwiseShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(136);
						((ExpressionBitwiseShiftContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BitwiseRightShift || _la==BitwiseLeftShift) ) {
							((ExpressionBitwiseShiftContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionCompare1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						((ExpressionCompare1Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
							((ExpressionCompare1Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionCompare2Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(142);
						((ExpressionCompare2Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((ExpressionCompare2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionBitwiseAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(145);
						((ExpressionBitwiseAndContext)_localctx).op = match(BitwiseAnd);
						setState(146);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionBitwiseXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
						((ExpressionBitwiseXorContext)_localctx).op = match(BitwiseXor);
						setState(149);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionBitwiseOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
						((ExpressionBitwiseOrContext)_localctx).op = match(BitwiseOr);
						setState(152);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionLogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
						((ExpressionLogicAndContext)_localctx).op = match(LogicAnd);
						setState(155);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionLogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						((ExpressionLogicOrContext)_localctx).op = match(LogicOr);
						setState(158);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionTrinocularContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionTrinocularContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						((ExpressionTrinocularContext)_localctx).op1 = match(QuestionMark);
						setState(161);
						((ExpressionTrinocularContext)_localctx).b = expression(0);
						setState(162);
						((ExpressionTrinocularContext)_localctx).op2 = match(Colon);
						setState(163);
						((ExpressionTrinocularContext)_localctx).c = expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionAssignContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(Assign);
						setState(167);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionFunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(169);
						match(LeftParenthesis);
						setState(171);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72164694417737632L) != 0)) {
							{
							setState(170);
							parameterList2();
							}
						}

						setState(173);
						match(RightParenthesis);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionArrayUnitContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(176); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(175);
								arrayUnit();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(178); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 15:
						{
						_localctx = new ExpressionSufSelfIncrementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(181);
						match(SelfIncrement);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionSufSelfDecrementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(183);
						match(SelfDecrement);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionMemberVisitContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(185);
						match(Member);
						setState(186);
						((ExpressionMemberVisitContext)_localctx).member = match(Identifier);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayConstantContext extends ParserRuleContext {
		public TerminalNode True_() { return getToken(MxParser.True_, 0); }
		public TerminalNode False_() { return getToken(MxParser.False_, 0); }
		public TerminalNode Integer() { return getToken(MxParser.Integer, 0); }
		public TerminalNode Cstring() { return getToken(MxParser.Cstring, 0); }
		public TerminalNode LeftBrace() { return getToken(MxParser.LeftBrace, 0); }
		public List<ArrayConstantContext> arrayConstant() {
			return getRuleContexts(ArrayConstantContext.class);
		}
		public ArrayConstantContext arrayConstant(int i) {
			return getRuleContext(ArrayConstantContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(MxParser.RightBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(MxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxParser.Comma, i);
		}
		public ArrayConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstant; }
	}

	public final ArrayConstantContext arrayConstant() throws RecognitionException {
		ArrayConstantContext _localctx = new ArrayConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayConstant);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True_:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(True_);
				}
				break;
			case False_:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(False_);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(Integer);
				}
				break;
			case Cstring:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(Cstring);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(LeftBrace);
				setState(197);
				arrayConstant();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(198);
					match(Comma);
					setState(199);
					arrayConstant();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				emptyStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				variableDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LeftBrace);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76685886231650238L) != 0)) {
				{
				{
				setState(224);
				statement();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(MxParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(Continue);
			setState(233);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(MxParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Break);
			setState(236);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(MxParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Return);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72164694417737632L) != 0)) {
				{
				setState(239);
				expression(0);
				}
			}

			setState(242);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext Body;
		public TerminalNode While() { return getToken(MxParser.While, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(While);
			setState(245);
			match(LeftParenthesis);
			setState(246);
			expression(0);
			setState(247);
			match(RightParenthesis);
			setState(248);
			((WhileStatementContext)_localctx).Body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public StatementContext Body;
		public TerminalNode Else() { return getToken(MxParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(Else);
			setState(251);
			((ElseStatementContext)_localctx).Body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext Body;
		public TerminalNode If() { return getToken(MxParser.If, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(If);
			setState(254);
			match(LeftParenthesis);
			setState(255);
			expression(0);
			setState(256);
			match(RightParenthesis);
			setState(257);
			((IfStatementContext)_localctx).Body = statement();
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(258);
				elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext Initialization;
		public ExpressionContext Condition;
		public ExpressionContext Step;
		public StatementContext Body;
		public TerminalNode For() { return getToken(MxParser.For, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(For);
			setState(262);
			match(LeftParenthesis);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(263);
				((ForStatementContext)_localctx).Initialization = statement();
				}
				break;
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72164694417737632L) != 0)) {
				{
				setState(266);
				((ForStatementContext)_localctx).Condition = expression(0);
				}
			}

			setState(269);
			match(Semicolon);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72164694417737632L) != 0)) {
				{
				setState(270);
				((ForStatementContext)_localctx).Step = expression(0);
				}
			}

			setState(273);
			match(RightParenthesis);
			setState(274);
			((ForStatementContext)_localctx).Body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			expression(0);
			setState(277);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterList1Context extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public List<VariableConstructorContext> variableConstructor() {
			return getRuleContexts(VariableConstructorContext.class);
		}
		public VariableConstructorContext variableConstructor(int i) {
			return getRuleContext(VariableConstructorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxParser.Comma, i);
		}
		public ParameterList1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList1; }
	}

	public final ParameterList1Context parameterList1() throws RecognitionException {
		ParameterList1Context _localctx = new ParameterList1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			typename();
			setState(280);
			variableConstructor();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(281);
				match(Comma);
				setState(282);
				typename();
				setState(283);
				variableConstructor();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterList2Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxParser.Comma, i);
		}
		public ParameterList2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList2; }
	}

	public final ParameterList2Context parameterList2() throws RecognitionException {
		ParameterList2Context _localctx = new ParameterList2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterList2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expression(0);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(291);
				match(Comma);
				setState(292);
				expression(0);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public Token name;
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public ParameterList1Context parameterList1() {
			return getRuleContext(ParameterList1Context.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			typename();
			setState(299);
			((FunctionDefContext)_localctx).name = match(Identifier);
			setState(300);
			match(LeftParenthesis);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524318L) != 0)) {
				{
				setState(301);
				parameterList1();
				}
			}

			setState(304);
			match(RightParenthesis);
			setState(305);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassConstructorContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((ClassConstructorContext)_localctx).name = match(Identifier);
			setState(308);
			match(LeftParenthesis);
			setState(309);
			match(RightParenthesis);
			setState(310);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Class() { return getToken(MxParser.Class, 0); }
		public TerminalNode LeftBrace() { return getToken(MxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxParser.RightBrace, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public List<VariableDefContext> variableDef() {
			return getRuleContexts(VariableDefContext.class);
		}
		public VariableDefContext variableDef(int i) {
			return getRuleContext(VariableDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<ClassConstructorContext> classConstructor() {
			return getRuleContexts(ClassConstructorContext.class);
		}
		public ClassConstructorContext classConstructor(int i) {
			return getRuleContext(ClassConstructorContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Class);
			setState(313);
			((ClassDefContext)_localctx).name = match(Identifier);
			setState(314);
			match(LeftBrace);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524318L) != 0)) {
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(315);
					variableDef();
					}
					break;
				case 2:
					{
					setState(316);
					functionDef();
					}
					break;
				case 3:
					{
					setState(317);
					classConstructor();
					}
					break;
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(RightBrace);
			setState(324);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormatStrContext extends ParserRuleContext {
		public TerminalNode FormatStrSingle() { return getToken(MxParser.FormatStrSingle, 0); }
		public TerminalNode FormatStrBegin() { return getToken(MxParser.FormatStrBegin, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FormatStrEnd() { return getToken(MxParser.FormatStrEnd, 0); }
		public List<TerminalNode> FormatStrBody() { return getTokens(MxParser.FormatStrBody); }
		public TerminalNode FormatStrBody(int i) {
			return getToken(MxParser.FormatStrBody, i);
		}
		public FormatStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatStr; }
	}

	public final FormatStrContext formatStr() throws RecognitionException {
		FormatStrContext _localctx = new FormatStrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formatStr);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FormatStrSingle:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(FormatStrSingle);
				}
				break;
			case FormatStrBegin:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(327);
				match(FormatStrBegin);
				setState(328);
				expression(0);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FormatStrBody) {
					{
					{
					setState(329);
					match(FormatStrBody);
					setState(330);
					expression(0);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(FormatStrEnd);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 28);
		case 13:
			return precpred(_ctx, 27);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0155\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003"+
		"L\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005W\b\u0005\n\u0005"+
		"\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007"+
		"\f\u0007s\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0080\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00ac\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u00b1\b\u0007\u000b\u0007\f\u0007\u00b2\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00bc\b\u0007\n\u0007\f\u0007\u00bf\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c9"+
		"\b\b\n\b\f\b\u00cc\t\b\u0001\b\u0001\b\u0003\b\u00d0\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00dc\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u00e2"+
		"\b\u000b\n\u000b\f\u000b\u00e5\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00f1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0104\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0109\b\u0012\u0001\u0012\u0003\u0012\u010c\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0110\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u011e\b\u0014\n\u0014"+
		"\f\u0014\u0121\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0126\b\u0015\n\u0015\f\u0015\u0129\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u012f\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u013f\b\u0018\n\u0018\f\u0018\u0142\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u014c\b\u0019\n\u0019\f\u0019\u014f\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0153\b\u0019\u0001\u0019\u0000\u0001\u000e\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0007\u0002\u0000\u0001\u0004\u0013\u0013\u0003"+
		"\u0000\b\n\u0014\u001488\u0001\u0000/1\u0001\u0000-.\u0001\u0000\u001f"+
		" \u0001\u0000\u0015\u0018\u0001\u0000\u0019\u001a\u017c\u00009\u0001\u0000"+
		"\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000"+
		"\u0006F\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nR\u0001\u0000"+
		"\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000"+
		"\u0000\u0010\u00cf\u0001\u0000\u0000\u0000\u0012\u00db\u0001\u0000\u0000"+
		"\u0000\u0014\u00dd\u0001\u0000\u0000\u0000\u0016\u00df\u0001\u0000\u0000"+
		"\u0000\u0018\u00e8\u0001\u0000\u0000\u0000\u001a\u00eb\u0001\u0000\u0000"+
		"\u0000\u001c\u00ee\u0001\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000"+
		"\u0000 \u00fa\u0001\u0000\u0000\u0000\"\u00fd\u0001\u0000\u0000\u0000"+
		"$\u0105\u0001\u0000\u0000\u0000&\u0114\u0001\u0000\u0000\u0000(\u0117"+
		"\u0001\u0000\u0000\u0000*\u0122\u0001\u0000\u0000\u0000,\u012a\u0001\u0000"+
		"\u0000\u0000.\u0133\u0001\u0000\u0000\u00000\u0138\u0001\u0000\u0000\u0000"+
		"2\u0152\u0001\u0000\u0000\u000048\u0003\n\u0005\u000058\u00030\u0018\u0000"+
		"68\u0003,\u0016\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000\u0000\u0000"+
		">?\u0007\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@B\u0005*\u0000"+
		"\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005)\u0000\u0000E\u0005\u0001"+
		"\u0000\u0000\u0000FJ\u0003\u0002\u0001\u0000GI\u0003\u0004\u0002\u0000"+
		"HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MP\u0005\u0013\u0000\u0000NO\u0005$\u0000\u0000OQ\u0003"+
		"\u000e\u0007\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\t\u0001\u0000\u0000\u0000RS\u0003\u0006\u0003\u0000SX\u0003\b\u0004"+
		"\u0000TU\u00055\u0000\u0000UW\u0003\b\u0004\u0000VT\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"+
		"4\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0007\u0001\u0000\u0000"+
		"^\r\u0001\u0000\u0000\u0000_`\u0006\u0007\uffff\uffff\u0000`a\u0005(\u0000"+
		"\u0000ab\u0003\u000e\u0007\u0000bc\u0005\'\u0000\u0000c\u0080\u0001\u0000"+
		"\u0000\u0000de\u0005%\u0000\u0000e\u0080\u0003\u000e\u0007\u0016fg\u0005"+
		"&\u0000\u0000g\u0080\u0003\u000e\u0007\u0015hi\u0005-\u0000\u0000i\u0080"+
		"\u0003\u000e\u0007\u0014jk\u0005.\u0000\u0000k\u0080\u0003\u000e\u0007"+
		"\u0013lm\u0005\u0005\u0000\u0000mq\u0003\u0002\u0001\u0000np\u0003\u0004"+
		"\u0002\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tu\u0005(\u0000\u0000uw\u0005\'\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0080\u0001\u0000"+
		"\u0000\u0000x\u0080\u0003\f\u0006\u0000y\u0080\u0005\u0007\u0000\u0000"+
		"z\u0080\u0005\u0013\u0000\u0000{|\u0005\u001e\u0000\u0000|\u0080\u0003"+
		"\u000e\u0007\u000e}~\u0005#\u0000\u0000~\u0080\u0003\u000e\u0007\r\u007f"+
		"_\u0001\u0000\u0000\u0000\u007fd\u0001\u0000\u0000\u0000\u007ff\u0001"+
		"\u0000\u0000\u0000\u007fh\u0001\u0000\u0000\u0000\u007fj\u0001\u0000\u0000"+
		"\u0000\u007fl\u0001\u0000\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u007f"+
		"y\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u00bd\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\n\f\u0000\u0000\u0082\u0083\u0007\u0002\u0000"+
		"\u0000\u0083\u00bc\u0003\u000e\u0007\r\u0084\u0085\n\u000b\u0000\u0000"+
		"\u0085\u0086\u0007\u0003\u0000\u0000\u0086\u00bc\u0003\u000e\u0007\f\u0087"+
		"\u0088\n\n\u0000\u0000\u0088\u0089\u0007\u0004\u0000\u0000\u0089\u00bc"+
		"\u0003\u000e\u0007\u000b\u008a\u008b\n\t\u0000\u0000\u008b\u008c\u0007"+
		"\u0005\u0000\u0000\u008c\u00bc\u0003\u000e\u0007\n\u008d\u008e\n\b\u0000"+
		"\u0000\u008e\u008f\u0007\u0006\u0000\u0000\u008f\u00bc\u0003\u000e\u0007"+
		"\t\u0090\u0091\n\u0007\u0000\u0000\u0091\u0092\u0005\u001b\u0000\u0000"+
		"\u0092\u00bc\u0003\u000e\u0007\b\u0093\u0094\n\u0006\u0000\u0000\u0094"+
		"\u0095\u0005\u001d\u0000\u0000\u0095\u00bc\u0003\u000e\u0007\u0007\u0096"+
		"\u0097\n\u0005\u0000\u0000\u0097\u0098\u0005\u001c\u0000\u0000\u0098\u00bc"+
		"\u0003\u000e\u0007\u0006\u0099\u009a\n\u0004\u0000\u0000\u009a\u009b\u0005"+
		"!\u0000\u0000\u009b\u00bc\u0003\u000e\u0007\u0005\u009c\u009d\n\u0003"+
		"\u0000\u0000\u009d\u009e\u0005\"\u0000\u0000\u009e\u00bc\u0003\u000e\u0007"+
		"\u0004\u009f\u00a0\n\u0002\u0000\u0000\u00a0\u00a1\u00053\u0000\u0000"+
		"\u00a1\u00a2\u0003\u000e\u0007\u0000\u00a2\u00a3\u00052\u0000\u0000\u00a3"+
		"\u00a4\u0003\u000e\u0007\u0002\u00a4\u00bc\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\n\u0001\u0000\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u00bc"+
		"\u0003\u000e\u0007\u0001\u00a8\u00a9\n\u001c\u0000\u0000\u00a9\u00ab\u0005"+
		"(\u0000\u0000\u00aa\u00ac\u0003*\u0015\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00bc\u0005\'\u0000\u0000\u00ae\u00b0\n\u001b\u0000\u0000"+
		"\u00af\u00b1\u0003\u0004\u0002\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\n\u001a\u0000\u0000\u00b5\u00bc\u0005%\u0000\u0000\u00b6"+
		"\u00b7\n\u0019\u0000\u0000\u00b7\u00bc\u0005&\u0000\u0000\u00b8\u00b9"+
		"\n\u0018\u0000\u0000\u00b9\u00ba\u00056\u0000\u0000\u00ba\u00bc\u0005"+
		"\u0013\u0000\u0000\u00bb\u0081\u0001\u0000\u0000\u0000\u00bb\u0084\u0001"+
		"\u0000\u0000\u0000\u00bb\u0087\u0001\u0000\u0000\u0000\u00bb\u008a\u0001"+
		"\u0000\u0000\u0000\u00bb\u008d\u0001\u0000\u0000\u0000\u00bb\u0090\u0001"+
		"\u0000\u0000\u0000\u00bb\u0093\u0001\u0000\u0000\u0000\u00bb\u0096\u0001"+
		"\u0000\u0000\u0000\u00bb\u0099\u0001\u0000\u0000\u0000\u00bb\u009c\u0001"+
		"\u0000\u0000\u0000\u00bb\u009f\u0001\u0000\u0000\u0000\u00bb\u00a5\u0001"+
		"\u0000\u0000\u0000\u00bb\u00a8\u0001\u0000\u0000\u0000\u00bb\u00ae\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00d0\u0005\b\u0000\u0000\u00c1\u00d0\u0005\t"+
		"\u0000\u0000\u00c2\u00d0\u0005\u0014\u0000\u0000\u00c3\u00d0\u00058\u0000"+
		"\u0000\u00c4\u00c5\u0005,\u0000\u0000\u00c5\u00ca\u0003\u0010\b\u0000"+
		"\u00c6\u00c7\u00055\u0000\u0000\u00c7\u00c9\u0003\u0010\b\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005+\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00c1\u0001\u0000\u0000\u0000\u00cf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00cf\u00c3\u0001\u0000\u0000\u0000\u00cf\u00c4"+
		"\u0001\u0000\u0000\u0000\u00d0\u0011\u0001\u0000\u0000\u0000\u00d1\u00dc"+
		"\u0003\u0016\u000b\u0000\u00d2\u00dc\u0003$\u0012\u0000\u00d3\u00dc\u0003"+
		"\"\u0011\u0000\u00d4\u00dc\u0003\u001e\u000f\u0000\u00d5\u00dc\u0003\u0018"+
		"\f\u0000\u00d6\u00dc\u0003\u001a\r\u0000\u00d7\u00dc\u0003\u0014\n\u0000"+
		"\u00d8\u00dc\u0003\u001c\u000e\u0000\u00d9\u00dc\u0003&\u0013\u0000\u00da"+
		"\u00dc\u0003\n\u0005\u0000\u00db\u00d1\u0001\u0000\u0000\u0000\u00db\u00d2"+
		"\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00d4"+
		"\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d6"+
		"\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u00054\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00e3\u0005"+
		",\u0000\u0000\u00e0\u00e2\u0003\u0012\t\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005+\u0000"+
		"\u0000\u00e7\u0017\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0010\u0000"+
		"\u0000\u00e9\u00ea\u00054\u0000\u0000\u00ea\u0019\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\u000f\u0000\u0000\u00ec\u00ed\u00054\u0000\u0000\u00ed"+
		"\u001b\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005\u0012\u0000\u0000\u00ef"+
		"\u00f1\u0003\u000e\u0007\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u00054\u0000\u0000\u00f3\u001d\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0011\u0000\u0000\u00f5\u00f6\u0005(\u0000\u0000\u00f6\u00f7\u0003"+
		"\u000e\u0007\u0000\u00f7\u00f8\u0005\'\u0000\u0000\u00f8\u00f9\u0003\u0012"+
		"\t\u0000\u00f9\u001f\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\r\u0000"+
		"\u0000\u00fb\u00fc\u0003\u0012\t\u0000\u00fc!\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005\f\u0000\u0000\u00fe\u00ff\u0005(\u0000\u0000\u00ff"+
		"\u0100\u0003\u000e\u0007\u0000\u0100\u0101\u0005\'\u0000\u0000\u0101\u0103"+
		"\u0003\u0012\t\u0000\u0102\u0104\u0003 \u0010\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104#\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106\u0108\u0005(\u0000"+
		"\u0000\u0107\u0109\u0003\u0012\t\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u010c\u0003\u000e\u0007\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u00054\u0000\u0000\u010e\u0110\u0003\u000e\u0007\u0000\u010f"+
		"\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\'\u0000\u0000\u0112\u0113"+
		"\u0003\u0012\t\u0000\u0113%\u0001\u0000\u0000\u0000\u0114\u0115\u0003"+
		"\u000e\u0007\u0000\u0115\u0116\u00054\u0000\u0000\u0116\'\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0003\u0006\u0003\u0000\u0118\u011f\u0003\b\u0004"+
		"\u0000\u0119\u011a\u00055\u0000\u0000\u011a\u011b\u0003\u0006\u0003\u0000"+
		"\u011b\u011c\u0003\b\u0004\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d"+
		"\u0119\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		")\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0127"+
		"\u0003\u000e\u0007\u0000\u0123\u0124\u00055\u0000\u0000\u0124\u0126\u0003"+
		"\u000e\u0007\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128+\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0003\u0006\u0003\u0000\u012b\u012c\u0005\u0013"+
		"\u0000\u0000\u012c\u012e\u0005(\u0000\u0000\u012d\u012f\u0003(\u0014\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005\'\u0000\u0000\u0131"+
		"\u0132\u0003\u0016\u000b\u0000\u0132-\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005\u0013\u0000\u0000\u0134\u0135\u0005(\u0000\u0000\u0135\u0136\u0005"+
		"\'\u0000\u0000\u0136\u0137\u0003\u0016\u000b\u0000\u0137/\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005\u0006\u0000\u0000\u0139\u013a\u0005\u0013"+
		"\u0000\u0000\u013a\u0140\u0005,\u0000\u0000\u013b\u013f\u0003\n\u0005"+
		"\u0000\u013c\u013f\u0003,\u0016\u0000\u013d\u013f\u0003.\u0017\u0000\u013e"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005+\u0000\u0000\u0144\u0145\u00054\u0000\u0000\u01451\u0001"+
		"\u0000\u0000\u0000\u0146\u0153\u0005;\u0000\u0000\u0147\u0148\u0005<\u0000"+
		"\u0000\u0148\u014d\u0003\u000e\u0007\u0000\u0149\u014a\u0005=\u0000\u0000"+
		"\u014a\u014c\u0003\u000e\u0007\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005>\u0000\u0000\u0151"+
		"\u0153\u0001\u0000\u0000\u0000\u0152\u0146\u0001\u0000\u0000\u0000\u0152"+
		"\u0147\u0001\u0000\u0000\u0000\u01533\u0001\u0000\u0000\u0000\u001d79"+
		"BJPXqv\u007f\u00ab\u00b2\u00bb\u00bd\u00ca\u00cf\u00db\u00e3\u00f0\u0103"+
		"\u0108\u010b\u010f\u011f\u0127\u012e\u013e\u0140\u014d\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}