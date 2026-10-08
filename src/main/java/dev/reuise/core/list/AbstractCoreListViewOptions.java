package dev.reuise.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import static dev.reuise.core.list.AbstractCoreListViewOptionsImpl.getComponentFactory;
public abstract class AbstractCoreListViewOptions<S extends AbstractCoreListViewOptions<S>> implements CoreListViewOptions , CoreComponentOptions {
    @Override
    public S addItem(String text) {
        CoreListItemOptions listItemOpts = getComponentFactory().createListItemOptions();
        CoreListItem listItem = getComponentFactory().createListItem(listItemOpts);
        listItem.addText(text);
        return addItem(listItem);
    }

    private List<Object> itemData;

    private Function<Object, CoreListItem> itemDataMapper;

    protected AbstractCoreListViewOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setItems(new ArrayList<>());
        setDefaultOrdered(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public List<CoreListItem> getItems() {
        return ((List<CoreListItem>) (getOptionValue("items")));
    }

    @Override
    public ComponentOption<List<CoreListItem>> getItemsOption() {
        return ((ComponentOption<List<CoreListItem>>) (getOption("items")));
    }

    @Override
    public S setItems(List<CoreListItem> items) {
        setOption("items", items, true);
        return self();
    }

    @Override
    public S addItem(CoreListItem item) {
        List<CoreListItem> list = getItems();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setItems(list);
        }
        list.add(item);
        return self();
    }

    @Override
    public S removeItem(CoreListItem item) {
        List<CoreListItem> list = getItems();
        if (list == null) {
            return self();
        }
        list.remove(item);
        return self();
    }

    @Override
    public S clearItems() {
        List<CoreListItem> list = getItems();
        if (list == null) {
            return self();
        }
        list.clear();
        return self();
    }

    public List<Object> getItemData() {
        return itemData;
    }

    public Function<Object, CoreListItem> getItemDataMapper() {
        return itemDataMapper;
    }

    @Override
    public <T> S setItems(List<T> data, Function<T, CoreListItem> mapper) {
        this.itemData = ((List<Object>) (data));
        this.itemDataMapper = ((Function<Object, CoreListItem>) (mapper));
        return self();
    }

    private void setDefaultItems(List<CoreListItem> items) {
        setDefaultOption("items", items, true);
    }

    @Override
    public boolean isOrdered() {
        return Boolean.TRUE.equals(getOptionValue("ordered"));
    }

    @Override
    public ComponentOption<Boolean> getOrderedOption() {
        return ((ComponentOption<Boolean>) (getOption("ordered")));
    }

    @Override
    public S setOrdered(Boolean ordered) {
        setOption("ordered", ordered);
        return self();
    }

    private void setDefaultOrdered(Boolean ordered) {
        setDefaultOption("ordered", ordered);
    }

    protected abstract S self();
}
