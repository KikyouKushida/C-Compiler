// Generated from /home/remosk/compiler/lexer&parser/MxParser.g4 by ANTLR 4.13.1
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
		RULE_variableConstructor = 4, RULE_variableDef = 5, RULE_expression = 6, 
		RULE_statement = 7, RULE_emptyStatement = 8, RULE_blockStatement = 9, 
		RULE_continueStatement = 10, RULE_breakStatement = 11, RULE_returnStatement = 12, 
		RULE_whileStatement = 13, RULE_elseStatement = 14, RULE_ifStatement = 15, 
		RULE_forStatement = 16, RULE_expressionStatement = 17, RULE_parameterList = 18, 
		RULE_functionDef = 19, RULE_classConstructor = 20, RULE_classDef = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "arrayUnit", "typename", "variableConstructor", "variableDef", 
			"expression", "statement", "emptyStatement", "blockStatement", "continueStatement", 
			"breakStatement", "returnStatement", "whileStatement", "elseStatement", 
			"ifStatement", "forStatement", "expressionStatement", "parameterList", 
			"functionDef", "classConstructor", "classDef"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524382L) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					variableDef();
					}
					break;
				case 2:
					{
					setState(45);
					classDef();
					}
					break;
				case 3:
					{
					setState(46);
					functionDef();
					}
					break;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
			setState(54);
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
	}

	public final ArrayUnitContext arrayUnit() throws RecognitionException {
		ArrayUnitContext _localctx = new ArrayUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					match(LeftBracket);
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Integer) {
						{
						setState(57);
						match(Integer);
						}
					}

					setState(60);
					match(RightBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
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
			setState(65);
			type();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket) {
				{
				{
				setState(66);
				arrayUnit();
				}
				}
				setState(71);
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
			setState(72);
			((VariableConstructorContext)_localctx).name = match(Identifier);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(73);
				match(Assign);
				setState(74);
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
			setState(77);
			typename();
			setState(78);
			variableConstructor();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(79);
				match(Comma);
				setState(80);
				variableConstructor();
				}
				}
				setState(85);
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
		public TerminalNode Integer() { return getToken(MxParser.Integer, 0); }
		public TerminalNode Cstring() { return getToken(MxParser.Cstring, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MxParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MxParser.Identifier, i);
		}
		public TerminalNode True() { return getToken(MxParser.True, 0); }
		public TerminalNode False() { return getToken(MxParser.False, 0); }
		public TerminalNode Null() { return getToken(MxParser.Null, 0); }
		public TerminalNode This() { return getToken(MxParser.This, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Member() { return getToken(MxParser.Member, 0); }
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(87);
				match(New);
				setState(88);
				type();
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						arrayUnit();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(95);
					match(LeftParenthesis);
					setState(96);
					match(RightParenthesis);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(99);
				match(Integer);
				}
				break;
			case 3:
				{
				setState(100);
				match(Cstring);
				}
				break;
			case 4:
				{
				setState(101);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(102);
				match(True);
				}
				break;
			case 6:
				{
				setState(103);
				match(False);
				}
				break;
			case 7:
				{
				setState(104);
				match(Null);
				}
				break;
			case 8:
				{
				setState(105);
				match(This);
				}
				break;
			case 9:
				{
				setState(106);
				match(Identifier);
				setState(107);
				match(LeftParenthesis);
				setState(108);
				parameterList();
				setState(109);
				match(RightParenthesis);
				}
				break;
			case 10:
				{
				setState(111);
				match(Identifier);
				setState(112);
				match(Member);
				setState(113);
				match(Identifier);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(114);
					match(LeftParenthesis);
					setState(115);
					parameterList();
					setState(116);
					match(RightParenthesis);
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(120);
				match(BitwiseNot);
				setState(121);
				expression(23);
				}
				break;
			case 12:
				{
				setState(122);
				match(Substract);
				setState(123);
				expression(22);
				}
				break;
			case 13:
				{
				setState(124);
				match(LogicNot);
				setState(125);
				expression(21);
				}
				break;
			case 14:
				{
				setState(126);
				match(SelfIncrement);
				setState(127);
				expression(20);
				}
				break;
			case 15:
				{
				setState(128);
				match(SelfDecrement);
				setState(129);
				expression(18);
				}
				break;
			case 16:
				{
				setState(130);
				match(LeftParenthesis);
				setState(131);
				expression(0);
				setState(132);
				match(RightParenthesis);
				}
				break;
			case 17:
				{
				setState(134);
				match(Identifier);
				setState(135);
				arrayUnit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(139);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(142);
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
						setState(143);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(145);
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
						setState(146);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(148);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(151);
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
						setState(152);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(154);
						((ExpressionContext)_localctx).op = match(BitwiseAnd);
						setState(155);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(157);
						((ExpressionContext)_localctx).op = match(BitwiseXor);
						setState(158);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(160);
						((ExpressionContext)_localctx).op = match(BitwiseOr);
						setState(161);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(163);
						((ExpressionContext)_localctx).op = match(LogicAnd);
						setState(164);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(166);
						((ExpressionContext)_localctx).op = match(LogicOr);
						setState(167);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(169);
						((ExpressionContext)_localctx).op1 = match(QuestionMark);
						setState(170);
						((ExpressionContext)_localctx).b = expression(0);
						setState(171);
						((ExpressionContext)_localctx).op2 = match(Colon);
						setState(172);
						((ExpressionContext)_localctx).c = expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(175);
						match(Assign);
						setState(176);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(178);
						match(SelfIncrement);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(180);
						match(SelfDecrement);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(LeftParenthesis);
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524318L) != 0)) {
							{
							setState(183);
							parameterList();
							}
						}

						setState(186);
						match(RightParenthesis);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(Member);
						setState(189);
						((ExpressionContext)_localctx).member = match(Identifier);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				emptyStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
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
		enterRule(_localctx, 16, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 18, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LeftBrace);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76650701859430334L) != 0)) {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
		enterRule(_localctx, 20, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Continue);
			setState(219);
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
		enterRule(_localctx, 22, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Break);
			setState(222);
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
		enterRule(_localctx, 24, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Return);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72129510045648800L) != 0)) {
				{
				setState(225);
				expression(0);
				}
			}

			setState(228);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LeftParenthesis);
			setState(231);
			expression(0);
			setState(232);
			match(RightParenthesis);
			setState(233);
			match(LeftBrace);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76650701859430334L) != 0)) {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(240);
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
	public static class ElseStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 28, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(Else);
			setState(243);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(If);
			setState(246);
			match(LeftParenthesis);
			setState(247);
			expression(0);
			setState(248);
			match(RightParenthesis);
			setState(249);
			statement();
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(250);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(For);
			setState(254);
			match(LeftParenthesis);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(255);
				((ForStatementContext)_localctx).Initialization = statement();
				}
				break;
			}
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(258);
				((ForStatementContext)_localctx).Condition = expressionStatement();
				}
				break;
			}
			setState(261);
			((ForStatementContext)_localctx).Step = expressionStatement();
			setState(262);
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
		enterRule(_localctx, 34, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expression(0);
			setState(265);
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
	public static class ParameterListContext extends ParserRuleContext {
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
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			typename();
			setState(268);
			variableConstructor();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(269);
				match(Comma);
				setState(270);
				typename();
				setState(271);
				variableConstructor();
				}
				}
				setState(277);
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
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			typename();
			setState(279);
			((FunctionDefContext)_localctx).name = match(Identifier);
			setState(280);
			match(LeftParenthesis);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524318L) != 0)) {
				{
				setState(281);
				parameterList();
				}
			}

			setState(284);
			match(RightParenthesis);
			setState(285);
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
		enterRule(_localctx, 40, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((ClassConstructorContext)_localctx).name = match(Identifier);
			setState(288);
			match(LeftParenthesis);
			setState(289);
			match(RightParenthesis);
			setState(290);
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
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Class);
			setState(293);
			((ClassDefContext)_localctx).name = match(Identifier);
			setState(294);
			match(LeftBrace);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524318L) != 0)) {
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(295);
					variableDef();
					setState(296);
					match(Semicolon);
					}
					break;
				case 2:
					{
					setState(298);
					functionDef();
					}
					break;
				case 3:
					{
					setState(299);
					classConstructor();
					}
					break;
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(RightBrace);
			setState(306);
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
		case 6:
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
		"\u0004\u0001:\u0135\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0004\u0002>\b\u0002\u000b"+
		"\u0002\f\u0002?\u0001\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003\f"+
		"\u0003G\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005R\b\u0005"+
		"\n\u0005\f\u0005U\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006[\b\u0006\n\u0006\f\u0006^\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006w\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b9\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bf\b\u0006\n\u0006"+
		"\f\u0006\u00c2\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ce\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00d4"+
		"\b\t\n\t\f\t\u00d7\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00e3\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ec\b\r\n\r\f\r\u00ef"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fc"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010"+
		"\u0001\u0010\u0003\u0010\u0104\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0112\b\u0012\n\u0012"+
		"\f\u0012\u0115\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u011b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u012d\b\u0015\n\u0015\f\u0015\u0130\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0000\u0001\f\u0016\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0006\u0002\u0000\u0001\u0004\u0013\u0013\u0001\u0000/1\u0001\u0000-"+
		".\u0001\u0000\u001f \u0001\u0000\u0015\u0018\u0001\u0000\u0019\u001a\u015e"+
		"\u00001\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004="+
		"\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bH\u0001\u0000"+
		"\u0000\u0000\nM\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000\u0000\u0000"+
		"\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00cf\u0001\u0000\u0000\u0000"+
		"\u0012\u00d1\u0001\u0000\u0000\u0000\u0014\u00da\u0001\u0000\u0000\u0000"+
		"\u0016\u00dd\u0001\u0000\u0000\u0000\u0018\u00e0\u0001\u0000\u0000\u0000"+
		"\u001a\u00e6\u0001\u0000\u0000\u0000\u001c\u00f2\u0001\u0000\u0000\u0000"+
		"\u001e\u00f5\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\""+
		"\u0108\u0001\u0000\u0000\u0000$\u010b\u0001\u0000\u0000\u0000&\u0116\u0001"+
		"\u0000\u0000\u0000(\u011f\u0001\u0000\u0000\u0000*\u0124\u0001\u0000\u0000"+
		"\u0000,0\u0003\n\u0005\u0000-0\u0003*\u0015\u0000.0\u0003&\u0013\u0000"+
		"/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005"+
		"\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u000067\u0007\u0000\u0000"+
		"\u00007\u0003\u0001\u0000\u0000\u00008:\u0005*\u0000\u00009;\u0005\u0014"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0005)\u0000\u0000=8\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@\u0005\u0001\u0000\u0000\u0000AE\u0003\u0002\u0001\u0000BD\u0003\u0004"+
		"\u0002\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HK\u0005\u0013\u0000\u0000IJ\u0005$\u0000"+
		"\u0000JL\u0003\f\u0006\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000L\t\u0001\u0000\u0000\u0000MN\u0003\u0006\u0003\u0000NS\u0003\b"+
		"\u0004\u0000OP\u00055\u0000\u0000PR\u0003\b\u0004\u0000QO\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T\u000b\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VW\u0006\u0006\uffff\uffff\u0000WX\u0005\u0005\u0000\u0000X\\\u0003"+
		"\u0002\u0001\u0000Y[\u0003\u0004\u0002\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]a\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005(\u0000"+
		"\u0000`b\u0005\'\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b\u0089\u0001\u0000\u0000\u0000c\u0089\u0005\u0014\u0000\u0000d"+
		"\u0089\u00058\u0000\u0000e\u0089\u0005\u0013\u0000\u0000f\u0089\u0005"+
		"\b\u0000\u0000g\u0089\u0005\t\u0000\u0000h\u0089\u0005\n\u0000\u0000i"+
		"\u0089\u0005\u0007\u0000\u0000jk\u0005\u0013\u0000\u0000kl\u0005(\u0000"+
		"\u0000lm\u0003$\u0012\u0000mn\u0005\'\u0000\u0000n\u0089\u0001\u0000\u0000"+
		"\u0000op\u0005\u0013\u0000\u0000pq\u00056\u0000\u0000qv\u0005\u0013\u0000"+
		"\u0000rs\u0005(\u0000\u0000st\u0003$\u0012\u0000tu\u0005\'\u0000\u0000"+
		"uw\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u0089\u0001\u0000\u0000\u0000xy\u0005\u001e\u0000\u0000y\u0089"+
		"\u0003\f\u0006\u0017z{\u0005.\u0000\u0000{\u0089\u0003\f\u0006\u0016|"+
		"}\u0005#\u0000\u0000}\u0089\u0003\f\u0006\u0015~\u007f\u0005%\u0000\u0000"+
		"\u007f\u0089\u0003\f\u0006\u0014\u0080\u0081\u0005&\u0000\u0000\u0081"+
		"\u0089\u0003\f\u0006\u0012\u0082\u0083\u0005(\u0000\u0000\u0083\u0084"+
		"\u0003\f\u0006\u0000\u0084\u0085\u0005\'\u0000\u0000\u0085\u0089\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0013\u0000\u0000\u0087\u0089\u0003"+
		"\u0004\u0002\u0000\u0088V\u0001\u0000\u0000\u0000\u0088c\u0001\u0000\u0000"+
		"\u0000\u0088d\u0001\u0000\u0000\u0000\u0088e\u0001\u0000\u0000\u0000\u0088"+
		"f\u0001\u0000\u0000\u0000\u0088g\u0001\u0000\u0000\u0000\u0088h\u0001"+
		"\u0000\u0000\u0000\u0088i\u0001\u0000\u0000\u0000\u0088j\u0001\u0000\u0000"+
		"\u0000\u0088o\u0001\u0000\u0000\u0000\u0088x\u0001\u0000\u0000\u0000\u0088"+
		"z\u0001\u0000\u0000\u0000\u0088|\u0001\u0000\u0000\u0000\u0088~\u0001"+
		"\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0082\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u00c0\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\n\u0010\u0000\u0000\u008b\u008c\u0007\u0001"+
		"\u0000\u0000\u008c\u00bf\u0003\f\u0006\u0011\u008d\u008e\n\u000f\u0000"+
		"\u0000\u008e\u008f\u0007\u0002\u0000\u0000\u008f\u00bf\u0003\f\u0006\u0010"+
		"\u0090\u0091\n\u000e\u0000\u0000\u0091\u0092\u0007\u0003\u0000\u0000\u0092"+
		"\u00bf\u0003\f\u0006\u000f\u0093\u0094\n\r\u0000\u0000\u0094\u0095\u0007"+
		"\u0004\u0000\u0000\u0095\u00bf\u0003\f\u0006\u000e\u0096\u0097\n\f\u0000"+
		"\u0000\u0097\u0098\u0007\u0005\u0000\u0000\u0098\u00bf\u0003\f\u0006\r"+
		"\u0099\u009a\n\u000b\u0000\u0000\u009a\u009b\u0005\u001b\u0000\u0000\u009b"+
		"\u00bf\u0003\f\u0006\f\u009c\u009d\n\n\u0000\u0000\u009d\u009e\u0005\u001d"+
		"\u0000\u0000\u009e\u00bf\u0003\f\u0006\u000b\u009f\u00a0\n\t\u0000\u0000"+
		"\u00a0\u00a1\u0005\u001c\u0000\u0000\u00a1\u00bf\u0003\f\u0006\n\u00a2"+
		"\u00a3\n\b\u0000\u0000\u00a3\u00a4\u0005!\u0000\u0000\u00a4\u00bf\u0003"+
		"\f\u0006\t\u00a5\u00a6\n\u0007\u0000\u0000\u00a6\u00a7\u0005\"\u0000\u0000"+
		"\u00a7\u00bf\u0003\f\u0006\b\u00a8\u00a9\n\u0006\u0000\u0000\u00a9\u00aa"+
		"\u00053\u0000\u0000\u00aa\u00ab\u0003\f\u0006\u0000\u00ab\u00ac\u0005"+
		"2\u0000\u0000\u00ac\u00ad\u0003\f\u0006\u0006\u00ad\u00bf\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\n\u0001\u0000\u0000\u00af\u00b0\u0005$\u0000"+
		"\u0000\u00b0\u00bf\u0003\f\u0006\u0001\u00b1\u00b2\n\u0013\u0000\u0000"+
		"\u00b2\u00bf\u0005%\u0000\u0000\u00b3\u00b4\n\u0011\u0000\u0000\u00b4"+
		"\u00bf\u0005&\u0000\u0000\u00b5\u00b6\n\u0003\u0000\u0000\u00b6\u00b8"+
		"\u0005(\u0000\u0000\u00b7\u00b9\u0003$\u0012\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bf\u0005\'\u0000\u0000\u00bb\u00bc\n\u0002\u0000"+
		"\u0000\u00bc\u00bd\u00056\u0000\u0000\u00bd\u00bf\u0005\u0013\u0000\u0000"+
		"\u00be\u008a\u0001\u0000\u0000\u0000\u00be\u008d\u0001\u0000\u0000\u0000"+
		"\u00be\u0090\u0001\u0000\u0000\u0000\u00be\u0093\u0001\u0000\u0000\u0000"+
		"\u00be\u0096\u0001\u0000\u0000\u0000\u00be\u0099\u0001\u0000\u0000\u0000"+
		"\u00be\u009c\u0001\u0000\u0000\u0000\u00be\u009f\u0001\u0000\u0000\u0000"+
		"\u00be\u00a2\u0001\u0000\u0000\u0000\u00be\u00a5\u0001\u0000\u0000\u0000"+
		"\u00be\u00a8\u0001\u0000\u0000\u0000\u00be\u00ae\u0001\u0000\u0000\u0000"+
		"\u00be\u00b1\u0001\u0000\u0000\u0000\u00be\u00b3\u0001\u0000\u0000\u0000"+
		"\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\r\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00ce\u0003\u0012\t\u0000\u00c4\u00ce"+
		"\u0003 \u0010\u0000\u00c5\u00ce\u0003\u001e\u000f\u0000\u00c6\u00ce\u0003"+
		"\u001a\r\u0000\u00c7\u00ce\u0003\u0014\n\u0000\u00c8\u00ce\u0003\u0016"+
		"\u000b\u0000\u00c9\u00ce\u0003\u0010\b\u0000\u00ca\u00ce\u0003\u0018\f"+
		"\u0000\u00cb\u00ce\u0003\"\u0011\u0000\u00cc\u00ce\u0003\n\u0005\u0000"+
		"\u00cd\u00c3\u0001\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u00054\u0000\u0000\u00d0"+
		"\u0011\u0001\u0000\u0000\u0000\u00d1\u00d5\u0005,\u0000\u0000\u00d2\u00d4"+
		"\u0003\u000e\u0007\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005+\u0000\u0000\u00d9\u0013\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u0010\u0000\u0000\u00db\u00dc\u0005"+
		"4\u0000\u0000\u00dc\u0015\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u000f"+
		"\u0000\u0000\u00de\u00df\u00054\u0000\u0000\u00df\u0017\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0005\u0012\u0000\u0000\u00e1\u00e3\u0003\f\u0006\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u00054\u0000\u0000\u00e5"+
		"\u0019\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005(\u0000\u0000\u00e7\u00e8"+
		"\u0003\f\u0006\u0000\u00e8\u00e9\u0005\'\u0000\u0000\u00e9\u00ed\u0005"+
		",\u0000\u0000\u00ea\u00ec\u0003\u000e\u0007\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005+\u0000"+
		"\u0000\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\r\u0000\u0000"+
		"\u00f3\u00f4\u0003\u000e\u0007\u0000\u00f4\u001d\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005\f\u0000\u0000\u00f6\u00f7\u0005(\u0000\u0000\u00f7"+
		"\u00f8\u0003\f\u0006\u0000\u00f8\u00f9\u0005\'\u0000\u0000\u00f9\u00fb"+
		"\u0003\u000e\u0007\u0000\u00fa\u00fc\u0003\u001c\u000e\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001f"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u0100"+
		"\u0005(\u0000\u0000\u00ff\u0101\u0003\u000e\u0007\u0000\u0100\u00ff\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0003\"\u0011\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0003\"\u0011\u0000\u0106\u0107\u0005\'\u0000"+
		"\u0000\u0107!\u0001\u0000\u0000\u0000\u0108\u0109\u0003\f\u0006\u0000"+
		"\u0109\u010a\u00054\u0000\u0000\u010a#\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0003\u0006\u0003\u0000\u010c\u0113\u0003\b\u0004\u0000\u010d\u010e\u0005"+
		"5\u0000\u0000\u010e\u010f\u0003\u0006\u0003\u0000\u010f\u0110\u0003\b"+
		"\u0004\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010d\u0001\u0000"+
		"\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114%\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u0006\u0003"+
		"\u0000\u0117\u0118\u0005\u0013\u0000\u0000\u0118\u011a\u0005(\u0000\u0000"+
		"\u0119\u011b\u0003$\u0012\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\'\u0000\u0000\u011d\u011e\u0003\u0012\t\u0000\u011e\'\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0005\u0013\u0000\u0000\u0120\u0121\u0005"+
		"(\u0000\u0000\u0121\u0122\u0005\'\u0000\u0000\u0122\u0123\u0003\u0012"+
		"\t\u0000\u0123)\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0006\u0000"+
		"\u0000\u0125\u0126\u0005\u0013\u0000\u0000\u0126\u012e\u0005,\u0000\u0000"+
		"\u0127\u0128\u0003\n\u0005\u0000\u0128\u0129\u00054\u0000\u0000\u0129"+
		"\u012d\u0001\u0000\u0000\u0000\u012a\u012d\u0003&\u0013\u0000\u012b\u012d"+
		"\u0003(\u0014\u0000\u012c\u0127\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005+\u0000\u0000\u0132\u0133\u00054\u0000"+
		"\u0000\u0133+\u0001\u0000\u0000\u0000\u0019/1:?EKS\\av\u0088\u00b8\u00be"+
		"\u00c0\u00cd\u00d5\u00e2\u00ed\u00fb\u0100\u0103\u0113\u011a\u012c\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}