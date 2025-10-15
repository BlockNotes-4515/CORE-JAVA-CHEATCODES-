import java.util.Random;
import java.util.Scanner;

// Shared class to pass number between threads
class SharedNumber {
    int number;
    boolean available = false;

    synchronized void setNumber(int number) {
        this.number = number;
        available = true;
        notifyAll(); // notify waiting threads
    }

    synchronized int getNumber() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        available = false;
        return number;
    }
}

// Thread to generate random numbers
class RandomNumberGenerator extends Thread {
    SharedNumber shared;

    public RandomNumberGenerator(SharedNumber shared) {
        this.shared = shared;
    }

    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                int num = rand.nextInt(20) + 1; // random number between 1-20
                System.out.println("Generated: " + num);
                shared.setNumber(num);
                Thread.sleep(1000); // generate every second
            }
        } catch (InterruptedException e) {
            System.out.println("Simulation stopped.");
        }
    }
}

// Thread to calculate square of even numbers
class SquareCalculator extends Thread {
    SharedNumber shared;

    public SquareCalculator(SharedNumber shared) {
        this.shared = shared;
    }

    public void run() {
        try {
            while (true) {
                int num = shared.getNumber();
                if (num % 2 == 0) {
                    System.out.println("Square: " + (num * num));
                }
            }
        } catch (Exception e) {
            System.out.println("SquareCalculator stopped.");
        }
    }
}

// Thread to calculate cube of odd numbers
class CubeCalculator extends Thread {
    SharedNumber shared;

    public CubeCalculator(SharedNumber shared) {
        this.shared = shared;
    }

    public void run() {
        try {
            while (true) {
                int num = shared.getNumber();
                if (num % 2 != 0) {
                    System.out.println("Cube: " + (num * num * num));
                }
            }
        } catch (Exception e) {
            System.out.println("CubeCalculator stopped.");
        }
    }
}

// Main class
public class TASK9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SharedNumber shared = new SharedNumber();

        System.out.println("Menu:\n1. Start Simulation\n2. Exit");
        int choice = sc.nextInt();

        if (choice == 1) {
            RandomNumberGenerator generator = new RandomNumberGenerator(shared);
            SquareCalculator squareCalc = new SquareCalculator(shared);
            CubeCalculator cubeCalc = new CubeCalculator(shared);

            // Start all threads
            generator.start();
            squareCalc.start();
            cubeCalc.start();
        } else {
            System.out.println("Exiting...");
        }

        sc.close();
    }
}
