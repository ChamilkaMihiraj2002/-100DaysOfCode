def leap_year(year):
    if year % 400 == 0:
        return "Leap Year"
    else:
        if year % 4 == 0 and year % 100 != 0:
            return "Leap Year"
        else:
            return "Not Leap Year"
        
x = int(input("Enter Year : "))
print(f"{x} year is {leap_year(x)}")