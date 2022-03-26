package g1401_1500.s1411_number_of_ways_to_paint_n_3_grid;

// #Hard #Dynamic_Programming #2022_03_26_Time_14_ms_(34.91%)_Space_41.2_MB_(53.09%)

import java.util.Arrays;

public class Solution {
    private static final int mod = 1000000007;

    public int numOfWays(int n) {
        int[][] dp = new int[n + 1][12];
        int[][] transfer = new int[12][5];

        Arrays.fill(dp[1], 1);

        transfer[0] = new int[] {5, 6, 8, 9, 10};
        transfer[1] = new int[] {5, 8, 7, 9, -1};
        transfer[2] = new int[] {5, 6, 9, 10, 12};
        transfer[3] = new int[] {6, 10, 11, 12, -1};
        transfer[4] = new int[] {1, 2, 3, 11, 12};
        transfer[5] = new int[] {1, 3, 4, 11, -1};
        transfer[6] = new int[] {2, 9, 10, 12, -1};
        transfer[7] = new int[] {1, 2, 10, 11, 12};
        transfer[8] = new int[] {1, 2, 3, 7, -1};
        transfer[9] = new int[] {1, 3, 4, 7, 8};
        transfer[10] = new int[] {4, 5, 6, 8, -1};
        transfer[11] = new int[] {3, 4, 5, 7, 8};

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 12; j++) {
                int[] prevStates = transfer[j];
                int sum = 0;
                for (int s : prevStates) {
                    if (s == -1) {
                        break;
                    }
                    sum = (sum + dp[i - 1][s - 1]) % mod;
                }
                dp[i][j] = sum;
            }
        }

        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = (total + dp[n][i]) % mod;
        }
        return total;
    }
}
