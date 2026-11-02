package dev.reuise.core.currencyselector;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreCurrencySelectorPartOptions {
    List<String> getCurrencies();

    ComponentOption<List<String>> getCurrenciesOption();

    CoreCurrencySelectorPartOptions setCurrencies(List<String> currencies);

    CoreCurrencySelectorPartOptions addCurrency(String currency);

    CoreCurrencySelectorPartOptions setCurrency(String currency);

    CoreCurrencySelectorPartOptions removeCurrency(String currency);

    CoreCurrencySelectorPartOptions clearCurrencies();

    List<String> getSuggestedCurrencies();

    ComponentOption<List<String>> getSuggestedCurrenciesOption();

    CoreCurrencySelectorPartOptions setSuggestedCurrencies(List<String> suggestedCurrencies);

    CoreCurrencySelectorPartOptions addSuggestedCurrency(String suggestedCurrency);

    CoreCurrencySelectorPartOptions setSuggestedCurrency(String suggestedCurrency);

    CoreCurrencySelectorPartOptions removeSuggestedCurrency(String suggestedCurrency);

    CoreCurrencySelectorPartOptions clearSuggestedCurrencies();

    boolean isDefaultFromBrowser();

    ComponentOption<Boolean> getDefaultFromBrowserOption();

    CoreCurrencySelectorPartOptions setDefaultFromBrowser(Boolean defaultFromBrowser);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreCurrencySelector getComponent();
}
