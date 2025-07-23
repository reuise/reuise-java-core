package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.core.text.CoreLabelOptions;
public interface CoreChipPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreChipPartOptions setLabel(String label);

    String getValue();

    ComponentOption<String> getValueOption();

    CoreChipPartOptions setValue(String value);

    ChipSize getSize();

    ComponentOption<ChipSize> getSizeOption();

    CoreChipPartOptions setSize(ChipSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreIconOptions getStartIconOptions();

    CoreChipPartOptions setStartIconOptions(CoreIconOptions startIconOptions);

    boolean hasStartIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getStartIconCreator();

    CoreLabelOptions getLabelContainerOptions();

    CoreChipPartOptions setLabelContainerOptions(CoreLabelOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreLabel, ? extends CoreLabelOptions> getLabelContainerCreator();

    CoreIconOptions getEndIconOptions();

    CoreChipPartOptions setEndIconOptions(CoreIconOptions endIconOptions);

    boolean hasEndIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getEndIconCreator();

    CoreComponentFactory getComponentFactory();

    CoreChip getComponent();
}