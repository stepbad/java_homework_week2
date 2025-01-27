package example1;

public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private int yearsOfExperience;

    // Constructor
    public Doctor(int id, String name, String specialization, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Methods
    public void diagnosePatient(String patientName) {
        System.out.println("Dr. " + name + " is diagnosing " + patientName + ".");
    }

    public void prescribeMedicine(String patientName) {
        System.out.println("Dr. " + name + " has prescribed medicine to " + patientName + ".");
    }

    public void performSurgery(String patientName) {
        System.out.println("Dr. " + name + " is performing surgery on " + patientName + ".");
    }

    // toString method for displaying doctor details
    
    public String toString() {
        return "Doctor [ID=" + id + ", Name=" + name + ", Specialization=" + specialization +
               ", Experience=" + yearsOfExperience + " years]";
    }
}
