package dev.reuise.core.button;
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
}