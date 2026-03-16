package dip.solution;

public class DeveloperFactory {

    // Factory method that returns a specific child class based on the type requested
    public static Developer getDeveloper(String type) {
        if (type.equalsIgnoreCase("Backend Developer")){
            return new BackendDeveloper();
        } else if (type.equalsIgnoreCase("Frontend Developer")) {
            return new FrontendDeveloper();
        } else {
            throw new IllegalArgumentException("Unknown Developer!");
        }
    }
}
