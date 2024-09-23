def vowelsCount(data):
    count = 0
    vowls = "aeiouAEIOU"
    for i in data:
        if i in vowls:
            count+=1
    return count

x = input("Word : ")
print(f"{x} - Vowel Count : {vowelsCount(x)}")