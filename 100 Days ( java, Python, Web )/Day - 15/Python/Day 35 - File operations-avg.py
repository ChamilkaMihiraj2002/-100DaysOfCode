def loadFile():
    try:
        file = open('100 days of coding/python/31 - 35/numbers.txt', "r")
    except FileNotFoundError:
        print("ERROR: File not found")
        exit(1)
    except IOError as e:
        print(f"ERROR: I/O error: {e}")
        exit(1)
        
    return file

def read(file):
    context = file.read()
    return context.split(" ")

def get_avg(file):
    total = 0
    split_data = read(file)
    for i in split_data:
        total += int(i)
        
    return total/len(split_data)

file = loadFile()
print(f"Average is : {get_avg(file)}")