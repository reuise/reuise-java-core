package dev.reuise.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreFloatingPanelOptions<S extends AbstractCoreFloatingPanelOptions<S>> implements CoreFloatingPanelOptions , CoreComponentOptions {
    protected dev.reuise.core.floating.CoreFloatingActionButtonOptions triggerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions panelOptions;

    protected dev.reuise.core.layout.CoreContainerOptions headerOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions titleContainerOptions;

    protected dev.reuise.core.button.CoreButtonOptions minimiseButtonOptions;

    protected dev.reuise.core.button.CoreButtonOptions closeButtonOptions;

    protected dev.reuise.core.layout.CoreContainerOptions contentOptions;

    protected AbstractCoreFloatingPanelOptions() {
        triggerOptions = createDefaultTriggerOptions();
        panelOptions = createDefaultPanelOptions();
        headerOptions = createDefaultHeaderOptions();
        titleContainerOptions = createDefaultTitleContainerOptions();
        minimiseButtonOptions = createDefaultMinimiseButtonOptions();
        closeButtonOptions = createDefaultCloseButtonOptions();
        contentOptions = createDefaultContentOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultTitle("Help");
        setDefaultCloseLabel("Close");
        setDefaultMinimiseLabel("Minimise");
        setDefaultExpanded(false);
        setDefaultMinimised(false);
        setDefaultDocked(false);
        setDefaultCorner("bottom-right");
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getTitle() {
        return ((String) (getOptionValue("title")));
    }

    @Override
    public ComponentOption<String> getTitleOption() {
        return ((ComponentOption<String>) (getOption("title")));
    }

    @Override
    public S setTitle(String title) {
        setOption("title", title, true);
        setLayoutChildrenTitle(title);
        return self();
    }

    protected void setLayoutChildrenTitle(String title) {
        if (titleContainerOptions == null)
            titleContainerOptions = createDefaultTitleContainerOptions();

        if (getOption("title", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (titleContainerOptions.getOption("text", null) == null || titleContainerOptions.getOption("text", null) instanceof dev.reuise.core.option.DefaultComponentOption) titleContainerOptions.setDefaultOption("text", title, null, getOption("title", null).isForce()); } else { titleContainerOptions.setText(title); };
    }

    private void setDefaultTitle(String title) {
        setDefaultOption("title", title, true);
        setLayoutChildrenTitle(title);
    }

    @Override
    public String getCloseLabel() {
        return ((String) (getOptionValue("closeLabel")));
    }

    @Override
    public ComponentOption<String> getCloseLabelOption() {
        return ((ComponentOption<String>) (getOption("closeLabel")));
    }

    @Override
    public S setCloseLabel(String closeLabel) {
        setOption("closeLabel", closeLabel, true);
        setLayoutChildrenCloseLabel(closeLabel);
        return self();
    }

    protected void setLayoutChildrenCloseLabel(String closeLabel) {
        if (closeButtonOptions == null)
            closeButtonOptions = createDefaultCloseButtonOptions();

        if (getOption("closeLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (closeButtonOptions.getOption("label", null) == null || closeButtonOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) closeButtonOptions.setDefaultOption("label", closeLabel, null, getOption("closeLabel", null).isForce()); } else { closeButtonOptions.setLabel(closeLabel); };
    }

    private void setDefaultCloseLabel(String closeLabel) {
        setDefaultOption("closeLabel", closeLabel, true);
        setLayoutChildrenCloseLabel(closeLabel);
    }

    @Override
    public String getMinimiseLabel() {
        return ((String) (getOptionValue("minimiseLabel")));
    }

    @Override
    public ComponentOption<String> getMinimiseLabelOption() {
        return ((ComponentOption<String>) (getOption("minimiseLabel")));
    }

    @Override
    public S setMinimiseLabel(String minimiseLabel) {
        setOption("minimiseLabel", minimiseLabel, true);
        setLayoutChildrenMinimiseLabel(minimiseLabel);
        return self();
    }

    protected void setLayoutChildrenMinimiseLabel(String minimiseLabel) {
        if (minimiseButtonOptions == null)
            minimiseButtonOptions = createDefaultMinimiseButtonOptions();

        if (getOption("minimiseLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (minimiseButtonOptions.getOption("label", null) == null || minimiseButtonOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) minimiseButtonOptions.setDefaultOption("label", minimiseLabel, null, getOption("minimiseLabel", null).isForce()); } else { minimiseButtonOptions.setLabel(minimiseLabel); };
    }

    private void setDefaultMinimiseLabel(String minimiseLabel) {
        setDefaultOption("minimiseLabel", minimiseLabel, true);
        setLayoutChildrenMinimiseLabel(minimiseLabel);
    }

    @Override
    public boolean isExpanded() {
        return Boolean.TRUE.equals(getOptionValue("expanded"));
    }

    @Override
    public ComponentOption<Boolean> getExpandedOption() {
        return ((ComponentOption<Boolean>) (getOption("expanded")));
    }

    @Override
    public S setExpanded(Boolean expanded) {
        setOption("expanded", expanded, true);
        setLayoutChildrenExpanded(expanded);
        return self();
    }

    protected void setLayoutChildrenExpanded(Boolean expanded) {
    }

    private void setDefaultExpanded(Boolean expanded) {
        setDefaultOption("expanded", expanded, true);
        setLayoutChildrenExpanded(expanded);
    }

    @Override
    public boolean isMinimised() {
        return Boolean.TRUE.equals(getOptionValue("minimised"));
    }

    @Override
    public ComponentOption<Boolean> getMinimisedOption() {
        return ((ComponentOption<Boolean>) (getOption("minimised")));
    }

    @Override
    public S setMinimised(Boolean minimised) {
        setOption("minimised", minimised, true);
        setLayoutChildrenMinimised(minimised);
        return self();
    }

    protected void setLayoutChildrenMinimised(Boolean minimised) {
    }

    private void setDefaultMinimised(Boolean minimised) {
        setDefaultOption("minimised", minimised, true);
        setLayoutChildrenMinimised(minimised);
    }

    @Override
    public boolean isDocked() {
        return Boolean.TRUE.equals(getOptionValue("docked"));
    }

    @Override
    public ComponentOption<Boolean> getDockedOption() {
        return ((ComponentOption<Boolean>) (getOption("docked")));
    }

    @Override
    public S setDocked(Boolean docked) {
        setOption("docked", docked, true);
        setLayoutChildrenDocked(docked);
        return self();
    }

    protected void setLayoutChildrenDocked(Boolean docked) {
    }

    private void setDefaultDocked(Boolean docked) {
        setDefaultOption("docked", docked, true);
        setLayoutChildrenDocked(docked);
    }

    @Override
    public String getCorner() {
        return ((String) (getOptionValue("corner")));
    }

    @Override
    public ComponentOption<String> getCornerOption() {
        return ((ComponentOption<String>) (getOption("corner")));
    }

    @Override
    public S setCorner(String corner) {
        setOption("corner", corner, true);
        setLayoutChildrenCorner(corner);
        return self();
    }

    protected void setLayoutChildrenCorner(String corner) {
    }

    private void setDefaultCorner(String corner) {
        setDefaultOption("corner", corner, true);
        setLayoutChildrenCorner(corner);
    }

    @Override
    public dev.reuise.core.floating.CoreFloatingActionButtonOptions getTriggerOptions() {
        return triggerOptions;
    }

    @Override
    public boolean hasTriggerOptions() {
        return triggerOptions != null;
    }

    @Override
    public S setTriggerOptions(dev.reuise.core.floating.CoreFloatingActionButtonOptions triggerOptions) {
        if (!hasTriggerOptions())
            this.triggerOptions = createDefaultTriggerOptions();

        // Merge with default options
        this.triggerOptions.merge(triggerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getPanelOptions() {
        return panelOptions;
    }

    @Override
    public boolean hasPanelOptions() {
        return panelOptions != null;
    }

    @Override
    public S setPanelOptions(dev.reuise.core.layout.CoreContainerOptions panelOptions) {
        if (!hasPanelOptions())
            this.panelOptions = createDefaultPanelOptions();

        // Merge with default options
        this.panelOptions.merge(panelOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getHeaderOptions() {
        return headerOptions;
    }

    @Override
    public boolean hasHeaderOptions() {
        return headerOptions != null;
    }

    @Override
    public S setHeaderOptions(dev.reuise.core.layout.CoreContainerOptions headerOptions) {
        if (!hasHeaderOptions())
            this.headerOptions = createDefaultHeaderOptions();

        // Merge with default options
        this.headerOptions.merge(headerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getTitleContainerOptions() {
        return titleContainerOptions;
    }

    @Override
    public boolean hasTitleContainerOptions() {
        return titleContainerOptions != null;
    }

    @Override
    public S setTitleContainerOptions(dev.reuise.core.text.CoreInlineTextOptions titleContainerOptions) {
        if (!hasTitleContainerOptions())
            this.titleContainerOptions = createDefaultTitleContainerOptions();

        // Merge with default options
        this.titleContainerOptions.merge(titleContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getMinimiseButtonOptions() {
        return minimiseButtonOptions;
    }

    @Override
    public boolean hasMinimiseButtonOptions() {
        return minimiseButtonOptions != null;
    }

    @Override
    public S setMinimiseButtonOptions(dev.reuise.core.button.CoreButtonOptions minimiseButtonOptions) {
        if (!hasMinimiseButtonOptions())
            this.minimiseButtonOptions = createDefaultMinimiseButtonOptions();

        // Merge with default options
        this.minimiseButtonOptions.merge(minimiseButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getCloseButtonOptions() {
        return closeButtonOptions;
    }

    @Override
    public boolean hasCloseButtonOptions() {
        return closeButtonOptions != null;
    }

    @Override
    public S setCloseButtonOptions(dev.reuise.core.button.CoreButtonOptions closeButtonOptions) {
        if (!hasCloseButtonOptions())
            this.closeButtonOptions = createDefaultCloseButtonOptions();

        // Merge with default options
        this.closeButtonOptions.merge(closeButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getContentOptions() {
        return contentOptions;
    }

    @Override
    public boolean hasContentOptions() {
        return contentOptions != null;
    }

    @Override
    public S setContentOptions(dev.reuise.core.layout.CoreContainerOptions contentOptions) {
        if (!hasContentOptions())
            this.contentOptions = createDefaultContentOptions();

        // Merge with default options
        this.contentOptions.merge(contentOptions);
        return self();
    }

    protected CoreFloatingActionButtonOptions createDefaultTriggerOptions() {
        CoreFloatingActionButtonOptions options = getComponentFactory().createFloatingActionButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultPanelOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultHeaderOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreInlineTextOptions createDefaultTitleContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultMinimiseButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultCloseButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultContentOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
