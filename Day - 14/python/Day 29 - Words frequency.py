def frequency(string):
    words = string.split()
    wordCount = {}
    
    for word in words:
        if word in wordCount:
            wordCount[word] += 1
        else:
            wordCount[word] = 1
            
    return wordCount

sentence = "This is a sample sentence sample"
print(frequency(sentence))        
    