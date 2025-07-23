package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.Position;
import dev.reuise.core.State;
import dev.reuise.core.list.CoreListView;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreMenuPartOptions {
    CoreComponent getAnchor();

    ComponentOption<CoreComponent> getAnchorOption();

    CoreMenuPartOptions setAnchor(CoreComponent anchor);

    List<CoreMenuItem> getItems();

    ComponentOption<List<CoreMenuItem>> getItemsOption();

    CoreMenuPartOptions setItems(List<CoreMenuItem> items);

    CoreMenuPartOptions addItem(CoreMenuItem item);

    CoreMenuPartOptions setItem(CoreMenuItem item);

    CoreMenuPartOptions removeItem(CoreMenuItem item);

    Position getAnchorPosition();

    ComponentOption<Position> getAnchorPositionOption();

    CoreMenuPartOptions setAnchorPosition(Position anchorPosition);

    Position getMenuPosition();

    ComponentOption<Position> getMenuPositionOption();

    CoreMenuPartOptions setMenuPosition(Position menuPosition);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreMenuPartOptions addDivider();

    CoreListViewOptions getListOptions();

    CoreMenuPartOptions setListOptions(CoreListViewOptions listOptions);

    boolean hasListOptions();

    ComponentCreator<? extends CoreListView, ? extends CoreListViewOptions> getListCreator();

    CoreComponentFactory getComponentFactory();

    CoreMenu getComponent();
}