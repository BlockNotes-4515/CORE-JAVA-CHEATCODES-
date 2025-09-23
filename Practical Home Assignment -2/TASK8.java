import java.util.Scanner;

// Abstract Loan class
abstract class Loan {
    double principal;
    double time;

    Loan(double principal, double time) {
        this.principal = principal;
        this.time = time;
    }

    // Abstract method
    abstract double calculateInterest();
}

// HomeLoan class
class HomeLoan extends Loan {
    HomeLoan(double principal, double time) {
        super(principal, time);
    }

    @Override
    double calculateInterest() {
        return (principal * 8 * time) / 100; // 8% interest
    }
}

// CarLoan class
class CarLoan extends Loan {
    CarLoan(double principal, double time) {
        super(principal, time);
    }

    @Override
    double calculateInterest() {
        return (principal * 10 * time) / 100; // 10% interest
    }
}

// Main class
public class TASK8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter loan type (Home/Car), principal, time:");
        String type = sc.next();
        double principal = sc.nextDouble();
        double time = sc.nextDouble();

        Loan loan;

        if (type.equalsIgnoreCase("Home")) {
            loan = new HomeLoan(principal, time);
        } else {
            loan = new CarLoan(principal, time);
        }

        System.out.println(type + " Loan Interest: " + loan.calculateInterest());

        sc.close();
    }
}
