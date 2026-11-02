package dev.reuise.core.currencyselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.CoreTextFieldPartOptions;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.menu.CoreMenuPartOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreCurrencySelectorOptions<S extends AbstractCoreCurrencySelectorOptions<S>> implements CoreCurrencySelectorOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreTextFieldPartOptions textFieldOptions;

    // Indirect layout child
    private CoreMenuPartOptions menuOptions;

    protected AbstractCoreCurrencySelectorOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        textFieldOptions = getTextFieldOptions();
        menuOptions = getMenuOptions();
        setDefaultCurrencies(new ArrayList<>());
        setDefaultSuggestedCurrencies(new ArrayList<>());
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
    public List<String> getCurrencies() {
        return ((List<String>) (getOptionValue("currencies")));
    }

    @Override
    public ComponentOption<List<String>> getCurrenciesOption() {
        return ((ComponentOption<List<String>>) (getOption("currencies")));
    }

    @Override
    public S setCurrencies(List<String> currencies) {
        setOption("currencies", currencies);
        return self();
    }

    @Override
    public S addCurrency(String currency) {
        List<String> list = getCurrencies();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setCurrencies(list);
        }
        list.add(currency);
        return self();
    }

    @Override
    public S setCurrency(String currency) {
        setCurrencies(new ArrayList<String>(Arrays.asList(currency)));
        return self();
    }

    @Override
    public S removeCurrency(String currency) {
        List<String> list = getCurrencies();
        if (list == null)
            return self();

        list.remove(currency);
        return self();
    }

    @Override
    public S clearCurrencies() {
        List<String> list = getCurrencies();
        if (list == null)
            return self();

        list.clear();
        return self();
    }

    private void setDefaultCurrencies(List<String> currencies) {
        setDefaultOption("currencies", currencies);
    }

    @Override
    public List<String> getSuggestedCurrencies() {
        return ((List<String>) (getOptionValue("suggestedCurrencies")));
    }

    @Override
    public ComponentOption<List<String>> getSuggestedCurrenciesOption() {
        return ((ComponentOption<List<String>>) (getOption("suggestedCurrencies")));
    }

    @Override
    public S setSuggestedCurrencies(List<String> suggestedCurrencies) {
        setOption("suggestedCurrencies", suggestedCurrencies);
        return self();
    }

    @Override
    public S addSuggestedCurrency(String suggestedCurrency) {
        List<String> list = getSuggestedCurrencies();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setSuggestedCurrencies(list);
        }
        list.add(suggestedCurrency);
        return self();
    }

    @Override
    public S setSuggestedCurrency(String suggestedCurrency) {
        setSuggestedCurrencies(new ArrayList<String>(Arrays.asList(suggestedCurrency)));
        return self();
    }

    @Override
    public S removeSuggestedCurrency(String suggestedCurrency) {
        List<String> list = getSuggestedCurrencies();
        if (list == null)
            return self();

        list.remove(suggestedCurrency);
        return self();
    }

    @Override
    public S clearSuggestedCurrencies() {
        List<String> list = getSuggestedCurrencies();
        if (list == null)
            return self();

        list.clear();
        return self();
    }

    private void setDefaultSuggestedCurrencies(List<String> suggestedCurrencies) {
        setDefaultOption("suggestedCurrencies", suggestedCurrencies);
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
