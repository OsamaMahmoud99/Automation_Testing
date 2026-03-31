class Calculator:
    num = 100

    def __init__(self, a , b):
        self.firstNumber = a
        self.secondNumber = b
        print("I am called automatically when object is created")

    def getData(self):
        print("I am now executing as method in class")

    def Summation(self):
        return self.firstNumber + self.secondNumber


obj = Calculator(2, 3)
obj.getData()
print(obj.Summation())
print(obj.num)

