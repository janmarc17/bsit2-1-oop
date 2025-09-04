public class Main {
    public static void main(String[] args) {
        System.out.println("===== Book Record System =====\n");
        System.out.println("Adding books and ratings...");

        Book b1 = new Book("Java Programming", "John Smith");
        Book b2 = new Book("Data Structures", "Alice Brown");
        Book b3 = new Book("Web Development", "Bob Wilson");

        try {
            b1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        }

        b2.addMultipleRatings(5, 4, 3, 5);

        try {
            b3.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println(b1.displayBook());
        System.out.println(b2.displayBook());
        System.out.println(b3.displayBook());

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book highest = b1;
        if (b2.getAverageRating() > highest.getAverageRating()) highest = b2;
        if (b3.getAverageRating() > highest.getAverageRating()) highest = b3;

        System.out.println("Highest rated book: " + highest.getTitle() + " by " + highest.getAuthor() + " (" +
                String.format("%.2f", highest.getAverageRating()) + ")");
    }
}