def check(number):
    if number % 2 == 0:
        return "Even Number"
    else:
        return "Odd Number"
    
x = int(input("Enter number : "))
print(f'{x} is an {check(x)}')