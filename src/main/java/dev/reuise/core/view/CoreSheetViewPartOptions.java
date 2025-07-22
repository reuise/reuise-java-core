package dev.reuise.core.view;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreSheetViewPartOptions {
    Object getSize();

    ComponentOption<Object> getSizeOption();

    CoreSheetViewPartOptions setSize(Object size);

    Object getMinSize();

    ComponentOption<Object> getMinSizeOption();

    CoreSheetViewPartOptions setMinSize(Object minSize);

    Object getMaxSize();

    ComponentOption<Object> getMaxSizeOption();

    CoreSheetViewPartOptions setMaxSize(Object maxSize);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreSheetViewPartOptions setSize(SheetSize size);

    CoreComponentFactory getComponentFactory();

    CoreSheetView getComponent();
}