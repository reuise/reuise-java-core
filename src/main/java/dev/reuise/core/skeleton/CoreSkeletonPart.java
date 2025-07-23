package dev.reuise.core.skeleton;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
public interface CoreSkeletonPart extends ComponentPart , CoreSkeletonFeatures , CoreBaseComponentPart {
    CoreBaseComponentPart getBaseComponentPart();
}