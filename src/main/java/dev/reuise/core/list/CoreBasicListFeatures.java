package dev.reuise.core.list;
import java.util.List;
public interface CoreBasicListFeatures {
    List<CoreBasicListItem> getItems();

    CoreBasicListFeatures setItems(List<CoreBasicListItem> items);

    CoreBasicListFeatures addItem(CoreBasicListItem item);

    CoreBasicListFeatures setItem(CoreBasicListItem item);

    CoreBasicListFeatures removeItem(CoreBasicListItem item);

    boolean isOrdered();

    CoreBasicListFeatures setOrdered(Boolean ordered);

    CoreBasicListFeatures addItem(String text);
}