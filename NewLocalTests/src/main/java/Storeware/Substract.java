package Storeware;

public class Substract extends AbstractOperation {
    private double value;
    public Substract(Operation operation, double value) {
        super(operation);
        this.value = value;
    }

    @Override
    public double getValue() {
        return super.getValue() - value;
    }
}
