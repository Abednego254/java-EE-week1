# Dependency Inversion Principle (DIP)

The **Dependency Inversion Principle (DIP)** is the "D" in the SOLID principles. 

It states two main things:
1. **High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces or abstract classes).**
2. **Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.**

### What it does:
- It decouples software modules from each other, making the system easier to scale, test, and maintain.
- Instead of a high-level class instantiating and depending directly on a low-level concrete class, it depends on an interface. The low-level class then implements this interface. This "inverts" the traditional dependency relationship.

### Code Example Explanation:
Please check the `src/dip/` directory for the code examples:
- **Violation (`src/dip/violation/DipViolationExample.java`)**: The `Project` class (high-level) directly depends on `BackendDeveloper` and `FrontendDeveloper` (low-level). If we want to add an `AndroidDeveloper`, we have to modify the `Project` class, tightly coupling them together.
- **Solution (`src/dip/solution/DipSolutionExample.java`)**: Both the `Project` class and the specific developer classes depend on the `Developer` abstraction (interface). Now, `Project` doesn't know about specific developers, it just knows they can `develop()`. We can easily add new types of developers without modifying the `Project` class.

---

# Single Responsibility Principle (SRP)

The **Single Responsibility Principle (SRP)** is the "S" in SOLID.

It states that a class should have one, and only one, reason to change. Meaning that a class should have only one job.

### Code Example Explanation:
Please check the `src/srp/` directory for the code examples:
- **Violation (`src/srp/violation/Employee.java`)**: The `Employee` class does too many things (managing employee data, calculating pay, and saving to database). 
- **Solution (`src/srp/solution/EmployeeSolution.java`)**: The logic is split into `Employee` (data), `PaymentCalculator` (calculating pay), and `EmployeeRepository` (database operations).

---

# Open/Closed Principle (OCP)

The **Open/Closed Principle (OCP)** is the "O" in SOLID.

It states that software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

### Code Example Explanation:
Please check the `src/ocp/` directory for the code examples:
- **Violation (`src/ocp/violation/ShapeCalculator.java`)**: Calculates area using instance checks (`instanceof`). To add a new shape, you must modify the `ShapeCalculator` class.
- **Solution (`src/ocp/solution/Shape.java`)**: Uses an interface `Shape` that defines a `calculateArea()` method. Each specific shape implements it. `ShapeCalculator` just calls `calculateArea()`, so adding a new shape doesn't require modifying the calculator.

---

# Liskov Substitution Principle (LSP)

The **Liskov Substitution Principle (LSP)** is the "L" in SOLID.

It states that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.

### Code Example Explanation:
Please check the `src/lsp/` directory for the code examples:
- **Violation (`src/lsp/violation/Bird.java`)**: An `Ostrich` extends `Bird` but throws an exception on `fly()`. Using an `Ostrich` instead of a `Bird` might break the code if flying is expected.
- **Solution (`src/lsp/solution/BirdSolution.java`)**: Extracts a `Flyable` interface for flying birds. `Sparrow` implements `Flyable`, while `Ostrich` only extends `Bird` but is not forced to implement a method it cannot support.

---

# Interface Segregation Principle (ISP)

The **Interface Segregation Principle (ISP)** is the "I" in SOLID.

It states that no code should be forced to depend on methods it does not use.

### Code Example Explanation:
Please check the `src/isp/` directory for the code examples:
- **Violation (`src/isp/violation/Worker.java`)**: A single `Worker` interface has both `work()` and `eat()` methods. A `RobotWorker` is forced to implement `eat()` even though robots don't eat.
- **Solution (`src/isp/solution/WorkerSolution.java`)**: Segregates interfaces into smaller, more specific ones (`Workable` and `Eatable`). A `HumanWorker` implements both, while a `RobotWorker` only implements `Workable`.
