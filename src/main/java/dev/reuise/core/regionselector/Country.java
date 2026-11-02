package dev.reuise.core.regionselector;

public final class Country {
    private final String code;
    private final String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /** The ISO 3166-1 alpha-2 code. */
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
