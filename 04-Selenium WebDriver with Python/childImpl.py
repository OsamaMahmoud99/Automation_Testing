from oop import Calculator

class childImpl(Calculator):
    num2 = 200

    def __init__(self):
        Calculator.__init__(self, 2, 10)

    def getCompletedata(self):
        return self.num2 + self.num + self.Summation()

obj = childImpl()
print(obj.getCompletedata())