package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreLabel;
import java.util.List;
// Value here??
// Placeholder here??
// Pattern here??
// Multiline here??
// MinLines here??
// MaxLines here??
// ReadOnly here??
// Autocomplete here??
// Validators here??
// GETTER OVERLAOD HERE
// GETTER OVERLAOD HERE
// Required here??
// Error here??
public interface CoreTextFieldPart extends ComponentPart , CoreTextFieldFeatures , CoreParentComponentPart {
    String getValue();

    CoreTextFieldPart setValue(String value);

    String getPlaceholder();

    CoreTextFieldPart setPlaceholder(String placeholder);

    String getPattern();

    CoreTextFieldPart setPattern(String pattern);

    boolean isMultiline();

    CoreTextFieldPart setMultiline(Boolean multiline);

    Integer getMinLines();

    CoreTextFieldPart setMinLines(Integer minLines);

    Integer getMaxLines();

    CoreTextFieldPart setMaxLines(Integer maxLines);

    boolean isReadOnly();

    CoreTextFieldPart setReadOnly(Boolean readOnly);

    String getAutocomplete();

    CoreTextFieldPart setAutocomplete(String autocomplete);

    CoreTextFieldPart setAutocomplete(boolean autocomplete);

    List<InputValidator> getValidators();

    CoreTextFieldPart setValidators(List<InputValidator> validators);

    CoreTextFieldPart addValidator(InputValidator validator);

    CoreTextFieldPart setValidator(InputValidator validator);

    CoreTextFieldPart removeValidator(InputValidator validator);

    List<InputValidator> getValidators(InputValidator.ValidationMode... modes);

    <T extends InputValidator> List<T> getValidators(Class<? extends T> type);

    boolean isRequired();

    CoreTextFieldPart setRequired(Boolean required);

    boolean isError();

    CoreTextFieldPart setError(Boolean error);

    boolean validate();

    void clear();

    boolean hasValue();

    CoreLabel getLabelContainer();

    CoreContainer getInputContainer();

    CoreIcon getStartIcon();

    CoreBasicInputField getInput();

    CoreIcon getEndIcon();

    CoreInlineText getSupportingTextContainer();

    CoreParentComponentPart getParentComponentPart();
}