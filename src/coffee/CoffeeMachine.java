package coffee;

public class CoffeeMachine {

    private static CoffeeMachine instance;

    private String machineName;

    private CoffeeMachine() {

        this.machineName = "Coffee Machine";
    }

    public static CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

    public void brew() {
        System.out.println(machineName + " is brewing coffee.");
    }
}