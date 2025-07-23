package dev.reuise.core.view;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreFlexContainer;
public interface CoreView extends CoreComponent , CoreFlexContainer , CoreViewPart {
    CoreView getComponent();
}