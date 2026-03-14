package isp.solution;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    @Override
    public void work() { System.out.println("Human working"); }
    @Override
    public void eat() { System.out.println("Human eating"); }
}

class RobotWorker implements Workable {
    @Override
    public void work() { System.out.println("Robot working"); }
}
