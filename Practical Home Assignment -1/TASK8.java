import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK8 
{
    public static void main(String[] args)
    {
        System.out.print("\n ------------------------ TASK - 8 -------------------------");
        System.out.print("\n\n ------------------ MARKSHEET ----------------\n");

        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        //Entering the Marks of the '5' Students.
        int i = 0;
        for(i=0;i<=arr1.length-1;i++)
        {
            System.out.print("\n --> Enter the Marks of " + i + "-Subject is: ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("\n Printing the Marks of the 5' Students given below.....!\n");
        for(i=0;i<arr1.length;i++)
        {
            System.out.print("\n --> Marks of Student " + i + " is: " + arr1[i]);
        }
        System.out.print("\n-----------------------------------------\n");
    }
}
