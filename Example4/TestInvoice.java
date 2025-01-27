package Example4;

public class TestInvoice {
    public static void main(String[] args) {
        // Create Invoice objects
        Invoice invoice1 = new Invoice(1, "Laptop", 1200.0, 2);
        Invoice invoice2 = new Invoice(2, "Mouse", 25.0, 3);
        Invoice invoice3 = new Invoice(3, "Keyboard", 50.0, 1);

        // Create a copy of an existing invoice
        Invoice invoice4 = new Invoice(invoice2);

        // Display all invoices
        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println(invoice3);
        System.out.println("Copy of Invoice 2: " + invoice4);

        // Print total number of invoices created
        System.out.println("Total Invoices Created: " + Invoice.getInvoiceCount());
    }
}
