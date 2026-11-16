package dev.reuise.core.overflow;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AlignItems;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.menu.CoreMenuButtonOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreOverflowBarOptions<S extends AbstractCoreOverflowBarOptions<S>> implements CoreComponentOptions , CoreOverflowBarOptions {
    protected dev.reuise.core.layout.CoreFlexContainerOptions itemsOptions;

    protected dev.reuise.core.menu.CoreMenuButtonOptions overflowMenuOptions;

    protected AbstractCoreOverflowBarOptions() {
        itemsOptions = createDefaultItemsOptions();
        overflowMenuOptions = createDefaultOverflowMenuOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultMoreLabel("More");
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getMoreLabel() {
        return ((String) (getOptionValue("moreLabel")));
    }

    @Override
    public ComponentOption<String> getMoreLabelOption() {
        return ((ComponentOption<String>) (getOption("moreLabel")));
    }

    @Override
    public S setMoreLabel(String moreLabel) {
        setOption("moreLabel", moreLabel, true);
        setLayoutChildrenMoreLabel(moreLabel);
        return self();
    }

    protected void setLayoutChildrenMoreLabel(String moreLabel) {
        if (overflowMenuOptions == null)
            overflowMenuOptions = createDefaultOverflowMenuOptions();

        if (getOption("moreLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (overflowMenuOptions.getOption("label", null) == null || overflowMenuOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) overflowMenuOptions.setDefaultOption("label", moreLabel, null, getOption("moreLabel", null).isForce()); } else { overflowMenuOptions.setLabel(moreLabel); };
    }

    private void setDefaultMoreLabel(String moreLabel) {
        setDefaultOption("moreLabel", moreLabel, true);
        setLayoutChildrenMoreLabel(moreLabel);
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getItemsOptions() {
        return itemsOptions;
    }

    @Override
    public boolean hasItemsOptions() {
        return itemsOptions != null;
    }

    @Override
    public S setItemsOptions(dev.reuise.core.layout.CoreFlexContainerOptions itemsOptions) {
        if (!hasItemsOptions())
            this.itemsOptions = createDefaultItemsOptions();

        // Merge with default options
        this.itemsOptions.merge(itemsOptions);
        return self();
    }

    @Override
    public dev.reuise.core.menu.CoreMenuButtonOptions getOverflowMenuOptions() {
        return overflowMenuOptions;
    }

    @Override
    public boolean hasOverflowMenuOptions() {
        return overflowMenuOptions != null;
    }

    @Override
    public S setOverflowMenuOptions(dev.reuise.core.menu.CoreMenuButtonOptions overflowMenuOptions) {
        if (!hasOverflowMenuOptions())
            this.overflowMenuOptions = createDefaultOverflowMenuOptions();

        // Merge with default options
        this.overflowMenuOptions.merge(overflowMenuOptions);
        return self();
    }

    protected CoreFlexContainerOptions createDefaultItemsOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setWrap(false);
        options.setAlignItems(AlignItems.CENTER);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreMenuButtonOptions createDefaultOverflowMenuOptions() {
        CoreMenuButtonOptions options = getComponentFactory().createMenuButtonOptions();
        options.setActionMenu(true);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
