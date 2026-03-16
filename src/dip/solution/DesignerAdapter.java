package dip.solution;

// The Adapter implements Developer, so our Project thinks it's a normal employee.
public class DesignerAdapter implements Developer {
    
    // It "wraps" the incompatible object
    private final FreelanceDesigner designer;

    public DesignerAdapter(FreelanceDesigner designer) {
        this.designer = designer;
    }

    @Override
    public void develop() {
        // We translate the 'develop()' call into 'designUI()' which the freelancer understands
        designer.designUI();
    }
}
