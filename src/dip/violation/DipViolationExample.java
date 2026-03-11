package dip.violation;

class BackendDeveloper {
    public void writeJava() {
        System.out.println("Writing Java code...");
    }
}

class FrontendDeveloper {
    public void writeJavascript() {
        System.out.println("Writing JavaScript code...");
    }
}

// High-level module directly depending on low-level modules (Violation of DIP)
class Project {
    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavascript();
    }
}

public class DipViolationExample {
    public static void main(String[] args) {
        Project project = new Project();
        System.out.println("--- Project Started (DIP Violation) ---");
        project.implement();
    }
}
