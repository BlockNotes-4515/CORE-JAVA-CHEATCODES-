//Arrays in Java.
// Arrays is a collection of similar type of data.
//Advantages in Arrays.
/*
 * 1. Store Contiguous Block of memory locations.
 * 2. Perform 1-D and 2-D Array.
 * 3. Items Stored in sequence manner.
 * 4. Items Acessed by using the index number.
 * 5/ Acessing elements in an array is Faster.
 */

 //Disadvantages of array.
 /*
  * 1. Fixed Size array, when you declare the size it will not change rigid in nature.
     2. Homogenous in nature stores only similar type of data once datatype defines.
     3. Lots of memory wastage when not in Use. (Rigidness). 
  */

import java.util.Scanner;
import javax.xml.transform.Templates;

public class Arrays
 {
     public static void main(String[] args)
     {
         System.out.print("\n ------- ARRAYS IN JAVA -------------\n");
         /* 
         //Initialization of the Arrays.
         int [] arr1 = new int[5];
         //Index always starts with 0 and end with (n-1).
         int arr2[] = new int[5];
         //Declaration and Memory Allocations.
         int arr3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         //Declaration and Initializations.
         */
         //Performing operation in an Array.
         /* 
         int arr1[] = { 22, 34, 78, 46, 100 };
         System.out.print("\n --> Now, give the elements at the  index [3] : " + arr1[3]);
         */
         //Manual Methods but rarely not in Practice.
         /* 
         int arr1[] = new int[5];
         arr1[0]=100;
         arr1[1]=89;
         arr1[2]=90;
         arr1[3]=88;
         arr1[4]=45;
         //arr1[5]=999; throws out of bound exceptions.
         System.out.print("\n --> Give the values at index [4]: "+arr1[4]);
         */
         //We, can also find the length in java by using the (length());
         //For Examples.
         /* 
         int arr1[] = new int[5];
         System.out.println("\n --> Enter the total length of the array: " + arr1.length);
         */
         //Asking the user-input values.
         //Declaration of an array.
         /* 
         System.out.print("\n How, Much items you want to enter: ");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int arr1[] = new int[a];
         System.out.print("\n --> Registeration starts enter the marks by 100 given below!");
         int i = 0;
         for(i=0;i<a;i++)
         {
             System.out.print("\n --> Enter the marks at : " + i + " is: ");
             arr1[i] = sc.nextInt();
         }
         System.out.print("\n --> Your marksheet given here!");
         for(i=0;i<a;i++)
         {
             System.out.print("\n Given Marks at " + i + " is : " + arr1[i]);
         }
             */
         //Program1: to show an array elements in reverse order.
         /* 
         System.out.print("\n --> How many items you want to enter: ");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int arr1[] = new int[a];
         int i = 0;
         for(i=0;i<a;i++)
         {
             System.out.print("\n --> Enter the elements at index " + i + " are: ");
             arr1 [i]= sc.nextInt();
         }
         //Printing the array in reverse order.
         for(i=a;i<=0;i--)
         {
             System.out.print("\n now values at index " + i + " is: " + arr1[i]);
         }
             */
         //Reverse order arrays.
         /* 
         System.out.print("\n --> Enter the itesm you want to enter: ");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int i = 0;
         int arr1[] = new int[a];
         System.out.print("\n --> Registeration Starts given below!");
         for(i=0;i<arr1.length;i++)
         {
             System.out.print("\n --> Enter items at " + i + " Index is: ");
             arr1[i] = sc.nextInt();
         }
         //Printing the entered items in reverse order.
         for (i = arr1.length - 1; i >= 0;i--)
         {
            System.out.print("\n Items at Index "+i+" is: "+arr1[i]);
         }
            */
         //This is the 1-D arrays.
         //Now, we are talking about the 2-D Arrays.
         //It is also know as array of arrays.
         //int arr1[][] = new int[2][3];
         //Rows -> 2 and Columns -> 3

         //Initializations of the arrays.
         //int arr1[][] = new int[2][2];
         //int[][] arr1 = new int[2][3];
         //This is the Manual Methods.
         /* 
         int flats[][];
         flats = new int[3][3];
         System.out.print("\n --> Enter items in arrays are given below Manual Methods!");
         flats[0][0] = 100;
         flats[0][1] = 101;
         flats[0][2] = 90;
         flats[1][0] = 200;
         flats[1][1] = 201;
         flats[1][2] = 190;
         System.out.print("\n Given items at matrix: " + flats[1][1]); */

         //Taking user-input and priting the 2-D Matrix.
      /* 
      System.out.print("\n 1. How, Many Rows You want to put: ");
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      System.out.print("\n 2. Enter the Columns You want to enter: ");
      int c = sc.nextInt();
      int i, j = 0;
      int arr1[][] = new int[r][c];
      System.out.print("\n --------------Taking the User-Input -------------");
      for(i=0;i<r;i++)
      {
      for (j = 0; j < c; j++) {
          System.out.print("\n\nEnter element at [" + i + "], and [" + j + "]: ");
          arr1[i][j] = sc.nextInt();
      }
      }
      //Printing the values.
      System.out.print("\n Given Matrix are given below!\n\n");
      for(i=0;i<r;i++)
      {
      for(j=0;j<c;j++)
      {
        System.out.print(" "+ arr1[i][j] + " ");
        System.out.print(" ");
      }
      System.out.println(" ");
      }*/
      /* 
      System.out.print("\n ---------- MATRIX SYSTEM ------------");
      System.out.print("\n 1. Enter the Rows you want to print: ");
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      System.out.print("\n 2. Enter the Columns you want: ");
      int c = sc.nextInt();
      int i, j = 0;
      int arr1[][] = new int[r][c];
      System.out.print("\n --> Enter the Elements in Matrix\n\n");
      for(i=0;i<r;i++)
      {
      for (j = 0; j < c; j++) {
          System.out.print("\n\n Enter items at [" + i + "] and [" + j + "] are: ");
          arr1[i][j] = sc.nextInt();
      }
      }
      System.out.print("\n Printing the Matrix given below\n\n");
      for(i=0;i<r;i++)
      {
      for(j=0;j<c;j++)
      {
        System.out.print(" " + arr1[i][j]);
        System.out.print(" ");
      }
      System.out.println(" ");
      } */
     
      //Q1 . Assignments craeting array of 5 float and find it's sum.
      /* 
      int i,sum = 0;
      float arr1[] = new float[5];
      Scanner sc = new Scanner(System.in);
      System.out.print("\n --> Enter items in an array given below! \n");
      for(i=0;i<arr1.length;i++)
      {
      System.out.print("\n --> Enter item at index " + i + " is: ");
      arr1[i] = sc.nextFloat();
      }
      System.out.print("\n Printing the elements of floating values of 5' items! \n");
      for(i=0;i<arr1.length;i++)
      {
      System.out.println("\n Values at index " + i + " is: " + arr1[i]);
      }*/
      
      //Q1. Creating the array of 5' floats and calculating it's sum.
      /* 
       System.out.print("\n Creating the array of 5 floats and calculating the sum!\n");
      
      float sum = 0.0f;
      float[] arr1 = new float[5];  // Corrected declaration
      Scanner sc = new Scanner(System.in);
      
      System.out.print("\n --> Now, Enter the Numbers in the Array...!\n");
      
      for (int i = 0; i < arr1.length; i++) {
        System.out.print("\n Enter the Number at Index " + i + " is: ");
        arr1[i] = sc.nextFloat();
        sum = sum + arr1[i];  // Corrected array name
      }
      
      System.out.print("\n Printing the items of array in float\n");
      for (int i = 0; i < arr1.length; i++) {
        System.out.print("\n --> Item at index " + i + " is: " + arr1[i]);
      }
      
      System.out.print("\n\n --> Total Sum is: " + sum);*/
        
      //Q2. Writing a program to find out wether the given integer is present in an array or not?
      /* 
      System.out.print("\n -> Enter the Number by the user: ");
      Scanner sc=new Scanner(System.in);
      int a = sc.nextInt();

      //Section of an Array.
      System.out.print("\n --> Enter the size of an Array: ");
      int size=sc.nextInt();
      System.out.print("\n\n --> We, also take the input from the suer as well\n");
      int arr1[] = new int[size];
      int i = 0;
      for(i=0;i<arr1.length;i++)
      {
          System.out.print("\n --> Items at Index " + i + " is: ");
          arr1[i] = sc.nextInt();
      }
      System.out.print("\n\n --> Showing the items you enter.. given below!\n");
      for(i=0;i<arr1.length;i++)
      {
          System.out.print("\n --> Item at Index " + i + " is: " + arr1[i]);
          //Checking wether the item user entered in 'a' is present or not?
          if(a==arr1[i])
          {
              System.out.print("\n --> Entered item: " + a + " is present in array: " + arr1[i] + " at Position: " + i);
          }
          else
          {
              System.out.print("\n --> Ooops! No. not found !");
          }*/
      //Q3. Calculating the Average marks of physics from all students.
          /* 
          float avg, sum = 0.0f;
          int i=0;
          System.out.print("\n --> Enter the number of students attends physics exam: ");
          Scanner sc=new Scanner(System.in);
          int size=sc.nextInt();
          float arr1[]=new float[size];
          System.out.print("\n Marks Allotted to the Students!\n");
          for(i=0;i<arr1.length;i++)
          {
            System.out.print("\n --> Enter Item at Index: "+i+" is: ");
            arr1[i]=sc.nextFloat();
            sum=sum+arr1[i];
          }
          System.out.print("\n\n Showing the Average of all\n");
          for(i=0;i<arr1.length;i++)
          {
              System.out.print("\n --> Item at Index " + i + " is: " + arr1[i]);
          }
          System.out.println("\n\n --> Total Sum: " + sum);
          avg = (sum / size);
          System.out.print("\n --> Total Average of the students mark's is: " + avg); */

          //Q4. WAP to reverse an array.
          /* 
          System.out.print("\n --> Enter the length of an array: ");
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int arr1[] = new int[size];
          
          System.out.print("\n --> Length of an Array: " + arr1.length);
          
          System.out.print("\n\n Enter data in array!\n");
          for (int i = 0; i < arr1.length; i++) {
            System.out.print("\n Item put at index " + i + " is: ");
            arr1[i] = sc.nextInt();
          }
          
          System.out.print("\n\n Showing the array items in reverse order\n");
          for (int i = arr1.length - 1; i >= 0; i--) {  // ✅ Fixed loop
            System.out.print("\n --> Item at Index " + i + " is: " + arr1[i]);
          }*/
        
          //Q5. WAP to find max. / min. element in an array!
          /* 
          System.out.print("\n --> Enter the size of an array: ");
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int arr1[] = new int[size];
          int i ,j,temp= 0;
          //Enter elements in an array.
          System.out.print("\n --> Enter items in an array!\n");
          for(i=0;i<arr1.length;i++)
          {
              System.out.print("\n --> Items at index " + i + " is: ");
              arr1[i] = sc.nextInt();
          }
          //Finding the maximum values.
          System.out.println("\n --> Finding the Maximum Values\n");
          int max = arr1[0];
          int min = arr1[0];
          for(i=0;i<arr1.length;i++)
          {
              if (arr1[i] > max) {
                  max = arr1[i];
              }
              if (arr1[i] < min) {
                  min = arr1[i];
              }
          }
          System.out.print("\n Max values: " + max + " and Min. values: " + min); */

          //Q6. Acsending and Descending order of an Arrays.
          System.out.print("\n --> Enter the size of an array: ");
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int arr1[] = new int[size];
          int i ,j,temp= 0;
          System.out.println("\n --> Size of an array: " + arr1.length);
          for (i = 0; i < arr1.length; i++)
          {
              System.out.print("\n Enter items at index " + i + " is: ");
              arr1[i]=sc.nextInt();
          }
          System.out.println("\n ASCENDING ORDER");
          for(i=0;i<arr1.length-1;i++)
          {
              for (j = i + 1; j < arr1.length; j++) {
                  if (arr1[i] > arr1[j]) {
                      temp = arr1[i];
                      arr1[i] = arr1[j];
                      arr1[j] = temp;
                  }
              }
          }
          System.out.print("\n Ascending Order of array given below!\n");
          for(i=0;i<arr1.length;i++)
          {
              System.out.print("  " + arr1[i]);
          }

          //Descending order.
          System.out.print("\n\nDESCENDING ORDER\n");
          for(i=0;i<arr1.length-1;i++)
          {
              for (j = i + 1; j < arr1.length; j++) {
                  if (arr1[i] < arr1[j]) {
                      temp = arr1[i];
                      arr1[i] = arr1[j];
                      arr1[j] = temp;
                  }
              }
          }
          System.out.print("\n Descending Order in an array given here!\n");
          for(i=0;i<arr1.length;i++)
          {
              System.out.print(" " + arr1[i]);
          }
    }
}