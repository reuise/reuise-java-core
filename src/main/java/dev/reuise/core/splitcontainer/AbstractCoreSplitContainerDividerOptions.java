package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreSplitContainerDividerOptions<S extends AbstractCoreSplitContainerDividerOptions<S>> implements CoreSplitContainerDividerOptions , CoreComponentOptions {
    protected AbstractCoreSplitContainerDividerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultThickness(6);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Integer getThickness() {
        return ((Integer) (getOptionValue("thickness")));
    }

    @Override
    public ComponentOption<Integer> getThicknessOption() {
        return ((ComponentOption<Integer>) (getOption("thickness")));
    }

    @Override
    public S setThickness(Integer thickness) {
        setOption("thickness", thickness, true);
        return self();
    }

    @Override
    public S setThickness(Integer thickness, State state) {
        setOption("thickness", thickness, state, true);
        return self();
    }

    @Override
    public S setThicknessAllStates(Integer thickness) {
        // HIMADDIE!!
        clearOptionStates("thickness");
        setThickness(thickness);
        return self();
    }

    @Override
    public S setThickness(ScreenSizeValues<Integer> screenValues) {
        clearOption("thickness", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Integer v) -> setThickness(v, s));
        return self();
    }

    @Override
    public Integer getThickness(State state) {
        return ((Integer) (getOptionValue("thickness", state)));
    }

    @Override
    public Collection<State> getThicknessStates() {
        return getOptionStates("thickness");
    }

    @Override
    public ComponentOption<Integer> getThicknessOption(State state) {
        return ((ComponentOption<Integer>) (getOption("thickness", state)));
    }

    private void setDefaultThickness(Integer thickness) {
        setDefaultOption("thickness", thickness, true);
    }

    private void setDefaultThickness(Integer thickness, State state) {
        setDefaultOption("thickness", thickness, state, true);
    }

    private void setDefaultThicknessAllStates(Integer thickness) {
        // HIMADDIE!!
        clearOptionStates("thickness");
        setThickness(thickness);
    }

    protected abstract S self();
}