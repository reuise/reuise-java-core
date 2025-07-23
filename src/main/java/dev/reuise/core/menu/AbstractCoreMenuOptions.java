package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Position;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreMenuOptions<S extends AbstractCoreMenuOptions<S>> implements CoreMenuOptions , CoreComponentOptions {
    @Override
    public S addDivider() {
        CoreMenuDividerOptions menuDividerOpts = getComponentFactory().createMenuDividerOptions();
        addItem(getComponentFactory().createMenuDivider(menuDividerOpts));
        return self();
    }

    protected dev.reuise.core.list.CoreListViewOptions listOptions;

    protected AbstractCoreMenuOptions() {
        listOptions = createDefaultListOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultItems(new ArrayList<>());
        setDefaultAnchorPosition(Position.BOTTOM_RIGHT);
        setDefaultMenuPosition(Position.BOTTOM_RIGHT);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public CoreComponent getAnchor() {
        return ((CoreComponent) (getOptionValue("anchor")));
    }

    @Override
    public ComponentOption<CoreComponent> getAnchorOption() {
        return ((ComponentOption<CoreComponent>) (getOption("anchor")));
    }

    @Override
    public S setAnchor(CoreComponent anchor) {
        setOption("anchor", anchor);
        setLayoutChildrenAnchor(anchor);
        return self();
    }

    protected void setLayoutChildrenAnchor(CoreComponent anchor) {
    }

    private void setDefaultAnchor(CoreComponent anchor) {
        setDefaultOption("anchor", anchor);
        setLayoutChildrenAnchor(anchor);
    }

    @Override
    public List<CoreMenuItem> getItems() {
        return ((List<CoreMenuItem>) (getOptionValue("items")));
    }

    @Override
    public ComponentOption<List<CoreMenuItem>> getItemsOption() {
        return ((ComponentOption<List<CoreMenuItem>>) (getOption("items")));
    }

    @Override
    public S setItems(List<CoreMenuItem> items) {
        setOption("items", items);
        return self();
    }

    @Override
    public S addItem(CoreMenuItem item) {
        List<CoreMenuItem> list = getItems();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setItems(list);
        }
        list.add(item);
        return self();
    }

    @Override
    public S setItem(CoreMenuItem item) {
        setItems(new ArrayList<CoreMenuItem>(Arrays.asList(item)));
        return self();
    }

    @Override
    public S removeItem(CoreMenuItem item) {
        List<CoreMenuItem> list = getItems();
        if (list == null) {
            return self();
        }
        list.remove(item);
        return self();
    }

    private void setDefaultItems(List<CoreMenuItem> items) {
        setDefaultOption("items", items);
    }

    @Override
    public Position getAnchorPosition() {
        return ((Position) (getOptionValue("anchorPosition")));
    }

    @Override
    public ComponentOption<Position> getAnchorPositionOption() {
        return ((ComponentOption<Position>) (getOption("anchorPosition")));
    }

    @Override
    public S setAnchorPosition(Position anchorPosition) {
        setOption("anchorPosition", anchorPosition, true);
        setLayoutChildrenAnchorPosition(anchorPosition);
        return self();
    }

    protected void setLayoutChildrenAnchorPosition(Position anchorPosition) {
    }

    private void setDefaultAnchorPosition(Position anchorPosition) {
        setDefaultOption("anchorPosition", anchorPosition, true);
        setLayoutChildrenAnchorPosition(anchorPosition);
    }

    @Override
    public Position getMenuPosition() {
        return ((Position) (getOptionValue("menuPosition")));
    }

    @Override
    public ComponentOption<Position> getMenuPositionOption() {
        return ((ComponentOption<Position>) (getOption("menuPosition")));
    }

    @Override
    public S setMenuPosition(Position menuPosition) {
        setOption("menuPosition", menuPosition, true);
        setLayoutChildrenMenuPosition(menuPosition);
        return self();
    }

    protected void setLayoutChildrenMenuPosition(Position menuPosition) {
    }

    private void setDefaultMenuPosition(Position menuPosition) {
        setDefaultOption("menuPosition", menuPosition, true);
        setLayoutChildrenMenuPosition(menuPosition);
    }

    @Override
    public dev.reuise.core.list.CoreListViewOptions getListOptions() {
        return listOptions;
    }

    @Override
    public boolean hasListOptions() {
        return listOptions != null;
    }

    @Override
    public S setListOptions(dev.reuise.core.list.CoreListViewOptions listOptions) {
        if (!hasListOptions())
            this.listOptions = createDefaultListOptions();

        // Merge with default options
        this.listOptions.merge(listOptions);
        return self();
    }

    protected CoreListViewOptions createDefaultListOptions() {
        CoreListViewOptions options = getComponentFactory().createListViewOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}