package g3401_3500.s3409_longest_subsequence_with_decreasing_adjacent_difference;

// #Medium #Array #Dynamic_Programming #2025_01_07_Time_68_(99.55%)_Space_45.74_(78.73%)

public class Solution {
    public int longestSubsequence(int[] nums) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(n, max);
        }
        max += 1;
        int[][] dp = new int[max][max];
        for (int i : nums) {
            int v = 1;
            for (int diff = max - 1; diff >= 0; diff--) {
                if (i + diff < max) {
                    v = Math.max(v, dp[i + diff][diff] + 1);
                }
                if (i - diff >= 0) {
                    v = Math.max(v, dp[i - diff][diff] + 1);
                }
                dp[i][diff] = v;
            }
        }
        int res = 0;
        for (int[] i : dp) {
            for (int j : i) {
                res = Math.max(res, j);
            }
        }
        return res;
    }
}
