import static utils.LogUtils.*;
import static utils.ScanUtils.*;
import math.functional.interfaces.*;

public class Lab2 {
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
        log("[1]. Compute the volume of a cylinder");
        log("[2]. Calculate sum the digits in an integer");
        log("[3]. Calculate tips");
        log("[4]. Caculate acceleration");
    }

    private static void Problem1() {
        MathOneParamFunc<Double> CylinderAreaByRadiusFunc = radius
                -> radius * radius * Math.PI;
        MathTwoParamsFunc<Double> CylinderVolumeByRadiusAndLengthFunc = (radius, length)
                -> CylinderAreaByRadiusFunc.calc(radius) * length;

        double radius = scanDouble("Enter radius (m): ");
        double length = scanDouble("Enter length (m): ");
        log(">>> Area of the cylinder is %f (m2)", CylinderAreaByRadiusFunc.calc(radius));
        log(">>> Volume of the cylinder is %f (m3)", CylinderVolumeByRadiusAndLengthFunc.calc(radius, length));
    }

    private static void Problem2() {
        MathOneParamFunc<Integer> SumDigitsFunc = num -> {
            int sum = 0;
            for (; num > 0; sum += num % 10, num /= 10) ;
            return sum;
        };

        int num = scanInt("Enter an integer: ");
        log(">>> Sum of digits in %d is %d", num, SumDigitsFunc.calc(num));
    }

    private static void Problem3() {
        MathTwoParamsFunc<Double> GratuityBySubtotalAndRateFunc = (subtotal, rate)
                -> subtotal * rate / 100;
        MathTwoParamsFunc<Double> TotalBySubtotalAndRateFunc = (subtotal, rate)
                -> subtotal + GratuityBySubtotalAndRateFunc.calc(subtotal, rate);

        double subtotal = scanDouble("Enter subtotal ($): ");
        double rate = scanDouble("Enter gratuity rate (%%): ");
        log(">>> Gratuity is $%.2f", GratuityBySubtotalAndRateFunc.calc(subtotal, rate));
        log(">>> Total is $%.2f", TotalBySubtotalAndRateFunc.calc(subtotal, rate));
    }

    private static void Problem4() {
        MathThreeParamsFunc<Double> AccelerationByStartingVelEndingVelAndTimeFunc = (v0, v1, t)
                -> (v1 - v0) / t;

        double v0 = scanDouble("Enter starting velocity (m/s): ");
        double v1 = scanDouble("Enter ending velocity (m/s): ");
        double t = scanDouble("Enter time span (s): ");
        log(">>> Average acceleration is %.2f (m/s2)", AccelerationByStartingVelEndingVelAndTimeFunc.calc(v0, v1, t));
    }
}
