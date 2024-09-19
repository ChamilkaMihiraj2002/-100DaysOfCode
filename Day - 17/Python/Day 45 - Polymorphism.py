import math

class square:
    def __init__(self, a):
        self.length = a
        
    def area(self):
        return self.length * self.length

class rectangular:
    def __init__(self, a, b):
        self.height = a
        self.width = b
        
    def area(self):
        return self.height * self.width

class circle:
    def __init__(self, a):
        self.radius = a
        
    def area(self):
        return math.pi * math.pow(self.radius, 2) 
    

square1 = square(5)
rectangular1 = rectangular(5, 10)
circle1  = circle(10)

for x in (square1, rectangular1, circle1):
    print(f"Area is : {x.area()}")