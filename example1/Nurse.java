package example1;

public class Nurse {
    private int id;
    private String name;
    private String specialization;

    // Constructor
    public Nurse(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
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

    // Methods
    public void assistDoctor(String task) {
        System.out.println(name + " is assisting with: " + task);
    }

    
    public String toString() {
        return "Nurse [ID=" + id + ", Name=" + name + ", Specialization=" + specialization + "]";
    }
}

