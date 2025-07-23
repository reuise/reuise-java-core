package dev.reuise.core.image;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreImagePartOptions {
    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreImagePartOptions setUrl(String url);

    SpriteOptions getSpriteOptions();

    ComponentOption<SpriteOptions> getSpriteOptionsOption();

    CoreImagePartOptions setSpriteOptions(SpriteOptions spriteOptions);

    String getLinkUrl();

    ComponentOption<String> getLinkUrlOption();

    CoreImagePartOptions setLinkUrl(String linkUrl);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreLinkOptions getLinkOptions();

    CoreLinkOptions getOrCreateLinkOptions();

    CoreImagePartOptions setLinkOptions(CoreLinkOptions linkOptions);

    boolean hasLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getLinkCreator();

    CoreComponentFactory getComponentFactory();

    CoreImage getComponent();
}