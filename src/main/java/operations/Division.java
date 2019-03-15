package operations;

public class Division implements Operation<Double> {
    @Override
    public Double calculate(Double x, Double y) {
        return x / y;
    }
}
