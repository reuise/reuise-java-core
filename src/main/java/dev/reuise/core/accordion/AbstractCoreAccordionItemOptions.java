package dev.reuise.core.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreAccordionItemOptions<S extends AbstractCoreAccordionItemOptions<S>> implements CoreAccordionItemOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreFlexContainerOptions headerOptions;

    protected dev.reuise.core.button.CoreButtonOptions toggleOptions;

    protected dev.reuise.core.layout.CoreContainerOptions contentOptions;

    protected AbstractCoreAccordionItemOptions() {
        headerOptions = createDefaultHeaderOptions();
        toggleOptions = createDefaultToggleOptions();
        contentOptions = createDefaultContentOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultExpanded(false);
        setDefaultToggleAtEnd(false);
        return true;
    }

    public void onInitialize() {
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
    public boolean isToggleAtEnd() {
        return Boolean.TRUE.equals(getOptionValue("toggleAtEnd"));
    }

    @Override
    public ComponentOption<Boolean> getToggleAtEndOption() {
        return ((ComponentOption<Boolean>) (getOption("toggleAtEnd")));
    }

    @Override
    public S setToggleAtEnd(Boolean toggleAtEnd) {
        setOption("toggleAtEnd", toggleAtEnd, true);
        setLayoutChildrenToggleAtEnd(toggleAtEnd);
        return self();
    }

    protected void setLayoutChildrenToggleAtEnd(Boolean toggleAtEnd) {
    }

    private void setDefaultToggleAtEnd(Boolean toggleAtEnd) {
        setDefaultOption("toggleAtEnd", toggleAtEnd, true);
        setLayoutChildrenToggleAtEnd(toggleAtEnd);
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getHeaderOptions() {
        return headerOptions;
    }

    @Override
    public boolean hasHeaderOptions() {
        return headerOptions != null;
    }

    @Override
    public S setHeaderOptions(dev.reuise.core.layout.CoreFlexContainerOptions headerOptions) {
        if (!hasHeaderOptions())
            this.headerOptions = createDefaultHeaderOptions();

        // Merge with default options
        this.headerOptions.merge(headerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getToggleOptions() {
        return toggleOptions;
    }

    @Override
    public boolean hasToggleOptions() {
        return toggleOptions != null;
    }

    @Override
    public S setToggleOptions(dev.reuise.core.button.CoreButtonOptions toggleOptions) {
        if (!hasToggleOptions())
            this.toggleOptions = createDefaultToggleOptions();

        // Merge with default options
        this.toggleOptions.merge(toggleOptions);
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

    protected CoreFlexContainerOptions createDefaultHeaderOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultToggleOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setLabel("Toggle section");
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
