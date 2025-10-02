public class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;
    private String publicationMonth;
    private boolean isLatestIssue;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationMonth, boolean isLatestIssue) {
        super(itemId, title, author);
        setIssueNumber(issueNumber);
        this.publicationMonth = publicationMonth;
        this.isLatestIssue = isLatestIssue;
    }

    // Getters
    public int getIssueNumber() { return issueNumber; }
    public String getPublicationMonth() { return publicationMonth; }
    public boolean isLatestIssue() { return isLatestIssue; }

    // Setters
    public void setLatestIssue(boolean latest) {
        this.isLatestIssue = latest;
    }

    public void setIssueNumber(int issue) {
        if (issue <= 0) this.issueNumber = 1;
        else this.issueNumber = issue;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.25;
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
        return 7;
    }
}
