import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK4 
{
    public static void main(String[] args)
    {
         System.out.print("\n -------------------- TASK - 4 -------------------------");
         System.out.print("\n\n --------------------- INDIAN GOV. (EVM) ---------------------");

         System.out.print("\n\n 1. Enter Your Age: ");
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();

         //Enering the citizenship of the person.
         System.out.print("\n 2. Are you an Indian Citizen (true/false): ");
         boolean iscitizen = sc.nextBoolean();

         //Checking the Eligibility for person to vote.
         if(age>=18 && iscitizen==true)
         {
             System.out.print("\n You , are Eligible to Vote!");
         }
         else if(age>=18 && iscitizen==false)
         {
             System.out.print("\n No, you are not Eligible");
         }
         else if(age<18 && iscitizen==true)
         {
             System.out.print("\n No, you are not Eligible");
         }
         else 
         {
             System.out.print("\n No, you are not Eligible");
         }
         // we uses Logical &&' operators' to find both values, if one of the values is false then complete result is false.
    }
}
