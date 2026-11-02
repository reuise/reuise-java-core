package dev.reuise.core.regionselector;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.selectmenu.CoreSelectMenuPart;
public interface CoreRegionSelectorPart extends ComponentPart , CoreRegionSelectorFeatures , CoreSelectMenuPart {
    CoreSelectMenuPart getSelectMenuPart();
}
