import java.util.Scanner;

// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// StudentMarks Class
class StudentMarks {
    public void enterMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        } else {
            System.out.println("Marks entered successfully: " + marks);
        }
    }
}

// Main Class
public class TASK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        StudentMarks student = new StudentMarks();

        try {
            student.enterMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the system");
        }

        sc.close();
    }
}
