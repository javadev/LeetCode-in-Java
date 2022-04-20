package g1601_1700.s1638_count_substrings_that_differ_by_one_character;

// #Medium #String #Hash_Table #Dynamic_Programming
// #2022_04_20_Time_5_ms_(76.39%)_Space_42.6_MB_(33.42%)

public class Solution {
    public int countSubstrings(String s, String t) {
        int ans = 0;
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        int[][] tp = new int[n + 1][m + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    tp[i][j] = tp[i + 1][j + 1];
                } else {
                    tp[i][j] = dp[i + 1][j + 1] + 1;
                }
                ans = ans + tp[i][j];
            }
        }
        return ans;
    }
}
