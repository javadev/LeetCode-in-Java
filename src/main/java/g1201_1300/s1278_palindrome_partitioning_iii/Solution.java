package g1201_1300.s1278_palindrome_partitioning_iii;

// #Hard #String #Dynamic_Programming #2022_03_12_Time_4_ms_(89.93%)_Space_42.6_MB_(30.60%)

import java.util.Arrays;

public class Solution {
    public int palindromePartition(String s, int k) {
        int n = s.length();
        int[][] pal = new int[n + 1][n + 1];
        fillPal(s, n, pal);
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return calculateMinCost(s, 0, n, k, pal, dp);
    }

    private int calculateMinCost(String s, int index, int n, int k, int[][] pal, int[][] dp) {
        if (index == n) {
            return n;
        }
        if (k == 1) {
            return pal[index][n - 1];
        }
        if (dp[index][k] != -1) {
            return dp[index][k];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = index; i < n; i++) {
            ans = Math.min(ans, pal[index][i] + calculateMinCost(s, i + 1, n, k - 1, pal, dp));
        }
        dp[index][k] = ans;
        return ans;
    }

    private void fillPal(String s, int n, int[][] pal) {
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {
                if (gap == 0) {
                    pal[i][i] = 0;
                } else if (gap == 1) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        pal[i][i + 1] = 0;
                    } else {
                        pal[i][i + 1] = 1;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        pal[i][j] = pal[i + 1][j - 1];
                    } else {
                        pal[i][j] = pal[i + 1][j - 1] + 1;
                    }
                }
            }
        }
    }
}
