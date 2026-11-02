package dev.reuise.core.regionselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.CoreTextFieldPartOptions;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.menu.CoreMenuPartOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreRegionSelectorOptions<S extends AbstractCoreRegionSelectorOptions<S>> implements CoreComponentOptions , CoreRegionSelectorOptions {
    // Indirect layout child
    private CoreTextFieldPartOptions textFieldOptions;

    // Indirect layout child
    private CoreMenuPartOptions menuOptions;

    protected AbstractCoreRegionSelectorOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        textFieldOptions = getTextFieldOptions();
        menuOptions = getMenuOptions();
        setDefaultRegions(new ArrayList<>());
        setDefaultDefaultFromBrowser(true);
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
    public List<String> getRegions() {
        return ((List<String>) (getOptionValue("regions")));
    }

    @Override
    public ComponentOption<List<String>> getRegionsOption() {
        return ((ComponentOption<List<String>>) (getOption("regions")));
    }

    @Override
    public S setRegions(List<String> regions) {
        setOption("regions", regions);
        return self();
    }

    @Override
    public S addRegion(String region) {
        List<String> list = getRegions();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setRegions(list);
        }
        list.add(region);
        return self();
    }

    @Override
    public S setRegion(String region) {
        setRegions(new ArrayList<String>(Arrays.asList(region)));
        return self();
    }

    @Override
    public S removeRegion(String region) {
        List<String> list = getRegions();
        if (list == null)
            return self();

        list.remove(region);
        return self();
    }

    @Override
    public S clearRegions() {
        List<String> list = getRegions();
        if (list == null)
            return self();

        list.clear();
        return self();
    }

    private void setDefaultRegions(List<String> regions) {
        setDefaultOption("regions", regions);
    }

    @Override
    public boolean isDefaultFromBrowser() {
        return Boolean.TRUE.equals(getOptionValue("defaultFromBrowser"));
    }

    @Override
    public ComponentOption<Boolean> getDefaultFromBrowserOption() {
        return ((ComponentOption<Boolean>) (getOption("defaultFromBrowser")));
    }

    @Override
    public S setDefaultFromBrowser(Boolean defaultFromBrowser) {
        setOption("defaultFromBrowser", defaultFromBrowser);
        return self();
    }

    private void setDefaultDefaultFromBrowser(Boolean defaultFromBrowser) {
        setDefaultOption("defaultFromBrowser", defaultFromBrowser);
    }

    protected abstract S self();
}
