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

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
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

    
    public String toString() {
        return "Doctor [ID=" + id + ", Name=" + name + ", Specialization=" + specialization +
               ", Experience=" + yearsOfExperience + " years]";
    }
}
