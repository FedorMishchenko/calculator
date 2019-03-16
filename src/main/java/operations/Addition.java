package operations;

public class Addition implements Operation<Float> {
    @Override
    public Float calculate(Float x, Float y) {
        return x + y;
    }
}
