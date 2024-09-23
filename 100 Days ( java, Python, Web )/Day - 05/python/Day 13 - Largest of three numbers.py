def getLargest_number(data):
    max = 0
    for i in range(len(data)):
        if data[i] > max:
            max = data[i]
    return max

array = list()
           
for i in range(0,3):
    array.append(int(input(f"Enter number {i}: ")))
    
print(f"\nLargest number is : {getLargest_number(array)}")