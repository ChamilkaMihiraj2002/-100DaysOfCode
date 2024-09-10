def Anagram(string_1, string_2):
    recreate_1 = string_1.replace(" ", "").lower()
    recreate_2 = string_2.replace(" ", "").lower()

    
    return sorted(recreate_1) == sorted(recreate_2)

string1 = "listen"
string2 = "silent"

if Anagram(string1, string2):
    print(f'"{string1}" and "{string2}" are anagrams.')
else:
    print(f'"{string1}" and "{string2}" are not anagrams.')