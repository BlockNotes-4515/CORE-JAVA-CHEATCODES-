import java.util.HashSet;
import java.util.Scanner;

class Attendance {
    // Using HashSet to store unique student names
    private HashSet<String> students;

    public Attendance() {
        students = new HashSet<>();
    }

    // Method to mark attendance
    public void markAttendance(String name) {
        if (students.contains(name)) {
            System.out.println(name + " is already marked present");
        } else {
            students.add(name);
            System.out.println("Attendance marked for " + name);
        }
    }

    // Method to display all students present
    public void displayAttendance() {
        if (students.isEmpty()) {
            System.out.println("No attendance marked yet.");
        } else {
            System.out.println("Present Students:");
            for (String s : students) {
                System.out.println(s);
            }
        }
    }
}

public class TASK2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Attendance attendance = new Attendance();
        String choice;

        do {
            System.out.print("Enter name to mark attendance: ");
            String name = sc.nextLine();
            attendance.markAttendance(name);

            System.out.print("Do you want to continue (yes/no)? ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println();
        attendance.displayAttendance();

        sc.close();
    }
}
