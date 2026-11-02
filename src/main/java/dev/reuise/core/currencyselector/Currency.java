package dev.reuise.core.currencyselector;

public final class Currency {
    private final String code;
    private final String name;

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /** The ISO 4217 alpha code. */
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /** The label shown in the selector, e.g. "AUD - Australian Dollar". */
    public String getLabel() {
        return code + " \u2013 " + name;
    }

    @Override
    public String toString() {
        return getLabel();
    }
}
