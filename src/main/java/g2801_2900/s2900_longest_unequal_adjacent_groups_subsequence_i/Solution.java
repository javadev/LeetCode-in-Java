package g2801_2900.s2900_longest_unequal_adjacent_groups_subsequence_i;

// #Easy #Array #String #Dynamic_Programming #Greedy
// #2023_12_20_Time_1_ms_(100.00%)_Space_45_MB_(7.16%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S1172")
public class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        int prev = groups[0];
        for (int i = 1; i < groups.length; i++) {
            if (prev != groups[i]) {
                ans.add(words[i]);
                prev = groups[i];
            }
        }
        return ans;
    }
}
