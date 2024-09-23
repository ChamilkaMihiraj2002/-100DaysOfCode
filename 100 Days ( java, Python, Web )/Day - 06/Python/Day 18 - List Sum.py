x = [10, 20, 30, 5, 6, 7, 8]

def getSum(data):
    total = 0
    for i in data:
        total += i
    return total

print(f"Total is : {getSum(x)}")