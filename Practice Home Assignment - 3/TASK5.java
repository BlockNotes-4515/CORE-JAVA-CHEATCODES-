import java.util.Scanner;

class UniversityLogin {
    public void login(String username) {
        if (username == null) {
            throw new NullPointerException("Username cannot be null");
        } else {
            System.out.println("Login successful! Welcome, " + username);
        }
    }
}

public class TASK5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = sc.nextLine();

        // Convert literal "null" (typed by user) into actual null value
        String username = input.equalsIgnoreCase("null") ? null : input;

        UniversityLogin loginSystem = new UniversityLogin();

        try {
            loginSystem.login(username);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Login process completed");
        }

        sc.close();
    }
}
