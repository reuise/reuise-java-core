package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
public abstract class AbstractCoreNavigationTreeGroupOptions<S extends AbstractCoreNavigationTreeGroupOptions<S>> implements CoreNavigationTreeGroupOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreFlexContainerPartOptions headerOptions;

    // Indirect layout child
    private CoreButtonPartOptions toggleOptions;

    // Indirect layout child
    private CoreContainerPartOptions contentOptions;

    protected dev.reuise.core.navigation.CoreNavigationTreeLinkOptions linkOptions;

    protected dev.reuise.core.navigation.CoreNavigationTreeOptions treeOptions;

    protected AbstractCoreNavigationTreeGroupOptions() {
        linkOptions = createDefaultLinkOptions();
        treeOptions = createDefaultTreeOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        headerOptions = getHeaderOptions();
        toggleOptions = getToggleOptions();
        contentOptions = getContentOptions();
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public dev.reuise.core.navigation.CoreNavigationTreeLinkOptions getLinkOptions() {
        return linkOptions;
    }

    @Override
    public boolean hasLinkOptions() {
        return linkOptions != null;
    }

    @Override
    public S setLinkOptions(dev.reuise.core.navigation.CoreNavigationTreeLinkOptions linkOptions) {
        if (!hasLinkOptions())
            this.linkOptions = createDefaultLinkOptions();

        // Merge with default options
        this.linkOptions.merge(linkOptions);
        return self();
    }

    @Override
    public dev.reuise.core.navigation.CoreNavigationTreeOptions getTreeOptions() {
        return treeOptions;
    }

    @Override
    public boolean hasTreeOptions() {
        return treeOptions != null;
    }

    @Override
    public S setTreeOptions(dev.reuise.core.navigation.CoreNavigationTreeOptions treeOptions) {
        if (!hasTreeOptions())
            this.treeOptions = createDefaultTreeOptions();

        // Merge with default options
        this.treeOptions.merge(treeOptions);
        return self();
    }

    protected CoreNavigationTreeLinkOptions createDefaultLinkOptions() {
        CoreNavigationTreeLinkOptions options = getComponentFactory().createNavigationTreeLinkOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreNavigationTreeOptions createDefaultTreeOptions() {
        CoreNavigationTreeOptions options = getComponentFactory().createNavigationTreeOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
