package dev.reuise.core.regionselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreRegionSelectorOptions extends CoreSelectMenuPartOptions , CoreRegionSelectorPartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreSelectMenuOptions , CoreComponentOptions {
    CoreSelectMenuPartOptions getSelectMenuPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
