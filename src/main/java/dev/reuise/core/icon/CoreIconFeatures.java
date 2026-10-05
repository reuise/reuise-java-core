package dev.reuise.core.icon;
import dev.reuise.core.theme.Color;
public interface CoreIconFeatures {
    Object getSize();

    CoreIconFeatures setSize(Object size);

    String getUrl();

    CoreIconFeatures setUrl(String url);

    Color getColor();

    CoreIconFeatures setColor(Color color);

    String getLinkUrl();

    CoreIconFeatures setLinkUrl(String linkUrl);

    CoreIconFeatures setSize(IconSize size);

    CoreIconFeatures setColor(String color);
}