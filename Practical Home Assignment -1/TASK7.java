import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK7 
{
    public static void main(String[] args)
    {
        System.out.print("\n ------------------------ TASK - 7 -------------------------");
        System.out.print("\n\n ------------------ SUM OF EVEN NO'S (1-50) ----------------");
         
        //Finding the sum of all even numbers (1-50) using the while loop.
        //While loop and Entry controlled loop.
        int sum = 0;
        int i = 1;
        while(i<=50)
        {
            if (i % 2 == 0) 
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.print("\n\n --> Sum of all Even Numbers are: " + sum);
    }
}
