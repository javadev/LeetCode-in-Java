package g0501_0600.s0516_longest_palindromic_subsequence;

// #Medium #String #Dynamic_Programming #Dynamic_Programming_I_Day_17
// #2022_03_19_Time_31_ms_(96.10%)_Space_51.9_MB_(82.26%)

public class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] x = s.toCharArray();
        char[] y = new StringBuilder(s).reverse().toString().toCharArray();
        int m = x.length;
        int n = y.length;
        int[][] l = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    l[i][j] = 0;
                } else if (x[i - 1] == y[j - 1]) {
                    l[i][j] = l[i - 1][j - 1] + 1;

                } else {
                    l[i][j] = Math.max(l[i - 1][j], l[i][j - 1]);
                }
            }
        }
        return l[m][n];
    }
}
