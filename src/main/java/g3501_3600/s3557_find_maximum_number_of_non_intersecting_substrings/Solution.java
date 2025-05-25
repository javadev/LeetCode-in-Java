package g3501_3600.s3557_find_maximum_number_of_non_intersecting_substrings;

// #Medium #2025_05_25_Time_103_ms_(100.00%)_Space_54.87_MB_(100.00%)

import java.util.Deque;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class Solution {
    public int maxSubstrings(String s) {
        Deque<Integer>[] last = new LinkedList[26];
        for (int k = 0; k < 26; k++) {
            last[k] = new LinkedList<>();
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            dp[i + 1] = dp[i];
            for (int j : last[c]) {
                if (i - j + 1 >= 4) {
                    dp[i + 1] = Math.max(dp[i + 1], dp[j] + 1);
                }
            }
            last[c].addLast(i);
            if (last[c].size() > 4) {
                last[c].removeFirst();
            }
        }
        return dp[n];
    }
}
