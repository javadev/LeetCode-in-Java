package g2701_2800.s2787_ways_to_express_an_integer_as_sum_of_powers;

// #Medium #Dynamic_Programming #2023_09_15_Time_12_ms_(98.96%)_Space_42.4_MB_(86.68%)

public class Solution {
    public int numberOfWays(int n, int x) {
        int[] dp = new int[301];
        int mod = 1000000007;
        int v;
        dp[0] = 1;
        int a = 1;
        while (Math.pow(a, x) <= n) {
            v = (int) Math.pow(a, x);
            for (int i = n; i >= v; i--) {
                dp[i] = (dp[i] + dp[i - v]) % mod;
            }
            a++;
        }
        return dp[n];
    }
}
