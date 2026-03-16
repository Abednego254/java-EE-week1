package dip.solution;

public class ITDepartmentFacade {

    // A single method that hides all the Factory, Builder, and Singleton complexity
    public void startStandardWebProject(String projectName) {
        System.out.println("--- FACADE: IT Department is setting up '" + projectName + "' ---");

        // 1. Ask factory for default devs
        Developer backend = DeveloperFactory.getDeveloper("Backend Developer");
        Developer frontend = DeveloperFactory.getDeveloper("Frontend Developer");

        // 2. Handle simple default build
        Project project = new Project.ProjectBuilder()
                .setName(projectName)
                .setBudget(10000.0)
                .addDeveloper(backend)
                .addDeveloper(frontend)
                .build();

        // 3. Hand off to Singleton manager
        ProjectManager.getInstance().manage(project);
        
        System.out.println("--- FACADE: Project setup complete ---");
    }
}
