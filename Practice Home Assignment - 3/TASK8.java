import java.util.Scanner;

// Class implementing Runnable interface
class PrinterJob implements Runnable {
    private int jobId;
    private String studentName;

    public PrinterJob(int jobId, String studentName) {
        this.jobId = jobId;
        this.studentName = studentName;
    }

    @Override
    public void run() {
        System.out.println("Printing job " + jobId + " by " + studentName);
        try {
            Thread.sleep(1000); // simulate time taken to print
        } catch (InterruptedException e) {
            System.out.println(studentName + "'s print job interrupted.");
        }
        System.out.println("Job " + jobId + " by " + studentName + " completed.");
    }
}

// Main class
public class TASK8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of print jobs: ");
        int n = sc.nextInt();

        // Example student names (can be customized)
        String[] students = {"Student A", "Student B", "Student C", "Student D", "Student E"};

        // Create and start threads
        for (int i = 1; i <= n; i++) {
            Thread t = new Thread(new PrinterJob(i, students[i - 1]));
            t.start();
        }

        sc.close();
    }
}
