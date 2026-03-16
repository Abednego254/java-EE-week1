package documentation;

public interface Automobile {
    String describe();
}

class FourWheeler implements Automobile {
    String name;

    public FourWheeler(String name) {
        this.name = name;
    }
    public String describe(){
        System.out.println(" 4 Wheeler " + name);
        return " 4 Wheeler " + name;
    }
}

class TwoWheeler extends FourWheeler {
    String name;

    public TwoWheeler(String name) {
        super(name);
    }

    public String describe(){
        System.out.println(" 2 Wheeler: " + name);
        return " 2 Wheeler " + name;
    }
}

class main {
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler("Bicycle");
        twoWheeler.describe();
    }
}
