package g1001_1100.s1048_longest_string_chain;

// #Medium #Array #String #Hash_Table #Dynamic_Programming #Two_Pointers
// #2022_02_28_Time_23_ms_(97.92%)_Space_46.6_MB_(66.36%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Solution {
    public int longestStrChain(String[] words) {
        List[] lenStr = new List[20];
        for (String word : words) {
            int len = word.length();
            if (lenStr[len] == null) {
                lenStr[len] = new ArrayList<String>();
            }
            lenStr[len].add(word);
        }
        Map<String, Integer> longest = new HashMap<>();
        int max = 0;
        for (String s : words) {
            max = Math.max(findLongest(s, lenStr, longest), max);
        }
        return max;
    }

    public int findLongest(String word, List<String>[] lenStr, Map<String, Integer> longest) {
        if (longest.containsKey(word)) {
            return longest.get(word);
        }
        int len = word.length();
        List<String> words = lenStr[len + 1];
        if (words == null) {
            longest.put(word, 1);
            return 1;
        }
        int max = 0;
        int i;
        int j;
        for (String w : words) {
            i = 0;
            j = 0;
            while (i < len && j - i <= 1) {
                if (word.charAt(i) == w.charAt(j++)) {
                    ++i;
                }
            }
            if (j - i <= 1) {
                max = Math.max(findLongest(w, lenStr, longest), max);
            }
        }
        ++max;
        longest.put(word, max);
        return max;
    }
}
