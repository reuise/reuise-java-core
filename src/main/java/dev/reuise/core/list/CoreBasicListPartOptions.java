package dev.reuise.core.list;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreBasicListPartOptions {
    List<CoreBasicListItem> getItems();

    ComponentOption<List<CoreBasicListItem>> getItemsOption();

    CoreBasicListPartOptions setItems(List<CoreBasicListItem> items);

    CoreBasicListPartOptions addItem(CoreBasicListItem item);

    CoreBasicListPartOptions setItem(CoreBasicListItem item);

    CoreBasicListPartOptions removeItem(CoreBasicListItem item);

    boolean isOrdered();

    ComponentOption<Boolean> getOrderedOption();

    CoreBasicListPartOptions setOrdered(Boolean ordered);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreBasicListPartOptions addItem(String text);

    CoreComponentFactory getComponentFactory();

    CoreBasicList getComponent();
}