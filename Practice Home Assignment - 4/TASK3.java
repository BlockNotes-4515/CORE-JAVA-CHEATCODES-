import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankDirectory {
    // Using HashMap to store account number and customer name
    private HashMap<Integer, String> accounts;

    public BankDirectory() {
        accounts = new HashMap<>();
    }

    // Method to add account
    public void addAccount(int accNo, String name) {
        accounts.put(accNo, name);
        System.out.println("Account added successfully.");
        System.out.println("Account No: " + accNo + " - " + name);
    }

    // Method to get customer name by account number
    public void getCustomer(int accNo) {
        if (accounts.containsKey(accNo)) {
            System.out.println("Customer Name: " + accounts.get(accNo));
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to display all accounts
    public void displayAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the directory.");
        } else {
            System.out.println("All Accounts:");
            for (Map.Entry<Integer, String> entry : accounts.entrySet()) {
                System.out.println("Account No: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}

public class TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDirectory directory = new BankDirectory();
        int choice;

        do {
            System.out.println("\n1. Add Account");
            System.out.println("2. Get Customer Name");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    directory.addAccount(accNo, name);
                    break;

                case 2:
                    System.out.print("Enter Account No to search: ");
                    int searchAcc = sc.nextInt();
                    directory.getCustomer(searchAcc);
                    break;

                case 3:
                    directory.displayAll();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
