package labs.lab5;

import java.util.HashMap;
import java.util.Map;

import static utils.LogUtils.*;
import static utils.ScanUtils.*;

public class Problem1 {
    public static void main(String[] args) {
        Map<String, Integer> wordsCounts = new HashMap<String, Integer>();
        String words = scanString("Enter list of words: ");
        String[] wordArray = words.split(" ");
        for (String word : wordArray) {
            Integer count = wordsCounts.get(word) == null ? 1 : wordsCounts.get(word) + 1;
            wordsCounts.put(word, count);
        }
    }
}
