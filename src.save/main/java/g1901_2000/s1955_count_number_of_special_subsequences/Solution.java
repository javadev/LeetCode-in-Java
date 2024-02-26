package g1901_2000.s1955_count_number_of_special_subsequences;

// #Hard #Array #Dynamic_Programming #2022_05_18_Time_22_ms_(80.65%)_Space_121_MB_(27.42%)

public class Solution {
    public int countSpecialSubsequences(int[] nums) {
        int mod = 1000000007;
        int[] dp = new int[] {1, 0, 0, 0};
        for (int n : nums) {
            dp[n + 1] = (dp[n] + 2 * dp[n + 1] % mod) % mod;
        }
        return dp[3];
    }
}
