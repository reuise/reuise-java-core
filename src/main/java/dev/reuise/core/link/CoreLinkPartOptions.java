package dev.reuise.core.link;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
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

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreLink getComponent();
}