package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreTableHeaderCellOptions<S extends AbstractCoreTableHeaderCellOptions<S>> implements CoreComponentOptions , CoreTableHeaderCellOptions {
    protected dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions;

    protected dev.reuise.core.menu.CoreMenuOptions menuOptions;

    protected dev.reuise.core.button.CoreIconButtonOptions menuButtonOptions;

    protected AbstractCoreTableHeaderCellOptions() {
        labelContainerOptions = createDefaultLabelContainerOptions();
        menuButtonOptions = createDefaultMenuButtonOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultHasMenuButton(false);
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
    public boolean isHasMenuButton() {
        return Boolean.TRUE.equals(getOptionValue("hasMenuButton"));
    }

    @Override
    public ComponentOption<Boolean> getHasMenuButtonOption() {
        return ((ComponentOption<Boolean>) (getOption("hasMenuButton")));
    }

    @Override
    public S setHasMenuButton(Boolean hasMenuButton) {
        setOption("hasMenuButton", hasMenuButton);
        setLayoutChildrenHasMenuButton(hasMenuButton);
        return self();
    }

    protected void setLayoutChildrenHasMenuButton(Boolean hasMenuButton) {
    }

    private void setDefaultHasMenuButton(Boolean hasMenuButton) {
        setDefaultOption("hasMenuButton", hasMenuButton);
        setLayoutChildrenHasMenuButton(hasMenuButton);
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
    public dev.reuise.core.menu.CoreMenuOptions getMenuOptions() {
        return menuOptions;
    }

    @Override
    public boolean hasMenuOptions() {
        return menuOptions != null;
    }

    @Override
    public S setMenuOptions(dev.reuise.core.menu.CoreMenuOptions menuOptions) {
        if (!hasMenuOptions())
            this.menuOptions = createDefaultMenuOptions();

        // Merge with default options
        this.menuOptions.merge(menuOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreIconButtonOptions getMenuButtonOptions() {
        return menuButtonOptions;
    }

    @Override
    public boolean hasMenuButtonOptions() {
        return menuButtonOptions != null;
    }

    @Override
    public S setMenuButtonOptions(dev.reuise.core.button.CoreIconButtonOptions menuButtonOptions) {
        if (!hasMenuButtonOptions())
            this.menuButtonOptions = createDefaultMenuButtonOptions();

        // Merge with default options
        this.menuButtonOptions.merge(menuButtonOptions);
        return self();
    }

    protected CoreInlineTextOptions createDefaultLabelContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreMenuOptions createDefaultMenuOptions() {
        CoreMenuOptions options = getComponentFactory().createMenuOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreIconButtonOptions createDefaultMenuButtonOptions() {
        CoreIconButtonOptions options = getComponentFactory().createIconButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}