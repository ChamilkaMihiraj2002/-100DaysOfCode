class shapes:
    def __init__(self):
        print("Shape created")
    
    
class circle (shapes):
    def create(self):
        print("circle create")
        
class square (shapes):
     def create(self):
        print("square create")
        
class triangle (shapes):
     def create(self):
        print("triangle create")
        

obj = circle()
obj.create()