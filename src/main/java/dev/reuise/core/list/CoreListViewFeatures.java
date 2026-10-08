package dev.reuise.core.list;
import java.util.List;
import java.util.function.Function;
public interface CoreListViewFeatures {
    List<CoreListItem> getItems();

    CoreListViewFeatures setItems(List<CoreListItem> items);

    <T> CoreListViewFeatures setItems(List<T> data, Function<T, CoreListItem> mapper);

    CoreListViewFeatures addItem(CoreListItem item);

    CoreListViewFeatures removeItem(CoreListItem item);

    CoreListViewFeatures clearItems();

    List<Object> getItemData();

    Function<Object, CoreListItem> getItemDataMapper();

    boolean isOrdered();

    CoreListViewFeatures setOrdered(Boolean ordered);

    CoreListViewFeatures addItem(String text);
}
