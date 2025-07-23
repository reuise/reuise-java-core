package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.splitcontainer.CoreSplitContainerPart;
import dev.reuise.core.view.SheetSize;
public interface CoreSheetLayoutPart extends ComponentPart , CoreSplitContainerPart , CoreSheetLayoutFeatures {
    CoreSheetLayoutPart setSheetSize(Object sheetSize);

    CoreSheetLayoutPart setSheetSize(SheetSize sheetSize);

    CoreSheetLayoutPart setMinSheetSize(Object minSheetSize);

    CoreSheetLayoutPart setMaxSheetSize(Object maxSheetSize);

    CoreSplitContainerPart getSplitContainerPart();
}