package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabelOptions;
import java.util.List;
public abstract class AbstractCoreTextFieldOptions<S extends AbstractCoreTextFieldOptions<S>> implements CoreComponentOptions , CoreTextFieldOptions {
    @Override
    public S setError(String message) {
        setError(message != null);
        setSupportingText(message);
        return self();
    }

    protected dev.reuise.core.text.CoreLabelOptions labelContainerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions inputContainerOptions;

    protected dev.reuise.core.icon.CoreIconOptions startIconOptions;

    protected dev.reuise.core.input.CoreBasicInputFieldOptions inputOptions;

    protected dev.reuise.core.icon.CoreIconOptions endIconOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions supportingTextContainerOptions;

    protected AbstractCoreTextFieldOptions() {
        labelContainerOptions = createDefaultLabelContainerOptions();
        inputContainerOptions = createDefaultInputContainerOptions();
        inputOptions = createDefaultInputOptions();
        supportingTextContainerOptions = createDefaultSupportingTextContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSize(TextFieldSize.MEDIUM);
        setDefaultLabelPlacement(TextFieldLabelPlacement.OUTSIZE);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getValue() {
        return inputOptions.getValue();
    }

    @Override
    public S setValue(String value) {
        this.inputOptions.setValue(value);
        return self();
    }

    @Override
    public String getPlaceholder() {
        return inputOptions.getPlaceholder();
    }

    @Override
    public S setPlaceholder(String placeholder) {
        this.inputOptions.setPlaceholder(placeholder);
        return self();
    }

    @Override
    public String getPattern() {
        return inputOptions.getPattern();
    }

    @Override
    public S setPattern(String pattern) {
        this.inputOptions.setPattern(pattern);
        return self();
    }

    @Override
    public boolean isMultiline() {
        return inputOptions.isMultiline();
    }

    @Override
    public S setMultiline(Boolean multiline) {
        this.inputOptions.setMultiline(multiline);
        return self();
    }

    @Override
    public Integer getMinLines() {
        return inputOptions.getMinLines();
    }

    @Override
    public S setMinLines(Integer minLines) {
        this.inputOptions.setMinLines(minLines);
        return self();
    }

    @Override
    public Integer getMaxLines() {
        return inputOptions.getMaxLines();
    }

    @Override
    public S setMaxLines(Integer maxLines) {
        this.inputOptions.setMaxLines(maxLines);
        return self();
    }

    @Override
    public boolean isReadOnly() {
        return inputOptions.isReadOnly();
    }

    @Override
    public S setReadOnly(Boolean readOnly) {
        this.inputOptions.setReadOnly(readOnly);
        return self();
    }

    @Override
    public String getAutocomplete() {
        return inputOptions.getAutocomplete();
    }

    @Override
    public S setAutocomplete(String autocomplete) {
        this.inputOptions.setAutocomplete(autocomplete);
        return self();
    }

    // Implementation
    @Override
    public S setAutocomplete(boolean autocomplete) {
        return setAutocomplete(null);
    }

    @Override
    public List<InputValidator> getValidators() {
        return inputOptions.getValidators();
    }

    @Override
    public S setValidators(List<InputValidator> validators) {
        this.inputOptions.setValidators(validators);
        return self();
    }

    @Override
    public S addValidator(InputValidator validator) {
        this.inputOptions.addValidator(validator);
        return self();
    }

    @Override
    public S setValidator(InputValidator validator) {
        inputOptions.setValidator(validator);
        return self();
    }

    @Override
    public S removeValidator(InputValidator validator) {
        inputOptions.removeValidator(validator);
        return self();
    }

    @Override
    public List<InputValidator> getValidators(InputValidator.ValidationMode... modes) {
        return this.inputOptions.getValidators(modes);
    }

    @Override
    public <T extends InputValidator> List<T> getValidators(Class<? extends T> type) {
        return this.inputOptions.getValidators(type);
    }

    @Override
    public boolean isRequired() {
        return inputOptions.isRequired();
    }

    @Override
    public S setRequired(Boolean required) {
        this.inputOptions.setRequired(required);
        return self();
    }

    @Override
    public TextFieldSize getSize() {
        return ((TextFieldSize) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<TextFieldSize> getSizeOption() {
        return ((ComponentOption<TextFieldSize>) (getOption("size")));
    }

    @Override
    public S setSize(TextFieldSize size) {
        setOption("size", size);
        setLayoutChildrenSize(size);
        return self();
    }

    protected void setLayoutChildrenSize(TextFieldSize size) {
    }

    private void setDefaultSize(TextFieldSize size) {
        setDefaultOption("size", size);
        setLayoutChildrenSize(size);
    }

    @Override
    public boolean isError() {
        return Boolean.TRUE.equals(getOptionValue("error"));
    }

    @Override
    public ComponentOption<Boolean> getErrorOption() {
        return ((ComponentOption<Boolean>) (getOption("error")));
    }

    @Override
    public S setError(Boolean error) {
        setOption("error", error);
        setLayoutChildrenError(error);
        return self();
    }

    protected void setLayoutChildrenError(Boolean error) {
        if (inputOptions == null)
            inputOptions = createDefaultInputOptions();

        inputOptions.setError(error);
    }

    private void setDefaultError(Boolean error) {
        setDefaultOption("error", error);
        setLayoutChildrenError(error);
    }

    @Override
    public String getSupportingText() {
        return ((String) (getOptionValue("supportingText")));
    }

    @Override
    public ComponentOption<String> getSupportingTextOption() {
        return ((ComponentOption<String>) (getOption("supportingText")));
    }

    @Override
    public S setSupportingText(String supportingText) {
        setOption("supportingText", supportingText);
        setLayoutChildrenSupportingText(supportingText);
        return self();
    }

    protected void setLayoutChildrenSupportingText(String supportingText) {
        if (supportingTextContainerOptions == null)
            supportingTextContainerOptions = createDefaultSupportingTextContainerOptions();

        supportingTextContainerOptions.setText(supportingText);
    }

    private void setDefaultSupportingText(String supportingText) {
        setDefaultOption("supportingText", supportingText);
        setLayoutChildrenSupportingText(supportingText);
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label);
        setLayoutChildrenLabel(label);
        return self();
    }

    protected void setLayoutChildrenLabel(String label) {
        if (labelContainerOptions == null)
            labelContainerOptions = createDefaultLabelContainerOptions();

        labelContainerOptions.setText(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
        setLayoutChildrenLabel(label);
    }

    @Override
    public TextFieldLabelPlacement getLabelPlacement() {
        return ((TextFieldLabelPlacement) (getOptionValue("labelPlacement")));
    }

    @Override
    public ComponentOption<TextFieldLabelPlacement> getLabelPlacementOption() {
        return ((ComponentOption<TextFieldLabelPlacement>) (getOption("labelPlacement")));
    }

    @Override
    public S setLabelPlacement(TextFieldLabelPlacement labelPlacement) {
        setOption("labelPlacement", labelPlacement);
        setLayoutChildrenLabelPlacement(labelPlacement);
        return self();
    }

    protected void setLayoutChildrenLabelPlacement(TextFieldLabelPlacement labelPlacement) {
    }

    private void setDefaultLabelPlacement(TextFieldLabelPlacement labelPlacement) {
        setDefaultOption("labelPlacement", labelPlacement);
        setLayoutChildrenLabelPlacement(labelPlacement);
    }

    @Override
    public dev.reuise.core.text.CoreLabelOptions getLabelContainerOptions() {
        return labelContainerOptions;
    }

    @Override
    public boolean hasLabelContainerOptions() {
        return labelContainerOptions != null;
    }

    @Override
    public S setLabelContainerOptions(dev.reuise.core.text.CoreLabelOptions labelContainerOptions) {
        if (!hasLabelContainerOptions())
            this.labelContainerOptions = createDefaultLabelContainerOptions();

        // Merge with default options
        this.labelContainerOptions.merge(labelContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getInputContainerOptions() {
        return inputContainerOptions;
    }

    @Override
    public boolean hasInputContainerOptions() {
        return inputContainerOptions != null;
    }

    @Override
    public S setInputContainerOptions(dev.reuise.core.layout.CoreContainerOptions inputContainerOptions) {
        if (!hasInputContainerOptions())
            this.inputContainerOptions = createDefaultInputContainerOptions();

        // Merge with default options
        this.inputContainerOptions.merge(inputContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getStartIconOptions() {
        return startIconOptions;
    }

    @Override
    public boolean hasStartIconOptions() {
        return startIconOptions != null;
    }

    @Override
    public S setStartIconOptions(dev.reuise.core.icon.CoreIconOptions startIconOptions) {
        if (!hasStartIconOptions())
            this.startIconOptions = createDefaultStartIconOptions();

        // Merge with default options
        this.startIconOptions.merge(startIconOptions);
        return self();
    }

    @Override
    public dev.reuise.core.input.CoreBasicInputFieldOptions getInputOptions() {
        return inputOptions;
    }

    @Override
    public boolean hasInputOptions() {
        return inputOptions != null;
    }

    @Override
    public S setInputOptions(dev.reuise.core.input.CoreBasicInputFieldOptions inputOptions) {
        if (!hasInputOptions())
            this.inputOptions = createDefaultInputOptions();

        // Merge with default options
        this.inputOptions.merge(inputOptions);
        return self();
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getEndIconOptions() {
        return endIconOptions;
    }

    @Override
    public boolean hasEndIconOptions() {
        return endIconOptions != null;
    }

    @Override
    public S setEndIconOptions(dev.reuise.core.icon.CoreIconOptions endIconOptions) {
        if (!hasEndIconOptions())
            this.endIconOptions = createDefaultEndIconOptions();

        // Merge with default options
        this.endIconOptions.merge(endIconOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getSupportingTextContainerOptions() {
        return supportingTextContainerOptions;
    }

    @Override
    public boolean hasSupportingTextContainerOptions() {
        return supportingTextContainerOptions != null;
    }

    @Override
    public S setSupportingTextContainerOptions(dev.reuise.core.text.CoreInlineTextOptions supportingTextContainerOptions) {
        if (!hasSupportingTextContainerOptions())
            this.supportingTextContainerOptions = createDefaultSupportingTextContainerOptions();

        // Merge with default options
        this.supportingTextContainerOptions.merge(supportingTextContainerOptions);
        return self();
    }

    protected CoreLabelOptions createDefaultLabelContainerOptions() {
        CoreLabelOptions options = getComponentFactory().createLabelOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultInputContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreIconOptions createDefaultStartIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreBasicInputFieldOptions createDefaultInputOptions() {
        CoreBasicInputFieldOptions options = getComponentFactory().createBasicInputFieldOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreIconOptions createDefaultEndIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreInlineTextOptions createDefaultSupportingTextContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}