package dev.reuise.core.banner;

/**
 * An explicit request to dismiss the campaign currently displayed by a banner.
 * The application decides whether to hide it and whether to remember this ID.
 */
public final class BannerDismissEvent {
    private final String campaignId;

    public BannerDismissEvent(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignId() {
        return campaignId;
    }
}
