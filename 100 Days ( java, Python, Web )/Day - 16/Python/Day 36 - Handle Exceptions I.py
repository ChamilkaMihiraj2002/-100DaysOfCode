def division(value, divider):
    try:
        answer = value / divider
    except ZeroDivisionError as e:
        print(f"Error :: {e}")
        exit(1)
    return answer
    

dta = int(input("Enter value : "))
div = int(input("Enter Divider :"))

print(f"{dta} / {div} = {division(dta, div)}")