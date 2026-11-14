package dev.reuise.core;

import java.util.function.Function;

import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.link.CoreLink;

/** Internal notification support for inherited navigation URL resolvers. */
public interface LinkUrlResolverState {
    String ORIGINAL_HREF = "data-reuise-original-href";

    Function<String, String> getLinkUrlResolver();

    void addLinkUrlResolverListener(Runnable listener);

    void removeLinkUrlResolverListener(Runnable listener);

    static boolean isNavigation(CoreComponent component) {
        return component instanceof CoreLink || component instanceof CoreButton || component instanceof CoreIconButton;
    }

    static LinkUrlResolverState of(CoreComponent component) {
        if (component instanceof CoreParentComponentPart) {
            Object base = ((CoreParentComponentPart) component).getBaseComponentPart();
            if (base instanceof LinkUrlResolverState) return (LinkUrlResolverState) base;
        }
        return component instanceof LinkUrlResolverState ? (LinkUrlResolverState) component : null;
    }

    static String resolve(LinkUrlResolverState state, String url) {
        HtmlEscaper.url(url);
        Function<String, String> resolver = state == null ? null : state.getLinkUrlResolver();
        if (resolver == null) return url;
        String resolved = resolver.apply(url);
        if (resolved == null) throw new IllegalArgumentException("The link URL resolver returned null for: " + url);
        return HtmlEscaper.url(resolved);
    }
}
