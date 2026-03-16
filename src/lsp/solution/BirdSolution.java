package lsp.solution;

class Bird {
    // General bird properties
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

class Ostrich extends Bird {
    // Ostrich doesn't implement Flyable
}
