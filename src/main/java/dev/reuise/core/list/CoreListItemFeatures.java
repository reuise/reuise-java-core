package dev.reuise.core.list;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
public interface CoreListItemFeatures {
    boolean isLoading();

    CoreListItemFeatures setLoading(Boolean loading);

    CoreSkeletonOptions getSkeletonOptions();

    CoreListItemFeatures setSkeletonOptions(CoreSkeletonOptions skeletonOptions);

    String getLabel();

    CoreListItemFeatures setLabel(String label);

    String getSecondaryLabel();

    CoreListItemFeatures setSecondaryLabel(String secondaryLabel);

    boolean isHasCheckbox();

    CoreListItemFeatures setHasCheckbox(Boolean hasCheckbox);

    boolean isToggleCheckboxOnClick();

    CoreListItemFeatures setToggleCheckboxOnClick(Boolean toggleCheckboxOnClick);
}
