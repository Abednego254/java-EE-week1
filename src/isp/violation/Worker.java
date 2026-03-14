package isp.violation;

public interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void work() { System.out.println("Human working"); }
    @Override
    public void eat() { System.out.println("Human eating"); }
}

class RobotWorker implements Worker {
    @Override
    public void work() { System.out.println("Robot working"); }
    @Override
    public void eat() { 
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
