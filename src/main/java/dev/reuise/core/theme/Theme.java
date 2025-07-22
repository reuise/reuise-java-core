package dev.reuise.core.theme;
public class Theme {
    protected ComponentTheme globalTheme;

    protected ComponentTheme buttonTheme;

    protected ComponentTheme headingTheme;

    protected ComponentTheme textFieldTheme;

    protected ComponentTheme tabTheme;

    protected ComponentTheme surfaceTheme;

    protected ComponentTheme dialogTheme;

    public Theme() {
    }

    public ComponentTheme getGlobalTheme() {
        return globalTheme;
    }

    public Theme setGlobalTheme(ComponentTheme globalTheme) {
        this.globalTheme = globalTheme;
        return this;
    }

    public ComponentTheme getButtonTheme() {
        return buttonTheme;
    }

    public Theme setButtonTheme(ComponentTheme buttonTheme) {
        this.buttonTheme = buttonTheme;
        return this;
    }

    public ComponentTheme getHeadingTheme() {
        return headingTheme;
    }

    public Theme setHeadingTheme(ComponentTheme headingTheme) {
        this.headingTheme = headingTheme;
        return this;
    }

    public ComponentTheme getTextFieldTheme() {
        return textFieldTheme;
    }

    public Theme setTextFieldTheme(ComponentTheme textFieldTheme) {
        this.textFieldTheme = textFieldTheme;
        return this;
    }

    public ComponentTheme getTabTheme() {
        return tabTheme;
    }

    public Theme setTabTheme(ComponentTheme tabTheme) {
        this.tabTheme = tabTheme;
        return this;
    }

    public ComponentTheme getSurfaceTheme() {
        return surfaceTheme;
    }

    public Theme setSurfaceTheme(ComponentTheme surfaceTheme) {
        this.surfaceTheme = surfaceTheme;
        return this;
    }

    public ComponentTheme getDialogTheme() {
        return dialogTheme;
    }

    public Theme setDialogTheme(ComponentTheme dialogTheme) {
        this.dialogTheme = dialogTheme;
        return this;
    }

    public static Theme create() {
        return new Theme();
    }
}