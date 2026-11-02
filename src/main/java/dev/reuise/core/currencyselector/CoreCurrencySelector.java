package dev.reuise.core.currencyselector;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.selectmenu.CoreSelectMenu;
public interface CoreCurrencySelector extends CoreComponent , CoreSelectMenu , CoreCurrencySelectorPart {
    CoreCurrencySelector getComponent();
}
