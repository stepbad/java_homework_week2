package example1;

public class Nurse {
    private int id;
    private String name;
    private String specialization;

    public Nurse(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void assistDoctor(String task) {
        System.out.println(name + " is assisting with: " + task);
    }

    public String toString() {
        return "Nurse [ID=" + id + ", Name=" + name + ", Specialization=" + specialization + "]";
    }
}
