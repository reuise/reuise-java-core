package dev.reuise.core.basecomponent;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.theme.Theme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public abstract class DefaultCoreBaseComponentPart<S extends DefaultCoreBaseComponentPart<S, O>, O extends CoreBaseComponentPartOptions> implements ComponentPart , CoreBaseComponent {
    private boolean mounted = false;

    private boolean initialized = false;

    private Map<ComponentPart.Type, List<ComponentPart>> parts = new HashMap<>();

    protected Map<ComponentPart, CoreComponentOptions> partOptions = new HashMap<>();

    private CoreBaseComponent component;

    protected Map<ComponentPart.Type, List<ComponentPart>> getParts() {
        return parts;
    }

    protected void clearOptions() {
        partOptions.clear();
        partOptions = null;
    }

    public void mount(CoreComponent component, RootComponent rootComponent) {
        mounted = true;
    }

    @Override
    public boolean isVisible(State state) {
        return true;
    }

    @Override
    public S setRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        return self();
    }

    @Override
    public boolean isRequiredLayoutComponent() {
        return false;
    }

    @Override
    public boolean isMounted() {
        return mounted;
    }

    /* @Override
    public void setRootComponent(RootComponent rootComponent) {
    this.rootComponent = rootComponent;
    }
     */
    @Override
    public S setMounted(Boolean mounted) {
        this.mounted = mounted;
        return self();
    }

    protected void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    @Override
    public CoreBaseComponent getComponent() {
        return component;
    }

    public S setFocused(Boolean focused) {
        return self();
    }

    public boolean isFocused() {
        return false;
    }

    private CoreComponentFactory componentFactory;

    protected CoreComponent parent;

    protected CoreParentComponent wrapper;

    protected Theme theme;

    protected Boolean debug;

    protected String debugId;

    protected RootComponent rootComponent;

    protected DefaultCoreBaseComponentPart(O options) {
        this.componentFactory = options.getComponentFactory();
        component = options.getComponent();
        parts.put(ComponentPart.Type.BASE, new ArrayList<>());
        parts.put(ComponentPart.Type.DESIGN, new ArrayList<>());
    }

    protected void setupReferences() {
        // Parts
        // Layout children (indirect)
    }

    // Implementation
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        boolean isPart = component != options.getComponent();
        if (!isPart) {
            options.onInitialize();
            setupReferences();
        }
        partOptions.put(component, options);
    }

    public <C extends ComponentType<?, ?>> void mount(C component, RootComponent rootComponent) {
    }

    // Implementation
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        parts.get(type).add(part);
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
        CoreBaseComponentPart component = ((CoreBaseComponentPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getMountedOption(), component::setMounted);
        applicator.add(options.getMarginOption(), component::setMargin);
        applicator.add(options.getMarginTopOption(), component::setMarginTop);
        applicator.add(options.getMarginRightOption(), component::setMarginRight);
        applicator.add(options.getMarginBottomOption(), component::setMarginBottom);
        applicator.add(options.getMarginLeftOption(), component::setMarginLeft);
        applicator.add(options.getWidthOption(), component::setWidth);
        applicator.add(options.getMinWidthOption(), component::setMinWidth);
        applicator.add(options.getMaxWidthOption(), component::setMaxWidth);
        applicator.add(options.getHeightOption(), component::setHeight);
        applicator.add(options.getMinHeightOption(), component::setMinHeight);
        applicator.add(options.getMaxHeightOption(), component::setMaxHeight);
        applicator.add(options.getRequiredLayoutComponentOption(), component::setRequiredLayoutComponent);
        applicator.add(options.getParentOption(), component::setParent);
        applicator.add(options.getWrapperOption(), component::setWrapper);
        applicator.add(options.getThemeOption(), component::setTheme);
        applicator.add(options.getVisibleOption(), component::setVisible);
        applicator.add(options.getEnabledOption(), component::setEnabled);
        applicator.add(options.getFocusedOption(), component::setFocused);
        applicator.add(options.getDebugOption(), component::setDebug);
        applicator.add(options.getDebugIdOption(), component::setDebugId);
        if (states != null)
            states.stream().forEach((State state) -> {
                // Apply options for each (non-default) state
                applicator.add(options.getMarginOption(state), state, component::setMargin);
                applicator.add(options.getMarginTopOption(state), state, component::setMarginTop);
                applicator.add(options.getMarginRightOption(state), state, component::setMarginRight);
                applicator.add(options.getMarginBottomOption(state), state, component::setMarginBottom);
                applicator.add(options.getMarginLeftOption(state), state, component::setMarginLeft);
                applicator.add(options.getWidthOption(state), state, component::setWidth);
                applicator.add(options.getMinWidthOption(state), state, component::setMinWidth);
                applicator.add(options.getMaxWidthOption(state), state, component::setMaxWidth);
                applicator.add(options.getHeightOption(state), state, component::setHeight);
                applicator.add(options.getMinHeightOption(state), state, component::setMinHeight);
                applicator.add(options.getMaxHeightOption(state), state, component::setMaxHeight);
                applicator.add(options.getVisibleOption(state), state, component::setVisible);
            });

    }

    public void onInitializeComponentType(RootComponent rootComponent) {
    }

    protected abstract S self();

    @Override
    public CoreComponentFactory getComponentFactory() {
        return this.componentFactory;
    }

    @Override
    public S setMarginAllStates(Object margin) {
        setMargin(ScreenSizeValues.of(margin, margin));
        setMargin(margin);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        setMarginTop(ScreenSizeValues.of(marginTop, marginTop));
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        setMarginRight(ScreenSizeValues.of(marginRight, marginRight));
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        setMarginBottom(ScreenSizeValues.of(marginBottom, marginBottom));
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        setMarginLeft(ScreenSizeValues.of(marginLeft, marginLeft));
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        setWidth(ScreenSizeValues.of(width, width));
        setWidth(width);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        setMinWidth(ScreenSizeValues.of(minWidth, minWidth));
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        setMaxWidth(ScreenSizeValues.of(maxWidth, maxWidth));
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        setHeight(ScreenSizeValues.of(height, height));
        setHeight(height);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        setMinHeight(ScreenSizeValues.of(minHeight, minHeight));
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        setMaxHeight(ScreenSizeValues.of(maxHeight, maxHeight));
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public CoreComponent getParent() {
        return parent;
    }

    @Override
    public S setParent(CoreComponent parent) {
        this.parent = parent;
        return self();
    }

    @Override
    public CoreParentComponent getWrapper() {
        return wrapper;
    }

    @Override
    public S setWrapper(CoreParentComponent wrapper) {
        this.wrapper = wrapper;
        return self();
    }

    @Override
    public Theme getTheme() {
        return theme;
    }

    @Override
    public S setTheme(Theme theme) {
        this.theme = theme;
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    @Override
    public boolean isDebug() {
        return Boolean.TRUE.equals(debug);
    }

    @Override
    public S setDebug(Boolean debug) {
        this.debug = debug;
        return self();
    }

    @Override
    public String getDebugId() {
        return debugId;
    }

    // Implementation
    @Override
    public S setDebugId(String debugId) {
        this.debugId = debugId;
        setDebug(true);
        return self();
    }

    @Override
    public S setMargin(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMargin(v, s));
        return self();
    }

    @Override
    public S setMarginTop(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginTop(v, s));
        return self();
    }

    @Override
    public S setMarginRight(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginRight(v, s));
        return self();
    }

    @Override
    public S setMarginBottom(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginBottom(v, s));
        return self();
    }

    @Override
    public S setMarginLeft(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginLeft(v, s));
        return self();
    }

    @Override
    public S setWidth(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setWidth(v, s));
        return self();
    }

    @Override
    public S setMinWidth(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMinWidth(v, s));
        return self();
    }

    @Override
    public S setMaxWidth(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMaxWidth(v, s));
        return self();
    }

    @Override
    public S setHeight(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setHeight(v, s));
        return self();
    }

    @Override
    public S setMinHeight(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMinHeight(v, s));
        return self();
    }

    @Override
    public S setMaxHeight(ScreenSizeValues<Object> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMaxHeight(v, s));
        return self();
    }

    @Override
    public S setVisible(ScreenSizeValues<Boolean> screenValues) {
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setVisible(v, s));
        return self();
    }

    // Implementation
    public boolean hasWrapper() {
        return this.wrapper != null;
    }

    // Implementation
    public boolean isInitialized() {
        return initialized;
    }

    // Implementation
    public void log(Object obj) {
    }

    // Implementation
    public void removeFromParent() {
        CoreComponent parent = getParent();
        if (parent instanceof CoreParentComponentPart)
            ((CoreParentComponentPart) (parent)).remove(component);

    }

    @Override
    public RootComponent getRootComponent() {
        return rootComponent;
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        if (rootComponent == null)
            return;

        if (Boolean.TRUE.equals(isMounted()))
            return;

        mount(component, rootComponent);
        boolean newlyRegistered = rootComponent.registerComponentType(component);
        this.rootComponent = rootComponent;
    }
}