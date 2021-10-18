import static utils.LogUtils.*;
import static utils.ScanUtils.*;

import math.functional.interfaces.*;

public class Lab1 {
    public static void main(String[] args) {
        displayMenu();
        int option = scanInt("Enter a number: ");
        switch (option) {
            case 1 -> Problem1();
            case 2 -> Problem2();
            case 3 -> Problem3();
            case 4 -> Problem4();
            default -> throw new IllegalArgumentException("Invalid option!");
        }
    }

    private static void displayMenu() {
        log("[1]. Calculate average of three integers");
        log("[2]. Convert miles into kilometers");
        log("[3]. Convert seconds into hours, minutes and seconds");
        log("[4]. Calculate car fuel consumption");
    }

    private static void Problem1() {
        double num1 = scanDouble("Enter 1st number: ");
        double num2 = scanDouble("Enter 2nd number: ");
        double num3 = scanDouble("Enter 3rd number: ");
        log(">>> Average of three numbers is %.2f", (num1 + num2 + num3) / 3);
    }

    static MathOneParamFunc<Double> MileToKmFunc = mile -> mile * 1.609d;

    private static void Problem2() {
        double mile = scanDouble("Enter a distance (mi): ");
        log(">>> Distance is %.2f (km)", mile, MileToKmFunc.calc(mile));
    }

    private static void Problem3() {
        int durationInSecs = scanInt("Enter number of seconds: ");
        int hours = (durationInSecs / 60) / 60;
        int minutes = (durationInSecs / 60) % 60;
        int seconds = durationInSecs % 60;
        log(">>> %d hour(s), %d minute(s), %d second(s)", hours, minutes, seconds);
    }

    private static void Problem4() {
        double o0 = scanDouble("Enter starting odometer (mi): ");
        double o1 = scanDouble("Enter ending odometer (mi): ");
        double l = scanDouble("Enter refueled gas (l): ");
        double consumption = l / MileToKmFunc.calc(o1 - o0) * 100;
        log(">>> Car fuel consumption is %.2f (l/100km)", consumption);
    }
}
