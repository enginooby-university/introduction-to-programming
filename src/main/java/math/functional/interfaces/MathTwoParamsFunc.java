package math.functional.interfaces;

@FunctionalInterface
public interface MathTwoParamsFunc<T> {
    double calc(T param1, T param2);
}
