#!/usr/bin/python3

from antlr4 import *
from MxLexer import MxLexer
from MxParser import MxParser
from Visitor import My_MxParserVisitor

def main(input_stream):
    lexer = MxLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MxParser(stream)
    tree = parser.program()
    visitor = My_MxParserVisitor()
    visitor.visit(tree)

if __name__ == '__main__':
#    input_stream = FileStream('input.mx')
    input_stream = InputStream(sys.stdin.read())
    main(input_stream)


# def visitBinary(self, ctx):
#     lhs = self.visit(ctx.lhs)
#     rhs = self.visit(ctx.rhs)



    