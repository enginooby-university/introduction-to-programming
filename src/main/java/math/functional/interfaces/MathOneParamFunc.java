package math.functional.interfaces;

@FunctionalInterface
public interface MathOneParamFunc<T> {
    T calc(T param);
}

