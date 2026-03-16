package srp.solution;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

class PaymentCalculator {
    public void calculatePay(Employee employee) {
        System.out.println("Calculating pay for " + employee.getName());
    }
}

class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving " + employee.getName() + " to database.");
    }
}
