package dev.reuise.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.link.CoreLinkPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreListItemOptions<S extends AbstractCoreListItemOptions<S>> implements CoreListItemOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreLinkPartOptions linkOptions;

    protected dev.reuise.core.checkbox.CoreCheckboxOptions checkboxOptions;

    protected dev.reuise.core.icon.CoreIconOptions startIconOptions;

    protected dev.reuise.core.layout.CoreContainerOptions textContainerOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions secondaryLabelContainerOptions;

    protected dev.reuise.core.icon.CoreIconOptions endIconOptions;

    protected AbstractCoreListItemOptions() {
        checkboxOptions = createDefaultCheckboxOptions();
        textContainerOptions = createDefaultTextContainerOptions();
        labelContainerOptions = createDefaultLabelContainerOptions();
        secondaryLabelContainerOptions = createDefaultSecondaryLabelContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        linkOptions = getLinkOptions();
        setDefaultHasCheckbox(false);
        setDefaultToggleCheckboxOnClick(false);
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
    public String getSecondaryLabel() {
        return ((String) (getOptionValue("secondaryLabel")));
    }

    @Override
    public ComponentOption<String> getSecondaryLabelOption() {
        return ((ComponentOption<String>) (getOption("secondaryLabel")));
    }

    @Override
    public S setSecondaryLabel(String secondaryLabel) {
        setOption("secondaryLabel", secondaryLabel);
        setLayoutChildrenSecondaryLabel(secondaryLabel);
        return self();
    }

    protected void setLayoutChildrenSecondaryLabel(String secondaryLabel) {
        if (secondaryLabelContainerOptions == null)
            secondaryLabelContainerOptions = createDefaultSecondaryLabelContainerOptions();

        secondaryLabelContainerOptions.setText(secondaryLabel);
    }

    private void setDefaultSecondaryLabel(String secondaryLabel) {
        setDefaultOption("secondaryLabel", secondaryLabel);
        setLayoutChildrenSecondaryLabel(secondaryLabel);
    }

    @Override
    public boolean isHasCheckbox() {
        return Boolean.TRUE.equals(getOptionValue("hasCheckbox"));
    }

    @Override
    public ComponentOption<Boolean> getHasCheckboxOption() {
        return ((ComponentOption<Boolean>) (getOption("hasCheckbox")));
    }

    @Override
    public S setHasCheckbox(Boolean hasCheckbox) {
        setOption("hasCheckbox", hasCheckbox);
        setLayoutChildrenHasCheckbox(hasCheckbox);
        return self();
    }

    protected void setLayoutChildrenHasCheckbox(Boolean hasCheckbox) {
    }

    private void setDefaultHasCheckbox(Boolean hasCheckbox) {
        setDefaultOption("hasCheckbox", hasCheckbox);
        setLayoutChildrenHasCheckbox(hasCheckbox);
    }

    @Override
    public boolean isToggleCheckboxOnClick() {
        return Boolean.TRUE.equals(getOptionValue("toggleCheckboxOnClick"));
    }

    @Override
    public ComponentOption<Boolean> getToggleCheckboxOnClickOption() {
        return ((ComponentOption<Boolean>) (getOption("toggleCheckboxOnClick")));
    }

    @Override
    public S setToggleCheckboxOnClick(Boolean toggleCheckboxOnClick) {
        setOption("toggleCheckboxOnClick", toggleCheckboxOnClick);
        setLayoutChildrenToggleCheckboxOnClick(toggleCheckboxOnClick);
        return self();
    }

    protected void setLayoutChildrenToggleCheckboxOnClick(Boolean toggleCheckboxOnClick) {
    }

    private void setDefaultToggleCheckboxOnClick(Boolean toggleCheckboxOnClick) {
        setDefaultOption("toggleCheckboxOnClick", toggleCheckboxOnClick);
        setLayoutChildrenToggleCheckboxOnClick(toggleCheckboxOnClick);
    }

    @Override
    public dev.reuise.core.checkbox.CoreCheckboxOptions getCheckboxOptions() {
        return checkboxOptions;
    }

    @Override
    public boolean hasCheckboxOptions() {
        return checkboxOptions != null;
    }

    @Override
    public S setCheckboxOptions(dev.reuise.core.checkbox.CoreCheckboxOptions checkboxOptions) {
        if (!hasCheckboxOptions())
            this.checkboxOptions = createDefaultCheckboxOptions();

        // Merge with default options
        this.checkboxOptions.merge(checkboxOptions);
        return self();
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getStartIconOptions() {
        return startIconOptions;
    }

    @Override
    public boolean hasStartIconOptions() {
        return startIconOptions != null;
    }

    @Override
    public S setStartIconOptions(dev.reuise.core.icon.CoreIconOptions startIconOptions) {
        if (!hasStartIconOptions())
            this.startIconOptions = createDefaultStartIconOptions();

        // Merge with default options
        this.startIconOptions.merge(startIconOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getTextContainerOptions() {
        return textContainerOptions;
    }

    @Override
    public boolean hasTextContainerOptions() {
        return textContainerOptions != null;
    }

    @Override
    public S setTextContainerOptions(dev.reuise.core.layout.CoreContainerOptions textContainerOptions) {
        if (!hasTextContainerOptions())
            this.textContainerOptions = createDefaultTextContainerOptions();

        // Merge with default options
        this.textContainerOptions.merge(textContainerOptions);
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
    public dev.reuise.core.text.CoreInlineTextOptions getSecondaryLabelContainerOptions() {
        return secondaryLabelContainerOptions;
    }

    @Override
    public boolean hasSecondaryLabelContainerOptions() {
        return secondaryLabelContainerOptions != null;
    }

    @Override
    public S setSecondaryLabelContainerOptions(dev.reuise.core.text.CoreInlineTextOptions secondaryLabelContainerOptions) {
        if (!hasSecondaryLabelContainerOptions())
            this.secondaryLabelContainerOptions = createDefaultSecondaryLabelContainerOptions();

        // Merge with default options
        this.secondaryLabelContainerOptions.merge(secondaryLabelContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getEndIconOptions() {
        return endIconOptions;
    }

    @Override
    public boolean hasEndIconOptions() {
        return endIconOptions != null;
    }

    @Override
    public S setEndIconOptions(dev.reuise.core.icon.CoreIconOptions endIconOptions) {
        if (!hasEndIconOptions())
            this.endIconOptions = createDefaultEndIconOptions();

        // Merge with default options
        this.endIconOptions.merge(endIconOptions);
        return self();
    }

    protected CoreCheckboxOptions createDefaultCheckboxOptions() {
        CoreCheckboxOptions options = getComponentFactory().createCheckboxOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreIconOptions createDefaultStartIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setSize(24);
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreContainerOptions createDefaultTextContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreInlineTextOptions createDefaultLabelContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreInlineTextOptions createDefaultSecondaryLabelContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreIconOptions createDefaultEndIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setSize(24);
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}