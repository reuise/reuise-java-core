package dev.reuise.core.topappbar;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.theme.Theme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public abstract class DefaultCoreTopAppBarPart<S extends DefaultCoreTopAppBarPart<S, O>, O extends CoreTopAppBarPartOptions> implements ComponentPart , CoreTopAppBar {
    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    protected CoreContainer container;

    protected CoreIconButton navigationButton;

    protected CoreContainer titleContainer;

    protected CoreContainer actionsContainer;

    protected Map<State, Boolean> fixed = new HashMap<>();

    protected Map<State, Boolean> hasNavigationButton = new HashMap<>();

    protected List<CoreButton> actions;

    protected DefaultCoreTopAppBarPart(O options) {
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
        if (container != null)
            container.setRootComponent(rootComponent);

        if (navigationButton != null)
            navigationButton.setRootComponent(rootComponent);

        if (titleContainer != null)
            titleContainer.setRootComponent(rootComponent);

        if (actionsContainer != null)
            actionsContainer.setRootComponent(rootComponent);

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
    public CoreTopAppBar getComponent() {
        return ((CoreTopAppBar) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        container = createContainer(options);
        if (needsNavigationButton(options)) {
            navigationButton = createNavigationButton(options);
        }
        titleContainer = createTitleContainer(options);
        actionsContainer = createActionsContainer(options);
        setupReferences();
        return true;
    }

    public CoreContainer getContainer() {
        return container;
    }

    private boolean needsContainer(O options) {
        if (container != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createContainer(O options) {
        if ((container != null) || (options == null))
            return container;

        CoreContainerOptions containerOptions = options.getContainerOptions();
        if (containerOptions == null)
            return container;

        containerOptions.setParent(this);
        ComponentCreator containerCreator = options.getContainerCreator();
        container = (containerCreator != null) ? ((CoreContainer) (containerCreator.create(containerOptions))) : getComponentFactory().createContainer(containerOptions);
        getParentComponentPart().add(container);
        return container;
    }

    public CoreIconButton getNavigationButton() {
        return navigationButton;
    }

    private boolean needsNavigationButton(O options) {
        if (navigationButton != null)
            return true;

        if (options == null)
            return false;

        if (options.hasNavigationButtonOptions())
            return true;

        if (options.isHasNavigationButtonAnyState())
            return true;

        return false;
    }

    private CoreIconButton createNavigationButton(O options) {
        if ((navigationButton != null) || (options == null))
            return navigationButton;

        CoreIconButtonOptions navigationButtonOptions = options.getOrCreateNavigationButtonOptions();
        if (navigationButtonOptions == null)
            return navigationButton;

        CoreParentComponentPart parent = (container != null) ? container : getParentComponentPart();
        navigationButtonOptions.setParent(container != null ? container : this);
        ComponentCreator navigationButtonCreator = options.getNavigationButtonCreator();
        navigationButton = (navigationButtonCreator != null) ? ((CoreIconButton) (navigationButtonCreator.create(navigationButtonOptions))) : getComponentFactory().createIconButton(navigationButtonOptions);
        parent.add(navigationButton);
        return navigationButton;
    }

    public CoreContainer getTitleContainer() {
        return titleContainer;
    }

    private boolean needsTitleContainer(O options) {
        if (titleContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createTitleContainer(O options) {
        if ((titleContainer != null) || (options == null))
            return titleContainer;

        CoreContainerOptions titleContainerOptions = options.getTitleContainerOptions();
        if (titleContainerOptions == null)
            return titleContainer;

        CoreParentComponentPart parent = (container != null) ? container : getParentComponentPart();
        titleContainerOptions.setParent(container != null ? container : this);
        ComponentCreator titleContainerCreator = options.getTitleContainerCreator();
        titleContainer = (titleContainerCreator != null) ? ((CoreContainer) (titleContainerCreator.create(titleContainerOptions))) : getComponentFactory().createContainer(titleContainerOptions);
        parent.add(titleContainer);
        return titleContainer;
    }

    @Override
    public S add(CoreComponent child) {
        titleContainer.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        titleContainer.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        titleContainer.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        titleContainer.remove(child);
    }

    @Override
    public void removeAll() {
        titleContainer.removeAll();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return titleContainer.getChildren();
    }

    public CoreContainer getActionsContainer() {
        return actionsContainer;
    }

    private boolean needsActionsContainer(O options) {
        if (actionsContainer != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createActionsContainer(O options) {
        if ((actionsContainer != null) || (options == null))
            return actionsContainer;

        CoreContainerOptions actionsContainerOptions = options.getActionsContainerOptions();
        if (actionsContainerOptions == null)
            return actionsContainer;

        CoreParentComponentPart parent = (container != null) ? container : getParentComponentPart();
        actionsContainerOptions.setParent(container != null ? container : this);
        ComponentCreator actionsContainerCreator = options.getActionsContainerCreator();
        actionsContainer = (actionsContainerCreator != null) ? ((CoreContainer) (actionsContainerCreator.create(actionsContainerOptions))) : getComponentFactory().createContainer(actionsContainerOptions);
        parent.add(actionsContainer);
        return actionsContainer;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        CoreTopAppBarPart component = ((CoreTopAppBarPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getFixedOption(), component::setFixed);
        applicator.add(options.getHasNavigationButtonOption(), component::setHasNavigationButton);
        applicator.add(options.getActionsOption(), component::setActions);
        if (states != null)
            states.stream().forEach((State state) -> {
                // Apply options for each (non-default) state
                applicator.add(options.getFixedOption(state), state, component::setFixed);
                applicator.add(options.getHasNavigationButtonOption(state), state, component::setHasNavigationButton);
            });

    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    protected abstract S self();

    @Override
    public boolean isFixed() {
        return Boolean.TRUE.equals(fixed.get(null));
    }

    // Implementation
    @Override
    public boolean isFixed(State state) {
        return false;
    }

    @Override
    public S setFixed(Boolean fixed) {
        this.fixed.put(null, fixed);
        return self();
    }

    @Override
    public S setFixedAllStates(Boolean fixed) {
        setFixed(ScreenSizeValues.of(fixed, fixed));
        setFixed(fixed);
        return self();
    }

    // Implementation
    @Override
    public S setFixed(Boolean fixed, State state) {
        return self();
    }

    @Override
    public boolean isHasNavigationButton() {
        return Boolean.TRUE.equals(hasNavigationButton.get(null));
    }

    @Override
    public boolean isHasNavigationButton(State state) {
        return Boolean.TRUE.equals(hasNavigationButton.get(state));
    }

    @Override
    public S setHasNavigationButton(Boolean hasNavigationButton) {
        this.hasNavigationButton.put(null, hasNavigationButton);
        return self();
    }

    @Override
    public S setHasNavigationButtonAllStates(Boolean hasNavigationButton) {
        setHasNavigationButton(ScreenSizeValues.of(hasNavigationButton, hasNavigationButton));
        setHasNavigationButton(hasNavigationButton);
        return self();
    }

    @Override
    public S setHasNavigationButton(Boolean hasNavigationButton, State state) {
        this.hasNavigationButton.put(state, hasNavigationButton);
        return self();
    }

    @Override
    public List<CoreButton> getActions() {
        return actions;
    }

    @Override
    public S setActions(List<CoreButton> actions) {
        // Create copy of
        this.actions = new ArrayList<CoreButton>(actions);
        return self();
    }

    // Implementation
    @Override
    public S addAction(CoreButton action) {
        this.actionsContainer.add(action);
        return self();
    }

    @Override
    public S removeAction(CoreButton action) {
        this.actions.remove(action);
        return self();
    }

    @Override
    public S setFixed(ScreenSizeValues<Boolean> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setFixed(v, s));
        return self();
    }

    @Override
    public S setHasNavigationButton(ScreenSizeValues<Boolean> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setHasNavigationButton(v, s));
        return self();
    }
}