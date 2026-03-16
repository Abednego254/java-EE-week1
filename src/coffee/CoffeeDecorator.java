package coffee;

public class CoffeeDecorator implements Coffee {
    protected final Coffee coffeeDecorator;

    public CoffeeDecorator(Coffee coffeeDecorator) {
        this.coffeeDecorator = coffeeDecorator;
    }


    @Override
    public void prepare() {
        coffeeDecorator.prepare();
    }
}
