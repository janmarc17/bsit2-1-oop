class Book {
    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = true;

    // Constructor
    public Book(String bookTitle, String bookAuthor, int pageCount) {
        title = bookTitle;
        author = bookAuthor;
        pages = pageCount;
        isAvailable = true;
        System.out.println("A new book " + title + " by " + author + " has been added to the library.");
    }

    // Display book info
    public void displayInfo() {
        System.out.println("----- Book Info -----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }

    // Borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book " + title + "\" has been borrowed.");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
        }
    }

    // Return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("The book " + title + " has been returned and is now available.");
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book("Winds of the South", "Elena Rivera", 287);
        Book book2 = new Book("The Hidden Signal", "Marco De Luna", 321);
        Book book3 = new Book("Beneath the Bamboo Sky", "Isabel Tan", 198);

        // Displaying info
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Borrowing and returning
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.borrowBook(); 
    }
}
