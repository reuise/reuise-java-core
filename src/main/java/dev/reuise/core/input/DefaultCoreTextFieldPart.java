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
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.core.text.CoreLabelOptions;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.List;
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
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultCoreTextFieldPart<S extends DefaultCoreTextFieldPart<S, O>, O extends CoreTextFieldPartOptions> implements ComponentPart , CoreTextField {
    @Override
    public TextFieldLabelPlacement getLabelPlacement() {
        return null;
    }

    @Override
    public S setLabelPlacement(TextFieldLabelPlacement textFieldLabelPlacement) {
        return self();
    }

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    protected CoreLabel labelContainer;

    protected CoreContainer inputContainer;

    protected CoreIcon startIcon;

    protected CoreBasicInputField input;

    protected CoreIcon endIcon;

    protected CoreInlineText supportingTextContainer;

    protected DefaultCoreTextFieldPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
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
    public RootComponent getRootComponent() {
        return parentComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.parentComponentPart.setRootComponent(rootComponent);
        if (labelContainer != null)
            labelContainer.setRootComponent(rootComponent);

        if (inputContainer != null)
            inputContainer.setRootComponent(rootComponent);

        if (startIcon != null)
            startIcon.setRootComponent(rootComponent);

        if (input != null)
            input.setRootComponent(rootComponent);

        if (endIcon != null)
            endIcon.setRootComponent(rootComponent);

        if (supportingTextContainer != null)
            supportingTextContainer.setRootComponent(rootComponent);

    }

    @Override
    public S add(CoreComponent child) {
        parentComponentPart.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        parentComponentPart.insertBefore(child, beforeChild);
    }

    // Implementation
    @Override
    public S addText(String text) {
        this.input.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        parentComponentPart.remove(child);
    }

    @Override
    public void removeAll() {
        parentComponentPart.removeAll();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return parentComponentPart.getChildren();
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
        return parentComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return parentComponentPart.isInitialized();
    }

    public void log(Object obj) {
        parentComponentPart.log(obj);
    }

    public void removeFromParent() {
        parentComponentPart.removeFromParent();
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
    public CoreTextField getComponent() {
        return ((CoreTextField) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        labelContainer = createLabelContainer(options);
        inputContainer = createInputContainer(options);
        startIcon = createStartIcon(options);
        input = createInput(options);
        endIcon = createEndIcon(options);
        supportingTextContainer = createSupportingTextContainer(options);
        setupReferences();
        return true;
    }

    public CoreLabel getLabelContainer() {
        return labelContainer;
    }

    private boolean needsLabelContainer(O options) {
        if (labelContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreLabel createLabelContainer(O options) {
        if ((labelContainer != null) || (options == null))
            return labelContainer;

        CoreLabelOptions labelContainerOptions = options.getLabelContainerOptions();
        if (labelContainerOptions == null)
            return labelContainer;

        CoreParentComponentPart parent = null;
        if (options.getLabelPlacement() == TextFieldLabelPlacement.INSIDE) {
            parent = createInputContainer(options);
            labelContainerOptions.setParent(inputContainer);
        } else {
            parent = getParentComponentPart();
            labelContainerOptions.setParent(this);
        }
        ComponentCreator labelContainerCreator = options.getLabelContainerCreator();
        labelContainer = (labelContainerCreator != null) ? ((CoreLabel) (labelContainerCreator.create(labelContainerOptions))) : getComponentFactory().createLabel(labelContainerOptions);
        parent.add(labelContainer);
        return labelContainer;
    }

    public CoreContainer getInputContainer() {
        return inputContainer;
    }

    private boolean needsInputContainer(O options) {
        if (inputContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createInputContainer(O options) {
        if ((inputContainer != null) || (options == null))
            return inputContainer;

        CoreContainerOptions inputContainerOptions = options.getInputContainerOptions();
        if (inputContainerOptions == null)
            return inputContainer;

        inputContainerOptions.setParent(this);
        ComponentCreator inputContainerCreator = options.getInputContainerCreator();
        inputContainer = (inputContainerCreator != null) ? ((CoreContainer) (inputContainerCreator.create(inputContainerOptions))) : getComponentFactory().createContainer(inputContainerOptions);
        getParentComponentPart().add(inputContainer);
        return inputContainer;
    }

    public CoreIcon getStartIcon() {
        return startIcon;
    }

    private boolean needsStartIcon(O options) {
        if (startIcon != null)
            return true;

        if (options == null)
            return false;

        return options.hasStartIconOptions();
    }

    private CoreIcon createStartIcon(O options) {
        if ((startIcon != null) || (options == null))
            return startIcon;

        CoreIconOptions startIconOptions = options.getStartIconOptions();
        if (startIconOptions == null)
            return startIcon;

        CoreParentComponentPart parent = (inputContainer != null) ? inputContainer : getParentComponentPart();
        startIconOptions.setParent(inputContainer != null ? inputContainer : this);
        ComponentCreator startIconCreator = options.getStartIconCreator();
        startIcon = (startIconCreator != null) ? ((CoreIcon) (startIconCreator.create(startIconOptions))) : getComponentFactory().createIcon(startIconOptions);
        parent.add(startIcon);
        return startIcon;
    }

    public CoreBasicInputField getInput() {
        return input;
    }

    private boolean needsInput(O options) {
        if (input != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreBasicInputField createInput(O options) {
        if ((input != null) || (options == null))
            return input;

        CoreBasicInputFieldOptions inputOptions = options.getInputOptions();
        if (inputOptions == null)
            return input;

        CoreParentComponentPart parent = (inputContainer != null) ? inputContainer : getParentComponentPart();
        inputOptions.setParent(inputContainer != null ? inputContainer : this);
        ComponentCreator inputCreator = options.getInputCreator();
        input = (inputCreator != null) ? ((CoreBasicInputField) (inputCreator.create(inputOptions))) : getComponentFactory().createBasicInputField(inputOptions);
        parent.add(input);
        return input;
    }

    public CoreIcon getEndIcon() {
        return endIcon;
    }

    private boolean needsEndIcon(O options) {
        if (endIcon != null)
            return true;

        if (options == null)
            return false;

        return options.hasEndIconOptions();
    }

    private CoreIcon createEndIcon(O options) {
        if ((endIcon != null) || (options == null))
            return endIcon;

        CoreIconOptions endIconOptions = options.getEndIconOptions();
        if (endIconOptions == null)
            return endIcon;

        CoreParentComponentPart parent = (inputContainer != null) ? inputContainer : getParentComponentPart();
        endIconOptions.setParent(inputContainer != null ? inputContainer : this);
        ComponentCreator endIconCreator = options.getEndIconCreator();
        endIcon = (endIconCreator != null) ? ((CoreIcon) (endIconCreator.create(endIconOptions))) : getComponentFactory().createIcon(endIconOptions);
        parent.add(endIcon);
        return endIcon;
    }

    public CoreInlineText getSupportingTextContainer() {
        return supportingTextContainer;
    }

    private boolean needsSupportingTextContainer(O options) {
        if (supportingTextContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreInlineText createSupportingTextContainer(O options) {
        if ((supportingTextContainer != null) || (options == null))
            return supportingTextContainer;

        CoreInlineTextOptions supportingTextContainerOptions = options.getSupportingTextContainerOptions();
        if (supportingTextContainerOptions == null)
            return supportingTextContainer;

        supportingTextContainerOptions.setParent(this);
        ComponentCreator supportingTextContainerCreator = options.getSupportingTextContainerCreator();
        supportingTextContainer = (supportingTextContainerCreator != null) ? ((CoreInlineText) (supportingTextContainerCreator.create(supportingTextContainerOptions))) : getComponentFactory().createInlineText(supportingTextContainerOptions);
        getParentComponentPart().add(supportingTextContainer);
        return supportingTextContainer;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        CoreTextFieldPart component = ((CoreTextFieldPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getSizeOption(), component::setSize);
        applicator.add(options.getErrorOption(), component::setError);
        applicator.add(options.getSupportingTextOption(), component::setSupportingText);
        applicator.add(options.getLabelOption(), component::setLabel);
        applicator.add(options.getLabelPlacementOption(), component::setLabelPlacement);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    public S setLabel(String label) {
        if (labelContainer != null)
            labelContainer.setText(label);

        return self();
    }

    public String getLabel() {
        if (labelContainer == null)
            return null;

        return labelContainer.getText();
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

    // Implementation
    @Override
    public S setAutocomplete(boolean autocomplete) {
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

    // Implementation
    @Override
    public S addValidator(InputValidator validator) {
        getInput().addValidator(validator);
        return self();
    }

    @Override
    public S setValidator(InputValidator validator) {
        input.setValidator(validator);
        return self();
    }

    // Implementation
    @Override
    public S removeValidator(InputValidator validator) {
        getInput().removeValidator(validator);
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

    @Override
    public S setRequired(Boolean required) {
        this.input.setRequired(required);
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

    public S setSupportingText(String supportingText) {
        if (supportingTextContainer != null)
            supportingTextContainer.setText(supportingText);

        return self();
    }

    public String getSupportingText() {
        if (supportingTextContainer == null)
            return null;

        return supportingTextContainer.getText();
    }

    protected abstract S self();

    // Implementation
    public boolean validate() {
        List<InputValidator> validators = getValidators(InputValidator.ValidationMode.WHOLE_FIELD, InputValidator.ValidationMode.BOTH);
        if ((validators == null) || validators.isEmpty()) {
            setError(false);
            return true;
        }
        for (InputValidator validator : validators) {
            String errorMessage = validator.validate(getComponent().getValue());
            boolean error = errorMessage != null;
            setError(errorMessage);
            if (error) {
                if (validator.isFocusOnError())
                    setFocused(true);

                return false;
            }
        }
        setError(false);
        return true;
    }

    public void clear() {
    }

    // Implementation
    public boolean hasValue() {
        String value = getValue();
        return (value != null) && (!value.isEmpty());
    }
}