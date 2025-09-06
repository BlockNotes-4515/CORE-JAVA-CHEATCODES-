import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK6 
{
    public static void main(String[] args)
    {
         System.out.print("\n ------------------------ TASK - 6 -------------------------");
         System.out.print("\n\n --------------------- NUMBER TABLE ---------------------");
        //Taking Number from the user and print it's Table.
        System.out.print("\n\n 1. Enter the Number to print it's table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("\n --> User's No. to print it's table: " + num + "\n");
        System.out.println("\n ");

        //Using 'for' loop printing the Multiplication Tables.
        for(int i=1;i<=10;i++)
        {
            System.out.println(" " + num + "  * " + i + " = " + (num * i));
        }
    }
}
