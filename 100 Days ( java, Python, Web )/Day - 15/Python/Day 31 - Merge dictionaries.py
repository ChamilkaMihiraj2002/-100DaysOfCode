dict1 = {'one':10, 'two':20, 'three':30}
dict2 = {'four':40, 'five':50, 'six':60}

def merge(one, two):
    return (one.update(two))

merge(dict1, dict2)

print(f"dictionary one : {dict1}")
print(f"dictionary two : {dict2}")
print(f"Merge the dictionary one & two : {dict1}")