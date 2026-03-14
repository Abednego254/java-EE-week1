package dip.solution;

public class DeveloperFactory {
    private DeveloperFactory(){}
    public Developer getDeveloper(String type) {
        if (type.equalsIgnoreCase("Backend Developer")){
            return new BackendDeveloper();
        } else if (type.equalsIgnoreCase("Frontend Developer")) {
            return new FrontendDeveloper();
        } else {
            throw new IllegalArgumentException("Unknown Developer!");
        }

    }
    private static DeveloperFactory instance;
    public DeveloperFactory getInstance() {
        if (instance == null) {
            return instance = new DeveloperFactory();
        } else {
            return instance;
        }
    }
}
