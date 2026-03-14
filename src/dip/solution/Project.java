package dip.solution;

import java.util.List;

public class Project {

    // High-level module depending on abstraction
    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(Developer::develop);
    } 
}
