package utils;

import java.util.Scanner;

public class ScanUtils {
    static Scanner scanner = new Scanner(System.in);
    // TODO: close scanner

    public static int scanInt(String message) {
        System.out.printf(message);
        return scanner.nextInt();
    }

    public static double scanDouble(String message) {
        System.out.printf(message);
        return scanner.nextDouble();
    }

    public static String scanString(String message) {
        System.out.printf(message);
        String input = "";
        input += scanner.nextLine();
        return input;
    }

    public static String[] scanStrings(String message, String splitter) {
        return scanString(message).split(splitter);
    }

    /**
     * Scan and return list of strings splitted by " ".
     */
    public static String[] scanStrings(String message) {
        return scanStrings(message, " ");
    }
}
