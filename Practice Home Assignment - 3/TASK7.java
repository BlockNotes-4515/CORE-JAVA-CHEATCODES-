import java.util.Scanner;

// Shared Resource Class
class TicketBooking {
    int availableSeats;

    public TicketBooking(int seats) {
        this.availableSeats = seats;
    }

    // Synchronized method to prevent race condition
    synchronized void bookSeat(String user, int seatsToBook) {
        if (seatsToBook <= availableSeats) {
            System.out.println(user + " booked " + seatsToBook + " seat(s) successfully");
            availableSeats -= seatsToBook;
        } else {
            System.out.println(user + " booking failed. Not enough seats");
        }
    }
}

// Thread class for each user
class User1 extends Thread {
    TicketBooking booking;
    int seats;

    public User1(TicketBooking booking, int seats) {
        this.booking = booking;
        this.seats = seats;
    }

    public void run() {
        booking.bookSeat("User1", seats);
    }
}

class User2 extends Thread {
    TicketBooking booking;
    int seats;

    public User2(TicketBooking booking, int seats) {
        this.booking = booking;
        this.seats = seats;
    }

    public void run() {
        booking.bookSeat("User2", seats);
    }
}

// Main Class
public class TASK7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Available Seats: ");
        int totalSeats = sc.nextInt();

        System.out.print("User1 wants to book: ");
        int user1Seats = sc.nextInt();

        System.out.print("User2 wants to book: ");
        int user2Seats = sc.nextInt();

        TicketBooking booking = new TicketBooking(totalSeats);

        User1 u1 = new User1(booking, user1Seats);
        User2 u2 = new User2(booking, user2Seats);

        // Start both threads
        u1.start();
        u2.start();

        sc.close();
    }
}
