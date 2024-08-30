def add(number_1, number_2):
    return number_1 + number_2

def subtract(number_1, number_2):
    return number_1 - number_2

def multi(number_1, number_2):
    return number_1 * number_2

def divide(number_1, number_2):
    return 0 if number_2 == 0 else number_1 / number_2

def main(data):
    value1 = int(data[0])
    value2 = int(data[2])
    
    if data[1] == '+':
        return add(value1,value2)
    elif data[1] == '-':
        return subtract(value1,value2)
    elif data[1] == 'x':
        return multi(value1,value2)
    elif data[1] == '/':
        return divide(value1,value2)
    else:
        print("Error")
        return 0

expression = input(":: ")  # e.g., "20 + 10"
tokens = expression.split(" ")
print(f"{tokens[0]} {tokens[1]} {tokens[2]} = {main(tokens)}")