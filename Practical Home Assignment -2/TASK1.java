import java.util.*;

// Professor class
class Professor {
    // private attributes
    private String name;
    private String employeeId;
    private String specialization;

    // default constructor
    public Professor() {}

    // parameterized constructor
    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId + ", Specialization: " + specialization;
    }
}

// Department class
class Department {
    // private attributes
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    // default constructor
    public Department() {
        professors = new ArrayList<>();
    }

    // parameterized constructor
    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    // getters and setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    // method to add professor
    public void addProfessor(Professor p) {
        professors.add(p);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department: ").append(deptName).append("\n");
        sb.append("HOD: ").append(hodName).append("\n");
        sb.append("Professors:\n");
        for (Professor p : professors) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}

// Main class
public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input department details
        System.out.println("Enter Department details (deptName,hodName):");
        String deptInput = sc.nextLine();
        String[] deptData = deptInput.split(",");
        Department dept = new Department(deptData[0], deptData[1]);

        // Input number of professors
        System.out.println("Enter number of professors:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input professor details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter professor details (name,employeeId,specialization):");
            String profInput = sc.nextLine();
            String[] profData = profInput.split(",");
            Professor prof = new Professor(profData[0], profData[1], profData[2]);
            dept.addProfessor(prof);
        }

        // Display output
        System.out.println("\n---------------------------------------------------\n");
        System.out.println(dept.toString());

        sc.close();
    }
}
