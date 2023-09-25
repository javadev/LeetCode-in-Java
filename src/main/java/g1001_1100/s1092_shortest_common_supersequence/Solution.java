package g1001_1100.s1092_shortest_common_supersequence;

// #Hard #String #Dynamic_Programming #2022_02_23_Time_10_ms_(96.12%)_Space_45.9_MB_(59.02%)

public class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // Length of the ShortestSuperSequence
        int l = dp[m][n];
        char[] arr = new char[l];
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            /* If current character in str1 and str2 are same, then
            current character is part of shortest supersequence */
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                arr[--l] = str1.charAt(i - 1);
                i--;
                j--;
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                arr[--l] = str1.charAt(i - 1);
                i--;
            } else {
                arr[--l] = str2.charAt(j - 1);
                j--;
            }
        }
        while (i > 0) {
            arr[--l] = str1.charAt(i - 1);
            i--;
        }
        while (j > 0) {
            arr[--l] = str2.charAt(j - 1);
            j--;
        }
        return new String(arr);
    }
}
