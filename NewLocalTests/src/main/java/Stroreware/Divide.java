package Stroreware;

public class Divide extends AbstractOperation {
    private Double value;
    public Divide(Operation operation, double value) {
        super(operation);
        this.value = value;
    }

    @Override
    public double getValue() {
        return super.getValue() / value;
    }

}
