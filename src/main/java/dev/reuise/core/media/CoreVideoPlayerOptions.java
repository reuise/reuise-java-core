package dev.reuise.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreVideoPlayerOptions extends CoreBaseComponentPartOptions , CoreMediaPlayerOptions , CoreMediaPlayerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreVideoPlayerPartOptions {
    CoreMediaPlayerPartOptions getMediaPlayerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}