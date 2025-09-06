import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Associativity
{
    public static void main(String[] args)
    {
        System.out.print("\n Showing the Precedence and Associativity in Java\n");
        //NOTE: In Precedence (+,-) have less precedence as compared to (*,/) 
        float a=0.0f;
        a=10*2+4/2;
        System.out.print(a);

        //Showing the Associativity and Precedence in the form (*,/)
        float b=0.0f;
        b=10/2-5*1;
        System.out.print("\n"+b);

        //Solving some of the complex expressions
        int x=90;
        int y=40;
        int c=0;
        c=(x-y)/2;
        System.out.print("\n"+c);

        //Solving another complex expression
        int p=1;
        int q=4;
        int r=5;
        int d= p*p-((4*q*r)/(2*p));
        System.out.print("\n"+d);

        //Solving another complex expression
        Scanner sc=new Scanner(System.in);
        int v,u=0;
        System.out.print("\n Enter the value of u: ");
        u=sc.nextInt();
        System.out.print("\n Enter the values of v: ");
        v=sc.nextInt();
        int e=(v*v)-(u*u);
        System.out.print("\n The value of e is: "+e);

        //Solving another complex expression
        System.out.print("\n Printing the formula's by put the data on it!");
        Scanner sc2=new Scanner(System.in);
        float f1,f2,f3=0.0f;
        System.out.print("\n Enter the value of f1: ");
        f1=sc2.nextFloat();
        System.out.print("\n Enter the values of f2: ");
        f2=sc2.nextFloat();
        f3=(f1*f2)-2;  //Precedence give to the '*' only  (From Left to Right)
        System.out.print("\n The value of f3 is: "+f3);
    }
}
