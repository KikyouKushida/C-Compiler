// Generated from ./MxParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Void=2, Bool=3, String=4, New=5, Class=6, This=7, True=8, False=9, 
		Null=10, For=11, If=12, Else=13, Else_if=14, Break=15, Continue=16, While=17, 
		Return=18, Identifier=19, Integer=20, Greater=21, Less=22, GreaterEqual=23, 
		LessEqual=24, Equal=25, NotEqual=26, BitwiseAnd=27, BitwiseOr=28, BitwiseXor=29, 
		BitwiseNot=30, BitwiseRightShift=31, BitwiseLeftShift=32, LogicAnd=33, 
		LogicOr=34, LogicNot=35, Assign=36, SelfIncrement=37, SelfDecrement=38, 
		RightParenthesis=39, LeftParenthesis=40, RightBracket=41, LeftBracket=42, 
		RightBrace=43, LeftBrace=44, Add=45, Substract=46, Multiply=47, Divide=48, 
		Mod=49, Colon=50, QuestionMark=51, Semicolon=52, Comma=53, Member=54, 
		WhiteSpace=55, Cstring=56, CommentLine=57, CommentBlock=58;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_arrayUnit = 2, RULE_typename = 3, 
		RULE_variableConstructor = 4, RULE_variableDef = 5, RULE_constant = 6, 
		RULE_expression = 7, RULE_statement = 8, RULE_emptyStatement = 9, RULE_blockStatement = 10, 
		RULE_continueStatement = 11, RULE_breakStatement = 12, RULE_returnStatement = 13, 
		RULE_whileStatement = 14, RULE_elseStatement = 15, RULE_ifStatement = 16, 
		RULE_forStatement = 17, RULE_expressionStatement = 18, RULE_parameterList1 = 19, 
		RULE_parameterList2 = 20, RULE_functionDef = 21, RULE_classConstructor = 22, 
		RULE_classDef = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "arrayUnit", "typename", "variableConstructor", "variableDef", 
			"constant", "expression", "statement", "emptyStatement", "blockStatement", 
			"continueStatement", "breakStatement", "returnStatement", "whileStatement", 
			"elseStatement", "ifStatement", "forStatement", "expressionStatement", 
			"parameterList1", "parameterList2", "functionDef", "classConstructor", 
			"classDef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'void'", "'bool'", "'string'", "'new'", "'class'", "'this'", 
			"'true'", "'false'", "'null'", "'For'", "'if'", "'else'", "'else if'", 
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
			null, "Int", "Void", "Bool", "String", "New", "Class", "This", "True", 
			"False", "Null", "For", "If", "Else", "Else_if", "Break", "Continue", 
			"While", "Return", "Identifier", "Integer", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "BitwiseAnd", "BitwiseOr", "BitwiseXor", 
			"BitwiseNot", "BitwiseRightShift", "BitwiseLeftShift", "LogicAnd", "LogicOr", 
			"LogicNot", "Assign", "SelfIncrement", "SelfDecrement", "RightParenthesis", 
			"LeftParenthesis", "RightBracket", "LeftBracket", "RightBrace", "LeftBrace", 
			"Add", "Substract", "Multiply", "Divide", "Mod", "Colon", "QuestionMark", 
			"Semicolon", "Comma", "Member", "WhiteSpace", "Cstring", "CommentLine", 
			"CommentBlock"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Void) | (1L << Bool) | (1L << String) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					variableDef();
					}
					break;
				case 2:
					{
					setState(49);
					classDef();
					}
					break;
				case 3:
					{
					setState(50);
					functionDef();
					}
					break;
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Void) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) ) {
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

	public static class ArrayUnitContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(MxParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxParser.RightBracket, i);
		}
		public List<TerminalNode> Integer() { return getTokens(MxParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(MxParser.Integer, i);
		}
		public ArrayUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterArrayUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitArrayUnit(this);
		}
	}

	public final ArrayUnitContext arrayUnit() throws RecognitionException {
		ArrayUnitContext _localctx = new ArrayUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					match(LeftBracket);
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Integer) {
						{
						setState(61);
						match(Integer);
						}
					}

					setState(64);
					match(RightBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			type();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket) {
				{
				{
				setState(70);
				arrayUnit();
				}
				}
				setState(75);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterVariableConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitVariableConstructor(this);
		}
	}

	public final VariableConstructorContext variableConstructor() throws RecognitionException {
		VariableConstructorContext _localctx = new VariableConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((VariableConstructorContext)_localctx).name = match(Identifier);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(77);
				match(Assign);
				setState(78);
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
		public List<TerminalNode> Comma() { return getTokens(MxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxParser.Comma, i);
		}
		public VariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterVariableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitVariableDef(this);
		}
	}

	public final VariableDefContext variableDef() throws RecognitionException {
		VariableDefContext _localctx = new VariableDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			typename();
			setState(82);
			variableConstructor();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(83);
				match(Comma);
				setState(84);
				variableConstructor();
				}
				}
				setState(89);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(MxParser.Integer, 0); }
		public TerminalNode Cstring() { return getToken(MxParser.Cstring, 0); }
		public TerminalNode True() { return getToken(MxParser.True, 0); }
		public TerminalNode False() { return getToken(MxParser.False, 0); }
		public TerminalNode Null() { return getToken(MxParser.Null, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << True) | (1L << False) | (1L << Null) | (1L << Integer) | (1L << Cstring))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext a;
		public Token op;
		public Token op1;
		public ExpressionContext b;
		public Token op2;
		public ExpressionContext c;
		public Token member;
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode This() { return getToken(MxParser.This, 0); }
		public TerminalNode Identifier() { return getToken(MxParser.Identifier, 0); }
		public TerminalNode BitwiseNot() { return getToken(MxParser.BitwiseNot, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Substract() { return getToken(MxParser.Substract, 0); }
		public TerminalNode LogicNot() { return getToken(MxParser.LogicNot, 0); }
		public TerminalNode SelfIncrement() { return getToken(MxParser.SelfIncrement, 0); }
		public TerminalNode SelfDecrement() { return getToken(MxParser.SelfDecrement, 0); }
		public TerminalNode Multiply() { return getToken(MxParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(MxParser.Divide, 0); }
		public TerminalNode Mod() { return getToken(MxParser.Mod, 0); }
		public TerminalNode Add() { return getToken(MxParser.Add, 0); }
		public TerminalNode BitwiseLeftShift() { return getToken(MxParser.BitwiseLeftShift, 0); }
		public TerminalNode BitwiseRightShift() { return getToken(MxParser.BitwiseRightShift, 0); }
		public TerminalNode Less() { return getToken(MxParser.Less, 0); }
		public TerminalNode Greater() { return getToken(MxParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(MxParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MxParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(MxParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MxParser.NotEqual, 0); }
		public TerminalNode BitwiseAnd() { return getToken(MxParser.BitwiseAnd, 0); }
		public TerminalNode BitwiseXor() { return getToken(MxParser.BitwiseXor, 0); }
		public TerminalNode BitwiseOr() { return getToken(MxParser.BitwiseOr, 0); }
		public TerminalNode LogicAnd() { return getToken(MxParser.LogicAnd, 0); }
		public TerminalNode LogicOr() { return getToken(MxParser.LogicOr, 0); }
		public TerminalNode QuestionMark() { return getToken(MxParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(MxParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(MxParser.Assign, 0); }
		public ParameterList2Context parameterList2() {
			return getRuleContext(ParameterList2Context.class,0);
		}
		public TerminalNode Member() { return getToken(MxParser.Member, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitExpression(this);
		}
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(93);
				match(New);
				setState(94);
				type();
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						arrayUnit();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(101);
					match(LeftParenthesis);
					setState(102);
					match(RightParenthesis);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(105);
				constant();
				}
				break;
			case 3:
				{
				setState(106);
				match(This);
				}
				break;
			case 4:
				{
				setState(107);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(108);
				match(BitwiseNot);
				setState(109);
				expression(23);
				}
				break;
			case 6:
				{
				setState(110);
				match(Substract);
				setState(111);
				expression(22);
				}
				break;
			case 7:
				{
				setState(112);
				match(LogicNot);
				setState(113);
				expression(21);
				}
				break;
			case 8:
				{
				setState(114);
				match(SelfIncrement);
				setState(115);
				expression(20);
				}
				break;
			case 9:
				{
				setState(116);
				match(SelfDecrement);
				setState(117);
				expression(18);
				}
				break;
			case 10:
				{
				setState(118);
				match(LeftParenthesis);
				setState(119);
				expression(0);
				setState(120);
				match(RightParenthesis);
				}
				break;
			case 11:
				{
				setState(122);
				match(Identifier);
				setState(123);
				arrayUnit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(127);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Mod))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(130);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(133);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BitwiseRightShift || _la==BitwiseLeftShift) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(136);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(139);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(142);
						((ExpressionContext)_localctx).op = match(BitwiseAnd);
						setState(143);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(145);
						((ExpressionContext)_localctx).op = match(BitwiseXor);
						setState(146);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						((ExpressionContext)_localctx).op = match(BitwiseOr);
						setState(149);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						((ExpressionContext)_localctx).op = match(LogicAnd);
						setState(152);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						((ExpressionContext)_localctx).op = match(LogicOr);
						setState(155);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						((ExpressionContext)_localctx).op1 = match(QuestionMark);
						setState(158);
						((ExpressionContext)_localctx).b = expression(0);
						setState(159);
						((ExpressionContext)_localctx).op2 = match(Colon);
						setState(160);
						((ExpressionContext)_localctx).c = expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(163);
						match(Assign);
						setState(164);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(166);
						match(SelfIncrement);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(168);
						match(SelfDecrement);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						match(LeftParenthesis);
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(171);
							parameterList2();
							}
						}

						setState(174);
						match(RightParenthesis);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(Member);
						setState(177);
						((ExpressionContext)_localctx).member = match(Identifier);
						}
						break;
					}
					} 
				}
				setState(182);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				emptyStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(192);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LeftBrace);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Void) | (1L << Bool) | (1L << String) | (1L << New) | (1L << This) | (1L << True) | (1L << False) | (1L << Null) | (1L << For) | (1L << If) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << Identifier) | (1L << Integer) | (1L << BitwiseNot) | (1L << LogicNot) | (1L << SelfIncrement) | (1L << SelfDecrement) | (1L << LeftParenthesis) | (1L << LeftBrace) | (1L << Substract) | (1L << Semicolon) | (1L << Cstring))) != 0)) {
				{
				{
				setState(198);
				statement();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(MxParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Continue);
			setState(207);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(MxParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Break);
			setState(210);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Return);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << This) | (1L << True) | (1L << False) | (1L << Null) | (1L << Identifier) | (1L << Integer) | (1L << BitwiseNot) | (1L << LogicNot) | (1L << SelfIncrement) | (1L << SelfDecrement) | (1L << LeftParenthesis) | (1L << Substract) | (1L << Cstring))) != 0)) {
				{
				setState(213);
				expression(0);
				}
			}

			setState(216);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public TerminalNode LeftBrace() { return getToken(MxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(LeftParenthesis);
			setState(219);
			expression(0);
			setState(220);
			match(RightParenthesis);
			setState(221);
			match(LeftBrace);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Void) | (1L << Bool) | (1L << String) | (1L << New) | (1L << This) | (1L << True) | (1L << False) | (1L << Null) | (1L << For) | (1L << If) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << Identifier) | (1L << Integer) | (1L << BitwiseNot) | (1L << LogicNot) | (1L << SelfIncrement) | (1L << SelfDecrement) | (1L << LeftParenthesis) | (1L << LeftBrace) | (1L << Substract) | (1L << Semicolon) | (1L << Cstring))) != 0)) {
				{
				{
				setState(222);
				statement();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(228);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(MxParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(Else);
			setState(231);
			statement();
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

	public static class IfStatementContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(If);
			setState(234);
			match(LeftParenthesis);
			setState(235);
			expression(0);
			setState(236);
			match(RightParenthesis);
			setState(237);
			statement();
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(238);
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

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext Initialization;
		public ExpressionStatementContext Condition;
		public ExpressionStatementContext Step;
		public TerminalNode For() { return getToken(MxParser.For, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MxParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MxParser.RightParenthesis, 0); }
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(For);
			setState(242);
			match(LeftParenthesis);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(243);
				((ForStatementContext)_localctx).Initialization = statement();
				}
				break;
			}
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(246);
				((ForStatementContext)_localctx).Condition = expressionStatement();
				}
				break;
			}
			setState(249);
			((ForStatementContext)_localctx).Step = expressionStatement();
			setState(250);
			match(RightParenthesis);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MxParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expression(0);
			setState(253);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterParameterList1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitParameterList1(this);
		}
	}

	public final ParameterList1Context parameterList1() throws RecognitionException {
		ParameterList1Context _localctx = new ParameterList1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterList1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			typename();
			setState(256);
			variableConstructor();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(257);
				match(Comma);
				setState(258);
				typename();
				setState(259);
				variableConstructor();
				}
				}
				setState(265);
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

	public static class ParameterList2Context extends ParserRuleContext {
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
		public ParameterList2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterParameterList2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitParameterList2(this);
		}
	}

	public final ParameterList2Context parameterList2() throws RecognitionException {
		ParameterList2Context _localctx = new ParameterList2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			variableConstructor();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(267);
				match(Comma);
				setState(268);
				variableConstructor();
				}
				}
				setState(273);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitFunctionDef(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			typename();
			setState(275);
			((FunctionDefContext)_localctx).name = match(Identifier);
			setState(276);
			match(LeftParenthesis);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Void) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(277);
				parameterList1();
				}
			}

			setState(280);
			match(RightParenthesis);
			setState(281);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitClassConstructor(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((ClassConstructorContext)_localctx).name = match(Identifier);
			setState(284);
			match(LeftParenthesis);
			setState(285);
			match(RightParenthesis);
			setState(286);
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

	public static class ClassDefContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Class() { return getToken(MxParser.Class, 0); }
		public TerminalNode LeftBrace() { return getToken(MxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxParser.RightBrace, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(MxParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MxParser.Semicolon, i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitClassDef(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Class);
			setState(289);
			((ClassDefContext)_localctx).name = match(Identifier);
			setState(290);
			match(LeftBrace);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Void) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(291);
					variableDef();
					setState(292);
					match(Semicolon);
					}
					break;
				case 2:
					{
					setState(294);
					functionDef();
					}
					break;
				case 3:
					{
					setState(295);
					classConstructor();
					}
					break;
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(RightBrace);
			setState(302);
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
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4A\n"+
		"\4\3\4\6\4D\n\4\r\4\16\4E\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6"+
		"\5\6R\n\6\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\7\tc\n\t\f\t\16\tf\13\t\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00c4\n\n\3\13\3\13\3\f\3\f\7\f\u00ca\n\f\f\f\16\f\u00cd\13\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\5\17\u00d9\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f2\n\22\3\23"+
		"\3\23\3\23\5\23\u00f7\n\23\3\23\5\23\u00fa\n\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0108\n\25\f\25\16\25\u010b"+
		"\13\25\3\26\3\26\3\26\7\26\u0110\n\26\f\26\16\26\u0113\13\26\3\27\3\27"+
		"\3\27\3\27\5\27\u0119\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u012b\n\31\f\31\16\31\u012e\13"+
		"\31\3\31\3\31\3\31\3\31\2\3\20\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\t\4\2\3\6\25\25\5\2\n\f\26\26::\3\2\61\63\3\2/\60\3"+
		"\2!\"\3\2\27\32\3\2\33\34\2\u0154\2\67\3\2\2\2\4<\3\2\2\2\6C\3\2\2\2\b"+
		"G\3\2\2\2\nN\3\2\2\2\fS\3\2\2\2\16\\\3\2\2\2\20~\3\2\2\2\22\u00c3\3\2"+
		"\2\2\24\u00c5\3\2\2\2\26\u00c7\3\2\2\2\30\u00d0\3\2\2\2\32\u00d3\3\2\2"+
		"\2\34\u00d6\3\2\2\2\36\u00dc\3\2\2\2 \u00e8\3\2\2\2\"\u00eb\3\2\2\2$\u00f3"+
		"\3\2\2\2&\u00fe\3\2\2\2(\u0101\3\2\2\2*\u010c\3\2\2\2,\u0114\3\2\2\2."+
		"\u011d\3\2\2\2\60\u0122\3\2\2\2\62\66\5\f\7\2\63\66\5\60\31\2\64\66\5"+
		",\27\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<=\t\2\2\2"+
		"=\5\3\2\2\2>@\7,\2\2?A\7\26\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7+\2\2"+
		"C>\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GK\5\4\3\2HJ\5\6\4"+
		"\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NQ\7\25"+
		"\2\2OP\7&\2\2PR\5\20\t\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2ST\5\b\5\2TY\5"+
		"\n\6\2UV\7\67\2\2VX\5\n\6\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\r"+
		"\3\2\2\2[Y\3\2\2\2\\]\t\3\2\2]\17\3\2\2\2^_\b\t\1\2_`\7\7\2\2`d\5\4\3"+
		"\2ac\5\6\4\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3\2\2\2fd\3\2\2"+
		"\2gh\7*\2\2hj\7)\2\2ig\3\2\2\2ij\3\2\2\2j\177\3\2\2\2k\177\5\16\b\2l\177"+
		"\7\t\2\2m\177\7\25\2\2no\7 \2\2o\177\5\20\t\31pq\7\60\2\2q\177\5\20\t"+
		"\30rs\7%\2\2s\177\5\20\t\27tu\7\'\2\2u\177\5\20\t\26vw\7(\2\2w\177\5\20"+
		"\t\24xy\7*\2\2yz\5\20\t\2z{\7)\2\2{\177\3\2\2\2|}\7\25\2\2}\177\5\6\4"+
		"\2~^\3\2\2\2~k\3\2\2\2~l\3\2\2\2~m\3\2\2\2~n\3\2\2\2~p\3\2\2\2~r\3\2\2"+
		"\2~t\3\2\2\2~v\3\2\2\2~x\3\2\2\2~|\3\2\2\2\177\u00b6\3\2\2\2\u0080\u0081"+
		"\f\22\2\2\u0081\u0082\t\4\2\2\u0082\u00b5\5\20\t\23\u0083\u0084\f\21\2"+
		"\2\u0084\u0085\t\5\2\2\u0085\u00b5\5\20\t\22\u0086\u0087\f\20\2\2\u0087"+
		"\u0088\t\6\2\2\u0088\u00b5\5\20\t\21\u0089\u008a\f\17\2\2\u008a\u008b"+
		"\t\7\2\2\u008b\u00b5\5\20\t\20\u008c\u008d\f\16\2\2\u008d\u008e\t\b\2"+
		"\2\u008e\u00b5\5\20\t\17\u008f\u0090\f\r\2\2\u0090\u0091\7\35\2\2\u0091"+
		"\u00b5\5\20\t\16\u0092\u0093\f\f\2\2\u0093\u0094\7\37\2\2\u0094\u00b5"+
		"\5\20\t\r\u0095\u0096\f\13\2\2\u0096\u0097\7\36\2\2\u0097\u00b5\5\20\t"+
		"\f\u0098\u0099\f\n\2\2\u0099\u009a\7#\2\2\u009a\u00b5\5\20\t\13\u009b"+
		"\u009c\f\t\2\2\u009c\u009d\7$\2\2\u009d\u00b5\5\20\t\n\u009e\u009f\f\b"+
		"\2\2\u009f\u00a0\7\65\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\64\2\2\u00a2"+
		"\u00a3\5\20\t\b\u00a3\u00b5\3\2\2\2\u00a4\u00a5\f\3\2\2\u00a5\u00a6\7"+
		"&\2\2\u00a6\u00b5\5\20\t\3\u00a7\u00a8\f\25\2\2\u00a8\u00b5\7\'\2\2\u00a9"+
		"\u00aa\f\23\2\2\u00aa\u00b5\7(\2\2\u00ab\u00ac\f\5\2\2\u00ac\u00ae\7*"+
		"\2\2\u00ad\u00af\5*\26\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b5\7)\2\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\78\2"+
		"\2\u00b3\u00b5\7\25\2\2\u00b4\u0080\3\2\2\2\u00b4\u0083\3\2\2\2\u00b4"+
		"\u0086\3\2\2\2\u00b4\u0089\3\2\2\2\u00b4\u008c\3\2\2\2\u00b4\u008f\3\2"+
		"\2\2\u00b4\u0092\3\2\2\2\u00b4\u0095\3\2\2\2\u00b4\u0098\3\2\2\2\u00b4"+
		"\u009b\3\2\2\2\u00b4\u009e\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a7\3\2"+
		"\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\21\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b9\u00c4\5\26\f\2\u00ba\u00c4\5$\23\2\u00bb"+
		"\u00c4\5\"\22\2\u00bc\u00c4\5\36\20\2\u00bd\u00c4\5\30\r\2\u00be\u00c4"+
		"\5\32\16\2\u00bf\u00c4\5\24\13\2\u00c0\u00c4\5\34\17\2\u00c1\u00c4\5&"+
		"\24\2\u00c2\u00c4\5\f\7\2\u00c3\u00b9\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2"+
		"\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7\66\2\2\u00c6\25\3\2\2\2"+
		"\u00c7\u00cb\7.\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\22\2"+
		"\2\u00d1\u00d2\7\66\2\2\u00d2\31\3\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5"+
		"\7\66\2\2\u00d5\33\3\2\2\2\u00d6\u00d8\7\24\2\2\u00d7\u00d9\5\20\t\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\66"+
		"\2\2\u00db\35\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\u00de\5\20\t\2\u00de\u00df"+
		"\7)\2\2\u00df\u00e3\7.\2\2\u00e0\u00e2\5\22\n\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7\37\3\2\2\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9\u00ea\5\22\n\2\u00ea!\3\2\2\2\u00eb\u00ec\7\16\2\2\u00ec"+
		"\u00ed\7*\2\2\u00ed\u00ee\5\20\t\2\u00ee\u00ef\7)\2\2\u00ef\u00f1\5\22"+
		"\n\2\u00f0\u00f2\5 \21\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"#\3\2\2\2\u00f3\u00f4\7\r\2\2\u00f4\u00f6\7*\2\2\u00f5\u00f7\5\22\n\2"+
		"\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa"+
		"\5&\24\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\5&\24\2\u00fc\u00fd\7)\2\2\u00fd%\3\2\2\2\u00fe\u00ff\5\20\t\2"+
		"\u00ff\u0100\7\66\2\2\u0100\'\3\2\2\2\u0101\u0102\5\b\5\2\u0102\u0109"+
		"\5\n\6\2\u0103\u0104\7\67\2\2\u0104\u0105\5\b\5\2\u0105\u0106\5\n\6\2"+
		"\u0106\u0108\3\2\2\2\u0107\u0103\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a)\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u0111\5\n\6\2\u010d\u010e\7\67\2\2\u010e\u0110\5\n\6\2\u010f\u010d\3"+
		"\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"+\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\5\b\5\2\u0115\u0116\7\25\2\2"+
		"\u0116\u0118\7*\2\2\u0117\u0119\5(\25\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7)\2\2\u011b\u011c\5\26\f\2\u011c"+
		"-\3\2\2\2\u011d\u011e\7\25\2\2\u011e\u011f\7*\2\2\u011f\u0120\7)\2\2\u0120"+
		"\u0121\5\26\f\2\u0121/\3\2\2\2\u0122\u0123\7\b\2\2\u0123\u0124\7\25\2"+
		"\2\u0124\u012c\7.\2\2\u0125\u0126\5\f\7\2\u0126\u0127\7\66\2\2\u0127\u012b"+
		"\3\2\2\2\u0128\u012b\5,\27\2\u0129\u012b\5.\30\2\u012a\u0125\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\7-\2\2\u0130\u0131\7\66\2\2\u0131\61\3\2\2\2\33\65\67@EKQYdi~\u00ae"+
		"\u00b4\u00b6\u00c3\u00cb\u00d8\u00e3\u00f1\u00f6\u00f9\u0109\u0111\u0118"+
		"\u012a\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}