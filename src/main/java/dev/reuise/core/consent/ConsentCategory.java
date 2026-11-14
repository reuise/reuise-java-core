package dev.reuise.core.consent;

import java.util.Objects;

/**
 * An application-defined category presented in consent preferences.
 */
public final class ConsentCategory {
    private final String id;
    private final String label;
    private final String description;
    private final boolean required;

    public ConsentCategory(String id, String label, String description, boolean required) {
        this.id = requireText(id, "id");
        this.label = requireText(label, "label");
        this.description = Objects.requireNonNull(description, "description");
        this.required = required;
    }

    private static String requireText(String value, String name) {
        Objects.requireNonNull(value, name);
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException(name + " must not be blank");
        }
        return value;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRequired() {
        return required;
    }
}
