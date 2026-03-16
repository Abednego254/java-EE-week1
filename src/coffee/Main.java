package coffee;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== SINGLETON PATTERN =====");

        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        CoffeeMachine machine2 = CoffeeMachine.getInstance();

        System.out.println("Is these machines the same? " + (machine1 == machine2));

        System.out.println("\n===== FACTORY PATTERN =====");

        Coffee latte = CoffeeFactory.getCoffee("Latte");
        Coffee expresso = CoffeeFactory.getCoffee("Expresso");

        latte.prepare();
        expresso.prepare();

        System.out.println("\n===== BUILDER PATTERN =====");

        CoffeeOrder order = new CoffeeOrder.CoffeeOrderBuilder()
                .setCustomerName("John Doe")
                .setSize(" " + CoffeeSize.LARGE)
                .setExtraShots(2)
                .build();

        System.out.println("Order placed successfully! ");

        machine1.brew();
    }
}