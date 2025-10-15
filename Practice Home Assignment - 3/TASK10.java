import java.util.Scanner; // Import must come first

// BankTransaction Class extending Thread
class BankTransaction extends Thread {
    private String transactionName;
    private int amount;

    public BankTransaction(String transactionName, int amount) {
        this.transactionName = transactionName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println(transactionName + " of ₹" + amount + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500); // simulate transaction processing
        } catch (InterruptedException e) {
            System.out.println(transactionName + " interrupted");
        }
        System.out.println(transactionName + " processed successfully");
    }
}

// Main Class
public class TASK10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Transaction1 amount: ₹");
        int amount1 = sc.nextInt();

        System.out.print("Transaction2 amount: ₹");
        int amount2 = sc.nextInt();

        // Create threads
        BankTransaction t1 = new BankTransaction("Transaction1", amount1);
        BankTransaction t2 = new BankTransaction("Transaction2", amount2);

        // Set priorities based on amount
        if (amount1 > amount2) {
            t1.setPriority(Thread.MAX_PRIORITY); // high-value
            t2.setPriority(Thread.MIN_PRIORITY); // low-value
        } else {
            t2.setPriority(Thread.MAX_PRIORITY);
            t1.setPriority(Thread.MIN_PRIORITY);
        }

        // Start threads
        t1.start();
        t2.start();

        sc.close();
    }
}
