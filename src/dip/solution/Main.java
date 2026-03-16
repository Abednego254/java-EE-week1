package dip.solution;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. SINGLETON PATTERN ===");
        ProjectManager manager1 = ProjectManager.getInstance();
        ProjectManager manager2 = ProjectManager.getInstance();
        System.out.println("Are both managers the exact same person? " + (manager1 == manager2));

        System.out.println("\n=== 2. FACTORY PATTERN ===");
        Developer backendDev = DeveloperFactory.getDeveloper("Backend Developer");
        Developer frontendDev = DeveloperFactory.getDeveloper("Frontend Developer");
        System.out.println("Factory created: " + backendDev.getClass().getSimpleName());
        System.out.println("Factory created: " + frontendDev.getClass().getSimpleName());

        System.out.println("\n=== 3. ADAPTER PATTERN ===");
        // We hire a freelancer who CANNOT 'develop()', they only 'designUI()'
        FreelanceDesigner freelancer = new FreelanceDesigner();
        // We put them in the Adapter coat so they look like a normal Developer!
        Developer adaptedDesigner = new DesignerAdapter(freelancer);
        System.out.println("Adapter successfully wrapped the freelancer!");

        System.out.println("\n=== 4. DECORATOR PATTERN ===");
        // We take our normal frontend dev and promote them to Senior!
        // At runtime, we 'decorate' them with new code-reviewing responsibilities.
        Developer seniorFrontendDev = new SeniorDeveloperDecorator(frontendDev);
        System.out.println("Decorator successfully promoted the frontend developer!");

        System.out.println("\n=== 5. BUILDER PATTERN ===");
        Project project = new Project.ProjectBuilder()
                .setName("Awesome Web App")
                .setBudget(5000.0)
                .addDeveloper(backendDev)          // Normal Backend
                .addDeveloper(adaptedDesigner)     // ADAPTER is doing its job!
                .addDeveloper(seniorFrontendDev)   // DECORATOR is doing its job!
                .build();
        System.out.println("Project successfully built!");

        System.out.println("\n=== EXECUTE DIP APPLICATION ===");
        manager1.manage(project);

        System.out.println("\n\n=== 6. FACADE PATTERN ===");
        // Instead of writing ALL that Factory/Builder/Singleton code above, we just use a Facade!
        ITDepartmentFacade itFacade = new ITDepartmentFacade();
        itFacade.startStandardWebProject("Quick Marketing Page");
    }
}
