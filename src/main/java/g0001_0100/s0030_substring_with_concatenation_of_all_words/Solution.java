package g0001_0100.s0030_substring_with_concatenation_of_all_words;

// #Hard #String #Hash_Table #Sliding_Window #2023_08_09_Time_1472_ms_(34.43%)_Space_45_MB_(24.98%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("java:S127")
public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        if (words.length == 0) {
            return indices;
        }
        // Put each word into a HashMap and calculate word frequency
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        int wordLength = words[0].length();
        int window = words.length * wordLength;
        for (int i = 0; i < wordLength; i++) {
            // move a word's length each time
            for (int j = i; j + window <= s.length(); j = j + wordLength) {
                // get the subStr
                String subStr = s.substring(j, j + window);
                Map<String, Integer> map = new HashMap<>();
                // start from the last word
                for (int k = words.length - 1; k >= 0; k--) {
                    // get the word from subStr
                    String word = subStr.substring(k * wordLength, (k + 1) * wordLength);
                    int count = map.getOrDefault(word, 0) + 1;
                    // if the num of the word is greater than wordMap's, move (k * wordLength) and
                    // break
                    if (count > wordMap.getOrDefault(word, 0)) {
                        j = j + k * wordLength;
                        break;
                    } else if (k == 0) {
                        indices.add(j);
                    } else {
                        map.put(word, count);
                    }
                }
            }
        }
        return indices;
    }
}
