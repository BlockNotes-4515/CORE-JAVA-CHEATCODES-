import java.io.*;
import java.util.*;
import java.util.Scanner;
public class ControlStatements
{
    public static void main(String[] args)
    {
        /* 
        System.out.println("Control Statements in Java");
        System.out.print("\n 1. Enter the user age:  ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("\n Yes! You can Drive Status : ELIGIBLE");
        }
        else
        {
            System.out.println("\n No! You cannot Drive Status : NOT ELIGIBLE");
        }
            */
            //Reational and Logicak Operators

            //1. Logical AND Operator (&&)
            /* 
            System.out.println("Logical AND Operator (&&)");
            boolean a=true;
            boolean b=true;
            boolean c=true;
            if(a&&b)
            {
                System.out.println("Both are True");
            }
            else
            {
                System.out.println("One or Both are False");
            }

            //2. Logical OR Operator (||)
            System.out.println("\nLogical OR Operator (||)");
            boolean x=true;
            boolean y=false;
            boolean z=false;
            if(x||y||z)
            {
                System.out.println("Atleast One is True");
            }
            else
            {
                System.out.println("All are False");
            }

            //3. Logical NOT Operator (!)
            boolean p=true;
            boolean q=false;
            System.out.println("\nLogical NOT Operator (!)");
            if(!p || !q)
            {
                System.out.println("\n Real Value of p is: "+p+" Negation is : "+!p);
            }
            else
            {
                System.out.println("\n Real Value of q is: "+q+" Negation is : "+!q);
            }*/
            //Switch Case Statement
            /* 
            System.out.println("Switch Case Statement\n");
            System.out.println("\n--------------------------------------------\n");
            System.out.print("\n --> Enter Your Age here: ");
            Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            if(age>=15 && age<=20)
            {
                System.out.println("\n --------> Younger Inexperienced");
            }
            else if(age>=21 && age<=30)
            {
                System.out.println("\n --------> You have Semi-Experiene");
            }
            else if (age>=31 && age<=45)
            {
                System.out.println("\n ---------> You have Good Experience");
            }
            else
            {
                System.out.println("\n --> We, are hiring only 15-45 age candidates");
            }
                */
                /* 
            System.out.println("Switch Case Statement\n");
            System.out.println("\n--------------------------------------------\n");
            System.out.print("\n --> We, Performing the Arithmetic Operations\n");
            System.out.print("\n --> Press \'1\' for Addition: ");
            System.out.print("\n --> Press \'2\' for Subtraction: ");
            System.out.print("\n --> Press \'3\' for Multiplication: ");
            System.out.print("\n --> Press \'4\' for Division: ");
            System.out.print("\n --> Press \'5\' for Modulus: ");
            System.out.print("\n || Enter Your Choice here:  ");
            Scanner sc=new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    int a,b,sum=-0;
                    System.out.print("\n 1. Enter the First Number: ");
                    Scanner sc1=new Scanner(System.in);
                    a=sc1.nextInt();
                    System.out.print("\n 2. Enter the Second Number: ");
                    b=sc1.nextInt();
                    sum=(a+b);
                    System.out.println("\n Addition of "+a+"and"+b+"is : "+sum);
                    break;
                }
                case 2:
                {
                    int c,d,sub=0;
                    System.out.print("\n 1. Enter the First Number: ");
                    Scanner sc2=new Scanner(System.in);
                    c=sc2.nextInt();
                    System.out.print("\n 2. Enter the Second Number: ");
                    d=sc2.nextInt();
                    sub=(c-d);
                    System.out.println("\n Subtraction of "+c+"and"+d+"is : "+sub);
                    break;
                }
                case 3:
                {
                    int d,e,mul=0;
                    System.out.print("\n 1. Enter the First Number: ");
                    Scanner sc3=new Scanner(System.in);
                    d=sc3.nextInt();
                    System.out.print("\n 2. Enter the Second Number: ");
                    e=sc3.nextInt();
                    mul=(d*e);
                    System.out.println("\n Multiplication of "+d+" and "+e+" is : "+mul);
                    break;
                }
                case 4:
                {
                    int f,g,div=0;
                    System.out.print("\n 1. Enter the First Number: ");
                    Scanner sc4=new Scanner(System.in);
                    f=sc4.nextInt();
                    System.out.print("\n 2. Enter the Second Number: ");
                    g=sc4.nextInt();
                    div=(f/g);
                    System.out.println("\n Division of "+f+" and "+g+" is : "+div);
                    break;
                }
                case 5:
                {
                    int h,i,mod=0;
                    System.out.print("\n 1. Enter the First Number: ");
                    Scanner sc5=new Scanner(System.in);
                    h=sc5.nextInt();
                    System.out.print("\n 2. Enter the Second Number: ");
                    i=sc5.nextInt();
                    mod=(h%i);
                    System.out.println("\n Modulus of "+h+" and "+i+" is : "+mod);
                    break;
                }
            }     */
               //Ternary Operator (Condition)?  (Statement1):(Statement 2)

               System.out.print("\n Checking Wether the Student is Pass or Fail\n");
               //Check 33% subject-wise and 40% aggerigate overall.
                //1. Marks of First Subject
               System.out.print("\n 1. Enter the Marks of First Subject: ");
               Scanner sc=new Scanner(System.in);
               int sub1=sc.nextInt();
               int perc=0;
               perc=(sub1/100)*100;
               System.out.print("\n --> Percentage of Sub1: "+perc);
               if(perc>=33)
               {
                System.out.print("\n --> Student is Pass in Sub1");
               }
               else
               {
                System.out.print("\n --> Student is Fail in Sub1");
               }

               //2. Marks of Second Subject
               System.out.print("\n 2. Enter the Marks of Second Subject: ");
               int sub2=sc.nextInt();
               perc=(sub2/100)*100;
                System.out.print("\n --> Percentage of Sub2: "+perc);
                if(perc>=33)
                {
                 System.out.print("\n --> Student is Pass in Sub2");
                }
                else
                {
                 System.out.print("\n --> Student is Fail in Sub2");
                }

                //3. Marks of Third Subject
                System.out.print("\n 3. Enter the Marks of Third Subject: ");
                int sub3=sc.nextInt();
                perc=(sub3/100)*100;
                    System.out.print("\n --> Percentage of Sub3: "+perc);
                    if(perc>=33)
                    {
                    System.out.print("\n --> Student is Pass in Sub3");
                    }
                    else
                    {
                    System.out.print("\n --> Student is Fail in Sub3");
                    }
    

                    //Calculating the Overall Percentage
                    int overall_perc=0;
                    overall_perc=((sub1+sub2+sub3)/300)*100;
                    System.out.print("\n --> Overall Percentage of Student is: "+overall_perc);
                    if(overall_perc>=40)
                    {
                        System.out.print("\n --> Student is Pass in Overall");
                    }
                    else
                    {
                        System.out.print("\n --> Student is Fail in Overall");
                    }
    }
}