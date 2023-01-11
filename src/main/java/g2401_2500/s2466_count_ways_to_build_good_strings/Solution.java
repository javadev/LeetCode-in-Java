package g2401_2500.s2466_count_ways_to_build_good_strings;

// #Medium #Dynamic_Programming #2023_01_11_Time_8_ms_(99.59%)_Space_41_MB_(98.19%)

public class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[zero]++;
        dp[one]++;
        int ans = 0;
        for (int i = 0; i < high + 1; i++) {
            if (dp[i] != 0) {
                if (i + zero <= high) {
                    dp[i + zero] += dp[i];
                    dp[i + zero] = dp[i + zero] % 1000000007;
                }
                if (i + one <= high) {
                    dp[i + one] += dp[i];
                    dp[i + one] = dp[i + one] % 1000000007;
                }
                if (i >= low) {
                    ans += dp[i];
                    ans = ans % 1000000007;
                }
            }
        }
        return ans;
    }
}
