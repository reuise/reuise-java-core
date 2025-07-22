package dev.reuise.core.divider;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreDivider extends CoreComponent , CoreParentComponent , CoreDividerPart {
    CoreDivider getComponent();
}