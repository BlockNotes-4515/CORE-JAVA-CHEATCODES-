import java.util.Scanner;

// Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// ATM Class
class ATM {
    private double balance;

    // Constructor to initialize balance
    public ATM(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
        }
    }
}

// Main Class
public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        ATM atm = new ATM(balance);

        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }

        sc.close();
    }
}
