def longest(String_re):
    words = String_re.split(" ")
    length = 0
    
    for word in words:
        if (len(word) > length):
            longestWord = word
            length = len(word)
    
    return longestWord
        
    
string = str(input("Enter string : "))
print(f"'{string}' string longest word is : '{longest(string)}' ")