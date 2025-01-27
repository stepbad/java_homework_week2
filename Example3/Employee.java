package Example3;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be non-negative.");
        }
    }

    // Method to return the full name (firstName + lastName)
    public String getName() {
        return firstName + " " + lastName;
    }

    // Method to calculate the annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }

    // Method to apply a raise
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }

    
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + getName() + ", Salary=$" + salary + "]";
    }
}
