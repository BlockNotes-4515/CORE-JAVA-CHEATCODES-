import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Inventory {
    // Using HashMap to store product ID → stock count
    private HashMap<Integer, Integer> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Method to add a new product
    public void addProduct(int productId, int stock) {
        products.put(productId, stock);
        System.out.println("Product " + productId + " added with stock " + stock);
    }

    // Method to update stock for an existing product
    public void updateStock(int productId, int newStock) {
        if (products.containsKey(productId)) {
            products.put(productId, newStock);
            System.out.println("Stock updated for Product " + productId + " to " + newStock);
        } else {
            System.out.println("Product ID not found in inventory.");
        }
    }

    // Method to display inventory using Iterator
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        System.out.println("Current Inventory:");
        Iterator<Map.Entry<Integer, Integer>> iterator = products.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("Product ID: " + entry.getKey() + " → Stock: " + entry.getValue());
        }
    }
}

public class TASK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();
                    inventory.addProduct(productId, stock);
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter New Stock: ");
                    int newStock = sc.nextInt();
                    inventory.updateStock(updateId, newStock);
                    break;

                case 3:
                    inventory.displayInventory();
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
