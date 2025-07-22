package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.Position;
import java.util.List;
public interface CoreMenuFeatures {
    CoreComponent getAnchor();

    CoreMenuFeatures setAnchor(CoreComponent anchor);

    List<CoreMenuItem> getItems();

    CoreMenuFeatures setItems(List<CoreMenuItem> items);

    CoreMenuFeatures addItem(CoreMenuItem item);

    CoreMenuFeatures setItem(CoreMenuItem item);

    CoreMenuFeatures removeItem(CoreMenuItem item);

    Position getAnchorPosition();

    CoreMenuFeatures setAnchorPosition(Position anchorPosition);

    Position getMenuPosition();

    CoreMenuFeatures setMenuPosition(Position menuPosition);
}