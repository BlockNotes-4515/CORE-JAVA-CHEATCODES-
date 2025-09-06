import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK9 
{
    public static void main(String[] args)
    {
        System.out.print("\n ------------------------ TASK - 9 -------------------------");
        System.out.print("\n\n ------------------ FINDING MAX. ----------------\n");

        System.out.print("\n --> Finding the Maximum Values in an Array!\n");
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        
        //Reading the 10' integers from the user.
        System.out.print("\n --> Reading 10' integers from an array given here!\n");
        int i,j,temp = 0;
        for(i=0;i<arr1.length;i++)
        {
            System.out.print("\n --> Enter items at Index " + i + " is: ");
            arr1[i] = sc.nextInt();
        }

        //Finding the Maximum Values by Implementing the Maximum Algorithm.
        System.out.print("\n\n Finding the Maximum Values from an Array!\n");
        int max = arr1[0];
        for(i=1;i<arr1.length;i++)
        {
            if(arr1[i]>max)
            {
                max=arr1[i];
            }
        }
        System.out.print("\n\n --> Maximum Values from an Array are: " + max);
    }
}
