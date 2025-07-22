package dev.reuise.core;
import dev.reuise.core.option.OptionApplicator;
import java.util.Collection;
public interface ComponentType<C extends CoreComponent, O extends CoreComponentOptions> extends CoreComponent , ComponentPart {
    void applyOptions(O options, OptionApplicator applicator, Collection<State> states);

    boolean onPreInitialize(O options);

    void onInitialize(O options);

    void onCreate(O options);
}