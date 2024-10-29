package g3301_3400.s3333_find_the_original_typed_string_ii;

// #Hard #String #Dynamic_Programming #Prefix_Sum
// #2024_10_29_Time_89_ms_(90.20%)_Space_55.6_MB_(40.38%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final long MOD = (long) 1e9 + 7;

    public int possibleStringCount(String word, int k) {
        List<Integer> list = new ArrayList<>();
        int n = word.length();
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && word.charAt(j) == word.charAt(j - 1)) {
                j++;
            }
            list.add(j - i);
            i = j;
        }
        int m = list.size();
        long[] power = new long[m];
        power[m - 1] = list.get(m - 1);
        for (i = m - 2; i >= 0; i--) {
            power[i] = (power[i + 1] * list.get(i)) % MOD;
        }
        if (m >= k) {
            return (int) power[0];
        }
        long[][] dp = new long[m][k - m + 1];
        for (i = 0; i < k - m + 1; i++) {
            if (list.get(m - 1) + i + m > k) {
                dp[m - 1][i] = list.get(m - 1) - (long) (k - m - i);
            }
        }
        for (i = m - 2; i >= 0; i--) {
            long sum = (dp[i + 1][k - m] * list.get(i)) % MOD;
            for (int j = k - m; j >= 0; j--) {
                sum += dp[i + 1][j];
                if (j + list.get(i) > k - m) {
                    sum = (sum - dp[i + 1][k - m] + MOD) % MOD;
                } else {
                    sum = (sum - dp[i + 1][j + list.get(i)] + MOD) % MOD;
                }
                dp[i][j] = sum;
            }
        }
        return (int) dp[0][0];
    }
}
