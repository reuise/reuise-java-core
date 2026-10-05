package dev.reuise.core.tabs;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
import java.util.function.Function;
public interface CoreTabBarPartOptions {
    List<CoreTab> getTabs();

    ComponentOption<List<CoreTab>> getTabsOption();

    CoreTabBarPartOptions setTabs(List<CoreTab> tabs);

    <T> CoreTabBarPartOptions setTabs(List<T> data, Function<T, CoreTab> mapper);

    CoreTabBarPartOptions addTab(CoreTab tab);

    CoreTabBarPartOptions removeTab(CoreTab tab);

    CoreTabBarPartOptions clearTabs();

    List<Object> getTabData();

    Function<Object, CoreTab> getTabDataMapper();

    Integer getActiveTab();

    ComponentOption<Integer> getActiveTabOption();

    CoreTabBarPartOptions setActiveTab(Integer activeTab);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getContainerOptions();

    CoreTabBarPartOptions setContainerOptions(CoreContainerOptions containerOptions);

    boolean hasContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContainerCreator();

    CoreContainerOptions getActiveIndicatorOptions();

    CoreTabBarPartOptions setActiveIndicatorOptions(CoreContainerOptions activeIndicatorOptions);

    boolean hasActiveIndicatorOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getActiveIndicatorCreator();

    CoreComponentFactory getComponentFactory();

    CoreTabBar getComponent();
}