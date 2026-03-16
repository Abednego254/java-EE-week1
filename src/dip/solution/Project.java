package dip.solution;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private final String name;
    private final double budget;
    private final List<Developer> developers;

    // Private constructor so people MUST use the Builder
    private Project(ProjectBuilder builder) {
        this.name = builder.name;
        this.budget = builder.budget;
        this.developers = builder.developers;
    }

    public void implement() {
        System.out.println("Project [" + name + "] with budget $" + budget + " is starting...");
        developers.forEach(Developer::develop);
    }

    // The Builder static inner class
    public static class ProjectBuilder {
        private String name;
        private double budget;
        private List<Developer> developers = new ArrayList<>();

        public ProjectBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProjectBuilder setBudget(double budget) {
            this.budget = budget;
            return this;
        }

        public ProjectBuilder addDeveloper(Developer developer) {
            this.developers.add(developer);
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }
}
