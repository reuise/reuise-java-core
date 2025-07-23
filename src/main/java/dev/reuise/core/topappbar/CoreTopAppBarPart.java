package dev.reuise.core.topappbar;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTopAppBarPart extends ComponentPart , CoreParentComponentPart , CoreTopAppBarFeatures {
    CoreContainer getContainer();

    CoreIconButton getNavigationButton();

    CoreContainer getTitleContainer();

    CoreContainer getActionsContainer();

    CoreParentComponentPart getParentComponentPart();
}