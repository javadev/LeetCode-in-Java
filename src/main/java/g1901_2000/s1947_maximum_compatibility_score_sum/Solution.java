package g1901_2000.s1947_maximum_compatibility_score_sum;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_05_18_Time_2_ms_(95.90%)_Space_42.1_MB_(48.72%)

import java.util.Arrays;

public class Solution {
    private int[][] dp;
    private int m;
    private int[][] memo;

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int n = students[0].length;
        m = students.length;
        dp = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = 0;
                for (int k = 0; k < n; k++) {
                    tmp += (students[i][k] == mentors[j][k] ? 1 : 0);
                }
                dp[i][j] = tmp;
            }
        }
        memo = new int[m][(1 << m) + 1];
        for (int[] x : memo) {
            Arrays.fill(x, -1);
        }
        return dp(0, 0);
    }

    private int dp(int idx, int mask) {
        if (idx == m) {
            return 0;
        }
        if (memo[idx][mask] != -1) {
            return memo[idx][mask];
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if ((mask & (1 << i)) == 0) {
                ans = Math.max(ans, dp[idx][i] + dp(idx + 1, mask | (1 << i)));
            }
        }
        memo[idx][mask] = ans;
        return ans;
    }
}
