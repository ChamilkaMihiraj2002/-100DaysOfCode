import random

def sentence():
    subject = ["He", "She"]
    # Pair activities with their appropriate objects
    
    activity_object_pairs = [
        ("playing", "soccer"),
        ("writing", "an essay"),
        ("cooking", "a meal"),
        ("drawing", "a portrait"),
        ("studying", "for an exam")
    ]
    
    # Randomly choose an activity-object pair
    activity, obj = random.choice(activity_object_pairs)
    
    return random.choice(subject) + " is " + activity + " " + obj

print(sentence())
