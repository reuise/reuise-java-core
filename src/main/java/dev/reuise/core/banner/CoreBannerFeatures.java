package dev.reuise.core.banner;
public interface CoreBannerFeatures {
    String getMessage();

    CoreBannerFeatures setMessage(String message);

    String getCampaignId();

    CoreBannerFeatures setCampaignId(String campaignId);

    String getTone();

    CoreBannerFeatures setTone(String tone);

    String getDismissLabel();

    CoreBannerFeatures setDismissLabel(String dismissLabel);

    boolean isDismissible();

    CoreBannerFeatures setDismissible(Boolean dismissible);

    BannerDismissHandler getDismissHandler();

    CoreBannerFeatures setDismissHandler(BannerDismissHandler dismissHandler);
}
