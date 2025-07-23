package dev.reuise.core.tabs;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreTabBarPart extends ComponentPart , CoreTabBarFeatures , CoreContainerPart {
    CoreTabBarPart setActiveTab(CoreTab tab);

    CoreTabBarPart setActiveTab(String text);

    CoreContainer getContainer();

    CoreContainer getActiveIndicator();

    CoreContainerPart getContainerPart();
}