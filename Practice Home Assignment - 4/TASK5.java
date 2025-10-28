import java.util.*;

public class TASK5 {

    private LinkedHashSet<String> enrolledStudents = new LinkedHashSet<>();

    public void enrollStudent(String name) {
        if (enrolledStudents.contains(name)) {
            System.out.println(name + " is already enrolled");
        } else {
            enrolledStudents.add(name);
            System.out.println("Enrolled: " + name);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students: " + enrolledStudents);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TASK5 course = new TASK5();

        System.out.println("Enter student names to enroll.");
        System.out.println("Type 'done' when finished.\n");

        while (true) {
            System.out.print("Enroll: ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            if (!name.isEmpty()) {
                course.enrollStudent(name);
            } else {
                System.out.println("Please enter a valid name!");
            }
        }

        course.displayEnrolledStudents();
        sc.close();
    }
}
