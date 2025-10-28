import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
        System.out.println("Book added successfully.");
        displayBooks();
    }

    public void removeBook(String title) {
        if (books.remove(title)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found in the library.");
        }
        displayBooks();
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Current Books:");
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
}

public class TASK1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String titleToAdd = sc.nextLine();
                    library.addBook(titleToAdd);
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String titleToRemove = sc.nextLine();
                    library.removeBook(titleToRemove);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
