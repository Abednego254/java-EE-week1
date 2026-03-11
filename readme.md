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
