package dev.reuise.core.input;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.core.text.CoreLabelOptions;
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
// Required here??
// Error here??
public interface CoreTextFieldPartOptions {
    TextFieldSize getSize();

    ComponentOption<TextFieldSize> getSizeOption();

    CoreTextFieldPartOptions setSize(TextFieldSize size);

    ComponentOption<Boolean> getErrorOption();

    String getSupportingText();

    ComponentOption<String> getSupportingTextOption();

    CoreTextFieldPartOptions setSupportingText(String supportingText);

    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreTextFieldPartOptions setLabel(String label);

    TextFieldLabelPlacement getLabelPlacement();

    ComponentOption<TextFieldLabelPlacement> getLabelPlacementOption();

    CoreTextFieldPartOptions setLabelPlacement(TextFieldLabelPlacement labelPlacement);

    String getValue();

    CoreTextFieldPartOptions setValue(String value);

    String getPlaceholder();

    CoreTextFieldPartOptions setPlaceholder(String placeholder);

    String getPattern();

    CoreTextFieldPartOptions setPattern(String pattern);

    boolean isMultiline();

    CoreTextFieldPartOptions setMultiline(Boolean multiline);

    Integer getMinLines();

    CoreTextFieldPartOptions setMinLines(Integer minLines);

    Integer getMaxLines();

    CoreTextFieldPartOptions setMaxLines(Integer maxLines);

    boolean isReadOnly();

    CoreTextFieldPartOptions setReadOnly(Boolean readOnly);

    String getAutocomplete();

    CoreTextFieldPartOptions setAutocomplete(String autocomplete);

    CoreTextFieldPartOptions setAutocomplete(boolean autocomplete);

    List<InputValidator> getValidators();

    CoreTextFieldPartOptions setValidators(List<InputValidator> validators);

    CoreTextFieldPartOptions addValidator(InputValidator validator);

    CoreTextFieldPartOptions setValidator(InputValidator validator);

    CoreTextFieldPartOptions removeValidator(InputValidator validator);

    List<InputValidator> getValidators(InputValidator.ValidationMode... modes);

    <T extends InputValidator> List<T> getValidators(Class<? extends T> type);

    boolean isRequired();

    CoreTextFieldPartOptions setRequired(Boolean required);

    boolean isError();

    CoreTextFieldPartOptions setError(Boolean error);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreTextFieldPartOptions setError(String message);

    CoreLabelOptions getLabelContainerOptions();

    CoreTextFieldPartOptions setLabelContainerOptions(CoreLabelOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreLabel, ? extends CoreLabelOptions> getLabelContainerCreator();

    CoreContainerOptions getInputContainerOptions();

    CoreTextFieldPartOptions setInputContainerOptions(CoreContainerOptions inputContainerOptions);

    boolean hasInputContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getInputContainerCreator();

    CoreIconOptions getStartIconOptions();

    CoreTextFieldPartOptions setStartIconOptions(CoreIconOptions startIconOptions);

    boolean hasStartIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getStartIconCreator();

    CoreBasicInputFieldOptions getInputOptions();

    CoreTextFieldPartOptions setInputOptions(CoreBasicInputFieldOptions inputOptions);

    boolean hasInputOptions();

    ComponentCreator<? extends CoreBasicInputField, ? extends CoreBasicInputFieldOptions> getInputCreator();

    CoreIconOptions getEndIconOptions();

    CoreTextFieldPartOptions setEndIconOptions(CoreIconOptions endIconOptions);

    boolean hasEndIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getEndIconCreator();

    CoreInlineTextOptions getSupportingTextContainerOptions();

    CoreTextFieldPartOptions setSupportingTextContainerOptions(CoreInlineTextOptions supportingTextContainerOptions);

    boolean hasSupportingTextContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getSupportingTextContainerCreator();

    CoreComponentFactory getComponentFactory();

    CoreTextField getComponent();
}