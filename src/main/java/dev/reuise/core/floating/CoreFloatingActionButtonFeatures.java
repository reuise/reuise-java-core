package dev.reuise.core.floating;
public interface CoreFloatingActionButtonFeatures {
    String getAccessibleLabel();

    CoreFloatingActionButtonFeatures setAccessibleLabel(String accessibleLabel);

    String getCorner();

    CoreFloatingActionButtonFeatures setCorner(String corner);

    Integer getUnreadCount();

    CoreFloatingActionButtonFeatures setUnreadCount(Integer unreadCount);
}
