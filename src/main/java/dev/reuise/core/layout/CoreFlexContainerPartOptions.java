package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreFlexContainerPartOptions {
    FlexDirection getDirection();

    ComponentOption<FlexDirection> getDirectionOption();

    CoreFlexContainerPartOptions setDirection(FlexDirection direction);

    CoreFlexContainerPartOptions setDirection(FlexDirection direction, State state);

    CoreFlexContainerPartOptions setDirectionAllStates(FlexDirection direction);

    CoreFlexContainerPartOptions setDirection(ScreenSizeValues<FlexDirection> direction);

    FlexDirection getDirection(State state);

    ComponentOption<FlexDirection> getDirectionOption(State state);

    Collection<State> getDirectionStates();

    JustifyContent getJustifyContent();

    ComponentOption<JustifyContent> getJustifyContentOption();

    CoreFlexContainerPartOptions setJustifyContent(JustifyContent justifyContent);

    CoreFlexContainerPartOptions setJustifyContent(JustifyContent justifyContent, State state);

    CoreFlexContainerPartOptions setJustifyContentAllStates(JustifyContent justifyContent);

    CoreFlexContainerPartOptions setJustifyContent(ScreenSizeValues<JustifyContent> justifyContent);

    JustifyContent getJustifyContent(State state);

    ComponentOption<JustifyContent> getJustifyContentOption(State state);

    Collection<State> getJustifyContentStates();

    AlignItems getAlignItems();

    ComponentOption<AlignItems> getAlignItemsOption();

    CoreFlexContainerPartOptions setAlignItems(AlignItems alignItems);

    CoreFlexContainerPartOptions setAlignItems(AlignItems alignItems, State state);

    CoreFlexContainerPartOptions setAlignItemsAllStates(AlignItems alignItems);

    CoreFlexContainerPartOptions setAlignItems(ScreenSizeValues<AlignItems> alignItems);

    AlignItems getAlignItems(State state);

    ComponentOption<AlignItems> getAlignItemsOption(State state);

    Collection<State> getAlignItemsStates();

    Object getColumnGap();

    ComponentOption<Object> getColumnGapOption();

    CoreFlexContainerPartOptions setColumnGap(Object columnGap);

    CoreFlexContainerPartOptions setColumnGap(Object columnGap, State state);

    CoreFlexContainerPartOptions setColumnGapAllStates(Object columnGap);

    CoreFlexContainerPartOptions setColumnGap(ScreenSizeValues<Object> columnGap);

    Object getColumnGap(State state);

    ComponentOption<Object> getColumnGapOption(State state);

    Collection<State> getColumnGapStates();

    Object getRowGap();

    ComponentOption<Object> getRowGapOption();

    CoreFlexContainerPartOptions setRowGap(Object rowGap);

    CoreFlexContainerPartOptions setRowGap(Object rowGap, State state);

    CoreFlexContainerPartOptions setRowGapAllStates(Object rowGap);

    CoreFlexContainerPartOptions setRowGap(ScreenSizeValues<Object> rowGap);

    Object getRowGap(State state);

    ComponentOption<Object> getRowGapOption(State state);

    Collection<State> getRowGapStates();

    Object getGap();

    ComponentOption<Object> getGapOption();

    CoreFlexContainerPartOptions setGap(Object gap);

    CoreFlexContainerPartOptions setGap(Object gap, State state);

    CoreFlexContainerPartOptions setGapAllStates(Object gap);

    CoreFlexContainerPartOptions setGap(ScreenSizeValues<Object> gap);

    Object getGap(State state);

    ComponentOption<Object> getGapOption(State state);

    Collection<State> getGapStates();

    boolean isWrap();

    ComponentOption<Boolean> getWrapOption();

    CoreFlexContainerPartOptions setWrap(Boolean wrap);

    CoreFlexContainerPartOptions setWrap(Boolean wrap, State state);

    CoreFlexContainerPartOptions setWrapAllStates(Boolean wrap);

    CoreFlexContainerPartOptions setWrap(ScreenSizeValues<Boolean> wrap);

    boolean isWrap(State state);

    ComponentOption<Boolean> getWrapOption(State state);

    Collection<State> getWrapStates();

    boolean isWrapAnyState();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreFlexContainer getComponent();
}