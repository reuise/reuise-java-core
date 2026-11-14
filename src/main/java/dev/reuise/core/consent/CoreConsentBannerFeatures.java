package dev.reuise.core.consent;
public interface CoreConsentBannerFeatures {
    String getMessage();

    CoreConsentBannerFeatures setMessage(String message);

    String getAcceptLabel();

    CoreConsentBannerFeatures setAcceptLabel(String acceptLabel);

    String getRejectLabel();

    CoreConsentBannerFeatures setRejectLabel(String rejectLabel);

    String getPreferencesLabel();

    CoreConsentBannerFeatures setPreferencesLabel(String preferencesLabel);

    String getPreferencesTitle();

    CoreConsentBannerFeatures setPreferencesTitle(String preferencesTitle);
}
