public class Book extends LibraryItem implements Borrowable {
    private String isbn;
    private int numberOfPages;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, int numberOfPages, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        setNumberOfPages(numberOfPages);
        setGenre(genre);
    }

    // Getters
    public String getIsbn() { return isbn; }
    public int getNumberOfPages() { return numberOfPages; }
    public String getGenre() { return genre; }

    // Setters with validation
    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }
    }

    public void setNumberOfPages(int pages) {
        if (pages <= 0) {
            this.numberOfPages = 1;
        } else {
            this.numberOfPages = pages;
        }
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.50;
    }

    // Borrowable methods
    @Override
    public void borrowItem(String borrowerName) {
        checkOut(borrowerName);
    }

    @Override
    public void returnItem() {
        checkIn();
    }

    @Override
    public boolean isAvailable() {
        return !isCheckedOut;
    }

    @Override
    public int getBorrowingPeriod() {
        return 14;
    }
}
