
def frequency(sentence):
    count = 0
    words = sentence.split()
    word_count = {}
    
    for word in words:
        if word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1
    
    return word_count

sentence = "This is a sample sentence sample"
print(frequency(sentence))        