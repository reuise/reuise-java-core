package dev.reuise.core.currencyselector;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.selectmenu.CoreSelectMenuPart;
public interface CoreCurrencySelectorPart extends ComponentPart , CoreSelectMenuPart , CoreCurrencySelectorFeatures {
    CoreSelectMenuPart getSelectMenuPart();
}
