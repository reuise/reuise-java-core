package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreContainerPartOptions {
    Object getPadding();

    ComponentOption<Object> getPaddingOption();

    CoreContainerPartOptions setPadding(Object padding);

    CoreContainerPartOptions setPadding(Object padding, State state);

    CoreContainerPartOptions setPaddingAllStates(Object padding);

    CoreContainerPartOptions setPadding(ScreenSizeValues<Object> padding);

    Object getPadding(State state);

    ComponentOption<Object> getPaddingOption(State state);

    Collection<State> getPaddingStates();

    Object getPaddingTop();

    ComponentOption<Object> getPaddingTopOption();

    CoreContainerPartOptions setPaddingTop(Object paddingTop);

    CoreContainerPartOptions setPaddingTop(Object paddingTop, State state);

    CoreContainerPartOptions setPaddingTopAllStates(Object paddingTop);

    CoreContainerPartOptions setPaddingTop(ScreenSizeValues<Object> paddingTop);

    Object getPaddingTop(State state);

    ComponentOption<Object> getPaddingTopOption(State state);

    Collection<State> getPaddingTopStates();

    Object getPaddingRight();

    ComponentOption<Object> getPaddingRightOption();

    CoreContainerPartOptions setPaddingRight(Object paddingRight);

    CoreContainerPartOptions setPaddingRight(Object paddingRight, State state);

    CoreContainerPartOptions setPaddingRightAllStates(Object paddingRight);

    CoreContainerPartOptions setPaddingRight(ScreenSizeValues<Object> paddingRight);

    Object getPaddingRight(State state);

    ComponentOption<Object> getPaddingRightOption(State state);

    Collection<State> getPaddingRightStates();

    Object getPaddingBottom();

    ComponentOption<Object> getPaddingBottomOption();

    CoreContainerPartOptions setPaddingBottom(Object paddingBottom);

    CoreContainerPartOptions setPaddingBottom(Object paddingBottom, State state);

    CoreContainerPartOptions setPaddingBottomAllStates(Object paddingBottom);

    CoreContainerPartOptions setPaddingBottom(ScreenSizeValues<Object> paddingBottom);

    Object getPaddingBottom(State state);

    ComponentOption<Object> getPaddingBottomOption(State state);

    Collection<State> getPaddingBottomStates();

    Object getPaddingLeft();

    ComponentOption<Object> getPaddingLeftOption();

    CoreContainerPartOptions setPaddingLeft(Object paddingLeft);

    CoreContainerPartOptions setPaddingLeft(Object paddingLeft, State state);

    CoreContainerPartOptions setPaddingLeftAllStates(Object paddingLeft);

    CoreContainerPartOptions setPaddingLeft(ScreenSizeValues<Object> paddingLeft);

    Object getPaddingLeft(State state);

    ComponentOption<Object> getPaddingLeftOption(State state);

    Collection<State> getPaddingLeftStates();

    String getPosition();

    ComponentOption<String> getPositionOption();

    CoreContainerPartOptions setPosition(String position);

    CoreContainerPartOptions setPosition(String position, State state);

    CoreContainerPartOptions setPositionAllStates(String position);

    CoreContainerPartOptions setPosition(ScreenSizeValues<String> position);

    String getPosition(State state);

    ComponentOption<String> getPositionOption(State state);

    Collection<State> getPositionStates();

    Object getInset();

    ComponentOption<Object> getInsetOption();

    CoreContainerPartOptions setInset(Object inset);

    CoreContainerPartOptions setInset(Object inset, State state);

    CoreContainerPartOptions setInsetAllStates(Object inset);

    CoreContainerPartOptions setInset(ScreenSizeValues<Object> inset);

    Object getInset(State state);

    ComponentOption<Object> getInsetOption(State state);

    Collection<State> getInsetStates();

    BackdropFilterSetting getBackdropFilter();

    ComponentOption<BackdropFilterSetting> getBackdropFilterOption();

    CoreContainerPartOptions setBackdropFilter(BackdropFilterSetting backdropFilter);

    CoreContainerPartOptions setBackdropFilter(BackdropFilterSetting backdropFilter, State state);

    CoreContainerPartOptions setBackdropFilterAllStates(BackdropFilterSetting backdropFilter);

    CoreContainerPartOptions setBackdropFilter(ScreenSizeValues<BackdropFilterSetting> backdropFilter);

    BackdropFilterSetting getBackdropFilter(State state);

    ComponentOption<BackdropFilterSetting> getBackdropFilterOption(State state);

    Collection<State> getBackdropFilterStates();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerPartOptions setBackdropFilter(BackdropFilter backdropFilter, Object value);

    CoreComponentFactory getComponentFactory();

    CoreContainer getComponent();
}