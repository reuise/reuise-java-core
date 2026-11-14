package dev.reuise.core.link;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreLinkPartOptions {
    String getText();

    ComponentOption<String> getTextOption();

    CoreLinkPartOptions setText(String text);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreLinkPartOptions setUrl(String url);

    String getTarget();

    ComponentOption<String> getTargetOption();

    CoreLinkPartOptions setTarget(String target);

    String getExternalIndicator();

    ComponentOption<String> getExternalIndicatorOption();

    CoreLinkPartOptions setExternalIndicator(String externalIndicator);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreIconOptions getStartIconOptions();

    CoreLinkPartOptions setStartIconOptions(CoreIconOptions startIconOptions);

    boolean hasStartIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getStartIconCreator();

    CoreIconOptions getEndIconOptions();

    CoreLinkPartOptions setEndIconOptions(CoreIconOptions endIconOptions);

    boolean hasEndIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getEndIconCreator();

    CoreComponentFactory getComponentFactory();

    CoreLink getComponent();
}
