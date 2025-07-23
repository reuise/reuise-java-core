package dev.reuise.core.list;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreListItemPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreListItemPartOptions setLabel(String label);

    String getSecondaryLabel();

    ComponentOption<String> getSecondaryLabelOption();

    CoreListItemPartOptions setSecondaryLabel(String secondaryLabel);

    boolean isHasCheckbox();

    ComponentOption<Boolean> getHasCheckboxOption();

    CoreListItemPartOptions setHasCheckbox(Boolean hasCheckbox);

    boolean isToggleCheckboxOnClick();

    ComponentOption<Boolean> getToggleCheckboxOnClickOption();

    CoreListItemPartOptions setToggleCheckboxOnClick(Boolean toggleCheckboxOnClick);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreCheckboxOptions getCheckboxOptions();

    CoreListItemPartOptions setCheckboxOptions(CoreCheckboxOptions checkboxOptions);

    boolean hasCheckboxOptions();

    ComponentCreator<? extends CoreCheckbox, ? extends CoreCheckboxOptions> getCheckboxCreator();

    CoreIconOptions getStartIconOptions();

    CoreListItemPartOptions setStartIconOptions(CoreIconOptions startIconOptions);

    boolean hasStartIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getStartIconCreator();

    CoreContainerOptions getTextContainerOptions();

    CoreListItemPartOptions setTextContainerOptions(CoreContainerOptions textContainerOptions);

    boolean hasTextContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getTextContainerCreator();

    CoreInlineTextOptions getLabelContainerOptions();

    CoreListItemPartOptions setLabelContainerOptions(CoreInlineTextOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getLabelContainerCreator();

    CoreInlineTextOptions getSecondaryLabelContainerOptions();

    CoreListItemPartOptions setSecondaryLabelContainerOptions(CoreInlineTextOptions secondaryLabelContainerOptions);

    boolean hasSecondaryLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getSecondaryLabelContainerCreator();

    CoreIconOptions getEndIconOptions();

    CoreListItemPartOptions setEndIconOptions(CoreIconOptions endIconOptions);

    boolean hasEndIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getEndIconCreator();

    CoreComponentFactory getComponentFactory();

    CoreListItem getComponent();
}