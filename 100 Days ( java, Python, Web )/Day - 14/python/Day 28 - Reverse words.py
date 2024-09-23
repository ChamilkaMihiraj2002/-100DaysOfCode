def reverse(string):
    words = string.split(" ")
    
    reverse_word = list()
    for word in  words:
        reverse_word.append(word[::-1])
    return reverse_word
    
    
words = reverse(input("Enter string : "))
print("Revers words list ::  {}".format(" ".join(words)))