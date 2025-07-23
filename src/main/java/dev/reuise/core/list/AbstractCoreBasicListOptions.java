package dev.reuise.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreBasicListOptions<S extends AbstractCoreBasicListOptions<S>> implements CoreBasicListOptions , CoreComponentOptions {
    @Override
    public S addItem(String text) {
        CoreBasicListItemOptions listItemOpts = getComponentFactory().createBasicListItemOptions();
        CoreBasicListItem listItem = getComponentFactory().createBasicListItem(listItemOpts);
        listItem.addText(text);
        return addItem(listItem);
    }

    protected AbstractCoreBasicListOptions() {
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
    public List<CoreBasicListItem> getItems() {
        return ((List<CoreBasicListItem>) (getOptionValue("items")));
    }

    @Override
    public ComponentOption<List<CoreBasicListItem>> getItemsOption() {
        return ((ComponentOption<List<CoreBasicListItem>>) (getOption("items")));
    }

    @Override
    public S setItems(List<CoreBasicListItem> items) {
        setOption("items", items);
        return self();
    }

    @Override
    public S addItem(CoreBasicListItem item) {
        List<CoreBasicListItem> list = getItems();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setItems(list);
        }
        list.add(item);
        return self();
    }

    @Override
    public S setItem(CoreBasicListItem item) {
        setItems(new ArrayList<CoreBasicListItem>(Arrays.asList(item)));
        return self();
    }

    @Override
    public S removeItem(CoreBasicListItem item) {
        List<CoreBasicListItem> list = getItems();
        if (list == null) {
            return self();
        }
        list.remove(item);
        return self();
    }

    private void setDefaultItems(List<CoreBasicListItem> items) {
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