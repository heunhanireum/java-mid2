package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            Integer count = wordFreq.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            wordFreq.put(word, count);
        }

        /*
        for (String word : words) {
            if (wordFreq.containsKey(word)) {
                wordFreq.put(word, wordFreq.get(word) + 1);
            } else {
                wordFreq.put(word, 1);
            }
        }
        */

        System.out.println(wordFreq);

    }
}
