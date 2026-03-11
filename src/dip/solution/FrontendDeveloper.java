package dip.solution;

public class FrontendDeveloper implements Developer {

    // Low-level module depending on abstraction
    @Override
    public void develop() {
        System.out.println("Writing JavaScript code...");
    }

}
