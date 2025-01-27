package example1;

public class Drug {
    private String name;
    private String manufacturer;
    private double price;

    // Constructor
    public Drug(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public String toString() {
        return "Drug [Name=" + name + ", Manufacturer=" + manufacturer + ", Price=$" + price + "]";
    }
}
