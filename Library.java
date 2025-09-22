public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];
        bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            return true;
        } else {
            System.out.println("Library is full, cannot add more books.");
            return false;
        }
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully!");
                return true;
            } else {
                System.out.println("Book is not available for borrowing.");
            }
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.returnBook()) {
                System.out.println("Book returned successfully!");
                return true;
            }
        }
        return false;
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll books in library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}
