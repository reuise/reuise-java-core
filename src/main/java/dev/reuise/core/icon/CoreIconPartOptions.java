package dev.reuise.core.icon;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreIconPartOptions {
    Integer getSize();

    ComponentOption<Integer> getSizeOption();

    CoreIconPartOptions setSize(Integer size);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreIconPartOptions setUrl(String url);

    String getLinkUrl();

    ComponentOption<String> getLinkUrlOption();

    CoreIconPartOptions setLinkUrl(String linkUrl);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

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