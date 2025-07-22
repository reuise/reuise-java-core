package dev.reuise.core.view;
import dev.reuise.core.ComponentPart;
public interface CoreSheetViewPart extends ComponentPart , CoreViewPart , CoreSheetViewFeatures {
    CoreViewPart getViewPart();
}