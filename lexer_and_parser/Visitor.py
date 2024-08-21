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

def Error_unexpected_item(item_name):
    print(f"Unexpected item {item_name}")
    sys.exit(1)

def Error_return_out_of_any_function():
    print(f"Return statement out of any function")
    sys.exit(1)

def Error_expression_type_dismatch(string):
    print(f"Type dismatch in expression {string}")
    sys.exit(1)


def Error_invalid_variable_or_object_name(op, name):
    if op == 1:
        print(f"Invalid variable name {name}")
    else:
        print(f"Invalid object name {name}")
    sys.exit(1)


def Error_array_length_not_a_positive_integer(name):
    print(f"Array {name} length is not an positive integer")
    sys.exit(1)

def Error_function_lack_returnStatement(name):
    print(f"function {name} lacks return statements")
    sys.exit(1)

def Error_name_of_functionCall_not_a_function(name):
    print(f"attempt to call {name}, which is not a function at all")


from enum import Enum

class ExpressionType(Enum):
    Int = 1
    Bool = 2
    Void = 3
    Cstring = 4
    Object = 5
    Function = 6
    Reference = 7
    Unknown = 8


class typeInformation():    
    def __init__(self):
        self.type = None
        self.dimension = 0
        self.arraySize = []
        self.value = None
        self.objectName = None
    

class objectInformation():
    def __init__(self):
        self.name = ""
        self.type = ""

class functionInformation():
    def __init__(self):
        self.returnType = ""
        self.name = ""
        self.parameterListType = []
        self.parameterListName = []
        self.haveReturnStatement = False


Default_functions = {"print", "println", "printInt", "getString", "getInt", "toString"}

class classInformation():
    def __init__(self):
        self.name = ""
        self.object = {}
        self.function = {}

class scopeInformation():
    def __init__(self):
        self.fa = -1
        self.scopeId = -1
        self.object = {}

scopeInformationStore = [scopeInformation() for _ in range(1000)]
class_name_set = {}      # string -> classInformation
function_name_set = {}   # string -> functionInformation


class My_MxParserVisitor(MxParserVisitor):

    def create_new_scope(self):
        newScopeId = self.scope_count + 1
        self.scope_count += 1
        tempScopeInformation = scopeInformation()
        tempScopeInformation.fa = self.current_scope
        tempScopeInformation.scopeId = newScopeId
        self.current_scope = newScopeId
        scopeInformationStore[newScopeId] = tempScopeInformation
        return tempScopeInformation

    def translate_MxParser_basictype(self, type: MxParser.TypeContext):
        if isinstance(type, MxParser.Int): return ExpressionType.Int
        elif isinstance(type, MxParser.Bool): return ExpressionType.Bool
        elif isinstance(type, MxParser.Cstring): return ExpressionType.Cstring
        elif isinstance(type, MxParser.Void): return ExpressionType.Void
        else: return ExpressionType.Object

    def translate_typename(self, typeName: MxParser.TypenameContext):
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = self.translate_MxParser_basictype(typeName.type_())
        tempTypeInformation.dimension = len(typeName.arrayUnit())
        for i in range(tempTypeInformation.dimension):
            arrayUnitMember = typeName.arrayUnit(i)
            if arrayUnitMember.expression() != None:
                res = self.visit(arrayUnitMember.expression())
                if res.type != ExpressionType.Int or res.value < 0:
                    Error_array_length_not_a_positive_integer(tempTypeInformation.type.getText())
                tempTypeInformation.arraySize.append(res.value)
            else: tempTypeInformation.arraySize.append(None)
        return tempTypeInformation

    def check_valid_typename(self, typeName: MxParser.TypenameContext):
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = typeName.type_()
        tempTypeInformation.dimension = len(typeName.arrayUnit())
        for i in range(tempTypeInformation.dimension):
            arrayUnitMember = typeName.arrayUnit(i)
            if arrayUnitMember.expression() != None:
                res = self.visit(arrayUnitMember.expression())
                if res.type != ExpressionType.Int or res.value < 0 :
                    Error_array_length_not_a_positive_integer(tempTypeInformation.type.getText())
                tempTypeInformation.arraySize.append(res.value)
            else: tempTypeInformation.arraySize.append(None)

        if class_name_set.get(typeName.type_().getText()) != None: 
            return True
        elif tempTypeInformation.type != ExpressionType.Unknown and tempTypeInformation.type != ExpressionType.Object:
            return True 
        Error_unknown_identifier(typeName.type_().getText())
        return False

    def check_multiple_identifier(self, current_scope: int, name: str):
        if class_name_set.get(name) != None or function_name_set.get(name) != None:
            Error_multiple_definitions(name)
            return False
        while current_scope != -1:
            tempScopeInformation = scopeInformation[current_scope]
            if tempScopeInformation.object.get(name) != None:
                Error_multiple_definitions(name)
                return False
            current_scope = tempScopeInformation.fa
        return True

    # def check_no_new_in_parameterList1(self, ctx: MxParser.VariableConstructorContext):
    #     if ctx.New() != None:
    #         Error_unexpected_item("new")
    #         return False
    #     return True

    def check_no_assign_in_parameterList1(self, ctx: MxParser.VariableConstructorContext):
        if ctx.Assign() != None:
            Error_unexpected_item("=")
            return False
        return True

    def __init__(self):
        self.current_scope = 0
        self.scope_count = 0
        self.priority = 0
        self.function_main_count = 0
        self.current_function = None
        self.current_class = None

    def Update_function_main_count(self):
        self.function_main_count += 1
        if self.function_main_count > 1:
            Error_function_main_count_is_not_one(self.function_main_count)


    def visitProgram(self, ctx: MxParser.ProgramContext):
        self.priority += 1
        self.create_new_scope()
        for child in ctx.getChildren():
            self.visit(child)
        if self.function_main_count == 0:
            Error_function_main_count_is_not_one(self.function_main_count)
        self.priority -= 1
        print(f"ok check passed.")
        sys.exit(0)

    def visitClassDef(self, ctx: MxParser.ClassDefContext):
        class_name = ctx.Identifier().getText()
        self.check_multiple_identifier(class_name)
        tempClassInformation = classInformation()
        tempClassInformation.name = class_name
        self.current_class = class_name
        print(f"Class Definition: {class_name}")
        class_name_set[class_name] = tempClassInformation
        for child in ctx.getChildren():
            self.visit(child)
        self.current_class = None

    def visitFunctionDef(self, ctx: MxParser.FunctionDefContext):
        function_name = ctx.Identifier().getText()
        type_name = ctx.typename()
        self.check_multiple_identifier(self.current_scope, function_name)
        self.check_valid_typename(type_name)
        self.current_function = function_name
        if self.current_class == None:
            print(f"Global Function Definition: {function_name}")
        else:
            print(f"Class {self.current_class} Member Function Definition: {function_name}")
        tempFunctionInformation = functionInformation()
        tempFunctionInformation.name = function_name
        tempFunctionInformation.returnType = self.translate_typename(type_name)
        paralen = len(ctx.parameterList1().variableConstructor())
        print(f"Length of parameterList is {paralen}.")
        for i in range(0, len):
            # self.check_no_new_in_parameterList1(ctx.parameterList1().variableConstructor()[i])
            self.check_no_assign_in_parameterList1(ctx.parameterList1().variableConstructor()[i])
            tempFunctionInformation.parameterListType.append(ctx.parameterList1().typename()[i])
            tempFunctionInformation.parameterListName.append(ctx.parameterList1().variableConstructor()[i].name())
        if self.current_class == None:
            function_name_set[function_name] = tempFunctionInformation
        else: 
            tempClassInformation = class_name_set[self.current_class]
            tempClassInformation.function[function_name] = tempFunctionInformation
            class_name_set[self.current_class] = tempClassInformation
        for child in ctx.getChildren():
            self.visit(child)
        self.current_function = None

    def visitVariableDef(self, ctx: MxParser.VariableDefContext):
        type_name = ctx.typename()
        self.check_valid_typename(type_name)
        variablelen = len(ctx.variableConstructor())
        for i in range(variablelen):
            variable_name = ctx.variableConstructor()[i].Identifier()
            self.check_multiple_identifier(self.current_scope, variable_name)
            tempObjectInformation = objectInformation()
            tempObjectInformation.name = variable_name
            tempObjectInformation.type = self.translate_typename(type_name)
        for child in ctx.getChildren():
            self.visit(child)


    def visitBreakStatement(self, ctx:MxParser.BreakStatementContext):
        if self.current_priority == 0:
            Error_invalid_control_flow("break")
        return self.visitChildren(ctx)
    
    def visitContinueStatement(self, ctx:MxParser.ContinueStatementContext):
        if self.current_priority == 0:
            Error_invalid_control_flow("continue")
        return self.visitChildren(ctx)

    def visitReturnStatement(self, ctx: MxParser.ReturnStatementContext):
        if self.current_function == None:
            Error_return_out_of_any_function()
        if self.current_class == None: # global function
            tempFunctionInformation = function_name_set[self.current_function]
            actual_return_type = typeInformation()
            if ctx.expression() == None:
                actual_return_type.type = ExpressionType.Void
                actual_return_type.dimension = 0
            else:
                actual_return_type = self.visit(ctx.expression())
            expected_return_type = tempFunctionInformation.returnType
            if actual_return_type.type != expected_return_type.type or actual_return_type.dimension != expected_return_type.dimension:
                Error_return_type_dismatch(self.current_function)
            tempFunctionInformation.haveReturnStatement = True
            function_name_set[self.current_function] = tempFunctionInformation
        else:                           # member function
            tempClassInformation = class_name_set[self.current_class]
            tempFunctionInformation = tempClassInformation.function[self.current_function]
            actual_return_type = typeInformation()
            if ctx.expression() == None:
                actual_return_type.type = ExpressionType.Void
                actual_return_type.dimension = 0
            else:
                actual_return_type = self.visit(ctx.expression())
            expected_return_type = tempFunctionInformation.returnType
            if actual_return_type.type != expected_return_type.type or actual_return_type.dimension != expected_return_type.dimension:
                Error_return_type_dismatch(self.current_function)
            tempFunctionInformation.haveReturnStatement = True
            tempClassInformation.function[self.current_function] = tempFunctionInformation
            class_name_set[self.current_class] = tempClassInformation
    
    def visitConstant(self, ctx:MxParser.ConstantContext):
        return self.visitChildren(ctx)
    
    def visitExpressionLogicAnd(self, ctx:MxParser.ExpressionLogicAndContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Bool or rhs.type != ExpressionType.Bool or lhs.dimension != 1 or rhs.dimension != 1:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = [1]
        tempTypeInformation.dimension = 1
        tempTypeInformation.value = lhs.value and rhs.value

        return tempTypeInformation

    def visitExpressionArrayUnit(self, ctx:MxParser.ExpressionArrayUnitContext):

        return self.visitChildren(ctx)

    def visitExpressionAssign(self, ctx:MxParser.ExpressionAssignContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != rhs.type or lhs.dimension != rhs.dimension:
            Error_expression_type_dismatch(ctx.getText())

        # code to deal with assign operation, not yet completed

        return rhs

    def visitExpressionMemberVisit(self, ctx:MxParser.ExpressionMemberVisitContext):

        return self.visitChildren(ctx)

    def visitExpressionTrinocular(self, ctx:MxParser.ExpressionTrinocularContext):
        return self.visitChildren(ctx)

    def visitExpressionBitwiseXor(self, ctx:MxParser.ExpressionBitwiseXorContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = [1]
        tempTypeInformation.dimension = 1
        tempTypeInformation.value = lhs.value ^ rhs.value

        return tempTypeInformation

    def visitExpressionBitwiseShift(self, ctx:MxParser.ExpressionBitwiseShiftContext):
        return self.visitChildren(ctx)

    def visitExpressionBitwiseOr(self, ctx:MxParser.ExpressionBitwiseOrContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = [1]
        tempTypeInformation.dimension = 1
        tempTypeInformation.value = lhs.value or rhs.value

        return tempTypeInformation

    def visitExpressionPreSelfDecrement(self, ctx:MxParser.ExpressionPreSelfDecrementContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

    def visitExpressionSufSelfIncrement(self, ctx:MxParser.ExpressionSufSelfIncrementContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host
    
    def visitExpressionLogicNot(self, ctx:MxParser.ExpressionLogicNotContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Bool or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

    def visitExpressionArithmeticOp1(self, ctx:MxParser.ExpressionArithmeticOp1Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Int
        tempTypeInformation.arraySize = [1]
        tempTypeInformation.dimension = 1

        return tempTypeInformation

    def visitExpressionArithmeticOp2(self, ctx:MxParser.ExpressionArithmeticOp2Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Int
        tempTypeInformation.arraySize = [1]
        tempTypeInformation.dimension = 1

        return tempTypeInformation

    def visitExpressionAdd(self, ctx:MxParser.ExpressionAddContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

    def visitExpressionNew(self, ctx:MxParser.ExpressionNewContext):
        return self.visitChildren(ctx)

    def visitExpressionCompare1(self, ctx:MxParser.ExpressionCompare1Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.dimension = 0
        return tempTypeInformation

    def visitExpressionCompare2(self, ctx:MxParser.ExpressionCompare2Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        if lhs.type != ExpressionType.Int and lhs.type != ExpressionType.Cstring and lhs.type != ExpressionType.Bool:
            Error_expression_type_dismatch(ctx.getText())
        if rhs.type != ExpressionType.Int and rhs.type != ExpressionType.Cstring and rhs.type != ExpressionType.Bool:
            Error_expression_type_dismatch(ctx.getText())
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.dimension = 0
        return tempTypeInformation

    def visitExpressionLogicOr(self, ctx:MxParser.ExpressionLogicOrContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Bool or rhs.type != ExpressionType.Bool or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value or rhs.value

        return tempTypeInformation

    def visitExpressionFunctionCall(self, ctx:MxParser.ExpressionFunctionCallContext):
        # to be continued
        function_ = self.visit(ctx.expression())
        if function_.type != ExpressionType.Function:
            Error_
        return None

    def visitExpressionBracket(self, ctx:MxParser.ExpressionBracketContext):
        return self.visit(ctx.expression())

    def visitExpressionBitwiseAnd(self, ctx:MxParser.ExpressionBitwiseAndContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int:
            Error_expression_type_dismatch(ctx.getText())
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Int
        tempTypeInformation.arraySize = [1]
        tempTypeInformation.dimension = 1
        tempTypeInformation.value = lhs.value and rhs.value

        return tempTypeInformation

    def visitExpressionComma(self, ctx:MxParser.ExpressionCommaContext):
        return self.visitChildren(ctx)
    
    def visitExpressionBitwiseNot(self, ctx:MxParser.ExpressionBitwiseNotContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

    def visitExpressionIdentifier(self, ctx:MxParser.ExpressionIdentifierContext):
        tempTypeInformation = typeInformation()
        name = ctx.Identifier().getText()
        current_scope = self.current_scope
        while current_scope != -1:
            tempScopeInformation = scopeInformation[current_scope]
            if tempScopeInformation.object.get(name) != None:
                tempObjectInformation = tempScopeInformation.object[name]
                tempTypeInformation.type = tempObjectInformation.type
                return tempTypeInformation
            current_scope = tempScopeInformation.fa 
        tempTypeInformation.type = ExpressionType.Unknown
        # In this case, the identifier's type may be member function of member variable of a Class.
        return tempTypeInformation

    def visitExpressionSufSelfDecrement(self, ctx:MxParser.ExpressionSufSelfDecrementContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

    def visitExpressionConstant(self, ctx:MxParser.ExpressionConstantContext):
        tempTypeInformation = typeInformation()
        if isinstance(ctx, MxParser.Integer): tempTypeInformation.type = ExpressionType.Int
        elif isinstance(ctx, MxParser.True_) or isinstance(ctx, MxParser.False_): tempTypeInformation.type = ExpressionType.Bool
        elif isinstance(ctx, MxParser.Null): tempTypeInformation.type = ExpressionType.Reference
        return tempTypeInformation

    def visitExpressionSubtract(self, ctx:MxParser.ExpressionSubtractContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

    def visitExpressionThis(self, ctx:MxParser.ExpressionThisContext):
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Reference
        return tempTypeInformation

    def visitExpressionPreSelfIncrement(self, ctx:MxParser.ExpressionPreSelfIncrementContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText())
        return host

      
