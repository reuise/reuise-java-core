package dev.reuise.core.button;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
public interface CoreButtonFeatures {
    String getLabel();

    CoreButtonFeatures setLabel(String label);

    ButtonSize getSize();

    CoreButtonFeatures setSize(ButtonSize size);

    ButtonType getType();

    CoreButtonFeatures setType(ButtonType type);

    String getUrl();

    CoreButtonFeatures setUrl(String url);

    String getTarget();

    CoreButtonFeatures setTarget(String target);

    boolean isLoading();

    CoreButtonFeatures setLoading(Boolean loading);

    CoreSkeletonOptions getSkeletonOptions();

    CoreButtonFeatures setSkeletonOptions(CoreSkeletonOptions skeletonOptions);
}