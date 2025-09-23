import java.util.Scanner;

// Account class with encapsulation
class Account {
    private int accNo;
    private String holderName;
    private double balance; // private balance

    // Constructor
    public Account(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Get balance method
    public void getBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class TASK14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for account details
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        // Create account with initial balance 0
        Account acc = new Account(accNo, name, 0.0);

        // Ask user for number of operations
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation: ");
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            switch (parts[0].toLowerCase()) {
                case "deposit":
                    double depositAmount = Double.parseDouble(parts[1]);
                    acc.deposit(depositAmount);
                    break;

                case "withdraw":
                    double withdrawAmount = Double.parseDouble(parts[1]);
                    acc.withdraw(withdrawAmount);
                    break;

                case "getbalance":
                    acc.getBalance();
                    break;

                default:
                    System.out.println("Invalid operation!");
            }
        }

        sc.close();
    }
}
