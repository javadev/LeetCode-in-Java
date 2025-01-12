package g3401_3500.s3418_maximum_amount_of_money_robot_can_earn;

// #Medium #2025_01_12_Time_156_(_%)_Space_79.73_(_%)

import java.util.Arrays;

public class Solution {
    private int solve(int[][] coins, int r, int c, int i, int j, int skip, int[][][] dp) {
        if (i == r - 1 && j == c - 1) {
            if (coins[i][j] < 0 && skip > 0) {
                return 0;
            }
            return coins[i][j];
        } else if (dp[i][j][skip] != Integer.MIN_VALUE) {
            return dp[i][j][skip];
        }
        int val1 = Integer.MIN_VALUE;
        int val2 = Integer.MIN_VALUE;
        if (i < r - 1) {
            if (coins[i][j] < 0 && skip > 0) {
                val1 =
                        Math.max(
                                solve(coins, r, c, i + 1, j, skip - 1, dp),
                                coins[i][j] + solve(coins, r, c, i + 1, j, skip, dp));
            } else {
                val1 = coins[i][j] + solve(coins, r, c, i + 1, j, skip, dp);
            }
        }
        if (j < c - 1) {
            if (coins[i][j] < 0 && skip > 0) {
                val2 =
                        Math.max(
                                solve(coins, r, c, i, j + 1, skip - 1, dp),
                                coins[i][j] + solve(coins, r, c, i, j + 1, skip, dp));
            } else {
                val2 = coins[i][j] + solve(coins, r, c, i, j + 1, skip, dp);
            }
        }

        return dp[i][j][skip] = Math.max(val1, val2);
    }

    public int maximumAmount(int[][] coins) {
        int r = coins.length;
        int c = coins[0].length;
        int[][][] dp = new int[r][c][3];
        for (int[][] arr1 : dp) {
            for (int[] arr2 : arr1) {
                Arrays.fill(arr2, Integer.MIN_VALUE);
            }
        }
        return solve(coins, r, c, 0, 0, 2, dp);
    }
}
