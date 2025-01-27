package Example3;

public class TestEmployee {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee(1, "Noah", "Ten", 4500);
        Employee employee2 = new Employee(2, "Colin", "Smith", 5000);

        // Display initial details of employees
        System.out.println(employee1);
        System.out.println(employee2);

        // Display their annual salaries
        System.out.println("Annual Salary of " + employee1.getName() + ": $" + employee1.getAnnualSalary());
        System.out.println("Annual Salary of " + employee2.getName() + ": $" + employee2.getAnnualSalary());

        // Apply a 20% raise to both employees
        employee1.applyRaise(20);
        employee2.applyRaise(20);

        // Display updated details of employees after raise
        System.out.println("After 20% raise:");
        System.out.println(employee1);
        System.out.println(employee2);

        // Display their new annual salaries
        System.out.println("New Annual Salary of " + employee1.getName() + ": $" + employee1.getAnnualSalary());
        System.out.println("New Annual Salary of " + employee2.getName() + ": $" + employee2.getAnnualSalary());
    }
}
