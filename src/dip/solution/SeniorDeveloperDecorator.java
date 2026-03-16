package dip.solution;

public class SeniorDeveloperDecorator extends DeveloperDecorator {

    public SeniorDeveloperDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        // 1. Do the normal job (e.g., write Java or JavaScript)
        super.develop();
        // 2. Add the NEW dynamic behavior!
        reviewCode();
    }

    private void reviewCode() {
        System.out.println("Reviewing the team's code for quality and security...");
    }
}
