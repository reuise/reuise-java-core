package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.Html;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreContainerPart extends ComponentPart , CoreContainerFeatures , CoreParentComponentPart {
    CoreContainerPart addHeading(int level, String text);

    CoreContainerPart addHeading(String text);

    CoreContainerPart addHeading(int level, Html html);

    CoreContainerPart addHeading(Html html);

    CoreContainerPart addDivider();

    CoreContainerPart addDivider(String label);

    CoreContainerPart addParagraph(String text);

    CoreContainerPart addParagraph(Html html);

    CoreParentComponentPart getParentComponentPart();
}