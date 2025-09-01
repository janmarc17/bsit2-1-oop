public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        // Display initial books
        libraryManager.showBooks();

        // Add books
        libraryManager.addBook();
        libraryManager.addBook();
        libraryManager.addBook();

        // Remove books
        libraryManager.removeBook();
        libraryManager.removeBook();
        libraryManager.removeBook();

        System.out.println("\nProgram completed successfully.");
    }
}
