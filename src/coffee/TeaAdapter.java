package coffee;

public class TeaAdapter implements Coffee {

    private final OldTeaMaker oldTeaMaker;

    public TeaAdapter(OldTeaMaker oldTeaMaker) {
        this.oldTeaMaker = oldTeaMaker;
    }


    @Override
    public void prepare() {
        oldTeaMaker.steep();
    }
}
