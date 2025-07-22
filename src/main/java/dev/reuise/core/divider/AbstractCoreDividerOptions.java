package dev.reuise.core.divider;
import dev.reuise.core.Alignment;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreDividerOptions<S extends AbstractCoreDividerOptions<S>> implements CoreDividerOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions startLineOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions endLineOptions;

    protected AbstractCoreDividerOptions() {
        startLineOptions = createDefaultStartLineOptions();
        labelContainerOptions = createDefaultLabelContainerOptions();
        endLineOptions = createDefaultEndLineOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultThickness(1);
        setDefaultDirection(DividerDirection.HORIZONTAL);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label);
        setLayoutChildrenLabel(label);
        return self();
    }

    protected void setLayoutChildrenLabel(String label) {
        if (labelContainerOptions == null)
            labelContainerOptions = createDefaultLabelContainerOptions();

        labelContainerOptions.setText(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
        setLayoutChildrenLabel(label);
    }

    @Override
    public Alignment getLabelAlignment() {
        return ((Alignment) (getOptionValue("labelAlignment")));
    }

    @Override
    public ComponentOption<Alignment> getLabelAlignmentOption() {
        return ((ComponentOption<Alignment>) (getOption("labelAlignment")));
    }

    @Override
    public S setLabelAlignment(Alignment labelAlignment) {
        setOption("labelAlignment", labelAlignment);
        setLayoutChildrenLabelAlignment(labelAlignment);
        return self();
    }

    protected void setLayoutChildrenLabelAlignment(Alignment labelAlignment) {
    }

    private void setDefaultLabelAlignment(Alignment labelAlignment) {
        setDefaultOption("labelAlignment", labelAlignment);
        setLayoutChildrenLabelAlignment(labelAlignment);
    }

    @Override
    public Integer getThickness() {
        return ((Integer) (getOptionValue("thickness")));
    }

    @Override
    public ComponentOption<Integer> getThicknessOption() {
        return ((ComponentOption<Integer>) (getOption("thickness")));
    }

    @Override
    public S setThickness(Integer thickness) {
        setOption("thickness", thickness);
        setLayoutChildrenThickness(thickness);
        return self();
    }

    protected void setLayoutChildrenThickness(Integer thickness) {
    }

    private void setDefaultThickness(Integer thickness) {
        setDefaultOption("thickness", thickness);
        setLayoutChildrenThickness(thickness);
    }

    @Override
    public DividerDirection getDirection() {
        return ((DividerDirection) (getOptionValue("direction")));
    }

    @Override
    public ComponentOption<DividerDirection> getDirectionOption() {
        return ((ComponentOption<DividerDirection>) (getOption("direction")));
    }

    @Override
    public S setDirection(DividerDirection direction) {
        setOption("direction", direction);
        setLayoutChildrenDirection(direction);
        return self();
    }

    protected void setLayoutChildrenDirection(DividerDirection direction) {
    }

    private void setDefaultDirection(DividerDirection direction) {
        setDefaultOption("direction", direction);
        setLayoutChildrenDirection(direction);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getStartLineOptions() {
        return startLineOptions;
    }

    @Override
    public boolean hasStartLineOptions() {
        return startLineOptions != null;
    }

    @Override
    public S setStartLineOptions(dev.reuise.core.layout.CoreContainerOptions startLineOptions) {
        if (!hasStartLineOptions())
            this.startLineOptions = createDefaultStartLineOptions();

        // Merge with default options
        this.startLineOptions.merge(startLineOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getLabelContainerOptions() {
        return labelContainerOptions;
    }

    @Override
    public boolean hasLabelContainerOptions() {
        return labelContainerOptions != null;
    }

    @Override
    public S setLabelContainerOptions(dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions) {
        if (!hasLabelContainerOptions())
            this.labelContainerOptions = createDefaultLabelContainerOptions();

        // Merge with default options
        this.labelContainerOptions.merge(labelContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getEndLineOptions() {
        return endLineOptions;
    }

    @Override
    public boolean hasEndLineOptions() {
        return endLineOptions != null;
    }

    @Override
    public S setEndLineOptions(dev.reuise.core.layout.CoreContainerOptions endLineOptions) {
        if (!hasEndLineOptions())
            this.endLineOptions = createDefaultEndLineOptions();

        // Merge with default options
        this.endLineOptions.merge(endLineOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultStartLineOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreInlineTextOptions createDefaultLabelContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultEndLineOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}