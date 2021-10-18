package math.functional.interfaces;

@FunctionalInterface
public interface MathThreeParamsFunc<T> {
    double calc(T param1, T param2, T param3);
}
