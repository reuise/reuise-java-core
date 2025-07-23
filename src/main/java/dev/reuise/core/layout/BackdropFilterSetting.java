package dev.reuise.core.layout;

public class BackdropFilterSetting {
    private final BackdropFilter filter;
    private final Object value;

    public BackdropFilterSetting(BackdropFilter filter, Object value) {
        this.filter = filter;
        this.value = value;
    }

    public BackdropFilter getFilter() {
        return filter;
    }

    public Object getValue() {
        return value;
    }

    public String getCssValue() {
        String name = filter.name().toLowerCase().replace('_', '-');
        String unit = getUnit(filter);
        return name + "(" + value + unit + ")";
    }

    public static BackdropFilterSetting parseCss(String css) {
        int open = css.indexOf('(');
        int close = css.indexOf(')', open);

        if (open == -1 || close == -1) return null;

        String namePart = css.substring(0, open).trim();
        String valuePart = css.substring(open + 1, close).trim();

        // Convert to enum name format
        String enumName = namePart.toUpperCase().replace('-', '_');
        BackdropFilter filter = BackdropFilter.valueOf(enumName);

        String unit = getUnit(filter);
        String numeric = valuePart.endsWith(unit)
                ? valuePart.substring(0, valuePart.length() - unit.length())
                : valuePart;

        Object value = parseValue(numeric);

        return new BackdropFilterSetting(filter, value);
    }

    private static String getUnit(BackdropFilter filter) {
        switch (filter) {
            case BLUR:
                return "px";
            case HUE_ROTATE:
                return "deg";
            default:
                return ""; // unitless
        }
    }

    private static Object parseValue(String str) {
        if (str.indexOf('.') >= 0) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException e) {
                return 0.0;
            }
        } else {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return getCssValue();
    }
}
