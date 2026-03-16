package coffee;

public class Expresso implements Coffee {

    @Override
    public void prepare() {
        System.out.println("Extracting Strong Expresso...");
    }
}
