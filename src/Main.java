public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("B001", "Java Programming", "James Gosling", "ISBN-JAVA", 450, "Programming");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 12, "August", true);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");

        manager.addItem(book1);
        manager.addItem(mag1);
        manager.addItem(dvd1);

        Student studentJohn = new Student("U001", "John Smith", "john@example.com", "S123", "Computer Science");
        Faculty drSmith = new Faculty("U002", "Dr. Smith", "drsmith@example.com", "Engineering", "Professor");

        System.out.println("=== LIBRARY MANAGEMENT SYSTEM TEST ===\n");

        System.out.println("=== Adding Items to Library ===");
        System.out.println("Added: Book - Java Programming by James Gosling");
        System.out.println("Added: Magazine - Tech Today by Editor Smith");
        System.out.println("Added: DVD - The Matrix by Wachowski Sisters\n");

        System.out.println("=== Displaying All Items ===");
        manager.displayAllItems();
        System.out.println();

        System.out.println("=== Testing Borrowing ===");
        if (manager.borrowItem("B001", "John", studentJohn))
            System.out.println("Student John borrowed: Java Programming");
        if (manager.borrowItem("D001", "Dr. Smith", drSmith))
            System.out.println("Faculty Dr. Smith borrowed: The Matrix");
        System.out.println();

        System.out.println("=== Displaying Available Items ===");
        manager.displayAvailableItems();
        System.out.println();

        System.out.println("=== Testing Late Fees ===");
        System.out.printf("Java Programming - 5 days late: $%.2f%n", book1.calculateLateFee(5));
        System.out.printf("The Matrix - 5 days late: $%.2f%n", dvd1.calculateLateFee(5));
        System.out.println();

        System.out.println("=== Testing User Information ===");
        System.out.println("Student: John Smith (Computer Science) - " + studentJohn.getBorrowedItemsCount() + " items borrowed");
        System.out.println("Faculty: Dr. Smith (Engineering) - " + drSmith.getBorrowedItemsCount() + " items borrowed");
    }
}
