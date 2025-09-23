import java.util.Scanner;

// Employee class
class Employee {
    protected String name;
    protected String id;
    protected double basicSalary;

    // Constructor
    Employee() {
    }

    Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Method to calculate salary
    double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

// Manager class
class Manager extends Employee {
    private double bonus;

    Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary); // constructor chaining
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

// Main class
public class TASK3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee input
        System.out.println("Enter Employee details (Type,Name,ID,BasicSalary):");
        String[] empInput = sc.nextLine().split(",");
        String type1 = empInput[0];
        String name1 = empInput[1];
        String id1 = empInput[2];
        double basicSalary1 = Double.parseDouble(empInput[3]);

        Employee emp = null;
        if (type1.equalsIgnoreCase("Employee")) {
            emp = new Employee(name1, id1, basicSalary1);
        }

        // Manager input
        System.out.println("Enter Manager details (Type,Name,ID,BasicSalary,Bonus):");
        String[] mgrInput = sc.nextLine().split(",");
        String type2 = mgrInput[0];
        String name2 = mgrInput[1];
        String id2 = mgrInput[2];
        double basicSalary2 = Double.parseDouble(mgrInput[3]);
        double bonus = Double.parseDouble(mgrInput[4]);

        Manager mgr = null;
        if (type2.equalsIgnoreCase("Manager")) {
            mgr = new Manager(name2, id2, basicSalary2, bonus);
        }

        // Display output
        if (emp != null) System.out.println(emp);
        if (mgr != null) System.out.println(mgr);

        sc.close();
    }
}
