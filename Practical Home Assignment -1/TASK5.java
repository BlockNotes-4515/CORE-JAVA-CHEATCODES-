import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK5 
{
    public static void main(String[] args)
    {
         System.out.print("\n ------------------------ TASK - 5 -------------------------");
         System.out.print("\n\n --------------------- SIMPLE CALCULATOR ---------------------");

         System.out.print("\n\n 1. Enter the First Number: ");
         Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
         System.out.print("\n 2. Enter the Second Number: ");
         double b = sc.nextDouble();

         //Enter the Operators by the User.
         System.out.print("\n\n -->Enter the Operators (+,-,*,/):  ");
         char ch = sc.next().charAt(0);

         //Using Control Statements.
         if(ch=='+')
         {
             double sum = (a + b);
             System.out.print("\n --> Sum of (" + a + " + " + b + ") is: " + sum);
         }
         else if (ch=='-')
         {
             double sub = (a - b);
             System.out.print("\n --> Sum of (" + a + " - " + b + ") is: " + sub);
         }
         else if(ch=='*')
         {
             double mul = (a * b);
             System.out.print("\n --> Sum of (" + a + " * " + b + ") is: " + mul);
         }
         else if(ch=='/')
         {
             double div = (a / b);
             if (div != 0) {
                 System.out.print("\n --> Sum of (" + a + " / " + b + ") is: " + div);
             } else {
                 System.out.print("\n --> Division by '0' is not allowed!");
             }
         }
         else {
             System.out.print("\n --> Invalid Input enter by user!");
         }
    }
}
