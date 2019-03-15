package operations;

public class Subtraction implements Operation<Double> {
    @Override
    public Double calculate(Double x, Double y) {
        return x - y;
    }
}
