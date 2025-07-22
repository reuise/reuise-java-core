package dev.reuise.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreVideoPlayerOptions<S extends AbstractCoreVideoPlayerOptions<S>> implements CoreVideoPlayerOptions , CoreComponentOptions {
    protected AbstractCoreVideoPlayerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getPoster() {
        return ((String) (getOptionValue("poster")));
    }

    @Override
    public ComponentOption<String> getPosterOption() {
        return ((ComponentOption<String>) (getOption("poster")));
    }

    @Override
    public S setPoster(String poster) {
        setOption("poster", poster);
        return self();
    }

    private void setDefaultPoster(String poster) {
        setDefaultOption("poster", poster);
    }

    protected abstract S self();
}