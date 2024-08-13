rm -r bin
mkdir bin
cd ./bin
antlr4 -Dlanguage=Python3 MxLexer.g4 MxParser.g4 -visitor