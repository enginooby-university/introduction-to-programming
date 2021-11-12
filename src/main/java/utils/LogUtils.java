package utils;

public class LogUtils {
    public static void log(Object message) {
        System.out.println(message);
    }

    public static void logf(Object message) {
        System.out.printf(message.toString());
    }

    public static void log(String format, Object... args) {
        System.out.printf(format, args);
        log("");
    }

    public static void logHeading(String heading) {
        System.out.println("\n=== " + heading + " ===");
    }
}
