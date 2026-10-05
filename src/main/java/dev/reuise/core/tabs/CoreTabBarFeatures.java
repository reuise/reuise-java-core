package dev.reuise.core.tabs;
import java.util.List;
import java.util.function.Function;
public interface CoreTabBarFeatures {
    List<CoreTab> getTabs();

    CoreTabBarFeatures setTabs(List<CoreTab> tabs);

    <T> CoreTabBarFeatures setTabs(List<T> data, Function<T, CoreTab> mapper);

    CoreTabBarFeatures addTab(CoreTab tab);

    CoreTabBarFeatures removeTab(CoreTab tab);

    CoreTabBarFeatures clearTabs();

    List<Object> getTabData();

    Function<Object, CoreTab> getTabDataMapper();

    Integer getActiveTab();

    CoreTabBarFeatures setActiveTab(Integer activeTab);
}