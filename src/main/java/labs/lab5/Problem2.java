package labs.lab5;

import java.util.Random;

import static utils.LogUtils.*;
import static utils.NumeralUtils.*;

public class Problem2 {
    static String template = "I will never spam my friends again.";

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            char randomChar = (char) Random('a', 'z');
            log(generateTypo(randomChar, Random(1, template.length() - 1)));
        }
    }

    public static String generateTypo(char ch, int position) {
        return template.substring(0, position) + ch + template.substring(position);
    }
}
