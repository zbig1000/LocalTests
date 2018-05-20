package Storeware;

public class Apply implements Operation {
    private Double value;

    public Apply(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

}
