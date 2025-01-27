package example1;

public class OperatingTheatre {
    private int theatreNumber;
    private boolean isAvailable;

    // Constructor
    public OperatingTheatre(int theatreNumber, boolean isAvailable) {
        this.theatreNumber = theatreNumber;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Methods
    public void scheduleSurgery() {
        if (isAvailable) {
            System.out.println("Surgery scheduled in Theatre " + theatreNumber);
            isAvailable = false; // Mark as unavailable after scheduling
        } else {
            System.out.println("Theatre " + theatreNumber + " is currently unavailable.");
        }
    }

    public String toString() {
        return "OperatingTheatre [Theatre Number=" + theatreNumber + ", IsAvailable=" + isAvailable + "]";
    }
}
