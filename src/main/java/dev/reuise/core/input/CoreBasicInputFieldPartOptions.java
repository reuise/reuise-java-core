package dev.reuise.core.input;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
// GETTER OVERLAOD HERE
// GETTER OVERLAOD HERE
public interface CoreBasicInputFieldPartOptions {
    String getValue();

    ComponentOption<String> getValueOption();

    CoreBasicInputFieldPartOptions setValue(String value);

    String getPlaceholder();

    ComponentOption<String> getPlaceholderOption();

    CoreBasicInputFieldPartOptions setPlaceholder(String placeholder);

    String getPattern();

    ComponentOption<String> getPatternOption();

    CoreBasicInputFieldPartOptions setPattern(String pattern);

    boolean isMultiline();

    ComponentOption<Boolean> getMultilineOption();

    CoreBasicInputFieldPartOptions setMultiline(Boolean multiline);

    Integer getMinLines();

    ComponentOption<Integer> getMinLinesOption();

    CoreBasicInputFieldPartOptions setMinLines(Integer minLines);

    Integer getMaxLines();

    ComponentOption<Integer> getMaxLinesOption();

    CoreBasicInputFieldPartOptions setMaxLines(Integer maxLines);

    boolean isReadOnly();

    ComponentOption<Boolean> getReadOnlyOption();

    CoreBasicInputFieldPartOptions setReadOnly(Boolean readOnly);

    String getAutocomplete();

    ComponentOption<String> getAutocompleteOption();

    CoreBasicInputFieldPartOptions setAutocomplete(String autocomplete);

    List<InputValidator> getValidators();

    ComponentOption<List<InputValidator>> getValidatorsOption();

    CoreBasicInputFieldPartOptions setValidators(List<InputValidator> validators);

    CoreBasicInputFieldPartOptions addValidator(InputValidator validator);

    CoreBasicInputFieldPartOptions setValidator(InputValidator validator);

    CoreBasicInputFieldPartOptions removeValidator(InputValidator validator);

    boolean isRequired();

    ComponentOption<Boolean> getRequiredOption();

    CoreBasicInputFieldPartOptions setRequired(Boolean required);

    boolean isError();

    ComponentOption<Boolean> getErrorOption();

    CoreBasicInputFieldPartOptions setError(Boolean error);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreBasicInputFieldPartOptions setAutocomplete(boolean autocomplete);

    List<InputValidator> getValidators(InputValidator.ValidationMode... modes);

    <T extends InputValidator> List<T> getValidators(Class<? extends T> type);

    CoreComponentFactory getComponentFactory();

    CoreBasicInputField getComponent();
}