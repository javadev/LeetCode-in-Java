package g1401_1500.s1451_rearrange_words_in_a_sentence;

// #Medium #String #Sorting #2022_03_28_Time_21_ms_(89.94%)_Space_42.8_MB_(98.28%)

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution {
    public String arrangeWords(String text) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            int len = word.length();
            if (!map.containsKey(len)) {
                map.put(len, new ArrayList<>());
            }
            map.get(len).add(word.toLowerCase());
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int len : map.keySet()) {
            List<String> strings = map.get(len);
            for (String str : strings) {
                if (first) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                    first = false;
                }
                sb.append(str).append(" ");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
