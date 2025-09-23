import java.util.Scanner;

// Course class
class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

// Student class
class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name + " Course: " + enrolledCourse.toString();
    }
}

// PremiumStudent class extends Student
class PremiumStudent extends Student {
    private int discount; // in %

    public PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name + " Course: " + enrolledCourse.toString() + " Discount: " + discount + "%";
    }
}

// Main class
public class TASK9 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input course details
        System.out.println("Enter Course details (courseName,duration):");
        String[] courseInput = sc.nextLine().split(",");
        String courseName = courseInput[0];
        String duration = courseInput[1];

        Course course = new Course(courseName, duration);

        // Input Student details
        System.out.println("Enter normal student details (name,courseName):");
        String[] studentInput = sc.nextLine().split(",");
        String studentName = studentInput[0];
        // Course association
        Student student = new Student(studentName, course);

        // Input Premium Student details
        System.out.println("Enter premium student details (name,courseName,discount):");
        String[] premiumInput = sc.nextLine().split(",");
        String premiumName = premiumInput[0];
        int discount = Integer.parseInt(premiumInput[2]);
        PremiumStudent premiumStudent = new PremiumStudent(premiumName, course, discount);

        // Display students
        System.out.println(student);
        System.out.println(premiumStudent);

        sc.close();
    }
}
