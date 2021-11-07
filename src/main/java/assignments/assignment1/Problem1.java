/***************************************************************************************
 *    Name: Ngo Trong Hieu
 *    ID: 15943
 *    Course: Introduction to Programming
 *    University: Wyższa Szkoła Handlowa we Wrocławiu
 ***************************************************************************************/
package assignments.assignment1;

import java.math.BigDecimal;

import static utils.LogUtils.*;
import static utils.ScanUtils.*;

public class Problem1 {
    public static void main(String[] args) {
        var polishCurrencies = new double[]{100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        changeMoney(scanDouble("Enter a monetary amount (zl): "), polishCurrencies);
    }

    private static void changeMoney(double amount, double[] currencies) {
        for (int i = 0; i < currencies.length; i++) {
            logCurrencyAmount((int) (amount / currencies[i]), currencies[i]);
            amount %= currencies[i];
            // round amount left to prevent small FPU error (e.g. input 10.6 w/ and w/o this to see difference)
            amount = Math.round(amount * 100.00) / 100.00;
        }
    }

    private static void logCurrencyAmount(int currencyAmount, double currencyValue) {
        if (currencyAmount == 0) return;
        String currentyUnit = (currencyValue >= 1) ? (int) currencyValue + "zl" : (int) (currencyValue * 100) + "gr";
        log(currentyUnit + " - " + currencyAmount);
    }
}
