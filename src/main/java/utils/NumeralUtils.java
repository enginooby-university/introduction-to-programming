package utils;

public class NumeralUtils {
    /**
     * Return a random integer in the given range (inclusively).
     */
    public static int Random(int min, int max) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
