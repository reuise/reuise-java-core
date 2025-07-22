package dev.reuise.core.button;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreButtonPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreButtonPartOptions setLabel(String label);

    ButtonSize getSize();

    ComponentOption<ButtonSize> getSizeOption();

    CoreButtonPartOptions setSize(ButtonSize size);

    ButtonType getType();

    ComponentOption<ButtonType> getTypeOption();

    CoreButtonPartOptions setType(ButtonType type);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreButtonPartOptions setUrl(String url);

    String getTarget();

    ComponentOption<String> getTargetOption();

    CoreButtonPartOptions setTarget(String target);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreIconOptions getStartIconOptions();

    CoreButtonPartOptions setStartIconOptions(CoreIconOptions startIconOptions);

    boolean hasStartIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getStartIconCreator();

    CoreInlineTextOptions getLabelContainerOptions();

    CoreButtonPartOptions setLabelContainerOptions(CoreInlineTextOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getLabelContainerCreator();

    CoreIconOptions getEndIconOptions();

    CoreButtonPartOptions setEndIconOptions(CoreIconOptions endIconOptions);

    boolean hasEndIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getEndIconCreator();

    CoreComponentFactory getComponentFactory();

    CoreButton getComponent();
}