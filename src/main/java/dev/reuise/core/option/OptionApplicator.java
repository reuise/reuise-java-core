package dev.reuise.core.option;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dev.reuise.core.State;

public class OptionApplicator {
    private List<AbstractComponentOptionOperation<?>> operations;
    private boolean onlyForcedOptions = false;

    public OptionApplicator() {
    }

    public <T> void add(ComponentOption<T> option, ApplyOperation<T> operation) {
        if(option == null) return;
        T value = option.getValue();
        if(value == null) return;

        //operation.apply(value);
        initList();
        operations.add(new ComponentOptionOperation<T>(option, operation));
    }

    public <T> void add(ComponentOption<T> option, State state, ApplyOperationWithState<T> operation) {
        if(option == null) return;
        T value = option.getValue();
        if(value == null) return;
        
        //operation.apply(value, state);

        initList();
        operations.add(new ComponentOptionOperationWithState<T>(option, operation, state));
    }

    private void initList() {
        if(operations != null) return;
        operations = new ArrayList<>();
    }

    public boolean isOnlyForcedOptions() {
        return onlyForcedOptions;
    }

    public void setOnlyForcedOptions(boolean onlyForcedOptions) {
        this.onlyForcedOptions = onlyForcedOptions;
    }

    private Stream<AbstractComponentOptionOperation<?>> getOperationsStream() {
        initList();
        Stream<AbstractComponentOptionOperation<?>> stream = operations.stream();
        if(onlyForcedOptions) return stream.filter(AbstractComponentOptionOperation::isOptionForce);
        return stream;
    }

    public List<AbstractComponentOptionOperation<?>> getOperations() {
        initList();
        return getOperationsStream().collect(Collectors.toList());
    }

    public List<AbstractComponentOptionOperation<?>> getAllOperations() {
        initList();
        return operations;
    }

    public List<AbstractComponentOptionOperation<?>> getSortedOperations() {
        return getOperationsStream().sorted(Comparator.comparingInt(AbstractComponentOptionOperation::getOptionIndex)).collect(Collectors.toList());
    }

    public void run() throws ApplyOperationException {
        if(operations == null) return;

        List<AbstractComponentOptionOperation<?>> sorted = getSortedOperations();
        for(AbstractComponentOptionOperation<?> o : sorted) o.apply();
    }
}
