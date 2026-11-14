package dev.reuise.core.floating;
public interface CoreFloatingPanelFeatures {
    String getTitle();

    CoreFloatingPanelFeatures setTitle(String title);

    String getCloseLabel();

    CoreFloatingPanelFeatures setCloseLabel(String closeLabel);

    String getMinimiseLabel();

    CoreFloatingPanelFeatures setMinimiseLabel(String minimiseLabel);

    boolean isExpanded();

    CoreFloatingPanelFeatures setExpanded(Boolean expanded);

    boolean isMinimised();

    CoreFloatingPanelFeatures setMinimised(Boolean minimised);

    boolean isDocked();

    CoreFloatingPanelFeatures setDocked(Boolean docked);

    String getCorner();

    CoreFloatingPanelFeatures setCorner(String corner);
}
