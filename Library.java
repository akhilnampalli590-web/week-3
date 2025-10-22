import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!\n");
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.\n");
            return;
        }
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    // Borrow a book by ID
    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.getIsBorrowed()) {
                    book.borrow();
                    System.out.println("Book borrowed successfully!\n");
                } else {
                    System.out.println("Book is already borrowed.\n");
                }
                return;
            }
        }
        System.out.println("Book ID not found.\n");
    }

    // Return a book by ID
    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.getIsBorrowed()) {
                    book.returned();
                    System.out.println("Book returned successfully!\n");
                } else {
                    System.out.println("Book was not borrowed.\n");
                }
                return;
            }
        }
        System.out.println("Book ID not found.\n");
    }

    // Search book by title or author
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No book found with this keyword.\n");
        else System.out.println();
    }
}
