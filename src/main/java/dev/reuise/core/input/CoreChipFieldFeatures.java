package dev.reuise.core.input;
import java.util.List;
public interface CoreChipFieldFeatures {
    boolean isMultiple();

    CoreChipFieldFeatures setMultiple(Boolean multiple);

    List<String> getValues();

    CoreChipFieldFeatures setValues(List<String> values);

    CoreChipFieldFeatures addValue(String value);

    CoreChipFieldFeatures removeValue(String value);

    boolean hasValue(String value);

    List<String> getDelimiters();

    CoreChipFieldFeatures setDelimiters(List<String> delimiters);

    CoreChipFieldFeatures addDelimiter(String delimiter);

    CoreChipFieldFeatures removeDelimiter(String delimiter);

    boolean hasDelimiter(String delimiter);

    boolean isAllowDuplicates();

    CoreChipFieldFeatures setAllowDuplicates(Boolean allowDuplicates);
}