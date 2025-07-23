package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.chip.CoreChipGroup;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.List;
// Option: Multiple - CORE
// Option: Values - CORE
// Option: Delimiters - CORE
// Option: AllowDuplicates - CORE
// Option: Size - CORE
// Option: SupportingText - CORE
// Option: Label - CORE
// Option: LabelPlacement - CORE
// Option: Children - CORE
// Option: Mounted - CORE
// Option: Margin - CORE
// Option: MarginTop - CORE
// Option: MarginRight - CORE
// Option: MarginBottom - CORE
// Option: MarginLeft - CORE
// Option: Width - CORE
// Option: MinWidth - CORE
// Option: MaxWidth - CORE
// Option: Height - CORE
// Option: MinHeight - CORE
// Option: MaxHeight - CORE
// Option: RequiredLayoutComponent - CORE
// Option: Parent - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: chipField
// base comp: textField
// add composition for textField: validate
// add composition for textField: clear
// add composition for textField: hasValue
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultCoreMultiEmailAddressFieldPart<S extends DefaultCoreMultiEmailAddressFieldPart<S, O>, O extends CoreMultiEmailAddressFieldPartOptions> implements ComponentPart , CoreMultiEmailAddressField {
    private CoreChipFieldPart chipFieldPart;

    private CoreTextFieldPart textFieldPart;

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    private CoreChipGroup chipGroup;

    private CoreLabel labelContainer;

    private CoreContainer inputContainer;

    private CoreIcon startIcon;

    private CoreBasicInputField input;

    private CoreIcon endIcon;

    private CoreInlineText supportingTextContainer;

    protected DefaultCoreMultiEmailAddressFieldPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        chipFieldPart = getChipFieldPart();
        textFieldPart = getTextFieldPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
        chipGroup = getChipGroup();
        labelContainer = getLabelContainer();
        inputContainer = getInputContainer();
        startIcon = getStartIcon();
        input = getInput();
        endIcon = getEndIcon();
        supportingTextContainer = getSupportingTextContainer();
    }

    @Override
    public boolean isMultiple() {
        return chipFieldPart.isMultiple();
    }

    @Override
    public S setMultiple(Boolean multiple) {
        this.chipFieldPart.setMultiple(multiple);
        return self();
    }

    @Override
    public List<String> getValues() {
        return chipFieldPart.getValues();
    }

    @Override
    public S setValues(List<String> values) {
        this.chipFieldPart.setValues(values);
        return self();
    }

    @Override
    public S addValue(String value) {
        this.chipFieldPart.addValue(value);
        return self();
    }

    @Override
    public S removeValue(String value) {
        chipFieldPart.removeValue(value);
        return self();
    }

    @Override
    public boolean hasValue(String value) {
        return chipFieldPart.hasValue(value);
    }

    @Override
    public List<String> getDelimiters() {
        return chipFieldPart.getDelimiters();
    }

    @Override
    public S setDelimiters(List<String> delimiters) {
        this.chipFieldPart.setDelimiters(delimiters);
        return self();
    }

    @Override
    public S addDelimiter(String delimiter) {
        this.chipFieldPart.addDelimiter(delimiter);
        return self();
    }

    @Override
    public S removeDelimiter(String delimiter) {
        chipFieldPart.removeDelimiter(delimiter);
        return self();
    }

    @Override
    public boolean hasDelimiter(String delimiter) {
        return chipFieldPart.hasDelimiter(delimiter);
    }

    @Override
    public boolean isAllowDuplicates() {
        return chipFieldPart.isAllowDuplicates();
    }

    @Override
    public S setAllowDuplicates(Boolean allowDuplicates) {
        this.chipFieldPart.setAllowDuplicates(allowDuplicates);
        return self();
    }

    @Override
    public RootComponent getRootComponent() {
        return chipFieldPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.chipFieldPart.setRootComponent(rootComponent);
    }

    @Override
    public S add(CoreComponent child) {
        chipFieldPart.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        chipFieldPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        chipFieldPart.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        chipFieldPart.remove(child);
    }

    @Override
    public void removeAll() {
        chipFieldPart.removeAll();
    }

    @Override
    public TextFieldSize getSize() {
        return textFieldPart.getSize();
    }

    @Override
    public S setSize(TextFieldSize size) {
        this.textFieldPart.setSize(size);
        return self();
    }

    @Override
    public String getSupportingText() {
        return textFieldPart.getSupportingText();
    }

    @Override
    public S setSupportingText(String supportingText) {
        this.textFieldPart.setSupportingText(supportingText);
        return self();
    }

    @Override
    public String getLabel() {
        return textFieldPart.getLabel();
    }

    @Override
    public S setLabel(String label) {
        this.textFieldPart.setLabel(label);
        return self();
    }

    @Override
    public TextFieldLabelPlacement getLabelPlacement() {
        return textFieldPart.getLabelPlacement();
    }

    @Override
    public S setLabelPlacement(TextFieldLabelPlacement labelPlacement) {
        this.textFieldPart.setLabelPlacement(labelPlacement);
        return self();
    }

    @Override
    public S setError(String message) {
        this.textFieldPart.setError(message);
        return self();
    }

    public boolean validate() {
        return chipFieldPart.validate();
    }

    // Implementation
    public void clear() {
        getChipFieldPart().clear();
    }

    public boolean hasValue() {
        return chipFieldPart.hasValue();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return parentComponentPart.getChildren();
    }

    @Override
    public S setChildren(List<CoreComponent> children) {
        this.parentComponentPart.setChildren(children);
        return self();
    }

    @Override
    public S setChild(CoreComponent child) {
        parentComponentPart.setChild(child);
        return self();
    }

    @Override
    public S removeChild(CoreComponent child) {
        parentComponentPart.removeChild(child);
        return self();
    }

    @Override
    public boolean isMounted() {
        return baseComponentPart.isMounted();
    }

    @Override
    public S setMounted(Boolean mounted) {
        this.baseComponentPart.setMounted(mounted);
        return self();
    }

    @Override
    public Object getMargin() {
        return baseComponentPart.getMargin();
    }

    @Override
    public S setMargin(Object margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(Object margin, State state) {
        this.baseComponentPart.setMargin(margin, state);
        return self();
    }

    @Override
    public S setMarginAllStates(Object margin) {
        setMargin(ScreenSizeValues.of(margin, margin));
        setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(ScreenSizeValues<Object> margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public Object getMargin(State state) {
        return baseComponentPart.getMargin(state);
    }

    @Override
    public Object getMarginTop() {
        return baseComponentPart.getMarginTop();
    }

    @Override
    public S setMarginTop(Object marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(Object marginTop, State state) {
        this.baseComponentPart.setMarginTop(marginTop, state);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        setMarginTop(ScreenSizeValues.of(marginTop, marginTop));
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(ScreenSizeValues<Object> marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public Object getMarginTop(State state) {
        return baseComponentPart.getMarginTop(state);
    }

    @Override
    public Object getMarginRight() {
        return baseComponentPart.getMarginRight();
    }

    @Override
    public S setMarginRight(Object marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(Object marginRight, State state) {
        this.baseComponentPart.setMarginRight(marginRight, state);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        setMarginRight(ScreenSizeValues.of(marginRight, marginRight));
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(ScreenSizeValues<Object> marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public Object getMarginRight(State state) {
        return baseComponentPart.getMarginRight(state);
    }

    @Override
    public Object getMarginBottom() {
        return baseComponentPart.getMarginBottom();
    }

    @Override
    public S setMarginBottom(Object marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(Object marginBottom, State state) {
        this.baseComponentPart.setMarginBottom(marginBottom, state);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        setMarginBottom(ScreenSizeValues.of(marginBottom, marginBottom));
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(ScreenSizeValues<Object> marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public Object getMarginBottom(State state) {
        return baseComponentPart.getMarginBottom(state);
    }

    @Override
    public Object getMarginLeft() {
        return baseComponentPart.getMarginLeft();
    }

    @Override
    public S setMarginLeft(Object marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(Object marginLeft, State state) {
        this.baseComponentPart.setMarginLeft(marginLeft, state);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        setMarginLeft(ScreenSizeValues.of(marginLeft, marginLeft));
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(ScreenSizeValues<Object> marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public Object getMarginLeft(State state) {
        return baseComponentPart.getMarginLeft(state);
    }

    @Override
    public Object getWidth() {
        return baseComponentPart.getWidth();
    }

    @Override
    public S setWidth(Object width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public S setWidth(Object width, State state) {
        this.baseComponentPart.setWidth(width, state);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        setWidth(ScreenSizeValues.of(width, width));
        setWidth(width);
        return self();
    }

    @Override
    public S setWidth(ScreenSizeValues<Object> width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public Object getWidth(State state) {
        return baseComponentPart.getWidth(state);
    }

    @Override
    public Object getMinWidth() {
        return baseComponentPart.getMinWidth();
    }

    @Override
    public S setMinWidth(Object minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(Object minWidth, State state) {
        this.baseComponentPart.setMinWidth(minWidth, state);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        setMinWidth(ScreenSizeValues.of(minWidth, minWidth));
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(ScreenSizeValues<Object> minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public Object getMinWidth(State state) {
        return baseComponentPart.getMinWidth(state);
    }

    @Override
    public Object getMaxWidth() {
        return baseComponentPart.getMaxWidth();
    }

    @Override
    public S setMaxWidth(Object maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(Object maxWidth, State state) {
        this.baseComponentPart.setMaxWidth(maxWidth, state);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        setMaxWidth(ScreenSizeValues.of(maxWidth, maxWidth));
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(ScreenSizeValues<Object> maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public Object getMaxWidth(State state) {
        return baseComponentPart.getMaxWidth(state);
    }

    @Override
    public Object getHeight() {
        return baseComponentPart.getHeight();
    }

    @Override
    public S setHeight(Object height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public S setHeight(Object height, State state) {
        this.baseComponentPart.setHeight(height, state);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        setHeight(ScreenSizeValues.of(height, height));
        setHeight(height);
        return self();
    }

    @Override
    public S setHeight(ScreenSizeValues<Object> height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public Object getHeight(State state) {
        return baseComponentPart.getHeight(state);
    }

    @Override
    public Object getMinHeight() {
        return baseComponentPart.getMinHeight();
    }

    @Override
    public S setMinHeight(Object minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(Object minHeight, State state) {
        this.baseComponentPart.setMinHeight(minHeight, state);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        setMinHeight(ScreenSizeValues.of(minHeight, minHeight));
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(ScreenSizeValues<Object> minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public Object getMinHeight(State state) {
        return baseComponentPart.getMinHeight(state);
    }

    @Override
    public Object getMaxHeight() {
        return baseComponentPart.getMaxHeight();
    }

    @Override
    public S setMaxHeight(Object maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(Object maxHeight, State state) {
        this.baseComponentPart.setMaxHeight(maxHeight, state);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        setMaxHeight(ScreenSizeValues.of(maxHeight, maxHeight));
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(ScreenSizeValues<Object> maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public Object getMaxHeight(State state) {
        return baseComponentPart.getMaxHeight(state);
    }

    @Override
    public boolean isRequiredLayoutComponent() {
        return baseComponentPart.isRequiredLayoutComponent();
    }

    @Override
    public S setRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        this.baseComponentPart.setRequiredLayoutComponent(requiredLayoutComponent);
        return self();
    }

    @Override
    public CoreComponent getParent() {
        return baseComponentPart.getParent();
    }

    @Override
    public S setParent(CoreComponent parent) {
        this.baseComponentPart.setParent(parent);
        return self();
    }

    @Override
    public CoreParentComponent getWrapper() {
        return baseComponentPart.getWrapper();
    }

    @Override
    public S setWrapper(CoreParentComponent wrapper) {
        this.baseComponentPart.setWrapper(wrapper);
        return self();
    }

    @Override
    public Theme getTheme() {
        return baseComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.baseComponentPart.setTheme(theme);
        return self();
    }

    @Override
    public boolean isVisible() {
        return baseComponentPart.isVisible();
    }

    @Override
    public S setVisible(Boolean visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(Boolean visible, State state) {
        this.baseComponentPart.setVisible(visible, state);
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(ScreenSizeValues<Boolean> visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public boolean isVisible(State state) {
        return baseComponentPart.isVisible(state);
    }

    @Override
    public boolean isEnabled() {
        return baseComponentPart.isEnabled();
    }

    @Override
    public S setEnabled(Boolean enabled) {
        this.baseComponentPart.setEnabled(enabled);
        return self();
    }

    @Override
    public boolean isFocused() {
        return baseComponentPart.isFocused();
    }

    @Override
    public S setFocused(Boolean focused) {
        this.baseComponentPart.setFocused(focused);
        return self();
    }

    @Override
    public boolean isDebug() {
        return baseComponentPart.isDebug();
    }

    @Override
    public S setDebug(Boolean debug) {
        this.baseComponentPart.setDebug(debug);
        return self();
    }

    @Override
    public String getDebugId() {
        return baseComponentPart.getDebugId();
    }

    @Override
    public S setDebugId(String debugId) {
        this.baseComponentPart.setDebugId(debugId);
        return self();
    }

    public boolean hasWrapper() {
        return chipFieldPart.hasWrapper();
    }

    public boolean isInitialized() {
        return chipFieldPart.isInitialized();
    }

    public void log(Object obj) {
        chipFieldPart.log(obj);
    }

    public void removeFromParent() {
        chipFieldPart.removeFromParent();
    }

    @Override
    public CoreComponentFactory getComponentFactory() {
        return ((CoreComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    @Override
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        baseComponentPart.addPart(type, part);
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        baseComponentPart.initialize(component, options);
    }

    @Override
    public CoreMultiEmailAddressField getComponent() {
        return ((CoreMultiEmailAddressField) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        setupReferences();
        return true;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        chipFieldPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public String getValue() {
        return input.getValue();
    }

    @Override
    public S setValue(String value) {
        this.input.setValue(value);
        return self();
    }

    @Override
    public String getPlaceholder() {
        return input.getPlaceholder();
    }

    @Override
    public S setPlaceholder(String placeholder) {
        this.input.setPlaceholder(placeholder);
        return self();
    }

    @Override
    public String getPattern() {
        return input.getPattern();
    }

    @Override
    public S setPattern(String pattern) {
        this.input.setPattern(pattern);
        return self();
    }

    @Override
    public boolean isMultiline() {
        return input.isMultiline();
    }

    @Override
    public S setMultiline(Boolean multiline) {
        this.input.setMultiline(multiline);
        return self();
    }

    @Override
    public Integer getMinLines() {
        return input.getMinLines();
    }

    @Override
    public S setMinLines(Integer minLines) {
        this.input.setMinLines(minLines);
        return self();
    }

    @Override
    public Integer getMaxLines() {
        return input.getMaxLines();
    }

    @Override
    public S setMaxLines(Integer maxLines) {
        this.input.setMaxLines(maxLines);
        return self();
    }

    @Override
    public boolean isReadOnly() {
        return input.isReadOnly();
    }

    @Override
    public S setReadOnly(Boolean readOnly) {
        this.input.setReadOnly(readOnly);
        return self();
    }

    @Override
    public String getAutocomplete() {
        return input.getAutocomplete();
    }

    @Override
    public S setAutocomplete(String autocomplete) {
        this.input.setAutocomplete(autocomplete);
        return self();
    }

    @Override
    public S setAutocomplete(boolean autocomplete) {
        this.input.setAutocomplete(autocomplete);
        return self();
    }

    @Override
    public List<InputValidator> getValidators() {
        return input.getValidators();
    }

    @Override
    public S setValidators(List<InputValidator> validators) {
        this.input.setValidators(validators);
        return self();
    }

    @Override
    public S addValidator(InputValidator validator) {
        this.input.addValidator(validator);
        return self();
    }

    @Override
    public S setValidator(InputValidator validator) {
        input.setValidator(validator);
        return self();
    }

    @Override
    public S removeValidator(InputValidator validator) {
        input.removeValidator(validator);
        return self();
    }

    @Override
    public List<InputValidator> getValidators(InputValidator.ValidationMode... modes) {
        return this.input.getValidators(modes);
    }

    @Override
    public <T extends InputValidator> List<T> getValidators(Class<? extends T> type) {
        return this.input.getValidators(type);
    }

    @Override
    public boolean isRequired() {
        return input.isRequired();
    }

    // Implementation
    @Override
    public S setRequired(Boolean required) {
        getTextFieldPart().setRequired(required);
        getValidators(RequiredInputValidator.class).forEach(v -> {
            v.setMode(InputValidator.ValidationMode.BOTH);
            v.setErrorMessage("Email address is required");
        });
        return self();
    }

    @Override
    public boolean isError() {
        return input.isError();
    }

    @Override
    public S setError(Boolean error) {
        this.input.setError(error);
        return self();
    }

    protected abstract S self();
}