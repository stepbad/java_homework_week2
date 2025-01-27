package example1;

public class OperatingTheatre {
    private int theatreNumber;
    private boolean isAvailable;

    public OperatingTheatre(int theatreNumber, boolean isAvailable) {
        this.theatreNumber = theatreNumber;
        this.isAvailable = isAvailable;
    }

    public void scheduleSurgery() {
        if (isAvailable) {
            System.out.println("Surgery scheduled in Theatre " + theatreNumber);
            isAvailable = false;
        } else {
            System.out.println("Theatre " + theatreNumber + " is currently unavailable.");
        }
    }

    public String toString() {
        return "OperatingTheatre [Theatre Number=" + theatreNumber + ", IsAvailable=" + isAvailable + "]";
    }
}
