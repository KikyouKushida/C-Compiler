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
		Null=10, If=11, Else=12, Else_if=13, Break=14, Continue=15, While=16, 
		Return=17, Identifier=18, Integer=19, Greater=20, Less=21, GreaterEqual=22, 
		LessEqual=23, Equal=24, NotEqual=25, BitwiseAnd=26, BitwiseOr=27, BitwiseXor=28, 
		BitwiseNot=29, BitwiseRightShift=30, BitwiseLeftShift=31, LogicAnd=32, 
		LogicOr=33, LogicNot=34, Assign=35, SelfIncrement=36, SelfDecrement=37, 
		RightParenthesis=38, LeftParenthesis=39, RightBracket=40, LeftBracket=41, 
		RightBrace=42, LeftBrace=43, Add=44, Substract=45, Multiply=46, Divide=47, 
		Mod=48, Colon=49, QuestionMark=50, Semicolon=51, Comma=52, Member=53, 
		WhiteSpace=54, Cstring=55, VarDef=56, ClassDef=57, FuncDef=58;
	public static final int
		RULE_program = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'void'", "'bool'", "'string'", "'new'", "'class'", "'this'", 
			"'true'", "'false'", "'null'", "'if'", "'else'", "'else if'", "'break'", 
			"'continue'", "'while'", "'return'", null, null, "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'&'", "'|'", "'^'", "'~'", "'>>'", "'<<'", "'&&'", 
			"'||'", "'!'", "'='", "'++'", "'--'", "')'", "'('", "']'", "'['", "'}'", 
			"'{'", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'?'", "';'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Void", "Bool", "String", "New", "Class", "This", "True", 
			"False", "Null", "If", "Else", "Else_if", "Break", "Continue", "While", 
			"Return", "Identifier", "Integer", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "BitwiseAnd", "BitwiseOr", "BitwiseXor", 
			"BitwiseNot", "BitwiseRightShift", "BitwiseLeftShift", "LogicAnd", "LogicOr", 
			"LogicNot", "Assign", "SelfIncrement", "SelfDecrement", "RightParenthesis", 
			"LeftParenthesis", "RightBracket", "LeftBracket", "RightBrace", "LeftBrace", 
			"Add", "Substract", "Multiply", "Divide", "Mod", "Colon", "QuestionMark", 
			"Semicolon", "Comma", "Member", "WhiteSpace", "Cstring", "VarDef", "ClassDef", 
			"FuncDef"
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
		public List<TerminalNode> VarDef() { return getTokens(MxParser.VarDef); }
		public TerminalNode VarDef(int i) {
			return getToken(MxParser.VarDef, i);
		}
		public List<TerminalNode> ClassDef() { return getTokens(MxParser.ClassDef); }
		public TerminalNode ClassDef(int i) {
			return getToken(MxParser.ClassDef, i);
		}
		public List<TerminalNode> FuncDef() { return getTokens(MxParser.FuncDef); }
		public TerminalNode FuncDef(int i) {
			return getToken(MxParser.FuncDef, i);
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
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(8);
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

	public static final String _serializedATN =
		"\u0004\u0001:\u000b\u0002\u0000\u0007\u0000\u0001\u0000\u0005\u0000\u0004"+
		"\b\u0000\n\u0000\f\u0000\u0007\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u00008:\n\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001"+
		"\u0000\u0000\u0000\u0004\u0007\u0001\u0000\u0000\u0000\u0005\u0003\u0001"+
		"\u0000\u0000\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\b\u0001\u0000"+
		"\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\b\t\u0005\u0000\u0000"+
		"\u0001\t\u0001\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}