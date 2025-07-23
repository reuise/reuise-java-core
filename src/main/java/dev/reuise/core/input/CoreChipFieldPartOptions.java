package dev.reuise.core.input;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.chip.CoreChipGroup;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreChipFieldPartOptions {
    boolean isMultiple();

    ComponentOption<Boolean> getMultipleOption();

    CoreChipFieldPartOptions setMultiple(Boolean multiple);

    List<String> getValues();

    ComponentOption<List<String>> getValuesOption();

    CoreChipFieldPartOptions setValues(List<String> values);

    CoreChipFieldPartOptions addValue(String value);

    CoreChipFieldPartOptions removeValue(String value);

    boolean hasValue(String value);

    List<String> getDelimiters();

    ComponentOption<List<String>> getDelimitersOption();

    CoreChipFieldPartOptions setDelimiters(List<String> delimiters);

    CoreChipFieldPartOptions addDelimiter(String delimiter);

    CoreChipFieldPartOptions removeDelimiter(String delimiter);

    boolean hasDelimiter(String delimiter);

    boolean isAllowDuplicates();

    ComponentOption<Boolean> getAllowDuplicatesOption();

    CoreChipFieldPartOptions setAllowDuplicates(Boolean allowDuplicates);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreChipGroupOptions getChipGroupOptions();

    CoreChipFieldPartOptions setChipGroupOptions(CoreChipGroupOptions chipGroupOptions);

    boolean hasChipGroupOptions();

    ComponentCreator<? extends CoreChipGroup, ? extends CoreChipGroupOptions> getChipGroupCreator();

    CoreComponentFactory getComponentFactory();

    CoreChipField getComponent();
}