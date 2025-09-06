import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK10 
{
    public static void main(String[] args)
    {
        System.out.print("\n ------------------------ TASK - 10 -------------------------");
        System.out.print("\n\n ------------------ MINI. PROJECT ----------------\n");

        System.out.print("\n --> Enter the Marks to decide your Grade!\n");
        Scanner sc = new Scanner(System.in);
        float arr1[] = new float[5];
        int i = 0;
        float avg = 0.0f;
        float sum = 0.0f;
        String grade;
        for(i=0;i<arr1.length;i++)
        {
            System.out.print("\n --> Enter the Marks of Subject " + i + ": ");
            arr1[i] = sc.nextInt();
            sum = sum + arr1[i];
        }
        System.out.print("\n\n --> Total Sum of all 5' Subject are: " + sum);
        avg = (sum / 5);
        System.out.print("\n\n --> Total Average of all Subjects: " + avg);

        //Finding the Grade of the Student.
        if(avg>=90)
            {
                grade = "A";
            }
            else if(avg>=75)
            {
                grade="B";
            }
            else if(avg>=50)
            {
                grade="C";
            }
            else{
                grade="Fail";
            }
        System.out.print("\n\n--> Grade of the Student is: " + grade);

        //Now, control statements using to assign grades. (A-F);
    }
}
