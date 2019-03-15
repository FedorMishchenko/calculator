package operations;

public class Addition implements Operation<Double> {
    @Override
    public Double calculate(Double x, Double y) {
        return x + y;
    }
}
