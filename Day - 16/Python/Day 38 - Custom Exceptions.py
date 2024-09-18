class InvalidAgeSet(Exception) :
    "Age is not satisfy the conditions"
    pass

age = 18

try:
    value = int(input("Age : "))
    if value < 18:
        raise InvalidAgeSet
    else:
        print("Eligible")
        
except InvalidAgeSet:
    print(f"Error : age lowe than 18")
