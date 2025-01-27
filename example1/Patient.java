package example1;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String ailment;
    private String assignedDoctor;

    // Constructor
    public Patient(int id, String name, int age, String ailment, String assignedDoctor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.assignedDoctor = assignedDoctor;
    }

    // Methods
    public void admit() {
        System.out.println(name + " has been admitted to the hospital.");
    }

    public void discharge() {
        System.out.println(name + " has been discharged from the hospital.");
    }

    public void updateMedicalRecord(String newAilment) {
        ailment = newAilment;
        System.out.println("Medical record of " + name + " has been updated with ailment: " + ailment);
    }

    // toString method for displaying patient details
    public String toString() {
        return "Patient [ID=" + id + ", Name=" + name + ", Age=" + age +
               ", Ailment=" + ailment + ", Assigned Doctor=" + assignedDoctor + "]";
    }
}
