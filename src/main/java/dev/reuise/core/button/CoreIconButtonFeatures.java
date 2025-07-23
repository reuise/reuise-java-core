package dev.reuise.core.button;
import dev.reuise.core.icon.IconSize;
public interface CoreIconButtonFeatures {
    Object getSize();

    CoreIconButtonFeatures setSize(Object size);

    String getUrl();

    CoreIconButtonFeatures setUrl(String url);

    String getTarget();

    CoreIconButtonFeatures setTarget(String target);

    CoreIconButtonFeatures setSize(IconSize size);
}