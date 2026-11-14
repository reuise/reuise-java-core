package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreNavigationTreeLinkOptions<S extends AbstractCoreNavigationTreeLinkOptions<S>> implements CoreNavigationTreeLinkOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    protected dev.reuise.core.list.CoreListItemOptions itemOptions;

    protected AbstractCoreNavigationTreeLinkOptions() {
        itemOptions = createDefaultItemOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        startIconOptions = getStartIconOptions();
        endIconOptions = getEndIconOptions();
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
        if (itemOptions == null)
            itemOptions = createDefaultItemOptions();

        itemOptions.setLabel(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
        setLayoutChildrenLabel(label);
    }

    @Override
    public dev.reuise.core.list.CoreListItemOptions getItemOptions() {
        return itemOptions;
    }

    @Override
    public boolean hasItemOptions() {
        return itemOptions != null;
    }

    @Override
    public S setItemOptions(dev.reuise.core.list.CoreListItemOptions itemOptions) {
        if (!hasItemOptions())
            this.itemOptions = createDefaultItemOptions();

        // Merge with default options
        this.itemOptions.merge(itemOptions);
        return self();
    }

    protected CoreListItemOptions createDefaultItemOptions() {
        CoreListItemOptions options = getComponentFactory().createListItemOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
