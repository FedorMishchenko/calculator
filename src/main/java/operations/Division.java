package operations;

public class Division implements Operation<Float> {
    @Override
    public Float calculate(Float x, Float y) {
        return x / y;
    }
}
