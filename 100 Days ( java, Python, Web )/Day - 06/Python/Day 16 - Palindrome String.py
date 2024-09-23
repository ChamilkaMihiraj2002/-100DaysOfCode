def palindrome_String(word):
    reversed_word = word[::-1]
    return word == reversed_word

Read_string = input("Enter String :")
if palindrome_String(Read_string):
    print(f"{Read_string} is Palindrome")
else:
    print(f"{Read_string} is not a Palindrome")