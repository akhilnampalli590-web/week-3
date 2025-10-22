import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        System.out.println("=== Welcome to the Library Management System ===\n");

        do {
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    library.borrowBook(borrowId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 5:
                    System.out.print("Enter keyword to search (title/author): ");
                    String keyword = sc.next();
                    library.searchBook(keyword);
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while(choice != 6);

        sc.close();
    }
}
