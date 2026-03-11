package dip.solution;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(new FrontendDeveloper(), new BackendDeveloper());

        Project project = new Project(developers);

        System.out.println("=== Running with DIP adherence ===");
        project.implement();
    }
}
