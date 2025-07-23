package dev.reuise.core.input;
import java.util.List;
// GETTER OVERLAOD HERE
// GETTER OVERLAOD HERE
public interface CoreBasicInputFieldFeatures {
    String getValue();

    CoreBasicInputFieldFeatures setValue(String value);

    String getPlaceholder();

    CoreBasicInputFieldFeatures setPlaceholder(String placeholder);

    String getPattern();

    CoreBasicInputFieldFeatures setPattern(String pattern);

    boolean isMultiline();

    CoreBasicInputFieldFeatures setMultiline(Boolean multiline);

    Integer getMinLines();

    CoreBasicInputFieldFeatures setMinLines(Integer minLines);

    Integer getMaxLines();

    CoreBasicInputFieldFeatures setMaxLines(Integer maxLines);

    boolean isReadOnly();

    CoreBasicInputFieldFeatures setReadOnly(Boolean readOnly);

    String getAutocomplete();

    CoreBasicInputFieldFeatures setAutocomplete(String autocomplete);

    List<InputValidator> getValidators();

    CoreBasicInputFieldFeatures setValidators(List<InputValidator> validators);

    CoreBasicInputFieldFeatures addValidator(InputValidator validator);

    CoreBasicInputFieldFeatures setValidator(InputValidator validator);

    CoreBasicInputFieldFeatures removeValidator(InputValidator validator);

    boolean isRequired();

    CoreBasicInputFieldFeatures setRequired(Boolean required);

    boolean isError();

    CoreBasicInputFieldFeatures setError(Boolean error);

    CoreBasicInputFieldFeatures setAutocomplete(boolean autocomplete);

    List<InputValidator> getValidators(InputValidator.ValidationMode... modes);

    <T extends InputValidator> List<T> getValidators(Class<? extends T> type);
}