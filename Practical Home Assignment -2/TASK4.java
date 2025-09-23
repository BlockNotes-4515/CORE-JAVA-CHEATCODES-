import java.util.*;

// Product class
class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + (int)getTotal();
    }
}

// Order class
class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\nProducts:\n");
        for (Product p : products) {
            sb.append(p).append("\n");
        }
        sb.append("Total: ").append((int)calculateTotal());
        return sb.toString();
    }
}

// Main class
public class TASK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Order ID:");
        String orderId = sc.nextLine();

        System.out.println("Enter number of products:");
        int n = Integer.parseInt(sc.nextLine());

        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product details (name,price,quantity):");
            String[] input = sc.nextLine().split(",");
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);

            productList.add(new Product(name, price, quantity));
        }

        Order order = new Order(orderId, productList);
        System.out.println(order);

        sc.close();
    }
}
