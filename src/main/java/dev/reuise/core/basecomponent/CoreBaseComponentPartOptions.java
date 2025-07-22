package dev.reuise.core.basecomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.Map;
public interface CoreBaseComponentPartOptions {
    <O extends CoreComponentOptions> void initialize(O options);

    boolean isMounted();

    ComponentOption<Boolean> getMountedOption();

    CoreBaseComponentPartOptions setMounted(Boolean mounted);

    Object getMargin();

    ComponentOption<Object> getMarginOption();

    CoreBaseComponentPartOptions setMargin(Object margin);

    CoreBaseComponentPartOptions setMargin(Object margin, State state);

    CoreBaseComponentPartOptions setMarginAllStates(Object margin);

    CoreBaseComponentPartOptions setMargin(ScreenSizeValues<Object> margin);

    Object getMargin(State state);

    ComponentOption<Object> getMarginOption(State state);

    Collection<State> getMarginStates();

    Object getMarginTop();

    ComponentOption<Object> getMarginTopOption();

    CoreBaseComponentPartOptions setMarginTop(Object marginTop);

    CoreBaseComponentPartOptions setMarginTop(Object marginTop, State state);

    CoreBaseComponentPartOptions setMarginTopAllStates(Object marginTop);

    CoreBaseComponentPartOptions setMarginTop(ScreenSizeValues<Object> marginTop);

    Object getMarginTop(State state);

    ComponentOption<Object> getMarginTopOption(State state);

    Collection<State> getMarginTopStates();

    Object getMarginRight();

    ComponentOption<Object> getMarginRightOption();

    CoreBaseComponentPartOptions setMarginRight(Object marginRight);

    CoreBaseComponentPartOptions setMarginRight(Object marginRight, State state);

    CoreBaseComponentPartOptions setMarginRightAllStates(Object marginRight);

    CoreBaseComponentPartOptions setMarginRight(ScreenSizeValues<Object> marginRight);

    Object getMarginRight(State state);

    ComponentOption<Object> getMarginRightOption(State state);

    Collection<State> getMarginRightStates();

    Object getMarginBottom();

    ComponentOption<Object> getMarginBottomOption();

    CoreBaseComponentPartOptions setMarginBottom(Object marginBottom);

    CoreBaseComponentPartOptions setMarginBottom(Object marginBottom, State state);

    CoreBaseComponentPartOptions setMarginBottomAllStates(Object marginBottom);

    CoreBaseComponentPartOptions setMarginBottom(ScreenSizeValues<Object> marginBottom);

    Object getMarginBottom(State state);

    ComponentOption<Object> getMarginBottomOption(State state);

    Collection<State> getMarginBottomStates();

    Object getMarginLeft();

    ComponentOption<Object> getMarginLeftOption();

    CoreBaseComponentPartOptions setMarginLeft(Object marginLeft);

    CoreBaseComponentPartOptions setMarginLeft(Object marginLeft, State state);

    CoreBaseComponentPartOptions setMarginLeftAllStates(Object marginLeft);

    CoreBaseComponentPartOptions setMarginLeft(ScreenSizeValues<Object> marginLeft);

    Object getMarginLeft(State state);

    ComponentOption<Object> getMarginLeftOption(State state);

    Collection<State> getMarginLeftStates();

    Object getWidth();

    ComponentOption<Object> getWidthOption();

    CoreBaseComponentPartOptions setWidth(Object width);

    CoreBaseComponentPartOptions setWidth(Object width, State state);

    CoreBaseComponentPartOptions setWidthAllStates(Object width);

    CoreBaseComponentPartOptions setWidth(ScreenSizeValues<Object> width);

    Object getWidth(State state);

    ComponentOption<Object> getWidthOption(State state);

    Collection<State> getWidthStates();

    Object getMinWidth();

    ComponentOption<Object> getMinWidthOption();

    CoreBaseComponentPartOptions setMinWidth(Object minWidth);

    CoreBaseComponentPartOptions setMinWidth(Object minWidth, State state);

    CoreBaseComponentPartOptions setMinWidthAllStates(Object minWidth);

    CoreBaseComponentPartOptions setMinWidth(ScreenSizeValues<Object> minWidth);

    Object getMinWidth(State state);

    ComponentOption<Object> getMinWidthOption(State state);

    Collection<State> getMinWidthStates();

    Object getMaxWidth();

    ComponentOption<Object> getMaxWidthOption();

    CoreBaseComponentPartOptions setMaxWidth(Object maxWidth);

    CoreBaseComponentPartOptions setMaxWidth(Object maxWidth, State state);

    CoreBaseComponentPartOptions setMaxWidthAllStates(Object maxWidth);

    CoreBaseComponentPartOptions setMaxWidth(ScreenSizeValues<Object> maxWidth);

    Object getMaxWidth(State state);

    ComponentOption<Object> getMaxWidthOption(State state);

    Collection<State> getMaxWidthStates();

    Object getHeight();

    ComponentOption<Object> getHeightOption();

    CoreBaseComponentPartOptions setHeight(Object height);

    CoreBaseComponentPartOptions setHeight(Object height, State state);

    CoreBaseComponentPartOptions setHeightAllStates(Object height);

    CoreBaseComponentPartOptions setHeight(ScreenSizeValues<Object> height);

    Object getHeight(State state);

    ComponentOption<Object> getHeightOption(State state);

    Collection<State> getHeightStates();

    Object getMinHeight();

    ComponentOption<Object> getMinHeightOption();

    CoreBaseComponentPartOptions setMinHeight(Object minHeight);

    CoreBaseComponentPartOptions setMinHeight(Object minHeight, State state);

    CoreBaseComponentPartOptions setMinHeightAllStates(Object minHeight);

    CoreBaseComponentPartOptions setMinHeight(ScreenSizeValues<Object> minHeight);

    Object getMinHeight(State state);

    ComponentOption<Object> getMinHeightOption(State state);

    Collection<State> getMinHeightStates();

    Object getMaxHeight();

    ComponentOption<Object> getMaxHeightOption();

    CoreBaseComponentPartOptions setMaxHeight(Object maxHeight);

    CoreBaseComponentPartOptions setMaxHeight(Object maxHeight, State state);

    CoreBaseComponentPartOptions setMaxHeightAllStates(Object maxHeight);

    CoreBaseComponentPartOptions setMaxHeight(ScreenSizeValues<Object> maxHeight);

    Object getMaxHeight(State state);

    ComponentOption<Object> getMaxHeightOption(State state);

    Collection<State> getMaxHeightStates();

    boolean isRequiredLayoutComponent();

    ComponentOption<Boolean> getRequiredLayoutComponentOption();

    CoreBaseComponentPartOptions setRequiredLayoutComponent(Boolean requiredLayoutComponent);

    CoreComponent getParent();

    ComponentOption<CoreComponent> getParentOption();

    CoreBaseComponentPartOptions setParent(CoreComponent parent);

    CoreParentComponent getWrapper();

    ComponentOption<CoreParentComponent> getWrapperOption();

    CoreBaseComponentPartOptions setWrapper(CoreParentComponent wrapper);

    Theme getTheme();

    ComponentOption<Theme> getThemeOption();

    CoreBaseComponentPartOptions setTheme(Theme theme);

    boolean isVisible();

    ComponentOption<Boolean> getVisibleOption();

    CoreBaseComponentPartOptions setVisible(Boolean visible);

    CoreBaseComponentPartOptions setVisible(Boolean visible, State state);

    CoreBaseComponentPartOptions setVisibleAllStates(Boolean visible);

    CoreBaseComponentPartOptions setVisible(ScreenSizeValues<Boolean> visible);

    boolean isVisible(State state);

    ComponentOption<Boolean> getVisibleOption(State state);

    Collection<State> getVisibleStates();

    boolean isVisibleAnyState();

    boolean isEnabled();

    ComponentOption<Boolean> getEnabledOption();

    CoreBaseComponentPartOptions setEnabled(Boolean enabled);

    boolean isFocused();

    ComponentOption<Boolean> getFocusedOption();

    CoreBaseComponentPartOptions setFocused(Boolean focused);

    boolean isDebug();

    ComponentOption<Boolean> getDebugOption();

    CoreBaseComponentPartOptions setDebug(Boolean debug);

    String getDebugId();

    ComponentOption<String> getDebugIdOption();

    CoreBaseComponentPartOptions setDebugId(String debugId);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    Collection<State> getStates();

    Object getOptionValue(String option);

    Object getOptionValue(String option, State state);

    ComponentOption<? extends Object> getOption(String option);

    ComponentOption<? extends Object> getOption(String option, State state);

    Map<String, ComponentOption<? extends Object>> getOptions();

    Collection<ComponentOption<? extends Object>> getOptionValues(String option);

    <T> void setOption(String option, T value);

    <T> void setOption(String option, T value, boolean force);

    <T> void setOption(String option, T value, State state);

    <T> void setOption(String option, T value, State state, boolean force);

    void clearOption(String option);

    void clearOption(String option, boolean clearStates);

    void clearOptionStates(String option);

    void clearOption(String option, State state);

    Collection<State> getOptionStates(String option);

    void merge(CoreComponentOptions other);

    CoreComponentFactory getComponentFactory();

    CoreBaseComponent getComponent();

    void setComponent(CoreBaseComponent component);
}