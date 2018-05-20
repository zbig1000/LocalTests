package Storeware;

public class AbstractOperation implements Operation {
    private Operation operation;
    public AbstractOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public double getValue() {
        return operation.getValue();
    }
}
