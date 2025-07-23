package dev.reuise.core.list;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreListViewPartOptions {
    List<CoreListItem> getItems();

    ComponentOption<List<CoreListItem>> getItemsOption();

    CoreListViewPartOptions setItems(List<CoreListItem> items);

    CoreListViewPartOptions addItem(CoreListItem item);

    CoreListViewPartOptions setItem(CoreListItem item);

    CoreListViewPartOptions removeItem(CoreListItem item);

    boolean isOrdered();

    ComponentOption<Boolean> getOrderedOption();

    CoreListViewPartOptions setOrdered(Boolean ordered);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreListViewPartOptions addItem(String text);

    CoreComponentFactory getComponentFactory();

    CoreListView getComponent();
}