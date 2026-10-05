package dev.reuise.core.input;
import java.util.List;
import java.util.function.Function;
public interface CoreSegmentedTextFieldFeatures {
    Integer getSegments();

    CoreSegmentedTextFieldFeatures setSegments(Integer segments);

    List<CoreTextField> getFields();

    CoreSegmentedTextFieldFeatures setFields(List<CoreTextField> fields);

    <T> CoreSegmentedTextFieldFeatures setFields(List<T> data, Function<T, CoreTextField> mapper);

    CoreSegmentedTextFieldFeatures addField(CoreTextField field);

    CoreSegmentedTextFieldFeatures removeField(CoreTextField field);

    CoreSegmentedTextFieldFeatures clearFields();

    List<Object> getFieldData();

    Function<Object, CoreTextField> getFieldDataMapper();
}