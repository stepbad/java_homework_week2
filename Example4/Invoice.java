package Example4;

public class Invoice {
    private int id; // New field for unique invoice identification
    private String itemDescription;
    private double price;
    private int quantity;
    private static int invoiceCount = 0; // Static variable to track the number of invoices created

    // Constructor
    public Invoice(int id, String itemDescription, double price, int quantity) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.price = price;
        this.quantity = quantity;
        invoiceCount++; // Increment invoice count whenever a new invoice is created
    }

    // Copy Constructor
    public Invoice(Invoice other) {
        this.id = other.id;
        this.itemDescription = other.itemDescription;
        this.price = other.price;
        this.quantity = other.quantity;
        invoiceCount++;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price must be non-negative.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be non-negative.");
        }
    }

    public static int getInvoiceCount() {
        return invoiceCount;
    }

    // Method to calculate total price
    public double calculateTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Invoice [ID=" + id + ", Item=" + itemDescription + ", Price=$" + price +
               ", Quantity=" + quantity + ", Total=$" + calculateTotal() + "]";
    }
}
