package dev.reuise.core.badge;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.basecomponent.CoreBaseComponent;
public interface CoreBadge extends CoreComponent , CoreBaseComponent , CoreBadgePart {
    CoreBadge getComponent();
}