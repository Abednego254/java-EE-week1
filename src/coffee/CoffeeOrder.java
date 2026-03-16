package coffee;

public class CoffeeOrder {

    private String customerName;
    private String size;
    private int extraShots;

    private CoffeeOrder(CoffeeOrderBuilder builder) {
        this.customerName = builder.customerName;
        this.size = builder.size;
        this.extraShots = builder.extraShots;
    }

    public static class CoffeeOrderBuilder {
        private String customerName;
        private String size;
        private int extraShots;

        public CoffeeOrderBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CoffeeOrderBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public CoffeeOrderBuilder setExtraShots(int extraShots) {
            this.extraShots = extraShots;
            return this;
        }

        public CoffeeOrder build() {
            return new CoffeeOrder(this);
        }
    }
}
