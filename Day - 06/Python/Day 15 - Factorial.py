def factorial(value):
    total = 1
    for i in range(1, value + 1):
        total *= i
    return total

x = int(input("Enter number :"))
print(f"{x}'s factorial is : {factorial(x)}")