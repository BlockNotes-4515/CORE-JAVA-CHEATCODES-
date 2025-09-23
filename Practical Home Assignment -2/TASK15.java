import java.util.Scanner;

// Passport class
class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    // Constructor
    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }
    @Override
    public String toString() {
        return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
    }
}

// Citizen class
class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport; // One-to-one relationship

    // Constructor
    public Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address + "\n" + passport.toString();
    }
}

// Main class
public class TASK15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input citizen details
        System.out.println("Enter Citizen details (name,dob,address):");
        String[] citizenInput = sc.nextLine().split(",");
        String name = citizenInput[0];
        String dob = citizenInput[1];
        String address = citizenInput[2];

        // Input passport details
        System.out.println("Enter Passport details (passportNo,issueDate,expiryDate):");
        String[] passportInput = sc.nextLine().split(",");
        String passportNo = passportInput[0];
        String issueDate = passportInput[1];
        String expiryDate = passportInput[2];

        // Create Passport and Citizen objects
        Passport passport = new Passport(passportNo, issueDate, expiryDate);
        Citizen citizen = new Citizen(name, dob, address, passport);

        // Print citizen with passport details
        System.out.println("------------- Citizen with Passport details --------------\n");
        System.out.println(citizen);

        sc.close();
    }
}
