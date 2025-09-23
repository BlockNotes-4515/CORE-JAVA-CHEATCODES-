import java.util.Scanner;

// Author class
class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

// Book class
class Book {
    private String title;
    private double price;
    private Author author; // One-to-one relationship

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\nPrice: " + price + "\nAuthor: " + author.toString();
    }
}

// Main class
public class TASK6 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book details (title,price,authorName,authorEmail,authorGender):");
        String[] input = sc.nextLine().split(",");

        String title = input[0];
        double price = Double.parseDouble(input[1]);
        String authorName = input[2];
        String authorEmail = input[3];
        String authorGender = input[4];

        Author author = new Author(authorName, authorEmail, authorGender);
        Book book = new Book(title, price, author);

        System.out.println(book);

        sc.close();
    }
}
