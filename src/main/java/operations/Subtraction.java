package operations;

public class Subtraction implements Operation<Float> {
    @Override
    public Float calculate(Float x, Float y) {
        return x - y;
    }
}
