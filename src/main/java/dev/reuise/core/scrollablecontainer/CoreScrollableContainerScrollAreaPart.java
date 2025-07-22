package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreScrollableContainerScrollAreaPart extends ComponentPart , CoreScrollableContainerScrollAreaFeatures , CoreParentComponentPart {
    CoreContainer getScrollAreaTopFade();

    CoreContainer getScrollAreaLeftFade();

    CoreContainer getScrollAreaContent();

    CoreContainer getScrollAreaBottomFade();

    CoreContainer getScrollAreaRightFade();

    CoreParentComponentPart getParentComponentPart();
}