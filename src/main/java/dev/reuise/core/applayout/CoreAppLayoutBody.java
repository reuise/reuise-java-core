package dev.reuise.core.applayout;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreFlexContainer;
public interface CoreAppLayoutBody extends CoreComponent , CoreFlexContainer , CoreAppLayoutBodyPart {
    CoreAppLayoutBody getComponent();
}