package dev.reuise.core.link;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreLink extends CoreComponent , CoreParentComponent , CoreLinkPart {
    CoreLink getComponent();
}