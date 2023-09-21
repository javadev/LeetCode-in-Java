package g2701_2800.s2781_length_of_the_longest_valid_substring;

// #Hard #Array #String #Hash_Table #Sliding_Window
// #2023_09_21_Time_137_ms_(75.23%)_Space_60.4_MB_(65.51%)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        Set<String> set = new HashSet<>();
        for (String s : forbidden) {
            set.add(s);
        }
        int n = word.length();
        int ans = 0;
        int i = 0;
        int j = 0;
        while (j < n) {
            int k = j;
            while (k > j - 10 && k >= i) {
                if (set.contains(word.substring(k, j + 1))) {
                    i = k + 1;
                    break;
                }
                k--;
            }
            ans = Math.max(j - i + 1, ans);
            j++;
        }
        return ans;
    }
}
