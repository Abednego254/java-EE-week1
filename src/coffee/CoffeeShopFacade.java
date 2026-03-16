package coffee;

public class CoffeeShopFacade {

    public void orderSignatureVanillaLatte() {
        System.out.println("--- FACADE: Barista starting the Signature Order ---");
        
        // 1. Get the machine and brew
        CoffeeMachine machine = CoffeeMachine.getInstance();
        machine.brew();
        
        // 2. Ask factory for the base drink "Latte"
        Coffee baseLatte = CoffeeFactory.getCoffee("Latte");
        
        // 3. Decorate it! 
        // First wrap the latte in Vanilla
        Coffee vanillaLatte = new VanillaSyrupDecorator(baseLatte);
        // Then wrap the vanilla latte in Whipped Cream
        Coffee fancyLatte = new WhippedCreamDecorator((CoffeeDecorator) vanillaLatte);
        
        // 4. Finally, tell the fully decorated coffee to prepare itself!
        fancyLatte.prepare();
        
        System.out.println("--- FACADE: Drink is ready for the customer! ---");
    }
}
