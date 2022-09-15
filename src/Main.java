import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt1().apply(25.0));

        System.out.println(sqrt2().apply(36.0));

        MyOperation operation = new MyOperation();
        System.out.println(operation.apply(49.0));
    }

    //реализация через анонимный класс
    public static UnaryOperator<Double> sqrt1() {
        UnaryOperator<Double> mySqrt = new UnaryOperator<>() {
            @Override
            public Double apply(Double a) {
                return Math.sqrt(a);
            }
        };
        return mySqrt;
    }

    //реализация через лямбда
    public static UnaryOperator<Double> sqrt2() {
        UnaryOperator<Double> mySqrt = (a) -> Math.sqrt(a);
        return mySqrt;
    }
}



