import math
def area(radius):
    return math.pi * pow(radius, 2)

r = float(input("Enter radius :"))
print("Area of a Circle : {:.2f}".format(area(r)))