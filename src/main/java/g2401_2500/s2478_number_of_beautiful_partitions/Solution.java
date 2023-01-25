package g2401_2500.s2478_number_of_beautiful_partitions;

// #Hard #String #Dynamic_Programming #2023_01_25_Time_44_ms_(90.08%)_Space_55.1_MB_(32.23%)

@SuppressWarnings("java:S135")
public class Solution {
    public int beautifulPartitions(String s, int k, int l) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        if (!prime(cs[0]) || prime(cs[n - 1])) {
            return 0;
        }
        int[][] dp = new int[k][n];
        for (int i = n - l; 0 <= i; --i) {
            dp[0][i] = prime(cs[i]) ? 1 : 0;
        }
        for (int i = 1; i < k; ++i) {
            int sum = 0;
            for (int j = n - i * l; 0 <= j; --j) {
                int mod = (int) 1e9 + 7;
                if (0 == dp[i - 1][j]) {
                    dp[i - 1][j] = sum;
                } else if (0 != j && 0 == dp[i - 1][j - 1]) {
                    sum = (sum + dp[i - 1][j]) % mod;
                }
            }
            int p = l - 1;
            for (int j = 0; j + l * i < n; ++j) {
                if (!prime(cs[j])) {
                    continue;
                }
                p = Math.max(p, j + l - 1);
                while (prime(cs[p])) {
                    p++;
                }
                if (0 == dp[i - 1][p]) {
                    break;
                }
                dp[i][j] = dp[i - 1][p];
            }
        }
        return dp[k - 1][0];
    }

    private boolean prime(char c) {
        return '2' == c || '3' == c || '5' == c || '7' == c;
    }
}
