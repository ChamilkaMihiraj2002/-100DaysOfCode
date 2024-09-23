import random
import string
def GetPassword(numbersCount, letters, symbolsCount):
    numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    symbols = ['!', '@', '#', '$', '%', '&', '*']

    # Select random letters, symbols, and numbers
    random_letters = random.sample(string.ascii_letters, letters)
    random_symbols = random.sample(symbols, symbolsCount)
    random_numbers = random.sample(numbers, numbersCount)

    # Combine all selections into one list
    random_select = random_letters + random_symbols + random_numbers

    # Shuffle the combined list
    random.shuffle(random_select)

    return ''.join(random_select)
def getInput(data):
    count = int(input(data))
    if count > 10:
        print("Value should not be greater than 10.")
        return getInput(data)
    else:
        return count

print("----- Random Password Generator -----")

numberCount = getInput("Number Count (0-10): ")
letterCount = getInput("Letter Count (0-10): ")
symbolCount = getInput("Symbol Count (0-10): ")

genaratePwd = GetPassword(numberCount, letterCount, symbolCount)

print("--------------------------------------")
print("Password is : {}".format(genaratePwd))
print("--------------------------------------")