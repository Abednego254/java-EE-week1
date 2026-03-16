package coffee;

public class CoffeeFactory {

    public static Coffee getCoffee(String type) {
        if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("Expresso")) {
            return new Expresso();
        } else {
            throw new IllegalArgumentException("Unknown Coffee Type: " + type);
        }
    }
}
