package utils;

import java.util.Scanner;

public class ScanUtils {
    static Scanner scanner = new Scanner(System.in);

    public static int scanInt(String message){
        System.out.printf(message);
        return scanner.nextInt();
    }

    public static double scanDouble(String message){
        System.out.printf(message);
        return scanner.nextDouble();
    }
}
