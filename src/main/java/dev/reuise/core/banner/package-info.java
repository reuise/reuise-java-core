/**
 * Application-neutral announcements. Configure {@code Message} for escaped plain text,
 * or add components to {@code getContent()}. Add real buttons or links to
 * {@code getActions()}; configure {@code IconOptions} for a decorative icon.
 * The icon must not be the only indication of the message's meaning.
 *
 * <p>Use {@code setVisible(boolean)} to control the announcement. On the server,
 * supply the initial {@code Visible} option from application-owned state; a hidden
 * banner renders a native {@code hidden} attribute that hydration preserves.
 * Do not render it visible and then read browser storage to hide it on startup.
 * If the server cannot know the choice, render it hidden and reveal it deliberately
 * once the application has resolved visibility.
 *
 * <p>Assign a stable, distinct {@code CampaignId}, for example
 * {@code summer-sale-2027-v1}, to each campaign. Set {@code Dismissible} and a
 * localized {@code DismissLabel} to offer a dismiss button. {@code DismissHandler}
 * receives a {@link dev.reuise.core.banner.BannerDismissEvent} containing the current
 * ID; it does not hide the banner. Reattach the handler on the client when hydrating.
 * The application may hide it, move focus to an appropriate existing control, and
 * remember that specific ID. Changing the ID never hides or reveals a banner:
 * the application must also supply the new campaign's visibility. There is no
 * global dismissed flag, storage access, scheduling, discount formatting or
 * eligibility evaluation in this component.
 *
 * <p>The dismiss control is a native non-submit button: Tab, Enter and Space work
 * normally. There is no Escape shortcut, focus trap, automatic focus move, live
 * region or alert role. Supply an accessible section label or live-region semantics
 * explicitly when the application requires them. The visual {@code Tone} can be
 * {@code neutral}, {@code informational}, {@code warning} or {@code custom}.
 * Override {@code --reuise-banner-background}, {@code --reuise-banner-color} and
 * {@code --reuise-banner-border}, or use instance styles/application classes.
 * Unsupported tone strings use neutral styling.
 *
 * <p>ConsentBanner shares only notice-surface and wrapping-action CSS. It does not
 * inherit this component's dismiss callback, campaign state or any new behavior.
 */
package dev.reuise.core.banner;
