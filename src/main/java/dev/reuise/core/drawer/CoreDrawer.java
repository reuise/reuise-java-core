package dev.reuise.core.drawer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreDrawer extends CoreComponent , CoreContainer , CoreDrawerPart {
    CoreDrawer getComponent();
}