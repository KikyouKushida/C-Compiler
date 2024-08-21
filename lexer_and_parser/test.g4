int main(){
	if (a == 1){
		b = 2;
	}
	else if(a == 2){
		b = 3;
	}
	else {
		b = 4;
	}
	return 0;
}


表达式：
1. 类型：

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