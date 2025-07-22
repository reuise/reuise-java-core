package dev.reuise.core.selectmenu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Position;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.menu.CoreMenuItem;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreSelectMenuOptions<S extends AbstractCoreSelectMenuOptions<S>> implements CoreSelectMenuOptions , CoreComponentOptions {
    protected dev.reuise.core.input.CoreTextFieldOptions textFieldOptions;

    protected dev.reuise.core.menu.CoreMenuOptions menuOptions;

    protected AbstractCoreSelectMenuOptions() {
        textFieldOptions = createDefaultTextFieldOptions();
        menuOptions = createDefaultMenuOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultItems(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getPlaceholder() {
        return textFieldOptions.getPlaceholder();
    }

    @Override
    public S setPlaceholder(String placeholder) {
        this.textFieldOptions.setPlaceholder(placeholder);
        return self();
    }

    @Override
    public String getLabel() {
        return textFieldOptions.getLabel();
    }

    @Override
    public S setLabel(String label) {
        this.textFieldOptions.setLabel(label);
        return self();
    }

    @Override
    public String getAutocomplete() {
        return textFieldOptions.getAutocomplete();
    }

    @Override
    public S setAutocomplete(String autocomplete) {
        this.textFieldOptions.setAutocomplete(autocomplete);
        return self();
    }

    @Override
    public S setAutocomplete(boolean autocomplete) {
        this.textFieldOptions.setAutocomplete(autocomplete);
        return self();
    }

    @Override
    public boolean isReadOnly() {
        return textFieldOptions.isReadOnly();
    }

    @Override
    public S setReadOnly(Boolean readOnly) {
        this.textFieldOptions.setReadOnly(readOnly);
        return self();
    }

    @Override
    public TextFieldSize getSize() {
        return textFieldOptions.getSize();
    }

    @Override
    public S setSize(TextFieldSize size) {
        this.textFieldOptions.setSize(size);
        return self();
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
    public dev.reuise.core.input.CoreTextFieldOptions getTextFieldOptions() {
        return textFieldOptions;
    }

    @Override
    public boolean hasTextFieldOptions() {
        return textFieldOptions != null;
    }

    @Override
    public S setTextFieldOptions(dev.reuise.core.input.CoreTextFieldOptions textFieldOptions) {
        if (!hasTextFieldOptions())
            this.textFieldOptions = createDefaultTextFieldOptions();

        // Merge with default options
        this.textFieldOptions.merge(textFieldOptions);
        return self();
    }

    @Override
    public dev.reuise.core.menu.CoreMenuOptions getMenuOptions() {
        return menuOptions;
    }

    @Override
    public boolean hasMenuOptions() {
        return menuOptions != null;
    }

    @Override
    public S setMenuOptions(dev.reuise.core.menu.CoreMenuOptions menuOptions) {
        if (!hasMenuOptions())
            this.menuOptions = createDefaultMenuOptions();

        // Merge with default options
        this.menuOptions.merge(menuOptions);
        return self();
    }

    protected CoreTextFieldOptions createDefaultTextFieldOptions() {
        CoreTextFieldOptions options = getComponentFactory().createTextFieldOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreMenuOptions createDefaultMenuOptions() {
        CoreMenuOptions options = getComponentFactory().createMenuOptions();
        options.setAnchorPosition(Position.BOTTOM_LEFT);
        options.setMenuPosition(Position.BOTTOM_LEFT);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}