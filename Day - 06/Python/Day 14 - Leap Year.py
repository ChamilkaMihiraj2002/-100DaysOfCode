def leap(year):
    if (year%400 == 0) or (year % 4 == 0 and year % 100 != 0):
        return "Leap Year"
    else:
        return "Not a Leap Year"
    
x = int(input("Enter Year :"))
print(f"{x} is : {leap(x)}")