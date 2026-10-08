package dev.reuise.core.input;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
import java.util.function.Function;
public interface CoreSegmentedTextFieldPartOptions {
    Integer getSegments();

    ComponentOption<Integer> getSegmentsOption();

    CoreSegmentedTextFieldPartOptions setSegments(Integer segments);

    List<CoreTextField> getFields();

    ComponentOption<List<CoreTextField>> getFieldsOption();

    CoreSegmentedTextFieldPartOptions setFields(List<CoreTextField> fields);

    <T> CoreSegmentedTextFieldPartOptions setFields(List<T> data, Function<T, CoreTextField> mapper);

    CoreSegmentedTextFieldPartOptions addField(CoreTextField field);

    CoreSegmentedTextFieldPartOptions removeField(CoreTextField field);

    CoreSegmentedTextFieldPartOptions clearFields();

    List<Object> getFieldData();

    Function<Object, CoreTextField> getFieldDataMapper();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreSegmentedTextField getComponent();
}
