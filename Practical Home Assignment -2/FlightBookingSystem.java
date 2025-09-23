import java.util.Scanner;

// Abstract Flight class
abstract class Flight {
    private String flightNumber;
    private String airline;
    protected double fare; // base fare

    Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    // Abstract method to calculate final fare
    abstract void calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber + " Airline: " + airline + " Fare: " + fare;
    }
}

// DomesticFlight class
class DomesticFlight extends Flight {
    DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    void calculateFare() {
        fare = fare + fare * 0.10; // 10% tax
    }
}

// InternationalFlight class
class InternationalFlight extends Flight {
    InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    void calculateFare() {
        fare = fare + fare * 0.25; // 25% tax
    }
}

// Main class renamed to Task2
public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First flight
        System.out.println("Enter flight type,number,airline,fare:");
        String[] flight1 = sc.nextLine().split(",");
        String type1 = flight1[0];
        String number1 = flight1[1];
        String airline1 = flight1[2];
        double fare1 = Double.parseDouble(flight1[3]);

        Flight f1 = null;
        if (type1.equalsIgnoreCase("Domestic")) {
            f1 = new DomesticFlight(number1, airline1, fare1);
        } else if (type1.equalsIgnoreCase("International")) {
            f1 = new InternationalFlight(number1, airline1, fare1);
        }

        // Second flight
        System.out.println("Enter flight type,number,airline,fare:");
        String[] flight2 = sc.nextLine().split(",");
        String type2 = flight2[0];
        String number2 = flight2[1];
        String airline2 = flight2[2];
        double fare2 = Double.parseDouble(flight2[3]);

        Flight f2 = null;
        if (type2.equalsIgnoreCase("Domestic")) {
            f2 = new DomesticFlight(number2, airline2, fare2);
        } else if (type2.equalsIgnoreCase("International")) {
            f2 = new InternationalFlight(number2, airline2, fare2);
        }

        // Calculate fares
        if (f1 != null) f1.calculateFare();
        if (f2 != null) f2.calculateFare();

        // Display details
        if (f1 != null) System.out.println(f1);
        if (f2 != null) System.out.println(f2);

        sc.close();
    }
}
