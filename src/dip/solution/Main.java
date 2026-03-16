package dip.solution;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. SINGLETON PATTERN ===");
        // Getting the one and only Project Manager
        ProjectManager manager1 = ProjectManager.getInstance();
        ProjectManager manager2 = ProjectManager.getInstance();
        System.out.println("Are both managers the exact same person? " + (manager1 == manager2));

        System.out.println("\n=== 2. FACTORY PATTERN ===");
        // Asking the factory to make developers for us
        Developer backendDev = DeveloperFactory.getDeveloper("Backend Developer");
        Developer frontendDev = DeveloperFactory.getDeveloper("Frontend Developer");
        System.out.println("Factory created: " + backendDev.getClass().getSimpleName());
        System.out.println("Factory created: " + frontendDev.getClass().getSimpleName());

        System.out.println("\n=== 3. BUILDER PATTERN ===");
        // Building a project step-by-step
        Project project = new Project.ProjectBuilder()
                .setName("Awesome Web App")
                .setBudget(5000.0)
                .addDeveloper(backendDev)
                .addDeveloper(frontendDev)
                .build();
        System.out.println("Project successfully built!");

        System.out.println("\n=== EXECUTE DIP APPLICATION ===");
        // Run the project using the manager
        manager1.manage(project);
    }
}
