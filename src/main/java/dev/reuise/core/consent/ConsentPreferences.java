package dev.reuise.core.consent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Consent choices for application-defined categories. An undecided optional
 * category has a null choice; it must not be treated as consent.
 *
 * This model does not persist choices or control cookies and other storage.
 */
public final class ConsentPreferences {
    private final List<ConsentCategory> categories;
    private final Map<String, ConsentCategory> categoriesById;
    private final Map<String, Boolean> choices;

    public ConsentPreferences(List<ConsentCategory> categories) {
        Objects.requireNonNull(categories, "categories");
        List<ConsentCategory> categorySnapshot = new ArrayList<>();
        Map<String, ConsentCategory> index = new LinkedHashMap<>();
        for (ConsentCategory category : categories) {
            Objects.requireNonNull(category, "category");
            if (index.put(category.getId(), category) != null) {
                throw new IllegalArgumentException("Duplicate consent category: " + category.getId());
            }
            categorySnapshot.add(category);
        }
        this.categories = Collections.unmodifiableList(categorySnapshot);
        this.categoriesById = index;
        this.choices = new LinkedHashMap<>();
    }

    public List<ConsentCategory> getCategories() {
        return categories;
    }

    /**
     * Creates an independent copy suitable for editing before a choice is saved.
     */
    public ConsentPreferences copy() {
        ConsentPreferences copy = new ConsentPreferences(categories);
        copy.choices.putAll(choices);
        return copy;
    }

    /**
     * Returns true for required categories, or the explicit optional choice;
     * null means no choice has been made.
     */
    public Boolean getChoice(String categoryId) {
        ConsentCategory category = findCategory(categoryId);
        return category.isRequired() ? Boolean.TRUE : choices.get(categoryId);
    }

    /**
     * Sets an optional choice, or clears it when choice is null.
     * Required categories cannot be changed.
     */
    public ConsentPreferences setChoice(String categoryId, Boolean choice) {
        ConsentCategory category = findCategory(categoryId);
        if (category.isRequired()) {
            throw new IllegalArgumentException("Required category cannot be changed: " + categoryId);
        }
        if (choice == null) {
            choices.remove(categoryId);
        } else {
            choices.put(categoryId, choice);
        }
        return this;
    }

    public ConsentPreferences acceptAll() {
        return setAllOptional(true);
    }

    public ConsentPreferences rejectOptional() {
        return setAllOptional(false);
    }

    /**
     * Whether every optional category has an explicit choice.
     */
    public boolean hasCompleteChoices() {
        for (ConsentCategory category : categories) {
            if (!category.isRequired() && !choices.containsKey(category.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Replaces the optional choices with an application-supplied snapshot.
     * Missing or null optional values remain undecided. Unknown categories and
     * attempts to disable required categories are rejected without changing state.
     */
    public ConsentPreferences restoreChoices(Map<String, Boolean> snapshot) {
        Objects.requireNonNull(snapshot, "snapshot");
        Map<String, Boolean> restored = new LinkedHashMap<>();
        for (Map.Entry<String, Boolean> entry : snapshot.entrySet()) {
            ConsentCategory category = findCategory(entry.getKey());
            Boolean choice = entry.getValue();
            if (category.isRequired()) {
                if (!Boolean.TRUE.equals(choice)) {
                    throw new IllegalArgumentException("Required category cannot be disabled: " + entry.getKey());
                }
            } else if (choice != null) {
                restored.put(entry.getKey(), choice);
            }
        }
        choices.clear();
        choices.putAll(restored);
        return this;
    }

    private ConsentPreferences setAllOptional(boolean choice) {
        for (ConsentCategory category : categories) {
            if (!category.isRequired()) {
                choices.put(category.getId(), choice);
            }
        }
        return this;
    }

    /**
     * Returns an independent snapshot including required and undecided categories.
     */
    public Map<String, Boolean> getChoices() {
        Map<String, Boolean> snapshot = new LinkedHashMap<>();
        for (ConsentCategory category : categories) {
            snapshot.put(category.getId(), getChoice(category.getId()));
        }
        return Collections.unmodifiableMap(snapshot);
    }

    private ConsentCategory findCategory(String categoryId) {
        ConsentCategory category = categoriesById.get(categoryId);
        if (category == null) {
            throw new IllegalArgumentException("Unknown consent category: " + categoryId);
        }
        return category;
    }
}
