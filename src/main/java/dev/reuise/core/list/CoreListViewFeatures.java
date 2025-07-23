package dev.reuise.core.list;
import java.util.List;
public interface CoreListViewFeatures {
    List<CoreListItem> getItems();

    CoreListViewFeatures setItems(List<CoreListItem> items);

    CoreListViewFeatures addItem(CoreListItem item);

    CoreListViewFeatures setItem(CoreListItem item);

    CoreListViewFeatures removeItem(CoreListItem item);

    boolean isOrdered();

    CoreListViewFeatures setOrdered(Boolean ordered);

    CoreListViewFeatures addItem(String text);
}