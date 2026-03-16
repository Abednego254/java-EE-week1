package dip.solution;

public class ProjectManager {
    // 1. Singleton pattern: Single static instance of the class
    private static ProjectManager instance;

    private String managerName;

    // 2. Private constructor prevents anyone from using 'new ProjectManager()'
    private ProjectManager() {
        this.managerName = "Super Manager";
    }

    // 3. Public method to share the exact same instance with everyone
    public static ProjectManager getInstance() {
        if (instance == null) {
            instance = new ProjectManager();
        }
        return instance;
    }

    public void manage(Project project) {
        System.out.println(managerName + " is managing the project.");
        project.implement();
    }
}
