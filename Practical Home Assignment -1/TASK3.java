import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK3 
{
    public static void main(String[] args)
    {
        System.out.print("\n -------------------- TASK - 3 -------------------------");
        System.out.print("\n\n --------------------- Perfoming Operations ---------------------");

        //Taking the user-input
        System.out.print("\n\n 1. Enter the First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("\n 2. Enter the Second Number: ");
        int b = sc.nextInt();

        //Performing the Addition.
        int add = (a + b);
        //Performing the Substarction.
        int sub = (a - b);
        //Performing the Multiplication.
        int mul = (a * b);
        //Performing the Division (Numerator always greator)
        float div = 0.0f;
        div = (a / b);
        if(div!=0)
        {
            div = (a / b);
        }
        else {
            System.out.print("\n Division By '0' is not allowed");
        }
        //Performing the Modulus.
        int mod = (a % b);

        //Printing all Values.
        System.out.print("\n 1. Addition of (" + a + ") and (" + b + ") is: " + add);
        System.out.print("\n 2. Substraction of (" + a + ") and (" + b + ") is: " + sub);
        System.out.print("\n 3. Multiplication of (" + a + ") and (" + b + ") is: " + mul);
        System.out.print("\n 4. Division of (" + a + ") and (" + b + ") is: " + div);
        System.out.print("\n 5. Modulus of (" + a + ") and (" + b + ") is: " + mod);
    }
}
