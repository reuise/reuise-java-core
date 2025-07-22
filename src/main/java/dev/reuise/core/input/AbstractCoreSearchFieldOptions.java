package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.text.CoreInlineTextPartOptions;
import dev.reuise.core.text.CoreLabelPartOptions;
import java.util.List;
public abstract class AbstractCoreSearchFieldOptions<S extends AbstractCoreSearchFieldOptions<S>> implements CoreSearchFieldOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreLabelPartOptions labelContainerOptions;

    // Indirect layout child
    private CoreContainerPartOptions inputContainerOptions;

    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreBasicInputFieldPartOptions inputOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    // Indirect layout child
    private CoreInlineTextPartOptions supportingTextContainerOptions;

    protected AbstractCoreSearchFieldOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        labelContainerOptions = getLabelContainerOptions();
        inputContainerOptions = getInputContainerOptions();
        startIconOptions = getStartIconOptions();
        inputOptions = getInputOptions();
        endIconOptions = getEndIconOptions();
        supportingTextContainerOptions = getSupportingTextContainerOptions();
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

    @Override
    public S setAutocomplete(boolean autocomplete) {
        this.inputOptions.setAutocomplete(autocomplete);
        return self();
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
    public boolean isError() {
        return inputOptions.isError();
    }

    @Override
    public S setError(Boolean error) {
        this.inputOptions.setError(error);
        return self();
    }

    protected abstract S self();
}