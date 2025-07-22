package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreFilterChipPartOptions {
    boolean isSelected();

    ComponentOption<Boolean> getSelectedOption();

    CoreFilterChipPartOptions setSelected(Boolean selected);

    boolean isHasCheckIcon();

    ComponentOption<Boolean> getHasCheckIconOption();

    CoreFilterChipPartOptions setHasCheckIcon(Boolean hasCheckIcon);

    boolean isHasRemoveIcon();

    ComponentOption<Boolean> getHasRemoveIconOption();

    CoreFilterChipPartOptions setHasRemoveIcon(Boolean hasRemoveIcon);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreFilterChip getComponent();
}