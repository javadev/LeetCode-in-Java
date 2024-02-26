package g1801_1900.s1859_sorting_the_sentence;

// #Easy #String #Sorting #2022_05_08_Time_2_ms_(50.32%)_Space_42_MB_(55.85%)

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (String word : words) {
            int key = Integer.parseInt(word.charAt(word.length() - 1) + "");
            treeMap.put(key, word.substring(0, word.length() - 1));
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            sb.append(entry.getValue());
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
