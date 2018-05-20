package Storeware;

public class Multiply extends AbstractOperation {
    private Double value;
    public Multiply(Operation operation, double value) {
        super(operation);
        this.value = value;
    }

    @Override
    public double getValue() {
        return super.getValue() * value;
    }
}
