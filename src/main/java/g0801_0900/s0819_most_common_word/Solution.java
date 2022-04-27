package g0801_0900.s0819_most_common_word;

// #Easy #String #Hash_Table #Counting #2022_03_23_Time_10_ms_(88.85%)_Space_42_MB_(88.98%)

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("\\p{Punct}", " ").toLowerCase();
        String[] a = paragraph.split(" ");
        for (int i = 0; i < banned.length; i++) {
            banned[i] = banned[i].toLowerCase();
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : a) {
            int x = map.getOrDefault(s, 0);
            map.put(s, x + 1);
        }
        for (String s : banned) {
            map.remove(s);
            map.remove("");
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
