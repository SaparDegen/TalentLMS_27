import java.util.function.UnaryOperator;

public class MyOperation implements UnaryOperator<Double> {

    @Override
    public Double apply(Double o) {
        return Math.sqrt(o);
    }

}
