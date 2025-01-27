package example1;

public class Ward {
    private String wardName;
    private int capacity;
    private int occupiedBeds;

    // Constructor
    public Ward(String wardName, int capacity) {
        this.wardName = wardName;
        this.capacity = capacity;
        this.occupiedBeds = 0; // Initially, no beds are occupied
    }

    // Getters and Setters
    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupiedBeds() {
        return occupiedBeds;
    }

    public void setOccupiedBeds(int occupiedBeds) {
        if (occupiedBeds <= capacity) {
            this.occupiedBeds = occupiedBeds;
        } else {
            System.out.println("Error: Occupied beds cannot exceed capacity!");
        }
    }

    // Methods
    public void admitPatient() {
        if (occupiedBeds < capacity) {
            occupiedBeds++;
            System.out.println("Patient admitted to " + wardName + ". Occupied beds: " + occupiedBeds);
        } else {
            System.out.println(wardName + " is full. Cannot admit more patients.");
        }
    }

    public void dischargePatient() {
        if (occupiedBeds > 0) {
            occupiedBeds--;
            System.out.println("A patient has been discharged from " + wardName + ". Occupied beds: " + occupiedBeds);
        } else {
            System.out.println("No patients to discharge from " + wardName + ".");
        }
    }

    
    public String toString() {
        return "Ward [Name=" + wardName + ", Capacity=" + capacity + ", Occupied Beds=" + occupiedBeds + "]";
    }
}
