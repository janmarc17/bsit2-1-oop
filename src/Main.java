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
        Book book1 = new Book("Echoes of the Forgotten", "Lina Mercado", 412);
        Book book2 = new Book("The Last Moonkeeper", "Arden Reyes", 379);
        Book book3 = new Book("Whispers Beyond Time", "Jules Navarro", 295);
        
        System.out.println("Book Information:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.borrowBook();

        book1.returnBook();
        book1.borrowBook();
    }
}
