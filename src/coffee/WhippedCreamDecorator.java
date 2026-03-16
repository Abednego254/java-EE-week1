package coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(CoffeeDecorator coffeeDecorator) {

        super(coffeeDecorator);
    }

    @Override
    public void prepare() {
        super.prepare();
        addWhippedCream();
    }

    private void addWhippedCream() {
        System.out.println("Adding a mountain of whipped cream!");
    }
}
