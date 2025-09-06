import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TASK2 
{
    public static void main(String[] args)
    {
        System.out.print("\n ----------------- TASK - 2 -----------------");
        System.out.print("\n\n ------------- TEMPERATURE CONVERSION ----------------");
        System.out.print("\n\n 1. Enter the Temperature in Celcius: ");
        Scanner sc = new Scanner(System.in);
        double cel = sc.nextDouble();

        //Converting it into the Fahrenheit (F)
        //Using the Algorithm Formula.
        double fehr = (cel * 9 / 5 + 32);
        System.out.print("\n\n  --> Temperature in Celcius: " + cel);
        System.out.print("\n\n --> Temperature in Farenheit: " + fehr);
    }  
}
