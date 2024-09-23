x = [int(i) for i in input("Enter 3 numbers : ").split(" ")]

if x[0] > x[1]:
    if x[0] > x[2]:
        max = x[0]
    else:
        max = x[2]
else:
    if x[1] > x[2]:
        max = x[1]
    else:
        max = x[2]
        
print(f"Max number is : {max}")