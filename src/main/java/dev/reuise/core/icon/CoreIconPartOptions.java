package dev.reuise.core.icon;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.theme.Color;
public interface CoreIconPartOptions {
    Object getSize();

    ComponentOption<Object> getSizeOption();

    CoreIconPartOptions setSize(Object size);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreIconPartOptions setUrl(String url);

    Color getColor();

    ComponentOption<Color> getColorOption();

    CoreIconPartOptions setColor(Color color);

    String getLinkUrl();

    ComponentOption<String> getLinkUrlOption();

    CoreIconPartOptions setLinkUrl(String linkUrl);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreIconPartOptions setSize(IconSize size);

    CoreIconPartOptions setColor(String color);

    CoreLinkOptions getLinkOptions();

    CoreLinkOptions getOrCreateLinkOptions();

    CoreIconPartOptions setLinkOptions(CoreLinkOptions linkOptions);

    boolean hasLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getLinkCreator();

    CoreImageOptions getImageOptions();

    CoreImageOptions getOrCreateImageOptions();

    CoreIconPartOptions setImageOptions(CoreImageOptions imageOptions);

    boolean hasImageOptions();

    ComponentCreator<? extends CoreImage, ? extends CoreImageOptions> getImageCreator();

    CoreComponentFactory getComponentFactory();

    CoreIcon getComponent();
}