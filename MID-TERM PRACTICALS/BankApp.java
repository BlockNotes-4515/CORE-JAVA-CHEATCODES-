//we, have to create the bank that maintain the customer details.

/* Q1. Bank maintain the customer accounts. Different account types (savinga & current) have different withdrwal rules. We need to model deposits, withdrawals and balance display.
 * 
 * Menu
 * 1.Create Account(Savings/current)
 * 2. Deposit Money
 * 3. Withdrawal Money
 * 4. Display Balance
 * 5. Exit
 * 
 * Display Structure
 * Abstract class BankAccount
 * Fields: accNo,holdername,balance Abstract
 * methods: deposit(), withdrawal*()
 * Subclasses:  SavingsAccount(min balance rule), CurrentAccount(no min balance)
 * Concepts used: Abstraction, Inheritance , Method Overriding. 
 */
//SET-B.
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Abstract Class
abstract class BankAccount 
{
    int accNo;
    String holderName;
    double balance;

    BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Savings Account with Minimum Balance Rule
class SavingsAccount extends BankAccount {
    final double MIN_BALANCE = 1000;

    SavingsAccount(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " Successfully.");
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " Successfully.");
        } else {
            System.out.println("Withdrawal Denied! Minimum balance of Rs. " + MIN_BALANCE + " must be maintained.");
        }
    }
}

// Current Account (No Min Balance)
class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " Successfully.");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " Successfully.");
        } else {
            System.out.println("Withdrawal Denied! Insufficient Balance.");
        }
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account (Savings/Current)");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    System.out.print("Enter Account Type (1-Savings, 2-Current): ");
                    int type = sc.nextInt();

                    if (type == 1) {
                        account = new SavingsAccount(accNo, name, bal);
                        System.out.println("Savings Account Created Successfully.");
                    } else {
                        account = new CurrentAccount(accNo, name, bal);
                        System.out.println("Current Account Created Successfully.");
                    }
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                    } else {
                        System.out.println("Create an account first!");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                    } else {
                        System.out.println("Create an account first!");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.displayBalance();
                    } else {
                        System.out.println("Create an account first!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}
