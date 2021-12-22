package dev.reuise.core.button;
public class CoreButtonOptions {
    private String label;

    public CoreButtonOptions() {
    }

    /**
     * Gets the label on the button
     *
     * @return Label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets the label on the button
     *
     * @param label:
     * 		Label
     * @return Options instance
     */
    public void setLabel(String label) {
        this.label = label;
    }
}