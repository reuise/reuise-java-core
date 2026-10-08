package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.Html;
import dev.reuise.core.divider.CoreDivider;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.list.CoreBasicList;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreHeading;
import dev.reuise.core.text.CoreParagraph;
import java.util.List;
public interface CoreContainerPart extends ComponentPart , CoreContainerFeatures , CoreParentComponentPart {
    CoreContainerPart addMarkdown(String markdown);

    CoreContainerPart addHeading(int level, String text);

    CoreContainerPart addHeading(String text);

    CoreContainerPart addHeading(int level, Html html);

    CoreContainerPart addHeading(Html html);

    CoreHeading createHeading(int level, String text);

    CoreHeading createHeading(String text);

    CoreHeading createHeading(int level, Html html);

    CoreHeading createHeading(Html html);

    CoreContainerPart addDivider();

    CoreContainerPart addDivider(String label);

    CoreDivider createDivider();

    CoreDivider createDivider(String label);

    CoreContainerPart addImage(String altText, String url);

    CoreImage createImage(String altText, String url);

    CoreContainerPart addLink(String label, String url);

    CoreLink createLink(String label, String url);

    CoreContainerPart addParagraph(String text);

    CoreContainerPart addParagraph(Html html);

    CoreParagraph createParagraph(String text);

    CoreParagraph createParagraph(Html html);

    CoreContainerPart addBasicList(boolean ordered, String... items);

    CoreContainerPart addBasicList(boolean ordered, List<String> items);

    CoreContainerPart addBasicList(String... items);

    CoreContainerPart addBasicList(List<String> items);

    CoreBasicList createBasicList(boolean ordered, String... items);

    CoreBasicList createBasicList(boolean ordered, List<String> items);

    CoreBasicList createBasicList(String... items);

    CoreBasicList createBasicList(List<String> items);

    CoreParentComponentPart getParentComponentPart();
}
