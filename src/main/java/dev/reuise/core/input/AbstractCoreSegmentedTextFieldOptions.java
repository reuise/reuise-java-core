package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public abstract class AbstractCoreSegmentedTextFieldOptions<S extends AbstractCoreSegmentedTextFieldOptions<S>> implements CoreSegmentedTextFieldOptions , CoreComponentOptions {
    private List<Object> fieldData;

    private Function<Object, CoreTextField> fieldDataMapper;

    protected AbstractCoreSegmentedTextFieldOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setFields(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Integer getSegments() {
        return ((Integer) (getOptionValue("segments")));
    }

    @Override
    public ComponentOption<Integer> getSegmentsOption() {
        return ((ComponentOption<Integer>) (getOption("segments")));
    }

    @Override
    public S setSegments(Integer segments) {
        setOption("segments", segments);
        return self();
    }

    private void setDefaultSegments(Integer segments) {
        setDefaultOption("segments", segments);
    }

    @Override
    public List<CoreTextField> getFields() {
        return ((List<CoreTextField>) (getOptionValue("fields")));
    }

    @Override
    public ComponentOption<List<CoreTextField>> getFieldsOption() {
        return ((ComponentOption<List<CoreTextField>>) (getOption("fields")));
    }

    @Override
    public S setFields(List<CoreTextField> fields) {
        setOption("fields", fields, true);
        return self();
    }

    @Override
    public S addField(CoreTextField field) {
        List<CoreTextField> list = getFields();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setFields(list);
        }
        list.add(field);
        return self();
    }

    @Override
    public S removeField(CoreTextField field) {
        List<CoreTextField> list = getFields();
        if (list == null) {
            return self();
        }
        list.remove(field);
        return self();
    }

    @Override
    public S clearFields() {
        List<CoreTextField> list = getFields();
        if (list == null) {
            return self();
        }
        list.clear();
        return self();
    }

    public List<Object> getFieldData() {
        return fieldData;
    }

    public Function<Object, CoreTextField> getFieldDataMapper() {
        return fieldDataMapper;
    }

    @Override
    public <T> S setFields(List<T> data, Function<T, CoreTextField> mapper) {
        this.fieldData = ((List<Object>) (data));
        this.fieldDataMapper = ((Function<Object, CoreTextField>) (mapper));
        return self();
    }

    private void setDefaultFields(List<CoreTextField> fields) {
        setDefaultOption("fields", fields, true);
    }

    protected abstract S self();
}