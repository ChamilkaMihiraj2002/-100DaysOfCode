def grade(value):
    if value <= 100 and value >= 75:
        grade = 'A'
    elif value >= 65:
        grade = 'B'
    elif value >= 55:
        grade = 'C'
    elif value >= 45:
        grade = "S"
    else:
        grade = "F"
    return  grade

marks = float(input("Enter Marks : "))
print(f"Your grade for {marks} marks : {grade(marks)}")