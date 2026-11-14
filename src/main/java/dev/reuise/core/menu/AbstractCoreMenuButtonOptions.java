package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreMenuButtonOptions<S extends AbstractCoreMenuButtonOptions<S>> implements CoreMenuButtonOptions , CoreComponentOptions {
    protected dev.reuise.core.button.CoreButtonOptions triggerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions popupOptions;

    protected AbstractCoreMenuButtonOptions() {
        triggerOptions = createDefaultTriggerOptions();
        popupOptions = createDefaultPopupOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultLabel("Menu");
        setDefaultExpanded(false);
        setDefaultActionMenu(false);
        setDefaultShowChevron(true);
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
        setOption("label", label, true);
        setLayoutChildrenLabel(label);
        return self();
    }

    protected void setLayoutChildrenLabel(String label) {
        if (triggerOptions == null)
            triggerOptions = createDefaultTriggerOptions();

        triggerOptions.setLabel(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label, true);
        setLayoutChildrenLabel(label);
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
    public boolean isActionMenu() {
        return Boolean.TRUE.equals(getOptionValue("actionMenu"));
    }

    @Override
    public ComponentOption<Boolean> getActionMenuOption() {
        return ((ComponentOption<Boolean>) (getOption("actionMenu")));
    }

    @Override
    public S setActionMenu(Boolean actionMenu) {
        setOption("actionMenu", actionMenu, true);
        setLayoutChildrenActionMenu(actionMenu);
        return self();
    }

    protected void setLayoutChildrenActionMenu(Boolean actionMenu) {
    }

    private void setDefaultActionMenu(Boolean actionMenu) {
        setDefaultOption("actionMenu", actionMenu, true);
        setLayoutChildrenActionMenu(actionMenu);
    }

    @Override
    public boolean isShowChevron() {
        return Boolean.TRUE.equals(getOptionValue("showChevron"));
    }

    @Override
    public ComponentOption<Boolean> getShowChevronOption() {
        return ((ComponentOption<Boolean>) (getOption("showChevron")));
    }

    @Override
    public S setShowChevron(Boolean showChevron) {
        setOption("showChevron", showChevron, true);
        setLayoutChildrenShowChevron(showChevron);
        return self();
    }

    protected void setLayoutChildrenShowChevron(Boolean showChevron) {
    }

    private void setDefaultShowChevron(Boolean showChevron) {
        setDefaultOption("showChevron", showChevron, true);
        setLayoutChildrenShowChevron(showChevron);
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getTriggerOptions() {
        return triggerOptions;
    }

    @Override
    public boolean hasTriggerOptions() {
        return triggerOptions != null;
    }

    @Override
    public S setTriggerOptions(dev.reuise.core.button.CoreButtonOptions triggerOptions) {
        if (!hasTriggerOptions())
            this.triggerOptions = createDefaultTriggerOptions();

        // Merge with default options
        this.triggerOptions.merge(triggerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getPopupOptions() {
        return popupOptions;
    }

    @Override
    public boolean hasPopupOptions() {
        return popupOptions != null;
    }

    @Override
    public S setPopupOptions(dev.reuise.core.layout.CoreContainerOptions popupOptions) {
        if (!hasPopupOptions())
            this.popupOptions = createDefaultPopupOptions();

        // Merge with default options
        this.popupOptions.merge(popupOptions);
        return self();
    }

    protected CoreButtonOptions createDefaultTriggerOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultPopupOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
