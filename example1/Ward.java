package example1;

public class Ward {
    private String wardName;
    private int capacity;
    private int occupiedBeds;

    public Ward(String wardName, int capacity) {
        this.wardName = wardName;
        this.capacity = capacity;
        this.occupiedBeds = 0;
    }

    public void admitPatient() {
        if (occupiedBeds < capacity) {
            occupiedBeds++;
            System.out.println("Patient admitted to " + wardName + ". Occupied beds: " + occupiedBeds);
        } else {
            System.out.println(wardName + " is full.");
        }
    }

    public String toString() {
        return "Ward [Name=" + wardName + ", Capacity=" + capacity + ", Occupied Beds=" + occupiedBeds + "]";
    }
}

