package labs.lab5;

import static utils.LogUtils.*;
import static utils.NumeralUtils.*;

public class Problem2 {
    public static void main(String[] args) {
        String template = "I will never spam my friends again.";

        for (int i = 1; i <= 100; i++) {
            char randomChar = (char) Random('a', 'z');
            int randomPos = Random(1, 8);
            logf(i + ". ");
            log(template.substring(0, randomPos) + randomChar + template.substring(randomPos));
        }
    }
}
