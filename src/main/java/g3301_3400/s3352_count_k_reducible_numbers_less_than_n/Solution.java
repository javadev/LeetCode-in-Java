package g3301_3400.s3352_count_k_reducible_numbers_less_than_n;

// #Hard #String #Dynamic_Programming #Math #Combinatorics
// #2024_11_15_Time_11_ms_(99.58%)_Space_42.6_MB_(95.85%)

public class Solution {
    private static final int MOD = (int) (1e9 + 7);

    public int countKReducibleNumbers(String s, int k) {
        int n = s.length();
        int[] reducible = new int[n + 1];
        for (int i = 2; i < reducible.length; i++) {
            reducible[i] = 1 + reducible[Integer.bitCount(i)];
        }
        long[] dp = new long[n + 1];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                dp[j + 1] += dp[j];
                dp[j + 1] %= MOD;
            }
            if (s.charAt(i) == '1') {
                dp[curr]++;
                dp[curr] %= MOD;
                curr++;
            }
        }
        long result = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (reducible[i] < k) {
                result += dp[i];
                result %= MOD;
            }
        }
        return (int) (result % MOD);
    }
}
