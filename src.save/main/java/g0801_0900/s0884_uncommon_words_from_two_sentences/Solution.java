package g0801_0900.s0884_uncommon_words_from_two_sentences;

// #Easy #String #Hash_Table #2022_03_28_Time_1_ms_(100.00%)_Space_40.8_MB_(89.40%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        String[] strs = new String[result.size()];
        result.toArray(strs);
        return strs;
    }
}
