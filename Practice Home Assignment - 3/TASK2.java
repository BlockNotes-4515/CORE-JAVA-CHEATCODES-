import java.util.Scanner; // ✅ Correct import statement

// User Defined Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    private String name;
    private int age;

    public void registerStudent(String name, int age) throws InvalidAgeException {
        if (age < 17) {
            throw new InvalidAgeException("Age must be above 17 for registration");
        } else {
            this.name = name;
            this.age = age;
            System.out.println("Student Registered Successfully!");
        }
    }
}

// Main Class
public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student student = new Student();

        try {
            student.registerStudent(name, age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
