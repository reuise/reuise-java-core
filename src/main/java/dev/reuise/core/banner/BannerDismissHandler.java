package dev.reuise.core.banner;

@FunctionalInterface
public interface BannerDismissHandler {
    void onDismiss(BannerDismissEvent event);
}
