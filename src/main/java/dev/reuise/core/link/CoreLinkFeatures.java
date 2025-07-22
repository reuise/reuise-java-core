package dev.reuise.core.link;
public interface CoreLinkFeatures {
    String getText();

    CoreLinkFeatures setText(String text);

    String getUrl();

    CoreLinkFeatures setUrl(String url);

    String getTarget();

    CoreLinkFeatures setTarget(String target);
}