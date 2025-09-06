//Making the Student Performance Checker Portal.
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String[] args) {
        int i, choice = 0, studentCount = 0;
        String[] names = new String[100];  // Array to store names
        float[] marks = new float[100];    // Array to store marks
        char grade;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\n\n -------------------- AMIZONE PORTAL --------------------\n");
            System.out.print("\n --> Welcome Follow the Steps Below\n");
            System.out.print("\n 1. Add Student ");
            System.out.print("\n 2. Display Students ");
            System.out.print("\n 3. Search Student ");
            System.out.print("\n 4. EXIT ");
            System.out.print("\n --> Enter your Choice here: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1: 
                {
                    System.out.print("\n Enter the Student name: ");
                    names[studentCount] = sc.nextLine();
                    System.out.print("\n Enter the Marks: ");
                    marks[studentCount] = sc.nextFloat();
                    studentCount++;
                    System.out.print("\n --> Student Added Successfully!");
                }
                break;

            case 2: 
                {
                    System.out.print("\n List of the Students: \n");
                    for (i = 0; i < studentCount; i++) {
                        if (marks[i] >= 90) {
                            grade = 'A';
                        } else if (marks[i] >= 80) {
                            grade = 'B';
                        } else if (marks[i] >= 70) {
                            grade = 'C';
                        } else if (marks[i] >= 60) {
                            grade = 'D';
                        } else {
                            grade = 'F';
                        }
                        System.out.print("\n Name: " + names[i] + " | Marks: " + marks[i] + " | Grade: " + grade);
                    }
                }
                break;

                case 3: {
                    System.out.print("\n --> Enter Student Name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (i = 0; i < studentCount; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            found = true;
                            if (marks[i] >= 90) {
                                grade = 'A';
                            } else if (marks[i] >= 80) {
                                grade = 'B';
                            } else if (marks[i] >= 70) {
                                grade = 'C';
                            } else if (marks[i] >= 60) {
                                grade = 'D';
                            } else {
                                grade = 'F';
                            }
                            System.out.print("\n Found: " + names[i] + " | Marks: " + marks[i] + " | Grade: " + grade);
                        }
                    }
                    if (!found) {
                        System.out.print("\n No student in database with this name: " + searchName);
                    }
                }
                break;

                case 4: {
                    System.out.print("\n ------------ Exiting Thank You : ) ---------------");
                }
                break;

                default:
                    System.out.print("\n Invalid Choice! Try again.");
            }
        } while (choice != 4);
    }
}