from antlr4 import *
from MxParserVisitor import MxParserVisitor
from MxParser import MxParser
import sys


def Error_return_type_dismatch(name, line_number):
    print(f"In line {line_number}, function {name}, whose return_type dismatches its definition_type.")
    sys.exit(1)

def Error_function_main_count_is_not_one(num, line_number):
    print(f"In line {line_number}, function_main count is {num}")
    sys.exit(1)


def Error_multiple_definitions(name, line_number):
    print(f"In line {line_number}, multiple definitions of identifier {name}")
    sys.exit(1)


def Error_invalid_control_flow(name, line_number):
    print(f"In line {line_number},  control flow, {name} out of any function's domain")
    sys.exit(1)

def Error_unknown_identifier(name, line_number):
    print(f"In line {line_number}, Unknown Identifier {name}")
    sys.exit(1)

def Error_unexpected_item(item_name, line_number):
    print(f"In line {line_number}, Unexpected item {item_name}")
    sys.exit(1)

def Error_return_out_of_any_function(line_number):
    print(f"In line {line_number}, Return statement out of any function")
    sys.exit(1)

def Error_expression_type_dismatch(string, line_number):
    print(f"In line {line_number}, Type dismatch in expression {string}")
    sys.exit(1)


def Error_invalid_variable_or_object_name(op, name, line_number):
    if op == 1:
        print(f"In line {line_number}, Invalid variable name {name}")
    else:
        print(f"In line {line_number}, Invalid object name {name}")
    sys.exit(1)


def Error_array_length_not_a_positive_integer(name, line_number):
    print(f"In line {line_number}, Array {name} length is not an positive integer")
    sys.exit(1)

def Error_function_lack_returnStatement(name, line_number):
    print(f"In line {line_number}, function {name} lacks return statements")
    sys.exit(1)

def Error_name_of_functionCall_not_a_function(name, line_number):
    print(f"In line {line_number}, attempt to call {name}, which is not a function at all")
    sys.exit(1)

def Error_parameterList_of_functionCall_wrong(name, line_number):
    print(f"In line {line_number}, Call of function {name} has a wrong parameterList")
    sys.exit(1)

def Error_invalid_member_visit(string, line_number):
    print(f"In line {line_number}, Such member visit {string} is invalid")
    sys.exit(1)

def Error_invalid_array_unit(string, line_number):
    print(f"In line {line_number}, Such array unit {string} is invalid")
    sys.exit(1)

def Error_trinocular_type_invalid(string, line_number):
    print(f"In line {line_number}, Invalid operator type detected in trinocular expression {string}")
    sys.exit(1)


def Error_dimension_dismatch_in_arrayUnit(expectedDimension, actualDimension, string, line_number):
    print(f"In line {line_number}, Dimension dismatch in {string}, expected {expectedDimension}, got {actualDimension}")
    sys.exit(1)

def Error_wrong_expression_type(string, line_number):
    print(f"In line {line_number}, Wrong expression type detected in expression {string}")
    sys.exit(1)


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
        self.opType = None
        self.objectInfo = None
        self.functionInfo = None
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
Default_functions = {}


class My_MxParserVisitor(MxParserVisitor):

    def initialize_default_lists(self):
        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Void
        tempFunctionInfo.name = "print"
        tempFunctionInfo.parameterListType = [ExpressionType.Cstring]
        tempFunctionInfo.parameterListName = ["str"]
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["print"] = tempFunctionInfo

        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Void
        tempFunctionInfo.name = "println"
        tempFunctionInfo.parameterListType = [ExpressionType.Cstring]
        tempFunctionInfo.parameterListName = ["str"]
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["println"] = tempFunctionInfo

        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Void
        tempFunctionInfo.name = "printInt"
        tempFunctionInfo.parameterListType = [ExpressionType.Int]
        tempFunctionInfo.parameterListName = ["n"]
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["printInt"] = tempFunctionInfo

        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Void
        tempFunctionInfo.name = "printlnInt"
        tempFunctionInfo.parameterListType = [ExpressionType.Int]
        tempFunctionInfo.parameterListName = ["n"]
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["printlnInt"] = tempFunctionInfo

        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Cstring
        tempFunctionInfo.name = "getString"
        tempFunctionInfo.parameterListType = []
        tempFunctionInfo.parameterListName = []
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["getString"] = tempFunctionInfo

        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Int
        tempFunctionInfo.name = "getInt"
        tempFunctionInfo.parameterListType = []
        tempFunctionInfo.parameterListName = []
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["getInt"] = tempFunctionInfo

        tempFunctionInfo = functionInformation()
        tempFunctionInfo.returnType = ExpressionType.Cstring
        tempFunctionInfo.name = "toString"
        tempFunctionInfo.parameterListType = [ExpressionType.Int]
        tempFunctionInfo.parameterListName = ["i"]
        tempFunctionInfo.haveReturnStatement = False
        Default_functions["toString"] = tempFunctionInfo

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
        if type.Int() != None: return ExpressionType.Int
        elif type.Bool() != None: return ExpressionType.Bool
        elif type.String() != None: return ExpressionType.Cstring
        elif type.Void() != None: return ExpressionType.Void
        else: return type.Identifier().getText()

    def translate_typename(self, typeName: MxParser.TypenameContext):
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = self.translate_MxParser_basictype(typeName.type_())
        tempTypeInformation.dimension = len(typeName.arrayUnit())
        for i in range(tempTypeInformation.dimension):
            arrayUnitMember = typeName.arrayUnit(i)
            if arrayUnitMember.expression() != None:
                res = self.visit(arrayUnitMember.expression())
                if res.type != ExpressionType.Int or res.value < 0:
                    line_number = self.ctx.start.line
                    Error_array_length_not_a_positive_integer(tempTypeInformation.type.getText(), line_number)
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
                    line_number = self.ctx.start.line
                    Error_array_length_not_a_positive_integer(tempTypeInformation.type.getText(), line_number)
                tempTypeInformation.arraySize.append(res.value)
            else: tempTypeInformation.arraySize.append(None)

        if class_name_set.get(typeName.type_().getText()) != None: 
            return True
        elif tempTypeInformation.type != ExpressionType.Unknown and tempTypeInformation.type != ExpressionType.Object:
            return True 
        line_number = self.ctx.start.line
        Error_unknown_identifier(typeName.type_().getText(), line_number)
        return False

    def check_multiple_identifier(self, current_scope: int, name: str):
        if class_name_set.get(name) != None or function_name_set.get(name) != None:
            line_number = self.ctx.start.line
            Error_multiple_definitions(name, line_number)
            return False
        while current_scope != 0:
            tempScopeInformation = scopeInformationStore[current_scope]
            if tempScopeInformation.object.get(name) != None:
                line_number = self.ctx.start.line
                Error_multiple_definitions(name, line_number)
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
            line_number = ctx.start.line
            Error_unexpected_item("=", line_number)
            return False
        return True

    def __init__(self):
        self.current_scope = 0
        self.scope_count = 0
        self.priority = 0
        self.function_main_count = 0
        self.current_function = None
        self.current_class = None
        self.initialize_default_lists()

    def Update_function_main_count(self):
        self.function_main_count += 1
        if self.function_main_count > 1:
            line_number = self.ctx.start.line
            Error_function_main_count_is_not_one(self.function_main_count, line_number)


    def visitProgram(self, ctx: MxParser.ProgramContext):
        self.priority += 1
        self.create_new_scope()
        for child in ctx.getChildren():
            self.visit(child)
        if self.function_main_count == 0:
            line_number = ctx.start.line
            Error_function_main_count_is_not_one(self.function_main_count, line_number)
        self.priority -= 1
        for function in function_name_set:
            if function_name_set[function].haveReturnStatement == False and function_name_set[function].returnType.type != ExpressionType.Void and function != "main":
                line_number = ctx.start.line
                Error_function_lack_returnStatement(function, line_number)
        for Class in class_name_set:
            for function in class_name_set[Class].function:
                if class_name_set[Class].function[function].haveReturnStatement == False and class_name_set[Class].function[function].returnType.type != ExpressionType.Void:
                    line_number = ctx.start.line
                    Error_function_lack_returnStatement(function, line_number)
        print(f"ok check passed.")
        sys.exit(0)

    def visitClassDef(self, ctx: MxParser.ClassDefContext):
        class_name = ctx.Identifier().getText()
        self.check_multiple_identifier(self.current_scope, class_name)
        tempClassInformation = classInformation()
        tempClassInformation.name = class_name
        self.current_class = class_name
        print(f"Class Definition: {class_name}")
        class_name_set[class_name] = tempClassInformation
        for child in ctx.getChildren():
            self.visit(child)
        self.current_class = None

    def visitFunctionDef(self, ctx: MxParser.FunctionDefContext):
        function_name = ctx.Identifier()
        type_name = ctx.typename()
        self.check_multiple_identifier(self.current_scope, function_name)
        self.check_valid_typename(type_name)
        self.current_function = function_name.getText()
        print()
        if function_name.getText() == "main":
            self.Update_function_main_count()
        if self.current_class == None:
            print(f"Global Function Definition: {function_name.getText()}")
        else:
            print(f"Class {self.current_class} Member Function Definition: {function_name.getText()}")
        tempFunctionInformation = functionInformation()
        tempFunctionInformation.name = function_name.getText()
        tempFunctionInformation.returnType = self.translate_typename(type_name)
        print(f"returnType = {tempFunctionInformation.returnType.type}, dimension = {tempFunctionInformation.returnType.dimension}")
        paralen = 0
        if ctx.parameterList1() != None: paralen = len(ctx.parameterList1().variableConstructor())
        print(f"Length of parameterList is {paralen}.")
        print()
        for i in range(0, paralen):
            # self.check_no_new_in_parameterList1(ctx.parameterList1().variableConstructor()[i])
            self.check_no_assign_in_parameterList1(ctx.parameterList1().variableConstructor()[i])
            tempFunctionInformation.parameterListType.append(self.translate_typename(ctx.parameterList1().typename()[i]))
            tempFunctionInformation.parameterListName.append((ctx.parameterList1().variableConstructor()[i].name()).getText())
        if self.current_class == None:
            function_name_set[function_name.getText()] = tempFunctionInformation
        else: 
            tempClassInformation = class_name_set[self.current_class]
            tempClassInformation.function[function_name.getText()] = tempFunctionInformation
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
            tempObjectInformation.name = variable_name.getText()
            tempObjectInformation.type = self.translate_typename(type_name)
            if self.current_class == None:
                scopeInformationStore[self.current_scope].object[variable_name.getText()] = tempObjectInformation
                print(f"Variable Definition: {variable_name.getText()}, current_scope = {self.current_scope}")
            else:
                tempClassInformation = class_name_set[self.current_class]
                tempClassInformation.object[variable_name.getText()] = tempObjectInformation
                print(f"Class member Variable Definition: {variable_name.getText()}, current_scope = {self.current_scope}")
        for child in ctx.getChildren():
            self.visit(child)


    def visitBreakStatement(self, ctx:MxParser.BreakStatementContext):
        if self.current_priority == 0:
            line_number = ctx.start.line
            Error_invalid_control_flow("break", line_number)
        return self.visitChildren(ctx)
    
    def visitContinueStatement(self, ctx:MxParser.ContinueStatementContext):
        if self.current_priority == 0:
            line_number = ctx.start.line
            Error_invalid_control_flow("continue", line_number)
        return self.visitChildren(ctx)

    def visitReturnStatement(self, ctx: MxParser.ReturnStatementContext):
        if self.current_function == None:
            line_number = ctx.start.line
            Error_return_out_of_any_function(line_number)
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
                line_number = ctx.start.line
                Error_return_type_dismatch(self.current_function, line_number)
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
                line_number = ctx.start.line
                Error_return_type_dismatch(self.current_function, line_number)
            tempFunctionInformation.haveReturnStatement = True
            tempClassInformation.function[self.current_function] = tempFunctionInformation
            class_name_set[self.current_class] = tempClassInformation
    
    def visitConstant(self, ctx:MxParser.ConstantContext):
        return self.visitChildren(ctx)
    
    def visitExpressionLogicAnd(self, ctx:MxParser.ExpressionLogicAndContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Bool or rhs.type != ExpressionType.Bool or lhs.dimension != 1 or rhs.dimension != 1:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value and rhs.value

        return tempTypeInformation

    def visitExpressionArrayUnit(self, ctx:MxParser.ExpressionArrayUnitContext):
        lhs = self.visit(ctx.expression())
        line_number = ctx.start.line
        if lhs.opType != ExpressionType.Object:
            Error_invalid_array_unit(ctx.getText(), line_number)
        dimension = len(ctx.arrayUnit())
        # if lhs.dimension != dimension:
        #     Error_dimension_dismatch_in_arrayUnit(lhs.dimension, dimension, ctx.getText())
        # for i in range(dimension):
        #     temp = self.visit(ctx.arrayUnit(i).expression())
        #     if temp.type != ExpressionType.Int or temp.dimension != 0:
        #         Error_wrong_expression_type(ctx.arrayUnit(i).expression())
        if lhs.dimension > dimension:
            Error_dimension_dismatch_in_arrayUnit(lhs.dimension, dimension, ctx.getText(), line_number)
        tempTypeInformation = typeInformation()
        tempTypeInformation.dimension = dimension - lhs.dimension
        tempTypeInformation.type = lhs.type
        for i in range(lhs.dimension):
            temp = self.visit(ctx.arrayUnit(i).expression())
            if temp.type != ExpressionType.Int or temp.dimension != 0:
                Error_wrong_expression_type(ctx.arrayUnit(i).expression(), line_number)
        return tempTypeInformation

    def visitExpressionAssign(self, ctx:MxParser.ExpressionAssignContext):
        print(f"Visit Expression Assign")
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != rhs.type or lhs.dimension != rhs.dimension:
            print(f"{lhs.type}, {rhs.type}, {lhs.dimension}, {rhs.dimension}")
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)

        # code to deal with assign operation, not yet completed

        return rhs

    def visitExpressionMemberVisit(self, ctx:MxParser.ExpressionMemberVisitContext):
        lhs = self.visit(ctx.expression())
        rhs = ctx.Identifier()
        if lhs.opType != ExpressionType.Object:
            line_number = ctx.start.line
            Error_invalid_member_visit(ctx.getText(), line_number)
        print(f"ko")
        tempObjectInformation = objectInformation()
        tempTypeInformation = typeInformation()
        class_name = None
        current_scope = self.current_scope
        while current_scope != 0:
            tempScopeInformation = scopeInformationStore[current_scope]
            if tempScopeInformation.object.get(lhs.objectName) != None:
                tempObjectInformation = tempScopeInformation.object[lhs.objectName]
                class_name = tempObjectInformation.type.type
                break
            current_scope = tempScopeInformation.fa
        print(f"{class_name}, {type(class_name)}")
        if class_name == None or type(class_name) != str:
            line_number = ctx.start.line
            Error_invalid_member_visit(ctx.getText(), line_number)
        print(f"ok")
        tempClassInformation = classInformation()
        tempClassInformation = class_name_set[class_name]

        print(f"size = {len(tempClassInformation.object)}")
    
        if tempClassInformation.function.get(rhs.getText()) != None:
            tempTypeInformation.optype = ExpressionType.Function
            tempTypeInformation.functionInfo = tempClassInformation.function.get(rhs.getText())
            return tempTypeInformation
        elif tempClassInformation.object.get(rhs.getText()) != None:
            tempTypeInformation = tempClassInformation.object.get(rhs.getText()).type
            tempTypeInformation.optype = ExpressionType.Object
            tempTypeInformation.objectName = rhs.getText()
            return tempTypeInformation
        line_number = ctx.start.line
        Error_invalid_member_visit(ctx.getText(), line_number)
        return 

    def visitExpressionTrinocular(self, ctx:MxParser.ExpressionTrinocularContext):
        a = self.visit(ctx.expression(0))
        b = self.visit(ctx.expression(1))
        c = self.visit(ctx.expression(2))
        if a.type != bool or a.dimension != 0 or b.type != c.type or b.dimension != c.dimension:
            line_number = ctx.start.line
            Error_trinocular_type_invalid(ctx.getText(), line_number)
        # returnType equals b's type
        return b

    def visitExpressionBitwiseXor(self, ctx:MxParser.ExpressionBitwiseXorContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value ^ rhs.value

        return tempTypeInformation

    def visitExpressionBitwiseShift(self, ctx:MxParser.ExpressionBitwiseShiftContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value ^ rhs.value

        return tempTypeInformation

    def visitExpressionBitwiseOr(self, ctx:MxParser.ExpressionBitwiseOrContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value or rhs.value

        return tempTypeInformation

    def visitExpressionPreSelfDecrement(self, ctx:MxParser.ExpressionPreSelfDecrementContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitExpressionSufSelfIncrement(self, ctx:MxParser.ExpressionSufSelfIncrementContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host
    
    def visitExpressionLogicNot(self, ctx:MxParser.ExpressionLogicNotContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Bool or host.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitExpressionArithmeticOp1(self, ctx:MxParser.ExpressionArithmeticOp1Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Int
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0

        return tempTypeInformation

    def visitExpressionArithmeticOp2(self, ctx:MxParser.ExpressionArithmeticOp2Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Int
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0

        return tempTypeInformation

    def visitExpressionAdd(self, ctx:MxParser.ExpressionAddContext):
        host = self.visit(ctx.expression())
        if host.type != ExpressionType.Int or host.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitExpressionNew(self, ctx:MxParser.ExpressionNewContext):

        return self.visitChildren(ctx)

    def visitExpressionCompare1(self, ctx:MxParser.ExpressionCompare1Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int or lhs.dimension != 0 or rhs.dimension != 0:
            line_number = ctx.start.line
            Error_expression_type_dismatch(ctx.getText(), line_number)
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.dimension = 0
        return tempTypeInformation

    def visitExpressionCompare2(self, ctx:MxParser.ExpressionCompare2Context):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        line_number = ctx.start.line
        if lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        if lhs.type != ExpressionType.Int and lhs.type != ExpressionType.Cstring and lhs.type != ExpressionType.Bool:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        if rhs.type != ExpressionType.Int and rhs.type != ExpressionType.Cstring and rhs.type != ExpressionType.Bool:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.dimension = 0
        return tempTypeInformation

    def visitExpressionLogicOr(self, ctx:MxParser.ExpressionLogicOrContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        line_number = ctx.start.line
        if lhs.type != ExpressionType.Bool or rhs.type != ExpressionType.Bool or lhs.dimension != 0 or rhs.dimension != 0:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Bool
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value or rhs.value

        return tempTypeInformation

    def visitExpressionFunctionCall(self, ctx:MxParser.ExpressionFunctionCallContext):
        # to be continued
        function_ = self.visit(ctx.expression())
        line_number = ctx.start.line
        if function_.type != ExpressionType.Function:
            Error_name_of_functionCall_not_a_function(ctx.exception().getText(), line_number)
        
        return None

    def visitExpressionBracket(self, ctx:MxParser.ExpressionBracketContext):
        return self.visit(ctx.expression())

    def visitExpressionBitwiseAnd(self, ctx:MxParser.ExpressionBitwiseAndContext):
        lhs = self.visit(ctx.expression(0))
        rhs = self.visit(ctx.expression(1))
        line_number = ctx.start.line
        if lhs.type != ExpressionType.Int or rhs.type != ExpressionType.Int:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Int
        tempTypeInformation.arraySize = []
        tempTypeInformation.dimension = 0
        tempTypeInformation.value = lhs.value and rhs.value

        return tempTypeInformation

    # def visitExpressionComma(self, ctx:MxParser.ExpressionCommaContext):
    #     return self.visitChildren(ctx)
    
    def visitExpressionBitwiseNot(self, ctx:MxParser.ExpressionBitwiseNotContext):
        host = self.visit(ctx.expression())
        line_number = ctx.start.line
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitExpressionIdentifier(self, ctx:MxParser.ExpressionIdentifierContext):
        tempTypeInformation = typeInformation()
        name = ctx.Identifier().getText()
        current_scope = self.current_scope
        line_number = ctx.start.line
        print(f"visitExpressionIdentifier, current_scope = {current_scope}, name = {name}")
        while current_scope != 0:
            print(f"try to find information in scope {current_scope}")
            tempScopeInformation = scopeInformationStore[current_scope]
            if tempScopeInformation.object.get(name) != None:
                tempObjectInformation = tempScopeInformation.object[name]
                tempTypeInformation = tempObjectInformation.type
                tempTypeInformation.opType = ExpressionType.Object
                tempTypeInformation.objectName = name
                return tempTypeInformation
            current_scope = tempScopeInformation.fa 
        if function_name_set.get(name) != None:
            tempTypeInformation.opType = ExpressionType.Function
            tempTypeInformation.type = ExpressionType.Function
            tempTypeInformation.functionInfo = function_name_set.get(name)
            return tempTypeInformation
        elif Default_functions.get(name) != None:
            tempTypeInformation.opType = ExpressionType.Function
            tempTypeInformation.type = ExpressionType.Function
            tempTypeInformation.functionInfo = Default_functions.get(name)
            return tempTypeInformation
        # ???
        Error_unknown_identifier(ctx.Identifier().getText(), line_number)
        return tempTypeInformation

    def visitExpressionSufSelfDecrement(self, ctx:MxParser.ExpressionSufSelfDecrementContext):
        host = self.visit(ctx.expression())
        line_number = ctx.start.line
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitExpressionConstant(self, ctx:MxParser.ExpressionConstantContext):
        tempTypeInformation = typeInformation()
        constant_value = ctx.constant()
        if constant_value.Integer() != None: tempTypeInformation.type = ExpressionType.Int
        elif constant_value.Cstring() != None: tempTypeInformation.type = ExpressionType.Cstring
        elif constant_value.True_() != None or constant_value.False_() != None: tempTypeInformation.type = ExpressionType.Bool
        elif constant_value.Null() != None: tempTypeInformation.type = ExpressionType.Reference
        return tempTypeInformation

    def visitExpressionSubtract(self, ctx:MxParser.ExpressionSubtractContext):
        host = self.visit(ctx.expression())
        line_number = ctx.start.line
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitExpressionThis(self, ctx:MxParser.ExpressionThisContext):
        tempTypeInformation = typeInformation()
        tempTypeInformation.type = ExpressionType.Reference
        return tempTypeInformation

    def visitExpressionPreSelfIncrement(self, ctx:MxParser.ExpressionPreSelfIncrementContext):
        host = self.visit(ctx.expression())
        line_number = ctx.start.line
        if host.type != ExpressionType.Int or host.dimension != 0:
            Error_expression_type_dismatch(ctx.getText(), line_number)
        return host

    def visitBlockStatement(self, ctx:MxParser.BlockStatementContext):
        original_scope = self.current_scope
        self.create_new_scope()
        for child in ctx.getChildren():
            self.visit(child)
        self.current_scope = original_scope
        return 
    
    def visitWhileStatement(self, ctx:MxParser.WhileStatementContext):
        self.priority += 1
        for child in ctx.getchildren():
            self.visit(child)
        self.priority -= 1
    
    def visitForStatement(self, ctx:MxParser.ForStatementContext):
        self.priority += 1
        for child in ctx.getchildren():
            self.visit(child)
        self.priority -= 1
    
    def visitArrayConstant(self, ctx: MxParser.ArrayConstantContext):
        
        return super().visitArrayConstant(ctx)
    
    

      
