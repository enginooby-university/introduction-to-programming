package labs.lab5;

import java.util.HashMap;

import static utils.LogUtils.*;
import static utils.ScanUtils.*;
import static utils.CommonUtils.*;

public class Problem1 {
    public static void main(String[] args) {
        var wordsCounts = new HashMap<String, Integer>();

        for (String word : scanStrings("Enter words (separated by whitespace): ")) {
            Integer currentCount = firstNonNull(wordsCounts.get(word), 0);
            wordsCounts.put(word, currentCount + 1);
        }

        log(wordsCounts);
    }
}
