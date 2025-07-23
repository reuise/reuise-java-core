package dev.reuise.core.button;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.icon.IconSize;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreIconButtonPartOptions {
    Object getSize();

    ComponentOption<Object> getSizeOption();

    CoreIconButtonPartOptions setSize(Object size);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreIconButtonPartOptions setUrl(String url);

    String getTarget();

    ComponentOption<String> getTargetOption();

    CoreIconButtonPartOptions setTarget(String target);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreIconButtonPartOptions setSize(IconSize size);

    CoreIconOptions getIconOptions();

    CoreIconButtonPartOptions setIconOptions(CoreIconOptions iconOptions);

    boolean hasIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getIconCreator();

    CoreComponentFactory getComponentFactory();

    CoreIconButton getComponent();
}