import java.util.Scanner;

// Room class
class Room {
    private String roomNumber;
    private String block;
    private String type; // Single/Double

    // Constructor
    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    // Getters
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return roomNumber + " " + block + " " + type;
    }
}

// Student class
class Student {
    private String name;
    private int roll;
    private String course;
    private Room room; // One-to-one relationship

    // Constructor
    public Student(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course + " Room: " + room.toString();
    }
}

// Main class
public class TASK11  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.println("Enter Student details (name,roll,course):");
        String[] studentInput = sc.nextLine().split(",");
        String name = studentInput[0];
        int roll = Integer.parseInt(studentInput[1]);
        String course = studentInput[2];

        // Input room details
        System.out.println("Enter Room details (roomNumber,block,type):");
        String[] roomInput = sc.nextLine().split(",");
        String roomNumber = roomInput[0];
        String block = roomInput[1];
        String type = roomInput[2];

        // Create Room and Student objects
        Room room = new Room(roomNumber, block, type);
        Student student = new Student(name, roll, course, room);

        // Print student with room details
        System.out.println(student);

        sc.close();
    }
}
