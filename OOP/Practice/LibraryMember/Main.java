class LibraryMember {
    private String name;
    private String memberID;
    private boolean isActive;

    static int totalMembers = 0;

    public LibraryMember(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        this.isActive = (memberID.substring(0, 3).equals("LIB"));
        totalMembers++;
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void displayMemberInfo() {
        System.out.println("Member info:");
        System.out.println("Name: " + this.name + " ,ID: " + this.memberID + " ,Subscription Status : " + ((this.isActive)? "Active Subscription" : "Inactive Subscription") + "\n");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " ,ID: " + this.memberID + " ,Subscription Status : " + ((this.isActive)? "Active Subscription" : "Inactive Subscription");
    }

    public static void displayTotalMembers() {
        System.out.println("Total Members: " + totalMembers + "\n");
    }

}

class Book {
    private String bookID;
    private String title;
    private LibraryMember currentHolder;

    public Book(String bookID, String title, LibraryMember currentHolder) {
        this.bookID = bookID;
        this.title = title;
        this.currentHolder = currentHolder;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public LibraryMember getCurrentHolder() {
        return currentHolder;
    }

    
    public void displayBookInfo() {
        System.out.println("Book info:");
        System.out.println("ID: " + this.bookID + " ,Title: " + this.title + " ,Current Holder: " + ((currentHolder.getName() != "None")? currentHolder.getName():"None"));
    }
}

class ReferenceBook extends Book {
    private String category = "Reference"; 
    private String astAccessed = "Never";

    public ReferenceBook(String bookID, String title, LibraryMember currentHolder, String category, String astAccessed ) {
        super(bookID, title, currentHolder);
        this.category = category;
        this.astAccessed = check_accessed(astAccessed);
    }
    
    public String check_accessed(String astAccessed) {
        try {
            if(super.getCurrentHolder().isActive()){
                System.out.println("Access granted on :" + astAccessed + "\n");
                return astAccessed;
            }
        } catch (Exception e) {
            System.out.println("Error: Member subscription is not active. \n");
        }
        return "Never";
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("Category: " + this.category + " ,Last Accessed: " + this.astAccessed + "\n");
    }
}

public class Main{
    public static void main(String[] args) {
        LibraryMember member2 = new LibraryMember("Malek imak", "NOP1234");
        LibraryMember member1 = new LibraryMember("John Doe", "LIB1234");

        member1.displayMemberInfo();
        member2.displayMemberInfo();

        LibraryMember.displayTotalMembers();

        Book book1 = new ReferenceBook("REF1234", "Java Programming", member1, "Programming", "2021-04-01");
        Book book2 = new ReferenceBook("BOK1234", "Harry Potter", member2,"fantasy", "2021-01-01");

        book1.displayBookInfo();
    } 
}