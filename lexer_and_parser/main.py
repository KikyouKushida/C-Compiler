from antlr4 import *
from MxLexer import MxLexer
from MxParser import MxParser
from Visitor import My_MxParserVisitor

def main(input_stream):
    lexer = MxLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MxParser(stream)
    tree = parser.startRule()  # 用你的起始规则替换 startRule
    visitor = My_MxParserVisitor()
    visitor.visit(tree)

if __name__ == '__main__':
    input_stream = FileStream('input.mx')
    main(input_stream)