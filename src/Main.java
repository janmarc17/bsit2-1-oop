public class Library {
    public static class Book {
        String title;
        String author;
        int pages;
        boolean isAvailable;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.isAvailable = true;
            System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
        }

        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
        
        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("The book '" + title + "' has been borrowed.");
            } else {
                System.out.println("Sorry, the book '" + title + "' is currently not available.");
            }
        }

        public void returnBook() {
            isAvailable = true;
            System.out.println("The book '" + title + "' has been returned.");
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        System.out.println("\nBook Information:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.borrowBook();

        book1.returnBook();
        book1.borrowBook();
    }
}
