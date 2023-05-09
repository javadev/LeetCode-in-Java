package g1501_1600.s1531_string_compression_ii;

// #Hard #String #Dynamic_Programming #2022_04_09_Time_34_ms_(83.91%)_Space_54.2_MB_(25.65%)

public class Solution {
    private final int[][] dp = new int[101][101];

    private int getLen(int cnt) {
        if (cnt == 0) {
            return 0;
        }
        if (cnt == 1) {
            return 1;
        }
        if (cnt < 10) {
            return 2;
        }
        if (cnt < 100) {
            return 3;
        }
        return 4;
    }

    public int getLengthOfOptimalCompression(String s, int k) {
        char[] sarr = s.toCharArray();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = -1;
            }
        }
        return dfs(sarr, 0, k);
    }

    private int dfs(char[] sarr, int pos, int k) {
        if (k < 0) {
            return -1;
        }
        if (pos == sarr.length || sarr.length - pos <= k) {
            return 0;
        }
        if (dp[pos][k] != -1) {
            return dp[pos][k];
        }
        int[] cnts = new int[26];
        int most = 0;
        int res = -1;
        for (int j = pos; j < sarr.length; j++) {
            cnts[sarr[j] - 'a']++;
            most = Math.max(most, cnts[sarr[j] - 'a']);
            int cost = dfs(sarr, j + 1, k - (j - pos + 1 - most));
            if (cost == -1) {
                continue;
            }
            if (res == -1) {
                res = cost + getLen(most);
            } else {
                res = Math.min(res, cost + getLen(most));
            }
        }
        dp[pos][k] = res;
        return res;
    }
}
