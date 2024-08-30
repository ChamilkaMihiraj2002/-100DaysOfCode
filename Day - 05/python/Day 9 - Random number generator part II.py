import random 

def genarate_number(start, end):
    x = random.randint(start,end)
    print(f"Random number : {x}")
    
data = input("Enter number x:y :: ").split(":")
genarate_number(int(data[0]), int(data[1]))