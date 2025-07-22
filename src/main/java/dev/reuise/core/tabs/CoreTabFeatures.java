package dev.reuise.core.tabs;
public interface CoreTabFeatures {
    String getLabel();

    CoreTabFeatures setLabel(String label);

    String getUrl();

    CoreTabFeatures setUrl(String url);

    boolean isBadgeVisible();

    CoreTabFeatures setBadgeVisible(Boolean badgeVisible);

    String getBadgeLabel();

    CoreTabFeatures setBadgeLabel(String badgeLabel);
}