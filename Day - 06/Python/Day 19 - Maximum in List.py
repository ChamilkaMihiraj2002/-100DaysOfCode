def findMax(data):
    max = 0
    for i in range(len(data)):
        if data[i] > max:
            max = data[i]
    return max

x = [15,2,3,42,57,1,12]
print(f"{x} list, max number is : {findMax(x)}")
    