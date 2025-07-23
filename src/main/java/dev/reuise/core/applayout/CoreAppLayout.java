package dev.reuise.core.applayout;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreAppLayout extends CoreComponent , CoreAppLayoutPart , CoreParentComponent {
    CoreAppLayout getComponent();
}