def loadFile(location):
    try:
        file = open(location, "r")
    except FileNotFoundError as e:
        print(f"Error :: {e}")
        exit(1)
    return file


location = str(input("File location : "))
loadFile(location)