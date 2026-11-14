package dev.reuise.core.menu;
public interface CoreMenuButtonFeatures {
    String getLabel();

    CoreMenuButtonFeatures setLabel(String label);

    boolean isExpanded();

    CoreMenuButtonFeatures setExpanded(Boolean expanded);

    boolean isActionMenu();

    CoreMenuButtonFeatures setActionMenu(Boolean actionMenu);

    boolean isShowChevron();

    CoreMenuButtonFeatures setShowChevron(Boolean showChevron);
}
