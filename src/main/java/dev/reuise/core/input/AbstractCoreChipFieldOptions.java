package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextPartOptions;
import dev.reuise.core.text.CoreLabelPartOptions;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreChipFieldOptions<S extends AbstractCoreChipFieldOptions<S>> implements CoreComponentOptions , CoreChipFieldOptions {
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

    protected dev.reuise.core.chip.CoreChipGroupOptions chipGroupOptions;

    protected AbstractCoreChipFieldOptions() {
        chipGroupOptions = createDefaultChipGroupOptions();
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
        setDefaultMultiple(true);
        setDefaultValues(new ArrayList<>());
        setDefaultDelimiters(new ArrayList<>());
        setDefaultAllowDuplicates(false);
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

    @Override
    public boolean isMultiple() {
        return Boolean.TRUE.equals(getOptionValue("multiple"));
    }

    @Override
    public ComponentOption<Boolean> getMultipleOption() {
        return ((ComponentOption<Boolean>) (getOption("multiple")));
    }

    @Override
    public S setMultiple(Boolean multiple) {
        setOption("multiple", multiple, true);
        setLayoutChildrenMultiple(multiple);
        return self();
    }

    protected void setLayoutChildrenMultiple(Boolean multiple) {
    }

    private void setDefaultMultiple(Boolean multiple) {
        setDefaultOption("multiple", multiple, true);
        setLayoutChildrenMultiple(multiple);
    }

    @Override
    public List<String> getValues() {
        return ((List<String>) (getOptionValue("values")));
    }

    @Override
    public ComponentOption<List<String>> getValuesOption() {
        return ((ComponentOption<List<String>>) (getOption("values")));
    }

    @Override
    public S setValues(List<String> values) {
        setOption("values", values);
        return self();
    }

    @Override
    public S addValue(String value) {
        List<String> list = getValues();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setValues(list);
        }
        list.add(value);
        return self();
    }

    @Override
    public S removeValue(String value) {
        List<String> list = getValues();
        if (list == null) {
            return self();
        }
        list.remove(value);
        return self();
    }

    @Override
    public boolean hasValue(String value) {
        List<String> list = getValues();
        if (list == null) {
            return false;
        }
        return list.contains(value);
    }

    private void setDefaultValues(List<String> values) {
        setDefaultOption("values", values);
    }

    @Override
    public List<String> getDelimiters() {
        return ((List<String>) (getOptionValue("delimiters")));
    }

    @Override
    public ComponentOption<List<String>> getDelimitersOption() {
        return ((ComponentOption<List<String>>) (getOption("delimiters")));
    }

    @Override
    public S setDelimiters(List<String> delimiters) {
        setOption("delimiters", delimiters);
        return self();
    }

    @Override
    public S addDelimiter(String delimiter) {
        List<String> list = getDelimiters();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setDelimiters(list);
        }
        list.add(delimiter);
        return self();
    }

    @Override
    public S removeDelimiter(String delimiter) {
        List<String> list = getDelimiters();
        if (list == null) {
            return self();
        }
        list.remove(delimiter);
        return self();
    }

    @Override
    public boolean hasDelimiter(String delimiter) {
        List<String> list = getDelimiters();
        if (list == null) {
            return false;
        }
        return list.contains(delimiter);
    }

    private void setDefaultDelimiters(List<String> delimiters) {
        setDefaultOption("delimiters", delimiters);
    }

    @Override
    public boolean isAllowDuplicates() {
        return Boolean.TRUE.equals(getOptionValue("allowDuplicates"));
    }

    @Override
    public ComponentOption<Boolean> getAllowDuplicatesOption() {
        return ((ComponentOption<Boolean>) (getOption("allowDuplicates")));
    }

    @Override
    public S setAllowDuplicates(Boolean allowDuplicates) {
        setOption("allowDuplicates", allowDuplicates);
        setLayoutChildrenAllowDuplicates(allowDuplicates);
        return self();
    }

    protected void setLayoutChildrenAllowDuplicates(Boolean allowDuplicates) {
    }

    private void setDefaultAllowDuplicates(Boolean allowDuplicates) {
        setDefaultOption("allowDuplicates", allowDuplicates);
        setLayoutChildrenAllowDuplicates(allowDuplicates);
    }

    @Override
    public dev.reuise.core.chip.CoreChipGroupOptions getChipGroupOptions() {
        return chipGroupOptions;
    }

    @Override
    public boolean hasChipGroupOptions() {
        return chipGroupOptions != null;
    }

    @Override
    public S setChipGroupOptions(dev.reuise.core.chip.CoreChipGroupOptions chipGroupOptions) {
        if (!hasChipGroupOptions())
            this.chipGroupOptions = createDefaultChipGroupOptions();

        // Merge with default options
        this.chipGroupOptions.merge(chipGroupOptions);
        return self();
    }

    protected CoreChipGroupOptions createDefaultChipGroupOptions() {
        CoreChipGroupOptions options = getComponentFactory().createChipGroupOptions();
        options.setHideUnselected(false);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}