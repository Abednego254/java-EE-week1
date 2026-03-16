package coffee;

public class Latte implements Coffee {

    @Override
    public void prepare() {
        System.out.println("Adding Milk and expresso...");
    }
}
