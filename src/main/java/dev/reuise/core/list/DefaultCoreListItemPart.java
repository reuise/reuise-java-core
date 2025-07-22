package dev.reuise.core.list;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkPart;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.List;
// Option: Url - CORE
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
// base comp: basicListItem
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultCoreListItemPart<S extends DefaultCoreListItemPart<S, O>, O extends CoreListItemPartOptions> implements ComponentPart , CoreListItem {
    @Override
    public S setToggleCheckboxOnClick(Boolean toggleCheckboxOnClick) {
        return self();
    }

    @Override
    public boolean isToggleCheckboxOnClick() {
        return false;
    }

    private CoreBasicListItemPart basicListItemPart;

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    private CoreLink link;

    protected CoreCheckbox checkbox;

    protected CoreIcon startIcon;

    protected CoreContainer textContainer;

    protected CoreInlineText labelContainer;

    protected CoreInlineText secondaryLabelContainer;

    protected CoreIcon endIcon;

    protected Boolean hasCheckbox;

    protected DefaultCoreListItemPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        basicListItemPart = getBasicListItemPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
        link = getLink();
    }

    @Override
    public String getUrl() {
        return basicListItemPart.getUrl();
    }

    @Override
    public S setUrl(String url) {
        this.basicListItemPart.setUrl(url);
        return self();
    }

    @Override
    public RootComponent getRootComponent() {
        return basicListItemPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.basicListItemPart.setRootComponent(rootComponent);
        if (checkbox != null)
            checkbox.setRootComponent(rootComponent);

        if (startIcon != null)
            startIcon.setRootComponent(rootComponent);

        if (textContainer != null)
            textContainer.setRootComponent(rootComponent);

        if (labelContainer != null)
            labelContainer.setRootComponent(rootComponent);

        if (secondaryLabelContainer != null)
            secondaryLabelContainer.setRootComponent(rootComponent);

        if (endIcon != null)
            endIcon.setRootComponent(rootComponent);

    }

    @Override
    public S add(CoreComponent child) {
        basicListItemPart.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        basicListItemPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        basicListItemPart.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        basicListItemPart.remove(child);
    }

    @Override
    public void removeAll() {
        basicListItemPart.removeAll();
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
        return basicListItemPart.hasWrapper();
    }

    public boolean isInitialized() {
        return basicListItemPart.isInitialized();
    }

    public void log(Object obj) {
        basicListItemPart.log(obj);
    }

    public void removeFromParent() {
        basicListItemPart.removeFromParent();
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
    public CoreListItem getComponent() {
        return ((CoreListItem) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        if (needsCheckbox(options)) {
            checkbox = createCheckbox(options);
        }
        startIcon = createStartIcon(options);
        textContainer = createTextContainer(options);
        labelContainer = createLabelContainer(options);
        secondaryLabelContainer = createSecondaryLabelContainer(options);
        endIcon = createEndIcon(options);
        setupReferences();
        return true;
    }

    public CoreCheckbox getCheckbox() {
        return checkbox;
    }

    private boolean needsCheckbox(O options) {
        if (checkbox != null)
            return true;

        if (options == null)
            return false;

        if (options.isHasCheckbox())
            return true;

        return false;
    }

    private CoreCheckbox createCheckbox(O options) {
        if ((checkbox != null) || (options == null))
            return checkbox;

        CoreCheckboxOptions checkboxOptions = options.getCheckboxOptions();
        if (checkboxOptions == null)
            return checkbox;

        CoreLinkPart link = ((CoreLinkPart) (getLink()));
        CoreParentComponentPart parent = (link != null) ? link : getParentComponentPart();
        checkboxOptions.setParent(link != null ? ((CoreComponent) (link)) : this);
        ComponentCreator checkboxCreator = options.getCheckboxCreator();
        checkbox = (checkboxCreator != null) ? ((CoreCheckbox) (checkboxCreator.create(checkboxOptions))) : getComponentFactory().createCheckbox(checkboxOptions);
        parent.add(checkbox);
        return checkbox;
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

        CoreLinkPart link = ((CoreLinkPart) (getLink()));
        CoreParentComponentPart parent = (link != null) ? link : getParentComponentPart();
        startIconOptions.setParent(link != null ? ((CoreComponent) (link)) : this);
        ComponentCreator startIconCreator = options.getStartIconCreator();
        startIcon = (startIconCreator != null) ? ((CoreIcon) (startIconCreator.create(startIconOptions))) : getComponentFactory().createIcon(startIconOptions);
        parent.add(startIcon);
        return startIcon;
    }

    public CoreContainer getTextContainer() {
        return textContainer;
    }

    private boolean needsTextContainer(O options) {
        if (textContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createTextContainer(O options) {
        if ((textContainer != null) || (options == null))
            return textContainer;

        CoreContainerOptions textContainerOptions = options.getTextContainerOptions();
        if (textContainerOptions == null)
            return textContainer;

        CoreLinkPart link = ((CoreLinkPart) (getLink()));
        CoreParentComponentPart parent = (link != null) ? link : getParentComponentPart();
        textContainerOptions.setParent(link != null ? ((CoreComponent) (link)) : this);
        ComponentCreator textContainerCreator = options.getTextContainerCreator();
        textContainer = (textContainerCreator != null) ? ((CoreContainer) (textContainerCreator.create(textContainerOptions))) : getComponentFactory().createContainer(textContainerOptions);
        parent.add(textContainer);
        return textContainer;
    }

    public CoreInlineText getLabelContainer() {
        return labelContainer;
    }

    private boolean needsLabelContainer(O options) {
        if (labelContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreInlineText createLabelContainer(O options) {
        if ((labelContainer != null) || (options == null))
            return labelContainer;

        CoreInlineTextOptions labelContainerOptions = options.getLabelContainerOptions();
        if (labelContainerOptions == null)
            return labelContainer;

        CoreLinkPart link = ((CoreLinkPart) (getLink()));
        CoreParentComponentPart parent = (textContainer != null) ? textContainer : link != null ? link : getParentComponentPart();
        labelContainerOptions.setParent(link != null ? ((CoreComponent) (link)) : this);
        ComponentCreator labelContainerCreator = options.getLabelContainerCreator();
        labelContainer = (labelContainerCreator != null) ? ((CoreInlineText) (labelContainerCreator.create(labelContainerOptions))) : getComponentFactory().createInlineText(labelContainerOptions);
        parent.add(labelContainer);
        return labelContainer;
    }

    public CoreInlineText getSecondaryLabelContainer() {
        return secondaryLabelContainer;
    }

    private boolean needsSecondaryLabelContainer(O options) {
        if (secondaryLabelContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreInlineText createSecondaryLabelContainer(O options) {
        if ((secondaryLabelContainer != null) || (options == null))
            return secondaryLabelContainer;

        CoreInlineTextOptions secondaryLabelContainerOptions = options.getSecondaryLabelContainerOptions();
        if (secondaryLabelContainerOptions == null)
            return secondaryLabelContainer;

        CoreLinkPart link = ((CoreLinkPart) (getLink()));
        CoreParentComponentPart parent = (textContainer != null) ? textContainer : link != null ? link : getParentComponentPart();
        secondaryLabelContainerOptions.setParent(link != null ? ((CoreComponent) (link)) : this);
        ComponentCreator secondaryLabelContainerCreator = options.getSecondaryLabelContainerCreator();
        secondaryLabelContainer = (secondaryLabelContainerCreator != null) ? ((CoreInlineText) (secondaryLabelContainerCreator.create(secondaryLabelContainerOptions))) : getComponentFactory().createInlineText(secondaryLabelContainerOptions);
        parent.add(secondaryLabelContainer);
        return secondaryLabelContainer;
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

        CoreLinkPart link = ((CoreLinkPart) (getLink()));
        CoreParentComponentPart parent = (link != null) ? link : getParentComponentPart();
        endIconOptions.setParent(link != null ? ((CoreComponent) (link)) : this);
        ComponentCreator endIconCreator = options.getEndIconCreator();
        endIcon = (endIconCreator != null) ? ((CoreIcon) (endIconCreator.create(endIconOptions))) : getComponentFactory().createIcon(endIconOptions);
        parent.add(endIcon);
        return endIcon;
    }

    // Implementation
    // Implementation
    // Implementation
    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        CoreListItemPart component = ((CoreListItemPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getLabelOption(), component::setLabel);
        applicator.add(options.getSecondaryLabelOption(), component::setSecondaryLabel);
        applicator.add(options.getHasCheckboxOption(), component::setHasCheckbox);
        applicator.add(options.getToggleCheckboxOnClickOption(), component::setToggleCheckboxOnClick);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        basicListItemPart.onInitializeComponentType(rootComponent);
    }

    // Implementation
    public S setLabel(String label) {
        if (label == null)
            return self();

        this.labelContainer.setText(label);
        return self();
    }

    // Implementation
    public String getLabel() {
        return this.labelContainer.getText();
    }

    // Implementation
    public S setSecondaryLabel(String secondaryLabel) {
        return self();
    }

    // Implementation
    public String getSecondaryLabel() {
        return null;
    }

    protected abstract S self();

    @Override
    public boolean isHasCheckbox() {
        return Boolean.TRUE.equals(hasCheckbox);
    }

    @Override
    public S setHasCheckbox(Boolean hasCheckbox) {
        this.hasCheckbox = hasCheckbox;
        return self();
    }

    public S setHighlightText(String text) {
        if (labelContainer != null)
            labelContainer.setHighlightText(text);

        if (secondaryLabelContainer != null)
            secondaryLabelContainer.setHighlightText(text);

        return self();
    }

    public boolean containsText(String text) {
        if ((labelContainer != null) && labelContainer.containsText(text))
            return true;

        if ((secondaryLabelContainer != null) && secondaryLabelContainer.containsText(text))
            return true;

        return false;
    }

    // Implementation
    public S setFilterText(String text) {
        setVisible(containsText(text));
        return self();
    }
}