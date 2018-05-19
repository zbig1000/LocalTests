package Stroreware;

public class Add extends AbstractOperation {
    private Double value;
    public Add(Operation operation, double value) {
        super(operation);
        this.value = value;
    }

    @Override
    public double getValue() {
        return super.getValue() + value;
    }
}
