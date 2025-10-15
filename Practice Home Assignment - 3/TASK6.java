import java.util.Scanner;

// User Defined Exception
class MinimumAmountException extends Exception {
    public MinimumAmountException(String message) {
        super(message);
    }
}

// OnlineShopping Class
class OnlineShopping {
    public void placeOrder(int amount) throws MinimumAmountException {
        if (amount < 500) {
            throw new MinimumAmountException("Minimum cart value must be ₹500");
        } else {
            System.out.println("Order placed successfully! Amount: ₹" + amount);
        }
    }
}

// Main Class
public class TASK6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cart amount: ");
        int amount = sc.nextInt();

        OnlineShopping shop = new OnlineShopping();

        try {
            shop.placeOrder(amount);
        } catch (MinimumAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for shopping with us!");
        }

        sc.close();
    }
}
