package coffee;

public class VanillaSyrupDecorator extends CoffeeDecorator {


    public VanillaSyrupDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }

    @Override
    public void prepare() {
        super.prepare();
        addVanillaSyrup();
    }

    private void addVanillaSyrup() {
        System.out.println("Add pumps of vanilla syrup ...");
    }
}
