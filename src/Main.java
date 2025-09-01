public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.showBooks();     // Display initial books
        manager.addBook();       // Add a book with validation
        manager.removeBook();    // Remove a book with validation

        System.out.println("\nProgram completed successfully.");
    }
}
