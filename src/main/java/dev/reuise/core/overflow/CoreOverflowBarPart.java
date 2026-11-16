package dev.reuise.core.overflow;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerPart;
import dev.reuise.core.menu.CoreMenuButton;
public interface CoreOverflowBarPart extends ComponentPart , CoreFlexContainerPart , CoreOverflowBarFeatures {
    CoreOverflowBarPart addItem(CoreComponent item);

    CoreOverflowBarPart addItem(CoreComponent item, CoreComponent overflowItem);

    CoreOverflowBarPart removeItem(CoreComponent item);

    CoreOverflowBarPart setOverflowItem(CoreComponent item, CoreComponent overflowItem);

    CoreComponent getOverflowItem(CoreComponent item);

    CoreOverflowBarPart setOverflowLabel(CoreComponent item, String label);

    String getOverflowLabel(CoreComponent item);

    CoreOverflowBarPart setNeverOverflow(CoreComponent item, Boolean neverOverflow);

    boolean isNeverOverflow(CoreComponent item);

    CoreOverflowBarPart addButton(CoreButton button);

    CoreOverflowBarPart refresh();

    CoreFlexContainer getItems();

    CoreMenuButton getOverflowMenu();

    CoreOverflowBarPart addButton(String label);

    CoreButton createButton(String label);

    CoreFlexContainerPart getFlexContainerPart();
}
