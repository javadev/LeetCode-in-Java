package g2201_2300.s2273_find_resultant_array_after_removing_anagrams;

// #2022_06_16_Time_4_ms_(85.95%)_Space_46_MB_(40.70%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        outerLoop:
        for (int i = 0; i < words.length; ) {
            res.add(words[i]);
            int[] ci = getCharCount(words[i]);
            for (int j = i + 1; j <= words.length; j++) {
                if (j == words.length) {
                    break outerLoop;
                }
                int[] cj = getCharCount(words[j]);
                if (!areAnagrams(ci, cj)) {
                    i = j;
                    break;
                }
            }
        }
        return res;
    }

    private int[] getCharCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    private boolean areAnagrams(int[] c1, int[] c2) {
        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }
}
