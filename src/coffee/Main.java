package coffee;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== SINGLETON PATTERN =====");

        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        CoffeeMachine machine2 = CoffeeMachine.getInstance();

        System.out.println("Are these machines the same? " + (machine1 == machine2));

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
        
        System.out.println("\n===== ADAPTER PATTERN =====");
        OldTeaMaker teaMaker = new OldTeaMaker();
        Coffee adaptedTea = new TeaAdapter(teaMaker);
        adaptedTea.prepare(); // Calling prepare() silently calls steer()!
        
        System.out.println("\n===== DECORATOR PATTERN =====");
        // Wrap a plain espresso with vanilla and whip
        Coffee fancyEspresso = new WhippedCreamDecorator(new VanillaSyrupDecorator(expresso));
        fancyEspresso.prepare();
        
        System.out.println("\n===== FACADE PATTERN =====");
        CoffeeShopFacade appButton = new CoffeeShopFacade();
        appButton.orderSignatureVanillaLatte();
    }
}