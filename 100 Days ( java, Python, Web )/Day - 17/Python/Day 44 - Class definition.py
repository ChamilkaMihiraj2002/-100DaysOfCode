class Book:
    def __init__(self, Author, Title):
        self.author = Author
        self.title = Title
        
        print(f"Book object is created!")
        
    def getAuthor(self):
        print(f"Author is : {self.author}")
    
    def getTitle(self):
        print(f"Author is : {self.title}")
        
book1 = Book("Mahagama Sekara", "Madolduwa")
book1.getAuthor()
book1.getTitle()