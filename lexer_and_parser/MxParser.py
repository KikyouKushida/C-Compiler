# Generated from MxParser.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,58,302,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,1,0,1,0,1,0,5,0,52,8,0,10,0,12,
        0,55,9,0,1,0,1,0,1,1,1,1,1,2,1,2,3,2,63,8,2,1,2,1,2,1,3,1,3,5,3,
        69,8,3,10,3,12,3,72,9,3,1,4,1,4,1,4,3,4,77,8,4,1,5,1,5,1,5,1,5,5,
        5,83,8,5,10,5,12,5,86,9,5,1,5,1,5,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,5,7,108,8,7,10,7,12,7,
        111,9,7,1,7,1,7,3,7,115,8,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,124,
        8,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,
        1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,
        1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,168,8,7,1,7,1,7,
        1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,5,7,180,8,7,10,7,12,7,183,9,7,1,
        8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,195,8,8,1,9,1,9,1,10,1,
        10,5,10,201,8,10,10,10,12,10,204,9,10,1,10,1,10,1,11,1,11,1,11,1,
        12,1,12,1,12,1,13,1,13,3,13,216,8,13,1,13,1,13,1,14,1,14,1,14,1,
        14,1,14,1,14,1,15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,1,16,3,16,235,
        8,16,1,17,1,17,1,17,3,17,240,8,17,1,17,3,17,243,8,17,1,17,1,17,3,
        17,247,8,17,1,17,1,17,1,17,1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,
        19,1,19,5,19,261,8,19,10,19,12,19,264,9,19,1,20,1,20,1,20,5,20,269,
        8,20,10,20,12,20,272,9,20,1,21,1,21,1,21,1,21,3,21,278,8,21,1,21,
        1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,23,1,23,1,23,1,23,1,23,1,23,
        5,23,294,8,23,10,23,12,23,297,9,23,1,23,1,23,1,23,1,23,0,1,14,24,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,
        46,0,7,2,0,1,4,19,19,3,0,8,10,20,20,56,56,1,0,47,49,1,0,45,46,1,
        0,31,32,1,0,21,24,1,0,25,26,335,0,53,1,0,0,0,2,58,1,0,0,0,4,60,1,
        0,0,0,6,66,1,0,0,0,8,73,1,0,0,0,10,78,1,0,0,0,12,89,1,0,0,0,14,123,
        1,0,0,0,16,194,1,0,0,0,18,196,1,0,0,0,20,198,1,0,0,0,22,207,1,0,
        0,0,24,210,1,0,0,0,26,213,1,0,0,0,28,219,1,0,0,0,30,225,1,0,0,0,
        32,228,1,0,0,0,34,236,1,0,0,0,36,251,1,0,0,0,38,254,1,0,0,0,40,265,
        1,0,0,0,42,273,1,0,0,0,44,282,1,0,0,0,46,287,1,0,0,0,48,52,3,10,
        5,0,49,52,3,46,23,0,50,52,3,42,21,0,51,48,1,0,0,0,51,49,1,0,0,0,
        51,50,1,0,0,0,52,55,1,0,0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,56,1,
        0,0,0,55,53,1,0,0,0,56,57,5,0,0,1,57,1,1,0,0,0,58,59,7,0,0,0,59,
        3,1,0,0,0,60,62,5,42,0,0,61,63,3,14,7,0,62,61,1,0,0,0,62,63,1,0,
        0,0,63,64,1,0,0,0,64,65,5,41,0,0,65,5,1,0,0,0,66,70,3,2,1,0,67,69,
        3,4,2,0,68,67,1,0,0,0,69,72,1,0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,
        71,7,1,0,0,0,72,70,1,0,0,0,73,76,5,19,0,0,74,75,5,36,0,0,75,77,3,
        14,7,0,76,74,1,0,0,0,76,77,1,0,0,0,77,9,1,0,0,0,78,79,3,6,3,0,79,
        84,3,8,4,0,80,81,5,53,0,0,81,83,3,8,4,0,82,80,1,0,0,0,83,86,1,0,
        0,0,84,82,1,0,0,0,84,85,1,0,0,0,85,87,1,0,0,0,86,84,1,0,0,0,87,88,
        5,52,0,0,88,11,1,0,0,0,89,90,7,1,0,0,90,13,1,0,0,0,91,92,6,7,-1,
        0,92,93,5,40,0,0,93,94,3,14,7,0,94,95,5,39,0,0,95,124,1,0,0,0,96,
        97,5,37,0,0,97,124,3,14,7,22,98,99,5,38,0,0,99,124,3,14,7,21,100,
        101,5,45,0,0,101,124,3,14,7,20,102,103,5,46,0,0,103,124,3,14,7,19,
        104,105,5,5,0,0,105,109,3,2,1,0,106,108,3,4,2,0,107,106,1,0,0,0,
        108,111,1,0,0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,114,1,0,0,0,
        111,109,1,0,0,0,112,113,5,40,0,0,113,115,5,39,0,0,114,112,1,0,0,
        0,114,115,1,0,0,0,115,124,1,0,0,0,116,124,3,12,6,0,117,124,5,7,0,
        0,118,124,5,19,0,0,119,120,5,30,0,0,120,124,3,14,7,14,121,122,5,
        35,0,0,122,124,3,14,7,13,123,91,1,0,0,0,123,96,1,0,0,0,123,98,1,
        0,0,0,123,100,1,0,0,0,123,102,1,0,0,0,123,104,1,0,0,0,123,116,1,
        0,0,0,123,117,1,0,0,0,123,118,1,0,0,0,123,119,1,0,0,0,123,121,1,
        0,0,0,124,181,1,0,0,0,125,126,10,12,0,0,126,127,7,2,0,0,127,180,
        3,14,7,13,128,129,10,11,0,0,129,130,7,3,0,0,130,180,3,14,7,12,131,
        132,10,10,0,0,132,133,7,4,0,0,133,180,3,14,7,11,134,135,10,9,0,0,
        135,136,7,5,0,0,136,180,3,14,7,10,137,138,10,8,0,0,138,139,7,6,0,
        0,139,180,3,14,7,9,140,141,10,7,0,0,141,142,5,27,0,0,142,180,3,14,
        7,8,143,144,10,6,0,0,144,145,5,29,0,0,145,180,3,14,7,7,146,147,10,
        5,0,0,147,148,5,28,0,0,148,180,3,14,7,6,149,150,10,4,0,0,150,151,
        5,33,0,0,151,180,3,14,7,5,152,153,10,3,0,0,153,154,5,34,0,0,154,
        180,3,14,7,4,155,156,10,2,0,0,156,157,5,51,0,0,157,158,3,14,7,0,
        158,159,5,50,0,0,159,160,3,14,7,2,160,180,1,0,0,0,161,162,10,1,0,
        0,162,163,5,36,0,0,163,180,3,14,7,1,164,165,10,28,0,0,165,167,5,
        40,0,0,166,168,3,40,20,0,167,166,1,0,0,0,167,168,1,0,0,0,168,169,
        1,0,0,0,169,180,5,39,0,0,170,171,10,27,0,0,171,180,3,4,2,0,172,173,
        10,26,0,0,173,180,5,37,0,0,174,175,10,25,0,0,175,180,5,38,0,0,176,
        177,10,24,0,0,177,178,5,54,0,0,178,180,5,19,0,0,179,125,1,0,0,0,
        179,128,1,0,0,0,179,131,1,0,0,0,179,134,1,0,0,0,179,137,1,0,0,0,
        179,140,1,0,0,0,179,143,1,0,0,0,179,146,1,0,0,0,179,149,1,0,0,0,
        179,152,1,0,0,0,179,155,1,0,0,0,179,161,1,0,0,0,179,164,1,0,0,0,
        179,170,1,0,0,0,179,172,1,0,0,0,179,174,1,0,0,0,179,176,1,0,0,0,
        180,183,1,0,0,0,181,179,1,0,0,0,181,182,1,0,0,0,182,15,1,0,0,0,183,
        181,1,0,0,0,184,195,3,20,10,0,185,195,3,34,17,0,186,195,3,32,16,
        0,187,195,3,28,14,0,188,195,3,22,11,0,189,195,3,24,12,0,190,195,
        3,18,9,0,191,195,3,26,13,0,192,195,3,36,18,0,193,195,3,10,5,0,194,
        184,1,0,0,0,194,185,1,0,0,0,194,186,1,0,0,0,194,187,1,0,0,0,194,
        188,1,0,0,0,194,189,1,0,0,0,194,190,1,0,0,0,194,191,1,0,0,0,194,
        192,1,0,0,0,194,193,1,0,0,0,195,17,1,0,0,0,196,197,5,52,0,0,197,
        19,1,0,0,0,198,202,5,44,0,0,199,201,3,16,8,0,200,199,1,0,0,0,201,
        204,1,0,0,0,202,200,1,0,0,0,202,203,1,0,0,0,203,205,1,0,0,0,204,
        202,1,0,0,0,205,206,5,43,0,0,206,21,1,0,0,0,207,208,5,16,0,0,208,
        209,5,52,0,0,209,23,1,0,0,0,210,211,5,15,0,0,211,212,5,52,0,0,212,
        25,1,0,0,0,213,215,5,18,0,0,214,216,3,14,7,0,215,214,1,0,0,0,215,
        216,1,0,0,0,216,217,1,0,0,0,217,218,5,52,0,0,218,27,1,0,0,0,219,
        220,5,17,0,0,220,221,5,40,0,0,221,222,3,14,7,0,222,223,5,39,0,0,
        223,224,3,16,8,0,224,29,1,0,0,0,225,226,5,13,0,0,226,227,3,16,8,
        0,227,31,1,0,0,0,228,229,5,12,0,0,229,230,5,40,0,0,230,231,3,14,
        7,0,231,232,5,39,0,0,232,234,3,16,8,0,233,235,3,30,15,0,234,233,
        1,0,0,0,234,235,1,0,0,0,235,33,1,0,0,0,236,237,5,11,0,0,237,239,
        5,40,0,0,238,240,3,16,8,0,239,238,1,0,0,0,239,240,1,0,0,0,240,242,
        1,0,0,0,241,243,3,14,7,0,242,241,1,0,0,0,242,243,1,0,0,0,243,244,
        1,0,0,0,244,246,5,52,0,0,245,247,3,14,7,0,246,245,1,0,0,0,246,247,
        1,0,0,0,247,248,1,0,0,0,248,249,5,39,0,0,249,250,3,16,8,0,250,35,
        1,0,0,0,251,252,3,14,7,0,252,253,5,52,0,0,253,37,1,0,0,0,254,255,
        3,6,3,0,255,262,3,8,4,0,256,257,5,53,0,0,257,258,3,6,3,0,258,259,
        3,8,4,0,259,261,1,0,0,0,260,256,1,0,0,0,261,264,1,0,0,0,262,260,
        1,0,0,0,262,263,1,0,0,0,263,39,1,0,0,0,264,262,1,0,0,0,265,270,3,
        14,7,0,266,267,5,53,0,0,267,269,3,14,7,0,268,266,1,0,0,0,269,272,
        1,0,0,0,270,268,1,0,0,0,270,271,1,0,0,0,271,41,1,0,0,0,272,270,1,
        0,0,0,273,274,3,6,3,0,274,275,5,19,0,0,275,277,5,40,0,0,276,278,
        3,38,19,0,277,276,1,0,0,0,277,278,1,0,0,0,278,279,1,0,0,0,279,280,
        5,39,0,0,280,281,3,20,10,0,281,43,1,0,0,0,282,283,5,19,0,0,283,284,
        5,40,0,0,284,285,5,39,0,0,285,286,3,20,10,0,286,45,1,0,0,0,287,288,
        5,6,0,0,288,289,5,19,0,0,289,295,5,44,0,0,290,294,3,10,5,0,291,294,
        3,42,21,0,292,294,3,44,22,0,293,290,1,0,0,0,293,291,1,0,0,0,293,
        292,1,0,0,0,294,297,1,0,0,0,295,293,1,0,0,0,295,296,1,0,0,0,296,
        298,1,0,0,0,297,295,1,0,0,0,298,299,5,43,0,0,299,300,5,52,0,0,300,
        47,1,0,0,0,24,51,53,62,70,76,84,109,114,123,167,179,181,194,202,
        215,234,239,242,246,262,270,277,293,295
    ]

class MxParser ( Parser ):

    grammarFileName = "MxParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'int'", "'void'", "'bool'", "'string'", 
                     "'new'", "'class'", "'this'", "'true'", "'false'", 
                     "'null'", "'for'", "'if'", "'else'", "'else if'", "'break'", 
                     "'continue'", "'while'", "'return'", "<INVALID>", "<INVALID>", 
                     "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&'", 
                     "'|'", "'^'", "'~'", "'>>'", "'<<'", "'&&'", "'||'", 
                     "'!'", "'='", "'++'", "'--'", "')'", "'('", "']'", 
                     "'['", "'}'", "'{'", "'+'", "'-'", "'*'", "'/'", "'%'", 
                     "':'", "'?'", "';'", "','", "'.'" ]

    symbolicNames = [ "<INVALID>", "Int", "Void", "Bool", "String", "New", 
                      "Class", "This", "True_", "False_", "Null", "For", 
                      "If", "Else", "Else_if", "Break", "Continue", "While", 
                      "Return", "Identifier", "Integer", "Greater", "Less", 
                      "GreaterEqual", "LessEqual", "Equal", "NotEqual", 
                      "BitwiseAnd", "BitwiseOr", "BitwiseXor", "BitwiseNot", 
                      "BitwiseRightShift", "BitwiseLeftShift", "LogicAnd", 
                      "LogicOr", "LogicNot", "Assign", "SelfIncrement", 
                      "SelfDecrement", "RightParenthesis", "LeftParenthesis", 
                      "RightBracket", "LeftBracket", "RightBrace", "LeftBrace", 
                      "Add", "Substract", "Multiply", "Divide", "Mod", "Colon", 
                      "QuestionMark", "Semicolon", "Comma", "Member", "WhiteSpace", 
                      "Cstring", "CommentLine", "CommentBlock" ]

    RULE_program = 0
    RULE_type = 1
    RULE_arrayUnit = 2
    RULE_typename = 3
    RULE_variableConstructor = 4
    RULE_variableDef = 5
    RULE_constant = 6
    RULE_expression = 7
    RULE_statement = 8
    RULE_emptyStatement = 9
    RULE_blockStatement = 10
    RULE_continueStatement = 11
    RULE_breakStatement = 12
    RULE_returnStatement = 13
    RULE_whileStatement = 14
    RULE_elseStatement = 15
    RULE_ifStatement = 16
    RULE_forStatement = 17
    RULE_expressionStatement = 18
    RULE_parameterList1 = 19
    RULE_parameterList2 = 20
    RULE_functionDef = 21
    RULE_classConstructor = 22
    RULE_classDef = 23

    ruleNames =  [ "program", "type", "arrayUnit", "typename", "variableConstructor", 
                   "variableDef", "constant", "expression", "statement", 
                   "emptyStatement", "blockStatement", "continueStatement", 
                   "breakStatement", "returnStatement", "whileStatement", 
                   "elseStatement", "ifStatement", "forStatement", "expressionStatement", 
                   "parameterList1", "parameterList2", "functionDef", "classConstructor", 
                   "classDef" ]

    EOF = Token.EOF
    Int=1
    Void=2
    Bool=3
    String=4
    New=5
    Class=6
    This=7
    True_=8
    False_=9
    Null=10
    For=11
    If=12
    Else=13
    Else_if=14
    Break=15
    Continue=16
    While=17
    Return=18
    Identifier=19
    Integer=20
    Greater=21
    Less=22
    GreaterEqual=23
    LessEqual=24
    Equal=25
    NotEqual=26
    BitwiseAnd=27
    BitwiseOr=28
    BitwiseXor=29
    BitwiseNot=30
    BitwiseRightShift=31
    BitwiseLeftShift=32
    LogicAnd=33
    LogicOr=34
    LogicNot=35
    Assign=36
    SelfIncrement=37
    SelfDecrement=38
    RightParenthesis=39
    LeftParenthesis=40
    RightBracket=41
    LeftBracket=42
    RightBrace=43
    LeftBrace=44
    Add=45
    Substract=46
    Multiply=47
    Divide=48
    Mod=49
    Colon=50
    QuestionMark=51
    Semicolon=52
    Comma=53
    Member=54
    WhiteSpace=55
    Cstring=56
    CommentLine=57
    CommentBlock=58

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MxParser.EOF, 0)

        def variableDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.VariableDefContext)
            else:
                return self.getTypedRuleContext(MxParser.VariableDefContext,i)


        def classDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ClassDefContext)
            else:
                return self.getTypedRuleContext(MxParser.ClassDefContext,i)


        def functionDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.FunctionDefContext)
            else:
                return self.getTypedRuleContext(MxParser.FunctionDefContext,i)


        def getRuleIndex(self):
            return MxParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = MxParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 524382) != 0):
                self.state = 51
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                if la_ == 1:
                    self.state = 48
                    self.variableDef()
                    pass

                elif la_ == 2:
                    self.state = 49
                    self.classDef()
                    pass

                elif la_ == 3:
                    self.state = 50
                    self.functionDef()
                    pass


                self.state = 55
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 56
            self.match(MxParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Int(self):
            return self.getToken(MxParser.Int, 0)

        def Bool(self):
            return self.getToken(MxParser.Bool, 0)

        def String(self):
            return self.getToken(MxParser.String, 0)

        def Void(self):
            return self.getToken(MxParser.Void, 0)

        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def getRuleIndex(self):
            return MxParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = MxParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 524318) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayUnitContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LeftBracket(self):
            return self.getToken(MxParser.LeftBracket, 0)

        def RightBracket(self):
            return self.getToken(MxParser.RightBracket, 0)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_arrayUnit

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArrayUnit" ):
                listener.enterArrayUnit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArrayUnit" ):
                listener.exitArrayUnit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayUnit" ):
                return visitor.visitArrayUnit(self)
            else:
                return visitor.visitChildren(self)




    def arrayUnit(self):

        localctx = MxParser.ArrayUnitContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_arrayUnit)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.match(MxParser.LeftBracket)
            self.state = 62
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 72164694417737632) != 0):
                self.state = 61
                self.expression(0)


            self.state = 64
            self.match(MxParser.RightBracket)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypenameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MxParser.TypeContext,0)


        def arrayUnit(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ArrayUnitContext)
            else:
                return self.getTypedRuleContext(MxParser.ArrayUnitContext,i)


        def getRuleIndex(self):
            return MxParser.RULE_typename

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypename" ):
                listener.enterTypename(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypename" ):
                listener.exitTypename(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypename" ):
                return visitor.visitTypename(self)
            else:
                return visitor.visitChildren(self)




    def typename(self):

        localctx = MxParser.TypenameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_typename)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.type_()
            self.state = 70
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==42:
                self.state = 67
                self.arrayUnit()
                self.state = 72
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableConstructorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.name = None # Token

        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def Assign(self):
            return self.getToken(MxParser.Assign, 0)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_variableConstructor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariableConstructor" ):
                listener.enterVariableConstructor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariableConstructor" ):
                listener.exitVariableConstructor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariableConstructor" ):
                return visitor.visitVariableConstructor(self)
            else:
                return visitor.visitChildren(self)




    def variableConstructor(self):

        localctx = MxParser.VariableConstructorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_variableConstructor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            localctx.name = self.match(MxParser.Identifier)
            self.state = 76
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==36:
                self.state = 74
                self.match(MxParser.Assign)
                self.state = 75
                self.expression(0)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typename(self):
            return self.getTypedRuleContext(MxParser.TypenameContext,0)


        def variableConstructor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.VariableConstructorContext)
            else:
                return self.getTypedRuleContext(MxParser.VariableConstructorContext,i)


        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def Comma(self, i:int=None):
            if i is None:
                return self.getTokens(MxParser.Comma)
            else:
                return self.getToken(MxParser.Comma, i)

        def getRuleIndex(self):
            return MxParser.RULE_variableDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariableDef" ):
                listener.enterVariableDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariableDef" ):
                listener.exitVariableDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariableDef" ):
                return visitor.visitVariableDef(self)
            else:
                return visitor.visitChildren(self)




    def variableDef(self):

        localctx = MxParser.VariableDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_variableDef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.typename()
            self.state = 79
            self.variableConstructor()
            self.state = 84
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==53:
                self.state = 80
                self.match(MxParser.Comma)
                self.state = 81
                self.variableConstructor()
                self.state = 86
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 87
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConstantContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Integer(self):
            return self.getToken(MxParser.Integer, 0)

        def Cstring(self):
            return self.getToken(MxParser.Cstring, 0)

        def True_(self):
            return self.getToken(MxParser.True_, 0)

        def False_(self):
            return self.getToken(MxParser.False_, 0)

        def Null(self):
            return self.getToken(MxParser.Null, 0)

        def getRuleIndex(self):
            return MxParser.RULE_constant

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConstant" ):
                listener.enterConstant(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConstant" ):
                listener.exitConstant(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConstant" ):
                return visitor.visitConstant(self)
            else:
                return visitor.visitChildren(self)




    def constant(self):

        localctx = MxParser.ConstantContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_constant)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 72057594038978304) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MxParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class ExpressionLogicAndContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def LogicAnd(self):
            return self.getToken(MxParser.LogicAnd, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionLogicAnd" ):
                listener.enterExpressionLogicAnd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionLogicAnd" ):
                listener.exitExpressionLogicAnd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionLogicAnd" ):
                return visitor.visitExpressionLogicAnd(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionArrayUnitContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)

        def arrayUnit(self):
            return self.getTypedRuleContext(MxParser.ArrayUnitContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionArrayUnit" ):
                listener.enterExpressionArrayUnit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionArrayUnit" ):
                listener.exitExpressionArrayUnit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionArrayUnit" ):
                return visitor.visitExpressionArrayUnit(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionAssignContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def Assign(self):
            return self.getToken(MxParser.Assign, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionAssign" ):
                listener.enterExpressionAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionAssign" ):
                listener.exitExpressionAssign(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionAssign" ):
                return visitor.visitExpressionAssign(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionMemberVisitContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.member = None # Token
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)

        def Member(self):
            return self.getToken(MxParser.Member, 0)
        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionMemberVisit" ):
                listener.enterExpressionMemberVisit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionMemberVisit" ):
                listener.exitExpressionMemberVisit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionMemberVisit" ):
                return visitor.visitExpressionMemberVisit(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionTrinocularContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.a = None # ExpressionContext
            self.op1 = None # Token
            self.b = None # ExpressionContext
            self.op2 = None # Token
            self.c = None # ExpressionContext
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def QuestionMark(self):
            return self.getToken(MxParser.QuestionMark, 0)
        def Colon(self):
            return self.getToken(MxParser.Colon, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionTrinocular" ):
                listener.enterExpressionTrinocular(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionTrinocular" ):
                listener.exitExpressionTrinocular(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionTrinocular" ):
                return visitor.visitExpressionTrinocular(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionBitwiseXorContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def BitwiseXor(self):
            return self.getToken(MxParser.BitwiseXor, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionBitwiseXor" ):
                listener.enterExpressionBitwiseXor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionBitwiseXor" ):
                listener.exitExpressionBitwiseXor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionBitwiseXor" ):
                return visitor.visitExpressionBitwiseXor(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionBitwiseShiftContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def BitwiseLeftShift(self):
            return self.getToken(MxParser.BitwiseLeftShift, 0)
        def BitwiseRightShift(self):
            return self.getToken(MxParser.BitwiseRightShift, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionBitwiseShift" ):
                listener.enterExpressionBitwiseShift(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionBitwiseShift" ):
                listener.exitExpressionBitwiseShift(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionBitwiseShift" ):
                return visitor.visitExpressionBitwiseShift(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionBitwiseOrContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def BitwiseOr(self):
            return self.getToken(MxParser.BitwiseOr, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionBitwiseOr" ):
                listener.enterExpressionBitwiseOr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionBitwiseOr" ):
                listener.exitExpressionBitwiseOr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionBitwiseOr" ):
                return visitor.visitExpressionBitwiseOr(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionPreSelfDecrementContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def SelfDecrement(self):
            return self.getToken(MxParser.SelfDecrement, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionPreSelfDecrement" ):
                listener.enterExpressionPreSelfDecrement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionPreSelfDecrement" ):
                listener.exitExpressionPreSelfDecrement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionPreSelfDecrement" ):
                return visitor.visitExpressionPreSelfDecrement(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionSufSelfIncrementContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)

        def SelfIncrement(self):
            return self.getToken(MxParser.SelfIncrement, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionSufSelfIncrement" ):
                listener.enterExpressionSufSelfIncrement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionSufSelfIncrement" ):
                listener.exitExpressionSufSelfIncrement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionSufSelfIncrement" ):
                return visitor.visitExpressionSufSelfIncrement(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionLogicNotContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LogicNot(self):
            return self.getToken(MxParser.LogicNot, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionLogicNot" ):
                listener.enterExpressionLogicNot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionLogicNot" ):
                listener.exitExpressionLogicNot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionLogicNot" ):
                return visitor.visitExpressionLogicNot(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionArithmeticOp1Context(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def Multiply(self):
            return self.getToken(MxParser.Multiply, 0)
        def Divide(self):
            return self.getToken(MxParser.Divide, 0)
        def Mod(self):
            return self.getToken(MxParser.Mod, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionArithmeticOp1" ):
                listener.enterExpressionArithmeticOp1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionArithmeticOp1" ):
                listener.exitExpressionArithmeticOp1(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionArithmeticOp1" ):
                return visitor.visitExpressionArithmeticOp1(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionArithmeticOp2Context(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def Add(self):
            return self.getToken(MxParser.Add, 0)
        def Substract(self):
            return self.getToken(MxParser.Substract, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionArithmeticOp2" ):
                listener.enterExpressionArithmeticOp2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionArithmeticOp2" ):
                listener.exitExpressionArithmeticOp2(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionArithmeticOp2" ):
                return visitor.visitExpressionArithmeticOp2(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionAddContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Add(self):
            return self.getToken(MxParser.Add, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionAdd" ):
                listener.enterExpressionAdd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionAdd" ):
                listener.exitExpressionAdd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionAdd" ):
                return visitor.visitExpressionAdd(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionNewContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def New(self):
            return self.getToken(MxParser.New, 0)
        def type_(self):
            return self.getTypedRuleContext(MxParser.TypeContext,0)

        def arrayUnit(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ArrayUnitContext)
            else:
                return self.getTypedRuleContext(MxParser.ArrayUnitContext,i)

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)
        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionNew" ):
                listener.enterExpressionNew(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionNew" ):
                listener.exitExpressionNew(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionNew" ):
                return visitor.visitExpressionNew(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionCompare1Context(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def Less(self):
            return self.getToken(MxParser.Less, 0)
        def Greater(self):
            return self.getToken(MxParser.Greater, 0)
        def LessEqual(self):
            return self.getToken(MxParser.LessEqual, 0)
        def GreaterEqual(self):
            return self.getToken(MxParser.GreaterEqual, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionCompare1" ):
                listener.enterExpressionCompare1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionCompare1" ):
                listener.exitExpressionCompare1(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionCompare1" ):
                return visitor.visitExpressionCompare1(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionCompare2Context(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def Equal(self):
            return self.getToken(MxParser.Equal, 0)
        def NotEqual(self):
            return self.getToken(MxParser.NotEqual, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionCompare2" ):
                listener.enterExpressionCompare2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionCompare2" ):
                listener.exitExpressionCompare2(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionCompare2" ):
                return visitor.visitExpressionCompare2(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionLogicOrContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def LogicOr(self):
            return self.getToken(MxParser.LogicOr, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionLogicOr" ):
                listener.enterExpressionLogicOr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionLogicOr" ):
                listener.exitExpressionLogicOr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionLogicOr" ):
                return visitor.visitExpressionLogicOr(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionFunctionCallContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)
        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)
        def parameterList2(self):
            return self.getTypedRuleContext(MxParser.ParameterList2Context,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionFunctionCall" ):
                listener.enterExpressionFunctionCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionFunctionCall" ):
                listener.exitExpressionFunctionCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionFunctionCall" ):
                return visitor.visitExpressionFunctionCall(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionBracketContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)

        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionBracket" ):
                listener.enterExpressionBracket(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionBracket" ):
                listener.exitExpressionBracket(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionBracket" ):
                return visitor.visitExpressionBracket(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionBitwiseAndContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)

        def BitwiseAnd(self):
            return self.getToken(MxParser.BitwiseAnd, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionBitwiseAnd" ):
                listener.enterExpressionBitwiseAnd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionBitwiseAnd" ):
                listener.exitExpressionBitwiseAnd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionBitwiseAnd" ):
                return visitor.visitExpressionBitwiseAnd(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionBitwiseNotContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BitwiseNot(self):
            return self.getToken(MxParser.BitwiseNot, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionBitwiseNot" ):
                listener.enterExpressionBitwiseNot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionBitwiseNot" ):
                listener.exitExpressionBitwiseNot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionBitwiseNot" ):
                return visitor.visitExpressionBitwiseNot(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionIdentifierContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionIdentifier" ):
                listener.enterExpressionIdentifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionIdentifier" ):
                listener.exitExpressionIdentifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionIdentifier" ):
                return visitor.visitExpressionIdentifier(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionSufSelfDecrementContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)

        def SelfDecrement(self):
            return self.getToken(MxParser.SelfDecrement, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionSufSelfDecrement" ):
                listener.enterExpressionSufSelfDecrement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionSufSelfDecrement" ):
                listener.exitExpressionSufSelfDecrement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionSufSelfDecrement" ):
                return visitor.visitExpressionSufSelfDecrement(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionConstantContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.value = None # ConstantContext
            self.copyFrom(ctx)

        def constant(self):
            return self.getTypedRuleContext(MxParser.ConstantContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionConstant" ):
                listener.enterExpressionConstant(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionConstant" ):
                listener.exitExpressionConstant(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionConstant" ):
                return visitor.visitExpressionConstant(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionSubtractContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Substract(self):
            return self.getToken(MxParser.Substract, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionSubtract" ):
                listener.enterExpressionSubtract(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionSubtract" ):
                listener.exitExpressionSubtract(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionSubtract" ):
                return visitor.visitExpressionSubtract(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionThisContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def This(self):
            return self.getToken(MxParser.This, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionThis" ):
                listener.enterExpressionThis(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionThis" ):
                listener.exitExpressionThis(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionThis" ):
                return visitor.visitExpressionThis(self)
            else:
                return visitor.visitChildren(self)


    class ExpressionPreSelfIncrementContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MxParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def SelfIncrement(self):
            return self.getToken(MxParser.SelfIncrement, 0)
        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionPreSelfIncrement" ):
                listener.enterExpressionPreSelfIncrement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionPreSelfIncrement" ):
                listener.exitExpressionPreSelfIncrement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionPreSelfIncrement" ):
                return visitor.visitExpressionPreSelfIncrement(self)
            else:
                return visitor.visitChildren(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MxParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 14
        self.enterRecursionRule(localctx, 14, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 123
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [40]:
                localctx = MxParser.ExpressionBracketContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 92
                self.match(MxParser.LeftParenthesis)
                self.state = 93
                self.expression(0)
                self.state = 94
                self.match(MxParser.RightParenthesis)
                pass
            elif token in [37]:
                localctx = MxParser.ExpressionPreSelfIncrementContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 96
                self.match(MxParser.SelfIncrement)
                self.state = 97
                self.expression(22)
                pass
            elif token in [38]:
                localctx = MxParser.ExpressionPreSelfDecrementContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 98
                self.match(MxParser.SelfDecrement)
                self.state = 99
                self.expression(21)
                pass
            elif token in [45]:
                localctx = MxParser.ExpressionAddContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 100
                self.match(MxParser.Add)
                self.state = 101
                self.expression(20)
                pass
            elif token in [46]:
                localctx = MxParser.ExpressionSubtractContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 102
                self.match(MxParser.Substract)
                self.state = 103
                self.expression(19)
                pass
            elif token in [5]:
                localctx = MxParser.ExpressionNewContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 104
                self.match(MxParser.New)
                self.state = 105
                self.type_()
                self.state = 109
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 106
                        self.arrayUnit() 
                    self.state = 111
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

                self.state = 114
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                if la_ == 1:
                    self.state = 112
                    self.match(MxParser.LeftParenthesis)
                    self.state = 113
                    self.match(MxParser.RightParenthesis)


                pass
            elif token in [8, 9, 10, 20, 56]:
                localctx = MxParser.ExpressionConstantContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 116
                localctx.value = self.constant()
                pass
            elif token in [7]:
                localctx = MxParser.ExpressionThisContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 117
                self.match(MxParser.This)
                pass
            elif token in [19]:
                localctx = MxParser.ExpressionIdentifierContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 118
                self.match(MxParser.Identifier)
                pass
            elif token in [30]:
                localctx = MxParser.ExpressionBitwiseNotContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 119
                self.match(MxParser.BitwiseNot)
                self.state = 120
                self.expression(14)
                pass
            elif token in [35]:
                localctx = MxParser.ExpressionLogicNotContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 121
                self.match(MxParser.LogicNot)
                self.state = 122
                self.expression(13)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 181
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 179
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
                    if la_ == 1:
                        localctx = MxParser.ExpressionArithmeticOp1Context(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 125
                        if not self.precpred(self._ctx, 12):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 12)")
                        self.state = 126
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 985162418487296) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 127
                        self.expression(13)
                        pass

                    elif la_ == 2:
                        localctx = MxParser.ExpressionArithmeticOp2Context(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 128
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 129
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==45 or _la==46):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 130
                        self.expression(12)
                        pass

                    elif la_ == 3:
                        localctx = MxParser.ExpressionBitwiseShiftContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 131
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 132
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==31 or _la==32):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 133
                        self.expression(11)
                        pass

                    elif la_ == 4:
                        localctx = MxParser.ExpressionCompare1Context(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 134
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 135
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 31457280) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 136
                        self.expression(10)
                        pass

                    elif la_ == 5:
                        localctx = MxParser.ExpressionCompare2Context(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 137
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 138
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==25 or _la==26):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 139
                        self.expression(9)
                        pass

                    elif la_ == 6:
                        localctx = MxParser.ExpressionBitwiseAndContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 140
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 141
                        localctx.op = self.match(MxParser.BitwiseAnd)
                        self.state = 142
                        self.expression(8)
                        pass

                    elif la_ == 7:
                        localctx = MxParser.ExpressionBitwiseXorContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 143
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 144
                        localctx.op = self.match(MxParser.BitwiseXor)
                        self.state = 145
                        self.expression(7)
                        pass

                    elif la_ == 8:
                        localctx = MxParser.ExpressionBitwiseOrContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 146
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 147
                        localctx.op = self.match(MxParser.BitwiseOr)
                        self.state = 148
                        self.expression(6)
                        pass

                    elif la_ == 9:
                        localctx = MxParser.ExpressionLogicAndContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 149
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 150
                        localctx.op = self.match(MxParser.LogicAnd)
                        self.state = 151
                        self.expression(5)
                        pass

                    elif la_ == 10:
                        localctx = MxParser.ExpressionLogicOrContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 152
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 153
                        localctx.op = self.match(MxParser.LogicOr)
                        self.state = 154
                        self.expression(4)
                        pass

                    elif la_ == 11:
                        localctx = MxParser.ExpressionTrinocularContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        localctx.a = _prevctx
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 155
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 156
                        localctx.op1 = self.match(MxParser.QuestionMark)
                        self.state = 157
                        localctx.b = self.expression(0)
                        self.state = 158
                        localctx.op2 = self.match(MxParser.Colon)
                        self.state = 159
                        localctx.c = self.expression(2)
                        pass

                    elif la_ == 12:
                        localctx = MxParser.ExpressionAssignContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 161
                        if not self.precpred(self._ctx, 1):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                        self.state = 162
                        self.match(MxParser.Assign)
                        self.state = 163
                        self.expression(1)
                        pass

                    elif la_ == 13:
                        localctx = MxParser.ExpressionFunctionCallContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 164
                        if not self.precpred(self._ctx, 28):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 28)")
                        self.state = 165
                        self.match(MxParser.LeftParenthesis)
                        self.state = 167
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if (((_la) & ~0x3f) == 0 and ((1 << _la) & 72164694417737632) != 0):
                            self.state = 166
                            self.parameterList2()


                        self.state = 169
                        self.match(MxParser.RightParenthesis)
                        pass

                    elif la_ == 14:
                        localctx = MxParser.ExpressionArrayUnitContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 170
                        if not self.precpred(self._ctx, 27):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 27)")
                        self.state = 171
                        self.arrayUnit()
                        pass

                    elif la_ == 15:
                        localctx = MxParser.ExpressionSufSelfIncrementContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 172
                        if not self.precpred(self._ctx, 26):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 26)")
                        self.state = 173
                        self.match(MxParser.SelfIncrement)
                        pass

                    elif la_ == 16:
                        localctx = MxParser.ExpressionSufSelfDecrementContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 174
                        if not self.precpred(self._ctx, 25):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 25)")
                        self.state = 175
                        self.match(MxParser.SelfDecrement)
                        pass

                    elif la_ == 17:
                        localctx = MxParser.ExpressionMemberVisitContext(self, MxParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 176
                        if not self.precpred(self._ctx, 24):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 24)")
                        self.state = 177
                        self.match(MxParser.Member)
                        self.state = 178
                        localctx.member = self.match(MxParser.Identifier)
                        pass

             
                self.state = 183
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def blockStatement(self):
            return self.getTypedRuleContext(MxParser.BlockStatementContext,0)


        def forStatement(self):
            return self.getTypedRuleContext(MxParser.ForStatementContext,0)


        def ifStatement(self):
            return self.getTypedRuleContext(MxParser.IfStatementContext,0)


        def whileStatement(self):
            return self.getTypedRuleContext(MxParser.WhileStatementContext,0)


        def continueStatement(self):
            return self.getTypedRuleContext(MxParser.ContinueStatementContext,0)


        def breakStatement(self):
            return self.getTypedRuleContext(MxParser.BreakStatementContext,0)


        def emptyStatement(self):
            return self.getTypedRuleContext(MxParser.EmptyStatementContext,0)


        def returnStatement(self):
            return self.getTypedRuleContext(MxParser.ReturnStatementContext,0)


        def expressionStatement(self):
            return self.getTypedRuleContext(MxParser.ExpressionStatementContext,0)


        def variableDef(self):
            return self.getTypedRuleContext(MxParser.VariableDefContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = MxParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_statement)
        try:
            self.state = 194
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,12,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 184
                self.blockStatement()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 185
                self.forStatement()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 186
                self.ifStatement()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 187
                self.whileStatement()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 188
                self.continueStatement()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 189
                self.breakStatement()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 190
                self.emptyStatement()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 191
                self.returnStatement()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 192
                self.expressionStatement()
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 193
                self.variableDef()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EmptyStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def getRuleIndex(self):
            return MxParser.RULE_emptyStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEmptyStatement" ):
                listener.enterEmptyStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEmptyStatement" ):
                listener.exitEmptyStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEmptyStatement" ):
                return visitor.visitEmptyStatement(self)
            else:
                return visitor.visitChildren(self)




    def emptyStatement(self):

        localctx = MxParser.EmptyStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_emptyStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 196
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LeftBrace(self):
            return self.getToken(MxParser.LeftBrace, 0)

        def RightBrace(self):
            return self.getToken(MxParser.RightBrace, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.StatementContext)
            else:
                return self.getTypedRuleContext(MxParser.StatementContext,i)


        def getRuleIndex(self):
            return MxParser.RULE_blockStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlockStatement" ):
                listener.enterBlockStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlockStatement" ):
                listener.exitBlockStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlockStatement" ):
                return visitor.visitBlockStatement(self)
            else:
                return visitor.visitChildren(self)




    def blockStatement(self):

        localctx = MxParser.BlockStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_blockStatement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 198
            self.match(MxParser.LeftBrace)
            self.state = 202
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 76685886231650238) != 0):
                self.state = 199
                self.statement()
                self.state = 204
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 205
            self.match(MxParser.RightBrace)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ContinueStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Continue(self):
            return self.getToken(MxParser.Continue, 0)

        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def getRuleIndex(self):
            return MxParser.RULE_continueStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterContinueStatement" ):
                listener.enterContinueStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitContinueStatement" ):
                listener.exitContinueStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitContinueStatement" ):
                return visitor.visitContinueStatement(self)
            else:
                return visitor.visitChildren(self)




    def continueStatement(self):

        localctx = MxParser.ContinueStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_continueStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 207
            self.match(MxParser.Continue)
            self.state = 208
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BreakStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Break(self):
            return self.getToken(MxParser.Break, 0)

        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def getRuleIndex(self):
            return MxParser.RULE_breakStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBreakStatement" ):
                listener.enterBreakStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBreakStatement" ):
                listener.exitBreakStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBreakStatement" ):
                return visitor.visitBreakStatement(self)
            else:
                return visitor.visitChildren(self)




    def breakStatement(self):

        localctx = MxParser.BreakStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_breakStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 210
            self.match(MxParser.Break)
            self.state = 211
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ReturnStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Return(self):
            return self.getToken(MxParser.Return, 0)

        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_returnStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReturnStatement" ):
                listener.enterReturnStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReturnStatement" ):
                listener.exitReturnStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturnStatement" ):
                return visitor.visitReturnStatement(self)
            else:
                return visitor.visitChildren(self)




    def returnStatement(self):

        localctx = MxParser.ReturnStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_returnStatement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 213
            self.match(MxParser.Return)
            self.state = 215
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 72164694417737632) != 0):
                self.state = 214
                self.expression(0)


            self.state = 217
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WhileStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.Body = None # StatementContext

        def While(self):
            return self.getToken(MxParser.While, 0)

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def statement(self):
            return self.getTypedRuleContext(MxParser.StatementContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_whileStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhileStatement" ):
                listener.enterWhileStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhileStatement" ):
                listener.exitWhileStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhileStatement" ):
                return visitor.visitWhileStatement(self)
            else:
                return visitor.visitChildren(self)




    def whileStatement(self):

        localctx = MxParser.WhileStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_whileStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 219
            self.match(MxParser.While)
            self.state = 220
            self.match(MxParser.LeftParenthesis)
            self.state = 221
            self.expression(0)
            self.state = 222
            self.match(MxParser.RightParenthesis)
            self.state = 223
            localctx.Body = self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.Body = None # StatementContext

        def Else(self):
            return self.getToken(MxParser.Else, 0)

        def statement(self):
            return self.getTypedRuleContext(MxParser.StatementContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_elseStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElseStatement" ):
                listener.enterElseStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElseStatement" ):
                listener.exitElseStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElseStatement" ):
                return visitor.visitElseStatement(self)
            else:
                return visitor.visitChildren(self)




    def elseStatement(self):

        localctx = MxParser.ElseStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_elseStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 225
            self.match(MxParser.Else)
            self.state = 226
            localctx.Body = self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.Body = None # StatementContext

        def If(self):
            return self.getToken(MxParser.If, 0)

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def statement(self):
            return self.getTypedRuleContext(MxParser.StatementContext,0)


        def elseStatement(self):
            return self.getTypedRuleContext(MxParser.ElseStatementContext,0)


        def getRuleIndex(self):
            return MxParser.RULE_ifStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfStatement" ):
                listener.enterIfStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfStatement" ):
                listener.exitIfStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfStatement" ):
                return visitor.visitIfStatement(self)
            else:
                return visitor.visitChildren(self)




    def ifStatement(self):

        localctx = MxParser.IfStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_ifStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 228
            self.match(MxParser.If)
            self.state = 229
            self.match(MxParser.LeftParenthesis)
            self.state = 230
            self.expression(0)
            self.state = 231
            self.match(MxParser.RightParenthesis)
            self.state = 232
            localctx.Body = self.statement()
            self.state = 234
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
            if la_ == 1:
                self.state = 233
                self.elseStatement()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.Initialization = None # StatementContext
            self.Condition = None # ExpressionContext
            self.Step = None # ExpressionContext
            self.Body = None # StatementContext

        def For(self):
            return self.getToken(MxParser.For, 0)

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)

        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.StatementContext)
            else:
                return self.getTypedRuleContext(MxParser.StatementContext,i)


        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)


        def getRuleIndex(self):
            return MxParser.RULE_forStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForStatement" ):
                listener.enterForStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForStatement" ):
                listener.exitForStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForStatement" ):
                return visitor.visitForStatement(self)
            else:
                return visitor.visitChildren(self)




    def forStatement(self):

        localctx = MxParser.ForStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_forStatement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 236
            self.match(MxParser.For)
            self.state = 237
            self.match(MxParser.LeftParenthesis)
            self.state = 239
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.state = 238
                localctx.Initialization = self.statement()


            self.state = 242
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 72164694417737632) != 0):
                self.state = 241
                localctx.Condition = self.expression(0)


            self.state = 244
            self.match(MxParser.Semicolon)
            self.state = 246
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 72164694417737632) != 0):
                self.state = 245
                localctx.Step = self.expression(0)


            self.state = 248
            self.match(MxParser.RightParenthesis)
            self.state = 249
            localctx.Body = self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(MxParser.ExpressionContext,0)


        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def getRuleIndex(self):
            return MxParser.RULE_expressionStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionStatement" ):
                listener.enterExpressionStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionStatement" ):
                listener.exitExpressionStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionStatement" ):
                return visitor.visitExpressionStatement(self)
            else:
                return visitor.visitChildren(self)




    def expressionStatement(self):

        localctx = MxParser.ExpressionStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_expressionStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 251
            self.expression(0)
            self.state = 252
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParameterList1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typename(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.TypenameContext)
            else:
                return self.getTypedRuleContext(MxParser.TypenameContext,i)


        def variableConstructor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.VariableConstructorContext)
            else:
                return self.getTypedRuleContext(MxParser.VariableConstructorContext,i)


        def Comma(self, i:int=None):
            if i is None:
                return self.getTokens(MxParser.Comma)
            else:
                return self.getToken(MxParser.Comma, i)

        def getRuleIndex(self):
            return MxParser.RULE_parameterList1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParameterList1" ):
                listener.enterParameterList1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParameterList1" ):
                listener.exitParameterList1(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameterList1" ):
                return visitor.visitParameterList1(self)
            else:
                return visitor.visitChildren(self)




    def parameterList1(self):

        localctx = MxParser.ParameterList1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_parameterList1)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 254
            self.typename()
            self.state = 255
            self.variableConstructor()
            self.state = 262
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==53:
                self.state = 256
                self.match(MxParser.Comma)
                self.state = 257
                self.typename()
                self.state = 258
                self.variableConstructor()
                self.state = 264
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParameterList2Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MxParser.ExpressionContext,i)


        def Comma(self, i:int=None):
            if i is None:
                return self.getTokens(MxParser.Comma)
            else:
                return self.getToken(MxParser.Comma, i)

        def getRuleIndex(self):
            return MxParser.RULE_parameterList2

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParameterList2" ):
                listener.enterParameterList2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParameterList2" ):
                listener.exitParameterList2(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameterList2" ):
                return visitor.visitParameterList2(self)
            else:
                return visitor.visitChildren(self)




    def parameterList2(self):

        localctx = MxParser.ParameterList2Context(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_parameterList2)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            self.expression(0)
            self.state = 270
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==53:
                self.state = 266
                self.match(MxParser.Comma)
                self.state = 267
                self.expression(0)
                self.state = 272
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.name = None # Token

        def typename(self):
            return self.getTypedRuleContext(MxParser.TypenameContext,0)


        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)

        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def blockStatement(self):
            return self.getTypedRuleContext(MxParser.BlockStatementContext,0)


        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def parameterList1(self):
            return self.getTypedRuleContext(MxParser.ParameterList1Context,0)


        def getRuleIndex(self):
            return MxParser.RULE_functionDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDef" ):
                listener.enterFunctionDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDef" ):
                listener.exitFunctionDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionDef" ):
                return visitor.visitFunctionDef(self)
            else:
                return visitor.visitChildren(self)




    def functionDef(self):

        localctx = MxParser.FunctionDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_functionDef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            self.typename()
            self.state = 274
            localctx.name = self.match(MxParser.Identifier)
            self.state = 275
            self.match(MxParser.LeftParenthesis)
            self.state = 277
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 524318) != 0):
                self.state = 276
                self.parameterList1()


            self.state = 279
            self.match(MxParser.RightParenthesis)
            self.state = 280
            self.blockStatement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassConstructorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.name = None # Token

        def LeftParenthesis(self):
            return self.getToken(MxParser.LeftParenthesis, 0)

        def RightParenthesis(self):
            return self.getToken(MxParser.RightParenthesis, 0)

        def blockStatement(self):
            return self.getTypedRuleContext(MxParser.BlockStatementContext,0)


        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def getRuleIndex(self):
            return MxParser.RULE_classConstructor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassConstructor" ):
                listener.enterClassConstructor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassConstructor" ):
                listener.exitClassConstructor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassConstructor" ):
                return visitor.visitClassConstructor(self)
            else:
                return visitor.visitChildren(self)




    def classConstructor(self):

        localctx = MxParser.ClassConstructorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_classConstructor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 282
            localctx.name = self.match(MxParser.Identifier)
            self.state = 283
            self.match(MxParser.LeftParenthesis)
            self.state = 284
            self.match(MxParser.RightParenthesis)
            self.state = 285
            self.blockStatement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.name = None # Token

        def Class(self):
            return self.getToken(MxParser.Class, 0)

        def LeftBrace(self):
            return self.getToken(MxParser.LeftBrace, 0)

        def RightBrace(self):
            return self.getToken(MxParser.RightBrace, 0)

        def Semicolon(self):
            return self.getToken(MxParser.Semicolon, 0)

        def Identifier(self):
            return self.getToken(MxParser.Identifier, 0)

        def variableDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.VariableDefContext)
            else:
                return self.getTypedRuleContext(MxParser.VariableDefContext,i)


        def functionDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.FunctionDefContext)
            else:
                return self.getTypedRuleContext(MxParser.FunctionDefContext,i)


        def classConstructor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MxParser.ClassConstructorContext)
            else:
                return self.getTypedRuleContext(MxParser.ClassConstructorContext,i)


        def getRuleIndex(self):
            return MxParser.RULE_classDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassDef" ):
                listener.enterClassDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassDef" ):
                listener.exitClassDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassDef" ):
                return visitor.visitClassDef(self)
            else:
                return visitor.visitChildren(self)




    def classDef(self):

        localctx = MxParser.ClassDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_classDef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 287
            self.match(MxParser.Class)
            self.state = 288
            localctx.name = self.match(MxParser.Identifier)
            self.state = 289
            self.match(MxParser.LeftBrace)
            self.state = 295
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 524318) != 0):
                self.state = 293
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
                if la_ == 1:
                    self.state = 290
                    self.variableDef()
                    pass

                elif la_ == 2:
                    self.state = 291
                    self.functionDef()
                    pass

                elif la_ == 3:
                    self.state = 292
                    self.classConstructor()
                    pass


                self.state = 297
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 298
            self.match(MxParser.RightBrace)
            self.state = 299
            self.match(MxParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[7] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 12)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 5:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 6:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 7:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 8:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 9:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 10:
                return self.precpred(self._ctx, 2)
         

            if predIndex == 11:
                return self.precpred(self._ctx, 1)
         

            if predIndex == 12:
                return self.precpred(self._ctx, 28)
         

            if predIndex == 13:
                return self.precpred(self._ctx, 27)
         

            if predIndex == 14:
                return self.precpred(self._ctx, 26)
         

            if predIndex == 15:
                return self.precpred(self._ctx, 25)
         

            if predIndex == 16:
                return self.precpred(self._ctx, 24)
         




