package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public abstract class AbstractCoreBasicInputFieldOptions<S extends AbstractCoreBasicInputFieldOptions<S>> implements CoreComponentOptions , CoreBasicInputFieldOptions {
    @Override
    public S setAutocomplete(boolean autocomplete) {
        return setAutocomplete(null);
    }

    @Override
    public List<InputValidator> getValidators(InputValidator.ValidationMode... modes) {
        return getValidators().stream().filter(v -> v.isMode(modes)).collect(Collectors.toList());
    }

    @Override
    public <T extends InputValidator> List<T> getValidators(Class<? extends T> type) {
        return getValidators().stream().filter(validator -> type == validator.getClass()).map(validator -> ((T) (validator))).collect(Collectors.toList());
    }

    protected AbstractCoreBasicInputFieldOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultMultiline(false);
        setValidators(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getValue() {
        return ((String) (getOptionValue("value")));
    }

    @Override
    public ComponentOption<String> getValueOption() {
        return ((ComponentOption<String>) (getOption("value")));
    }

    @Override
    public S setValue(String value) {
        setOption("value", value);
        return self();
    }

    private void setDefaultValue(String value) {
        setDefaultOption("value", value);
    }

    @Override
    public String getPlaceholder() {
        return ((String) (getOptionValue("placeholder")));
    }

    @Override
    public ComponentOption<String> getPlaceholderOption() {
        return ((ComponentOption<String>) (getOption("placeholder")));
    }

    @Override
    public S setPlaceholder(String placeholder) {
        setOption("placeholder", placeholder);
        return self();
    }

    private void setDefaultPlaceholder(String placeholder) {
        setDefaultOption("placeholder", placeholder);
    }

    @Override
    public String getPattern() {
        return ((String) (getOptionValue("pattern")));
    }

    @Override
    public ComponentOption<String> getPatternOption() {
        return ((ComponentOption<String>) (getOption("pattern")));
    }

    @Override
    public S setPattern(String pattern) {
        setOption("pattern", pattern);
        return self();
    }

    private void setDefaultPattern(String pattern) {
        setDefaultOption("pattern", pattern);
    }

    @Override
    public boolean isMultiline() {
        return Boolean.TRUE.equals(getOptionValue("multiline"));
    }

    @Override
    public ComponentOption<Boolean> getMultilineOption() {
        return ((ComponentOption<Boolean>) (getOption("multiline")));
    }

    @Override
    public S setMultiline(Boolean multiline) {
        setOption("multiline", multiline);
        return self();
    }

    private void setDefaultMultiline(Boolean multiline) {
        setDefaultOption("multiline", multiline);
    }

    @Override
    public Integer getMinLines() {
        return ((Integer) (getOptionValue("minLines")));
    }

    @Override
    public ComponentOption<Integer> getMinLinesOption() {
        return ((ComponentOption<Integer>) (getOption("minLines")));
    }

    @Override
    public S setMinLines(Integer minLines) {
        setOption("minLines", minLines);
        return self();
    }

    private void setDefaultMinLines(Integer minLines) {
        setDefaultOption("minLines", minLines);
    }

    @Override
    public Integer getMaxLines() {
        return ((Integer) (getOptionValue("maxLines")));
    }

    @Override
    public ComponentOption<Integer> getMaxLinesOption() {
        return ((ComponentOption<Integer>) (getOption("maxLines")));
    }

    @Override
    public S setMaxLines(Integer maxLines) {
        setOption("maxLines", maxLines, true);
        return self();
    }

    private void setDefaultMaxLines(Integer maxLines) {
        setDefaultOption("maxLines", maxLines, true);
    }

    @Override
    public boolean isReadOnly() {
        return Boolean.TRUE.equals(getOptionValue("readOnly"));
    }

    @Override
    public ComponentOption<Boolean> getReadOnlyOption() {
        return ((ComponentOption<Boolean>) (getOption("readOnly")));
    }

    @Override
    public S setReadOnly(Boolean readOnly) {
        setOption("readOnly", readOnly);
        return self();
    }

    private void setDefaultReadOnly(Boolean readOnly) {
        setDefaultOption("readOnly", readOnly);
    }

    @Override
    public String getAutocomplete() {
        return ((String) (getOptionValue("autocomplete")));
    }

    @Override
    public ComponentOption<String> getAutocompleteOption() {
        return ((ComponentOption<String>) (getOption("autocomplete")));
    }

    @Override
    public S setAutocomplete(String autocomplete) {
        setOption("autocomplete", autocomplete);
        return self();
    }

    private void setDefaultAutocomplete(String autocomplete) {
        setDefaultOption("autocomplete", autocomplete);
    }

    @Override
    public List<InputValidator> getValidators() {
        return ((List<InputValidator>) (getOptionValue("validators")));
    }

    @Override
    public ComponentOption<List<InputValidator>> getValidatorsOption() {
        return ((ComponentOption<List<InputValidator>>) (getOption("validators")));
    }

    @Override
    public S setValidators(List<InputValidator> validators) {
        setOption("validators", validators, true);
        return self();
    }

    @Override
    public S addValidator(InputValidator validator) {
        List<InputValidator> list = getValidators();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setValidators(list);
        }
        list.add(validator);
        return self();
    }

    @Override
    public S setValidator(InputValidator validator) {
        setValidators(new ArrayList<InputValidator>(Arrays.asList(validator)));
        return self();
    }

    @Override
    public S removeValidator(InputValidator validator) {
        List<InputValidator> list = getValidators();
        if (list == null) {
            return self();
        }
        list.remove(validator);
        return self();
    }

    private void setDefaultValidators(List<InputValidator> validators) {
        setDefaultOption("validators", validators, true);
    }

    @Override
    public boolean isRequired() {
        return Boolean.TRUE.equals(getOptionValue("required"));
    }

    @Override
    public ComponentOption<Boolean> getRequiredOption() {
        return ((ComponentOption<Boolean>) (getOption("required")));
    }

    // Implementation
    @Override
    public S setRequired(Boolean required) {
        setOption("required", required);
        List<RequiredInputValidator> requiredValidators = getValidators(RequiredInputValidator.class);
        if (Boolean.TRUE.equals(required) && requiredValidators.isEmpty())
            addValidator(new RequiredInputValidator());
        else if (Boolean.FALSE.equals(required) && (!requiredValidators.isEmpty()))
            requiredValidators.forEach(this::removeValidator);

        return self();
    }

    private void setDefaultRequired(Boolean required) {
        setDefaultOption("required", required);
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
        return self();
    }

    private void setDefaultError(Boolean error) {
        setDefaultOption("error", error);
    }

    protected abstract S self();
}