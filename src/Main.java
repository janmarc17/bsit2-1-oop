public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        // show initial books
        libraryManager.showBooks();

        // test adding books
        libraryManager.addBook();
        libraryManager.addBook();
        libraryManager.addBook();

        // test removing books
        libraryManager.removeBook();
        libraryManager.removeBook();
        libraryManager.removeBook();

        System.out.println("\nProgram completed successfully.");
    }
}
