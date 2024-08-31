def fibonacci(end):
    print("fibonacci Sequence :",  end=" ")
    number = 0
    temp = 0
    n = 1
    for i in range(0,end):
        print(number, end=" ")
        temp = n
        n = temp + number
        number = temp

limit = int(input("Enter limit :"))
fibonacci(limit)