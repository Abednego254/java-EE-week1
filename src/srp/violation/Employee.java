package srp.violation;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Responsibility 1: Business Logic
    public void calculatePay() {
        System.out.println("Calculating pay of " + salary + " for " + name);
    }

    // Responsibility 2: Database Operations
    public void saveToDatabase() {
        System.out.println("Saving " + name + " to database.");
    }
}
