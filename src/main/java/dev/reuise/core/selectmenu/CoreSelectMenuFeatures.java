package dev.reuise.core.selectmenu;
import dev.reuise.core.menu.CoreMenuItem;
import java.util.List;
public interface CoreSelectMenuFeatures {
    List<CoreMenuItem> getItems();

    CoreSelectMenuFeatures setItems(List<CoreMenuItem> items);

    CoreSelectMenuFeatures addItem(CoreMenuItem item);

    CoreSelectMenuFeatures setItem(CoreMenuItem item);

    CoreSelectMenuFeatures removeItem(CoreMenuItem item);
}