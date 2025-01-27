package Example2;

public class TestRectangle {
    public static void main(String[] args) {
        // Create two Rectangle objects using the constructor
        Rectangle rect1 = new Rectangle(5.0, 4.0);
        Rectangle rect2 = new Rectangle(6.5, 3.5);

        // Display initial details of both rectangles
        System.out.println(rect1);
        System.out.println(rect2);

        // Calculate and display the area and perimeter of both rectangles
        System.out.println("Rectangle 1 - Area: " + rect1.calculateArea() + ", Perimeter: " + rect1.calculatePerimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.calculateArea() + ", Perimeter: " + rect2.calculatePerimeter());

        // Modify the dimensions of rect1 using setters
        rect1.setLength(7.0);
        rect1.setWidth(5.0);

        // Display updated details of rect1
        System.out.println("Updated " + rect1);

        // Recalculate and display the area and perimeter of rect1
        System.out.println("Updated Rectangle 1 - Area: " + rect1.calculateArea() + ", Perimeter: " + rect1.calculatePerimeter());
    }
}
