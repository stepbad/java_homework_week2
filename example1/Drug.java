package example1;

public class Drug {
    private String name;
    private String manufacturer;
    private double price;

    public Drug(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String toString() {
        return "Drug [Name=" + name + ", Manufacturer=" + manufacturer + ", Price=$" + price + "]";
    }
}
