package dev.reuise.core.regionselector;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.selectmenu.CoreSelectMenu;
public interface CoreRegionSelector extends CoreComponent , CoreSelectMenu , CoreRegionSelectorPart {
    CoreRegionSelector getComponent();
}
