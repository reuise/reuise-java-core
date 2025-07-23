package dev.reuise.core.media;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreAudioPlayerOptions<S extends AbstractCoreAudioPlayerOptions<S>> implements CoreAudioPlayerOptions , CoreComponentOptions {
    protected AbstractCoreAudioPlayerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}