package operations;

public class Multiplication implements Operation<Float> {
    @Override
    public Float calculate(Float x, Float y) {
        return x * y;
    }
}
