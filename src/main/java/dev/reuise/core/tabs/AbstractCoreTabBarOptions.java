package dev.reuise.core.tabs;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreTabBarOptions<S extends AbstractCoreTabBarOptions<S>> implements CoreTabBarOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions containerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions activeIndicatorOptions;

    protected AbstractCoreTabBarOptions() {
        containerOptions = createDefaultContainerOptions();
        activeIndicatorOptions = createDefaultActiveIndicatorOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setTabs(new ArrayList<>());
        setDefaultActiveTab(0);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public List<CoreTab> getTabs() {
        return ((List<CoreTab>) (getOptionValue("tabs")));
    }

    @Override
    public ComponentOption<List<CoreTab>> getTabsOption() {
        return ((ComponentOption<List<CoreTab>>) (getOption("tabs")));
    }

    @Override
    public S setTabs(List<CoreTab> tabs) {
        setOption("tabs", tabs, true);
        return self();
    }

    @Override
    public S addTab(CoreTab tab) {
        List<CoreTab> list = getTabs();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setTabs(list);
        }
        list.add(tab);
        return self();
    }

    @Override
    public S removeTab(CoreTab tab) {
        List<CoreTab> list = getTabs();
        if (list == null) {
            return self();
        }
        list.remove(tab);
        return self();
    }

    private void setDefaultTabs(List<CoreTab> tabs) {
        setDefaultOption("tabs", tabs, true);
    }

    @Override
    public Integer getActiveTab() {
        return ((Integer) (getOptionValue("activeTab")));
    }

    @Override
    public ComponentOption<Integer> getActiveTabOption() {
        return ((ComponentOption<Integer>) (getOption("activeTab")));
    }

    @Override
    public S setActiveTab(Integer activeTab) {
        setOption("activeTab", activeTab, true);
        setLayoutChildrenActiveTab(activeTab);
        return self();
    }

    protected void setLayoutChildrenActiveTab(Integer activeTab) {
    }

    private void setDefaultActiveTab(Integer activeTab) {
        setDefaultOption("activeTab", activeTab, true);
        setLayoutChildrenActiveTab(activeTab);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getContainerOptions() {
        return containerOptions;
    }

    @Override
    public boolean hasContainerOptions() {
        return containerOptions != null;
    }

    @Override
    public S setContainerOptions(dev.reuise.core.layout.CoreContainerOptions containerOptions) {
        if (!hasContainerOptions())
            this.containerOptions = createDefaultContainerOptions();

        // Merge with default options
        this.containerOptions.merge(containerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getActiveIndicatorOptions() {
        return activeIndicatorOptions;
    }

    @Override
    public boolean hasActiveIndicatorOptions() {
        return activeIndicatorOptions != null;
    }

    @Override
    public S setActiveIndicatorOptions(dev.reuise.core.layout.CoreContainerOptions activeIndicatorOptions) {
        if (!hasActiveIndicatorOptions())
            this.activeIndicatorOptions = createDefaultActiveIndicatorOptions();

        // Merge with default options
        this.activeIndicatorOptions.merge(activeIndicatorOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultActiveIndicatorOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}