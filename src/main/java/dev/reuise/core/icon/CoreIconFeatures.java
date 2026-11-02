package dev.reuise.core.icon;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.core.theme.Color;
public interface CoreIconFeatures {
    boolean isLoading();

    CoreIconFeatures setLoading(Boolean loading);

    CoreSkeletonOptions getSkeletonOptions();

    CoreIconFeatures setSkeletonOptions(CoreSkeletonOptions skeletonOptions);

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
