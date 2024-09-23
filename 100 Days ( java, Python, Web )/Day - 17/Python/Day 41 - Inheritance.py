class person:
    def __init__(self, _name, _age, _nic):
        self.name = _name
        self.age = _age
        self.nic = _nic
        
    def printId(self):
        return str(self.nic)[0:5] + self.name[0:2].upper()
    
class student(person):
    def __init__(self, _name, _age, _nic, _school):
        super().__init__(_name, _age, _nic)
        self.school = _school
        
    def setMarks(self, sub1, sub2, sub3):
        self.subject1 = sub1
        self.subject2 = sub2
        self.subject3 = sub3
    
    def getTotal(self):
        return self.subject1 + self.subject2 + self.subject3
    
    def getAvg(self):
        return self.getTotal() / 3

class undergraduate (person):
    def __init__(self, _name, _age, _nic, _gpa, _university):
        super().__init__(_name, _age, _nic)
        self.gpa = _gpa
        self.university = _university
        

obj_std = student("Chamilka", 22 , 200218703760, "SSC")
obj_std.setMarks(90, 70 , 50)

print(obj_std.printId())

print(obj_std.getTotal(), obj_std.getAvg())