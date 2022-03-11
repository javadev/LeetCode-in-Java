package g1201_1300.s1218_longest_arithmetic_subsequence_of_given_difference;

// #Medium #Array #Hash_Table #Dynamic_Programming
// #2022_03_11_Time_11_ms_(98.23%)_Space_63.9_MB_(78.62%)

public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int res = 0;
        int[] dp = new int[20001];
        for (int j : arr) {
            int cur = j + 10000;
            int last = j - difference + 10000;
            if (last < 0 || last > 20000) {
                dp[cur] = Math.max(dp[cur], 1);
            } else {
                dp[cur] = Math.max(dp[cur], dp[last] + 1);
            }
            res = Math.max(res, dp[cur]);
        }
        return res;
    }
}
