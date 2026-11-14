package dev.reuise.core.text;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
import java.util.Map;
public interface CoreRotatingTextPartOptions {
    List<Map<String, String>> getItems();

    ComponentOption<List<Map<String, String>>> getItemsOption();

    CoreRotatingTextPartOptions setItems(List<Map<String, String>> items);

    Integer getDwellMillis();

    ComponentOption<Integer> getDwellMillisOption();

    CoreRotatingTextPartOptions setDwellMillis(Integer dwellMillis);

    Integer getTransitionMillis();

    ComponentOption<Integer> getTransitionMillisOption();

    CoreRotatingTextPartOptions setTransitionMillis(Integer transitionMillis);

    boolean isPaused();

    ComponentOption<Boolean> getPausedOption();

    CoreRotatingTextPartOptions setPaused(Boolean paused);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreRotatingText getComponent();
}
