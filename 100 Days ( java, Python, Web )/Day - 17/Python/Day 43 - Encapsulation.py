class Base:
    def __init__(self):
        self._a = 2
        
class Derived (Base):
    def __init__(self):
        super().__init__()
        print(f"Calling protected base class value : {self._a}")
        
        self._a = 3
        print(f"Calling modified protected member outside class: {self._a}")
    
obj1 = Derived()
obj2 = Base()

print("\n")
print("Accessing protected member of obj1: ", obj1._a)
print("Accessing protected member of obj2: ", obj2._a)