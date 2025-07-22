package dev.reuise.core.card;
import dev.reuise.core.button.CoreButton;
import java.util.List;
public interface CoreCardFeatures {
    String getHeading();

    CoreCardFeatures setHeading(String heading);

    String getSubHeading();

    CoreCardFeatures setSubHeading(String subHeading);

    String getText();

    CoreCardFeatures setText(String text);

    CardOrientation getOrientation();

    CoreCardFeatures setOrientation(CardOrientation orientation);

    String getUrl();

    CoreCardFeatures setUrl(String url);

    String getImageUrl();

    CoreCardFeatures setImageUrl(String imageUrl);

    List<CoreButton> getActions();

    CoreCardFeatures setActions(List<CoreButton> actions);

    CoreCardFeatures addAction(CoreButton action);

    CoreCardFeatures setAction(CoreButton action);

    CoreCardFeatures removeAction(CoreButton action);
}