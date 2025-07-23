package dev.reuise.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreListViewOptions<S extends AbstractCoreListViewOptions<S>> implements CoreListViewOptions , CoreComponentOptions {
    @Override
    public S addItem(String text) {
        CoreListItemOptions listItemOpts = getComponentFactory().createListItemOptions();
        CoreListItem listItem = getComponentFactory().createListItem(listItemOpts);
        listItem.addText(text);
        return addItem(listItem);
    }

    protected AbstractCoreListViewOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultItems(new ArrayList<>());
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
        setOption("items", items);
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
    public S setItem(CoreListItem item) {
        setItems(new ArrayList<CoreListItem>(Arrays.asList(item)));
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

    private void setDefaultItems(List<CoreListItem> items) {
        setDefaultOption("items", items);
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