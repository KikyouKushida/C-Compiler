from antlr4 import *
from MxParserVisitor import MxParserVisitor
from MxParser import MxParser
import sys


def Error_return_type_dismatch(name):
    print(f"function {name}, whose return_type dismatches its definition_type.")
    sys.exit(1)

def Error_function_main_count_is_not_one(num):
    print(f"function_main count is {num}")
    sys.exit(1)


def Error_multiple_definitions(name):
    print(f"multiple definitions of identifier {name}")
    sys.exit(1)


def Error_invalid_control_flow(name):
    print(f"Invalid control flow, {name} out of any function's domain")
    sys.exit(1)

def Error_unknown_identifier(name):
    print(f"Unknown Identifier {name}")
    sys.exit(1)


def Error_Invalid_variable_or_object_name(op, name):
    if op == 1:
        print(f"Invalid variable name {name}")
    else:
        print(f"Invalid object name {name}")

from enum import Enum

class ExpressionType(Enum):
    Int = 1
    Bool = 2
    Void = 3
    Cstring = 4
    Object = 5
    Unknown = 6


class functionInformation():
    def __init__(self):
        self.returnType = ""
        self.name = ""
        self.parameterListType = []
        self.parameterListName = []

class classInformation():
    def __init__(self):
        self.name = ""
        self.variable = {}
        self.function = {}


class scopeInformation():
    variable_object = {}
    class_object = {}
    array_dimension = {}

def check_type_equal(a, b):
    if a.type != b.type:
        print("Type mismatch:")
        print(a)
        print(b)
        sys.exit(1)
        return False
  
    return True

class_name_set = {}
function_name_set = {}

def check_multiple_identifier(name):
    if class_name_set.get(name) != None or function_name_set.get(name) != None or variable_object.get(name) != None:
        Error_multiple_definitions(name)
    return False

class My_MxParserVisitor(MxParserVisitor):
    def Update_function_main_count(self):
        self.function_main_count += 1
        if self.function_main_count > 1:
            Error_function_main_count_is_not_one(self.function_main_count)

    def __init__(self):
        self.priority = 0
        self.function_main_count = 0
        self.current_function = None


    def visitProgram(self, ctx: MxParser.ProgramContext):
        # 遍历 program 节点的所有子节点
        self.priority += 1
        for child in ctx.getChildren():
            if isinstance(child, MxParser.ClassDefContext):
                self.visitClassDef(child)
            elif isinstance(child, MxParser.FunctionDefContext):
                self.visitFunctionDef(child)
            elif isinstance(child, MxParser.VariableDefContext):
                self.visitVariableDef(child)
        
        if self.function_main_count == 0:
            Error_function_main_count_is_not_one(self.function_main_count)
            sys.exit(1)
        self.priority -= 1

        

    def visitClassDef(self, ctx: MxParser.ClassDefContext):
        class_name = ctx.Identifier().getText()
        if check_multiple_identifier(class_name) == False: True
        class_name_set[class_name] = 1
        print(f"Class Definition: {class_name}")
        return self.visitChildren(ctx)

    def visitFunctionDef(self, ctx: MxParser.FunctionDefContext):
        function_name = ctx.Identifier().getText()
        if check_multiple_identifier(function_name) == False: True
        function_name_set[function_name] = 1
        print(f"Function Definition: {function_name}")
        return self.visitChildren(ctx)

    def visitVariableDef(self, ctx: MxParser.VariableDefContext):
        variable_name = ctx.variableConstructor()[0].Identifier().getText()
        if check_multiple_identifier(variable_name) == False: True
        variable_object[variable_name] = 1
        print(f"Variable Definition: {variable_name}")
        return self.visitChildren(ctx)


    def visitBreakStatement(self, ctx:MxParser.BreakStatementContext):
        if self.current_function == None:
            Error_invalid_control_flow("break")
        return self.visitChildren(ctx)
    
    def visitContinueStatement(self, ctx:MxParser.ContinueStatementContext):
        if self.current_function == None:
            Error_invalid_control_flow("continue")
        return self.visitChildren(ctx)



    def visitExpression(self, ctx: MxParser.ExpressionContext):
        if isinstance(ctx, MxParser.ExpressionConstantContext):
            constant = ctx.constant()
            if constant.Integer() != None:
                return "int[0]"
            elif constant.Cstring() != None:
                return "string[0]"
            elif constant.True_() != None:
                return "bool[0]"
            elif constant.False_() != None:
                return "false[0]"
            else:
                return "null"
        if isinstance(ctx, MxParser.)
    

    def getIdentifierType(self, identifier):
        # Determine the type of an identifier (e.g., variable type)
        # This function should be implemented based on your specific context
        if class_name_set.get(identifier) != None: 
            # print(f"Error: class object {class_name_set[identifier]} {identifier} become an expression.")
            # sys.exit(1)
            return ExpressionType.Object
        if variable_object.get(identifier) != None:
            tmp = variable_object[identifier]
            return tmp
        return ExpressionType.Unknown

    def getConstantType(self, constant):
        # Determine the type of a constant
        # This function should be implemented based on your specific context
        if constant.isdigit():
            return ExpressionType.INTEGER
        try:
            float(constant)
            return ExprType.FLOAT
        except ValueError:
            return ExprType.STRING    
