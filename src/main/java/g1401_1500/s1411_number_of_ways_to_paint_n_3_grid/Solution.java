package g1401_1500.s1411_number_of_ways_to_paint_n_3_grid;

// #Hard #Dynamic_Programming #2022_03_26_Time_14_ms_(34.91%)_Space_41.2_MB_(53.09%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1000000007;

    public int numOfWays(int n) {
        int[][] dp = new int[n + 1][12];
        Arrays.fill(dp[1], 1);
        int[][] transfer =
                new int[][] {
                    {5, 6, 8, 9, 10},
                    {5, 8, 7, 9, -1},
                    {5, 6, 9, 10, 12},
                    {6, 10, 11, 12, -1},
                    {1, 2, 3, 11, 12},
                    {1, 3, 4, 11, -1},
                    {2, 9, 10, 12, -1},
                    {1, 2, 10, 11, 12},
                    {1, 2, 3, 7, -1},
                    {1, 3, 4, 7, 8},
                    {4, 5, 6, 8, -1},
                    {3, 4, 5, 7, 8}
                };
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 12; j++) {
                int[] prevStates = transfer[j];
                int sum = 0;
                for (int s : prevStates) {
                    if (s == -1) {
                        break;
                    }
                    sum = (sum + dp[i - 1][s - 1]) % MOD;
                }
                dp[i][j] = sum;
            }
        }
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = (total + dp[n][i]) % MOD;
        }
        return total;
    }
}
