import java.util.*;

// Guest class
class Guest {
    private String name;
    private int age;
    private String idProof;

    // Constructor
    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

// Reservation class
class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests; // Aggregation: Reservation has Guests

    // Constructor
    public Reservation(String reservationId, String roomType, List<Guest> guests) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        this.guests = guests;
    }

    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationId + " Room: " + roomType);
        System.out.println("Guests:");
        for (Guest guest : guests) {
            System.out.println(guest);
        }
    }
}

// Main class
public class TASK13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input reservation details
        System.out.println("Enter Reservation details (reservationId,roomType,numberOfGuests):");
        String[] reservationInput = sc.nextLine().split(",");
        String reservationId = reservationInput[0];
        String roomType = reservationInput[1];
        int numGuests = Integer.parseInt(reservationInput[2]);

        List<Guest> guestList = new ArrayList<>();

        // Input guest details
        for (int i = 0; i < numGuests; i++) {
            System.out.println("Enter Guest details (name,age,idProof):");
            String[] guestInput = sc.nextLine().split(",");
            String name = guestInput[0];
            int age = Integer.parseInt(guestInput[1]);
            String idProof = guestInput[2];
            guestList.add(new Guest(name, age, idProof));
        }

        // Create reservation
        Reservation reservation = new Reservation(reservationId, roomType, guestList);

        // Display reservation
        System.out.print("\n-----------------------------\n");
        reservation.displayReservation();

        sc.close();
    }
}
