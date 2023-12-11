package g1301_1400.s1316_distinct_echo_substrings;

// #Hard #String #Dynamic_Programming #Sliding_Window #Trie #Hash_Function #Rolling_Hash
// #2022_03_19_Time_165_ms_(93.15%)_Space_65.3_MB_(55.48%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private static final int PRIME = 101;
    private static final int MOD = 1_000_000_007;

    public int distinctEchoSubstrings(String text) {
        int n = text.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            long hash = 0;
            for (int j = i; j < n; j++) {
                hash = hash * PRIME + (text.charAt(j) - 'a' + 1);
                hash %= MOD;
                dp[i][j] = (int) hash;
            }
        }

        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; 2 * j - i + 1 < n; j++) {
                if (dp[i][j] == dp[j + 1][2 * j - i + 1] && set.add(dp[i][j])) {
                    res++;
                }
            }
        }

        return res;
    }
}
