import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            System.out.println(li.getItemType() + ": " + li.title + " (" + b.getBorrowingStatus() + ")");
        }
    }

    public boolean borrowItem(String itemId, String borrowerName, User user) {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            if (li.itemId.equals(itemId)) {
                if (b.isAvailable() && user.getBorrowedItemsCount() < user.getMaxBorrowLimit()) {
                    b.borrowItem(borrowerName);
                    user.addBorrowedItem(li);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean returnItem(String itemId, User user) {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            if (li.itemId.equals(itemId) && !b.isAvailable()) {
                b.returnItem();
                user.removeBorrowedItem(li);
                return true;
            }
        }
        return false;
    }

    public void displayAvailableItems() {
        for (Borrowable b : items) {
            if (b.isAvailable()) {
                LibraryItem li = (LibraryItem) b;
                System.out.println(li.getItemType() + ": " + li.title + " (" + b.getBorrowingStatus() + ")");
            }
        }
    }
}
