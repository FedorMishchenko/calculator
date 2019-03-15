package operations;

public class Multiplication implements Operation<Double> {
    @Override
    public Double calculate(Double x, Double y) {
        return x * y;
    }
}
