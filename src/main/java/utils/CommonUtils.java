package utils;

import org.jetbrains.annotations.Nullable;

public class CommonUtils {
    public static <T> T firstNonNull(@Nullable T... params) {
        for (T param : params)
            if (param != null)
                return param;
        return null;
    }
}
