package dev.reuise.core.divider;
import dev.reuise.core.Alignment;
public interface CoreDividerFeatures {
    String getLabel();

    CoreDividerFeatures setLabel(String label);

    Alignment getLabelAlignment();

    CoreDividerFeatures setLabelAlignment(Alignment labelAlignment);

    Integer getThickness();

    CoreDividerFeatures setThickness(Integer thickness);

    DividerDirection getDirection();

    CoreDividerFeatures setDirection(DividerDirection direction);
}