public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean getIsBorrowed() { return isBorrowed; }

    // Borrow the book
    public void borrow() { this.isBorrowed = true; }

    // Return the book
    public void returned() { this.isBorrowed = false; }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | " +
               (isBorrowed ? "Borrowed" : "Available");
    }
}
