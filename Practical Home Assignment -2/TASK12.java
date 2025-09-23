import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    // Constructor
    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Method to calculate rent (to be overridden)
    public double calculateRent() {
        return baseRate;
    }

    public void displayRent() {
        System.out.println(regNo + " " + brand + " Rent: " + calculateRent());
    }
}

// Car class extends Vehicle
class Car extends Vehicle {
    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.5;
    }

    @Override
    public void displayRent() {
        System.out.println("Car " + regNo + " " + brand + " Rent: " + calculateRent());
    }
}

// Bike class extends Vehicle
class Bike extends Vehicle {
    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.2;
    }

    @Override
    public void displayRent() {
        System.out.println("Bike " + regNo + " " + brand + " Rent: " + calculateRent());
    }
}

// Main class
public class TASK12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first vehicle
        System.out.println("Enter vehicle details (type,regNo,brand,baseRate):");
        String[] input1 = sc.nextLine().split(",");
        String type1 = input1[0];
        String regNo1 = input1[1];
        String brand1 = input1[2];
        double baseRate1 = Double.parseDouble(input1[3]);

        // Input second vehicle
        String[] input2 = sc.nextLine().split(",");
        String type2 = input2[0];
        String regNo2 = input2[1];
        String brand2 = input2[2];
        double baseRate2 = Double.parseDouble(input2[3]);

        Vehicle v1 = null;
        Vehicle v2 = null;

        // Create objects based on type
        if (type1.equalsIgnoreCase("Car")) {
            v1 = new Car(regNo1, brand1, baseRate1);
        } else if (type1.equalsIgnoreCase("Bike")) {
            v1 = new Bike(regNo1, brand1, baseRate1);
        }

        if (type2.equalsIgnoreCase("Car")) {
            v2 = new Car(regNo2, brand2, baseRate2);
        } else if (type2.equalsIgnoreCase("Bike")) {
            v2 = new Bike(regNo2, brand2, baseRate2);
        }

        // Display rent
        System.out.print("\n--------------------------\n");
        if (v1 != null) v1.displayRent();
        if (v2 != null) v2.displayRent();

        sc.close();
    }
}
