package dev.reuise.core.list;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreBasicListItemPartOptions {
    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreBasicListItemPartOptions setUrl(String url);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreLinkOptions getLinkOptions();

    CoreLinkOptions getOrCreateLinkOptions();

    CoreBasicListItemPartOptions setLinkOptions(CoreLinkOptions linkOptions);

    boolean hasLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getLinkCreator();

    CoreComponentFactory getComponentFactory();

    CoreBasicListItem getComponent();
}