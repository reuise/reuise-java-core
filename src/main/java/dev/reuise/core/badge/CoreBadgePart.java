package dev.reuise.core.badge;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
public interface CoreBadgePart extends ComponentPart , CoreBaseComponentPart , CoreBadgeFeatures {
    CoreBaseComponentPart getBaseComponentPart();
}