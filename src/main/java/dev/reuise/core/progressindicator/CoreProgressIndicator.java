package dev.reuise.core.progressindicator;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreProgressIndicator extends CoreComponent , CoreParentComponent , CoreProgressIndicatorPart {
    CoreProgressIndicator getComponent();
}