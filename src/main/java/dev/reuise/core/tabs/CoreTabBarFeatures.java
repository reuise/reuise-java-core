package dev.reuise.core.tabs;
import java.util.List;
public interface CoreTabBarFeatures {
    List<CoreTab> getTabs();

    CoreTabBarFeatures setTabs(List<CoreTab> tabs);

    CoreTabBarFeatures addTab(CoreTab tab);

    CoreTabBarFeatures removeTab(CoreTab tab);

    Integer getActiveTab();

    CoreTabBarFeatures setActiveTab(Integer activeTab);
}