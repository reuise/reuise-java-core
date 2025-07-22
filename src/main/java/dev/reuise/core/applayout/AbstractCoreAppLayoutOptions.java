package dev.reuise.core.applayout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.core.drawer.CoreDrawer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.splitcontainer.SplitDirection;
import dev.reuise.core.topappbar.CoreTopAppBar;
public abstract class AbstractCoreAppLayoutOptions<S extends AbstractCoreAppLayoutOptions<S>> implements CoreAppLayoutOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions drawerScrimOptions;

    protected dev.reuise.core.splitcontainer.CoreSplitContainerOptions drawerSplitOptions;

    protected dev.reuise.core.splitcontainer.CoreSplitContainerOptions topAppBarSplitOptions;

    protected dev.reuise.core.applayout.CoreAppLayoutBodyOptions bodyOptions;

    protected AbstractCoreAppLayoutOptions() {
        drawerScrimOptions = createDefaultDrawerScrimOptions();
        drawerSplitOptions = createDefaultDrawerSplitOptions();
        topAppBarSplitOptions = createDefaultTopAppBarSplitOptions();
        bodyOptions = createDefaultBodyOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public CoreTopAppBar getTopAppBar() {
        return ((CoreTopAppBar) (getOptionValue("topAppBar")));
    }

    @Override
    public ComponentOption<CoreTopAppBar> getTopAppBarOption() {
        return ((ComponentOption<CoreTopAppBar>) (getOption("topAppBar")));
    }

    @Override
    public S setTopAppBar(CoreTopAppBar topAppBar) {
        setOption("topAppBar", topAppBar, true);
        setLayoutChildrenTopAppBar(topAppBar);
        return self();
    }

    protected void setLayoutChildrenTopAppBar(CoreTopAppBar topAppBar) {
        if (topAppBarSplitOptions == null)
            topAppBarSplitOptions = createDefaultTopAppBarSplitOptions();

        topAppBarSplitOptions.setSplitPosition(topAppBar.getHeight());
    }

    private void setDefaultTopAppBar(CoreTopAppBar topAppBar) {
        setDefaultOption("topAppBar", topAppBar, true);
        setLayoutChildrenTopAppBar(topAppBar);
    }

    @Override
    public CoreBottomAppBar getBottomAppBar() {
        return ((CoreBottomAppBar) (getOptionValue("bottomAppBar")));
    }

    @Override
    public ComponentOption<CoreBottomAppBar> getBottomAppBarOption() {
        return ((ComponentOption<CoreBottomAppBar>) (getOption("bottomAppBar")));
    }

    @Override
    public S setBottomAppBar(CoreBottomAppBar bottomAppBar) {
        setOption("bottomAppBar", bottomAppBar, true);
        setLayoutChildrenBottomAppBar(bottomAppBar);
        return self();
    }

    protected void setLayoutChildrenBottomAppBar(CoreBottomAppBar bottomAppBar) {
    }

    private void setDefaultBottomAppBar(CoreBottomAppBar bottomAppBar) {
        setDefaultOption("bottomAppBar", bottomAppBar, true);
        setLayoutChildrenBottomAppBar(bottomAppBar);
    }

    @Override
    public CoreDrawer getDrawer() {
        return ((CoreDrawer) (getOptionValue("drawer")));
    }

    @Override
    public ComponentOption<CoreDrawer> getDrawerOption() {
        return ((ComponentOption<CoreDrawer>) (getOption("drawer")));
    }

    @Override
    public S setDrawer(CoreDrawer drawer) {
        setOption("drawer", drawer, true);
        setLayoutChildrenDrawer(drawer);
        return self();
    }

    protected void setLayoutChildrenDrawer(CoreDrawer drawer) {
        if (drawerSplitOptions == null)
            drawerSplitOptions = createDefaultDrawerSplitOptions();

        drawerSplitOptions.setResizable(drawer.isResizable());
    }

    private void setDefaultDrawer(CoreDrawer drawer) {
        setDefaultOption("drawer", drawer, true);
        setLayoutChildrenDrawer(drawer);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getDrawerScrimOptions() {
        return drawerScrimOptions;
    }

    @Override
    public boolean hasDrawerScrimOptions() {
        return drawerScrimOptions != null;
    }

    @Override
    public S setDrawerScrimOptions(dev.reuise.core.layout.CoreContainerOptions drawerScrimOptions) {
        if (!hasDrawerScrimOptions())
            this.drawerScrimOptions = createDefaultDrawerScrimOptions();

        // Merge with default options
        this.drawerScrimOptions.merge(drawerScrimOptions);
        return self();
    }

    @Override
    public dev.reuise.core.splitcontainer.CoreSplitContainerOptions getDrawerSplitOptions() {
        return drawerSplitOptions;
    }

    @Override
    public boolean hasDrawerSplitOptions() {
        return drawerSplitOptions != null;
    }

    @Override
    public S setDrawerSplitOptions(dev.reuise.core.splitcontainer.CoreSplitContainerOptions drawerSplitOptions) {
        if (!hasDrawerSplitOptions())
            this.drawerSplitOptions = createDefaultDrawerSplitOptions();

        // Merge with default options
        this.drawerSplitOptions.merge(drawerSplitOptions);
        return self();
    }

    @Override
    public dev.reuise.core.splitcontainer.CoreSplitContainerOptions getTopAppBarSplitOptions() {
        return topAppBarSplitOptions;
    }

    @Override
    public boolean hasTopAppBarSplitOptions() {
        return topAppBarSplitOptions != null;
    }

    @Override
    public S setTopAppBarSplitOptions(dev.reuise.core.splitcontainer.CoreSplitContainerOptions topAppBarSplitOptions) {
        if (!hasTopAppBarSplitOptions())
            this.topAppBarSplitOptions = createDefaultTopAppBarSplitOptions();

        // Merge with default options
        this.topAppBarSplitOptions.merge(topAppBarSplitOptions);
        return self();
    }

    @Override
    public dev.reuise.core.applayout.CoreAppLayoutBodyOptions getBodyOptions() {
        return bodyOptions;
    }

    @Override
    public boolean hasBodyOptions() {
        return bodyOptions != null;
    }

    @Override
    public S setBodyOptions(dev.reuise.core.applayout.CoreAppLayoutBodyOptions bodyOptions) {
        if (!hasBodyOptions())
            this.bodyOptions = createDefaultBodyOptions();

        // Merge with default options
        this.bodyOptions.merge(bodyOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultDrawerScrimOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreSplitContainerOptions createDefaultDrawerSplitOptions() {
        CoreSplitContainerOptions options = getComponentFactory().createSplitContainerOptions();
        options.setResizable(false);
        options.setDirection(SplitDirection.VERTICAL);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreSplitContainerOptions createDefaultTopAppBarSplitOptions() {
        CoreSplitContainerOptions options = getComponentFactory().createSplitContainerOptions();
        options.setDirection(SplitDirection.HORIZONTAL);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreAppLayoutBodyOptions createDefaultBodyOptions() {
        CoreAppLayoutBodyOptions options = getComponentFactory().createAppLayoutBodyOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}