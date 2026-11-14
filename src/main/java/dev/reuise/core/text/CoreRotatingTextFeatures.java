package dev.reuise.core.text;
import java.util.List;
import java.util.Map;
public interface CoreRotatingTextFeatures {
    List<Map<String, String>> getItems();

    CoreRotatingTextFeatures setItems(List<Map<String, String>> items);

    Integer getDwellMillis();

    CoreRotatingTextFeatures setDwellMillis(Integer dwellMillis);

    Integer getTransitionMillis();

    CoreRotatingTextFeatures setTransitionMillis(Integer transitionMillis);

    boolean isPaused();

    CoreRotatingTextFeatures setPaused(Boolean paused);
}
