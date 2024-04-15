package g2001_2100.s2085_count_common_words_with_one_occurrence;

// #Easy #Array #String #Hash_Table #Counting #2022_05_27_Time_6_ms_(77.66%)_Space_47.1_MB_(6.87%)

import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        // Putting the "words1" array in the map
        for (String s : words1) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        // Putting "words2" array in another map
        for (String s : words2) {
            if (!map1.containsKey(s)) {
                map1.put(s, 1);
            } else {
                map1.put(s, map1.get(s) + 1);
            }
        }
        // traversing through the "words1" array
        for (String s : words1) {
            // Checking if the key is present and is matching in both maps
            // and if the key has appeared just one time in "map1" map
            if (Objects.equals(map.get(s), map1.get(s)) && map1.get(s) == 1) {
                count++;
            }
        }
        return count;
    }
}
