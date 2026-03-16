package dip.solution;

// The base Decorator. It implements Developer, AND it holds a Developer inside it.
public abstract class DeveloperDecorator implements Developer {
    
    protected final Developer decoratedDeveloper;

    public DeveloperDecorator(Developer developer) {
        this.decoratedDeveloper = developer;
    }

    @Override
    public void develop() {
        // By default, it just asks the inner developer to do their normal job
        decoratedDeveloper.develop();
    }
}
