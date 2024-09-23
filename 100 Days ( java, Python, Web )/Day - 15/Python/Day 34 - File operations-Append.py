def loadFile():
    try:
        file = open('100 days of coding/python/31 - 35/append.txt', "a")
    except FileNotFoundError:
        print("ERROR: File not found")
        exit(1)
    except IOError as e:
        print(f"ERROR: I/O error: {e}")
        exit(1)
    
    return file

def write(text, file):
    if text is None:
        return print("Empty!!!")
    else:
        try:
            file.write(text)
            print("File is updated....")
        except IOError as e:
            print(f"ERROR: I/O error: {e}")
        finally:
            file.close

file = loadFile()

write("Hello programmer", file)