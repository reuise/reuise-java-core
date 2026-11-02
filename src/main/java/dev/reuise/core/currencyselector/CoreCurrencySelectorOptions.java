package dev.reuise.core.currencyselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreCurrencySelectorOptions extends CoreSelectMenuPartOptions , CoreBaseComponentPartOptions , CoreCurrencySelectorPartOptions , CoreParentComponentPartOptions , CoreSelectMenuOptions , CoreComponentOptions {
    CoreSelectMenuPartOptions getSelectMenuPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
