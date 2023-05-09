package g2301_2400.s2338_count_the_number_of_ideal_arrays;

// #Hard #Dynamic_Programming #Math #Number_Theory #Combinatorics
// #2022_07_13_Time_21_ms_(99.04%)_Space_46.3_MB_(81.25%)

import java.util.Arrays;

public class Solution {
    public int idealArrays(int n, int maxValue) {
        int mod = (int) (1e9 + 7);
        int maxDistinct = (int) (Math.log(maxValue) / Math.log(2)) + 1;
        int[][] dp = new int[maxDistinct + 1][maxValue + 1];
        Arrays.fill(dp[1], 1);
        dp[1][0] = 0;
        for (int i = 2; i <= maxDistinct; i++) {
            for (int j = 1; j <= maxValue; j++) {
                for (int k = 2; j * k <= maxValue && dp[i - 1][j * k] != 0; k++) {
                    dp[i][j] += dp[i - 1][j * k];
                }
            }
        }
        int[] sum = new int[maxDistinct + 1];
        for (int i = 1; i <= maxDistinct; i++) {
            sum[i] = Arrays.stream(dp[i]).sum();
        }
        long[] invs = new long[Math.min(n, maxDistinct) + 1];
        invs[1] = 1;
        for (int i = 2; i < invs.length; i++) {
            invs[i] = mod - mod / i * invs[mod % i] % mod;
        }
        long result = maxValue;
        long comb = (long) n - 1;
        for (int i = 2; i <= maxDistinct && i <= n; i++) {
            result += (sum[i] * comb) % mod;
            comb *= n - i;
            comb %= mod;
            comb *= invs[i];
            comb %= mod;
        }
        return (int) (result % mod);
    }
}
