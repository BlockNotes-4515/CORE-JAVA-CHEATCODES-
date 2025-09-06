import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK1
{
    public static void main(String[] args)
    {
        System.out.print("\n ------------------------ TASK - 1 -----------------------\n");

        //Initialising the Values to the Variables.
        String name="Dhruv Dhayal"; //NOTE: Any No. in between single or double quotes also conside as String.
        int Roll_No = 215;
        float subject1=95.6f;
        float subject2 = 91.2f;

        //Printing the Values by following java identifiew rules.
        System.out.print("\n --------------------- STUDENT INFORMATION ----------------\n");
        System.out.print("\n 1. Name of the Student: " + name);
        System.out.print("\n\n 2. Roll Number  " + Roll_No);
        System.out.print("\n\n 3. Marks in JAVA Subject : " + subject1);
        System.out.print("\n\n 4. Marks in DBMS Subject: "+subject2);
    }
}