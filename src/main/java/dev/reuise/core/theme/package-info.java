/**
 * Theme colors and gradient backgrounds can derive interaction states from a
 * normal value. For example:
 *
 * <pre>{@code
 * ThemeColorSet linkColors = ThemeColorSet.create("#2468ac")
 *     .setVariation(Interaction.HOVER, ColorVariation.lighten(0.10));
 * Gradient gradient = Gradient.linear(90,
 *     Gradient.Stop.at(new Color("#2468ac"), 0),
 *     Gradient.Stop.at(new Color("#8844cc"), 100));
 * ThemeGradientSet buttons = ThemeGradientSet.create(gradient)
 *     .setVariation(Interaction.HOVER, ColorVariation.darken(0.10));
 * ComponentTheme buttonTheme = ComponentTheme.create().setPrimaryGradient(buttons);
 * }</pre>
 *
 * A color or gradient created from a normal value defaults to 20% darker on
 * hover, 30% darker on active and focus, and half its original opacity when
 * disabled. These match the existing solid-color darkening defaults.
 * Variations follow changes to the normal value. Explicit colors or gradients
 * for a state replace that state's variation. Mix, multiply, screen and overlay
 * are color calculations, not CSS compositing with content behind an element.
 * For an optional separate overlay over either a solid or a gradient background:
 *
 * <pre>{@code
 * ThemeOverlaySet overlays = new ThemeOverlaySet().setOverlay(Interaction.HOVER,
 *     BackgroundOverlay.color(new Color("#2040ff").withAlpha(64),
 *         BackgroundBlendMode.MULTIPLY));
 * buttonTheme.setPrimaryOverlay(overlays);
 * }</pre>
 *
 * {@code BackgroundOverlay.gradient(...)} uses a gradient layer instead. These
 * layers use CSS background blending, not blending with arbitrary page content.
 * Button primary/secondary and dialog background theme roles consume gradients;
 * the matching solid role remains the fallback.
 */
package dev.reuise.core.theme;
