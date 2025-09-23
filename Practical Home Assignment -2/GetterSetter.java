import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import java.util.stream.*;
import java.util.Scanner;
import java.util.function.*;

//Making the first use-cases.
/* 
//Making the use of getter and setter methods
class Student 
{
    //Making the private variables.
    private String name;

    //Making the setter methods.
    public void setName(String name)
    {
        this.name=name;
    }
    //Making the getter methods.
    public void getName()
    {
        System.out.println("The name of the student is: "+name);
    }
}
//calling the class in main method.
public class GetterSetter
{
    public static void main(String[] args)
    {
        //making the object of the class.
        Student s = new Student();
        s.setName("Dhruv Dhayal");
        s.getName();
    }
}*/

/* 2-nd use case In Object-Oriented Programming (OOP), getter and setter methods are used to access (get) and update (set) the values of private variables in a class.

Getter → Used to retrieve (get) the value of a variable.

Setter → Used to modify (set) the value of a variable.

They help achieve encapsulation → keeping data safe and controlled.*/
class Student
{
    //making the data variables private.
    private String name;

    //making the setter methods.
    public void setName(String name)
    {
        this.name = name;
    }

    //Making the getter methods.
    public void getName()
    {
        System.out.print("\n --> Student name is: " + name);
    }
}
//calling the class in main method.
public class GetterSetter {
    public static void main(String[] args) {
        //making the object of the class.
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the name of the student: ");
        String name = sc.nextLine();
        s.setName(name);
        s.getName();
    }
}