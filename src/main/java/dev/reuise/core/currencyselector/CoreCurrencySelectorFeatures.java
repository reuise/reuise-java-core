package dev.reuise.core.currencyselector;
import java.util.List;
public interface CoreCurrencySelectorFeatures {
    List<String> getCurrencies();

    CoreCurrencySelectorFeatures setCurrencies(List<String> currencies);

    CoreCurrencySelectorFeatures addCurrency(String currency);

    CoreCurrencySelectorFeatures setCurrency(String currency);

    CoreCurrencySelectorFeatures removeCurrency(String currency);

    CoreCurrencySelectorFeatures clearCurrencies();

    List<String> getSuggestedCurrencies();

    CoreCurrencySelectorFeatures setSuggestedCurrencies(List<String> suggestedCurrencies);

    CoreCurrencySelectorFeatures addSuggestedCurrency(String suggestedCurrency);

    CoreCurrencySelectorFeatures setSuggestedCurrency(String suggestedCurrency);

    CoreCurrencySelectorFeatures removeSuggestedCurrency(String suggestedCurrency);

    CoreCurrencySelectorFeatures clearSuggestedCurrencies();

    boolean isDefaultFromBrowser();

    CoreCurrencySelectorFeatures setDefaultFromBrowser(Boolean defaultFromBrowser);
}
