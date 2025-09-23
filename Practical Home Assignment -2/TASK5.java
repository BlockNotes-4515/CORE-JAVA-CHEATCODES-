import java.util.Scanner;

// Person class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Doctor class extends Person
class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
}

// Surgeon class extends Doctor
class Surgeon extends Doctor {
    String surgeryType;

    Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSpecialization: " + specialization + "\nSurgery Type: " + surgeryType;
    }
}

// Main class
public class TASK5 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details (name,age,specialization,surgeryType):");
        String[] input = sc.nextLine().split(",");

        String name = input[0];
        int age = Integer.parseInt(input[1]);
        String specialization = input[2];
        String surgeryType = input[3];

        Surgeon surgeon = new Surgeon(name, age, specialization, surgeryType);

        System.out.println(surgeon);

        sc.close();
    }
}
