package dev.reuise.core.image;
public interface CoreImageFeatures {
    String getUrl();

    CoreImageFeatures setUrl(String url);

    SpriteOptions getSpriteOptions();

    CoreImageFeatures setSpriteOptions(SpriteOptions spriteOptions);

    String getLinkUrl();

    CoreImageFeatures setLinkUrl(String linkUrl);
}