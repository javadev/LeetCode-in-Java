package g0901_1000.s0931_minimum_falling_path_sum;

// #Medium #Array #Dynamic_Programming #Matrix

public class Solution {
    public int minFallingPathSum(int[][] A) {
        int size = A.length;
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0) {
                    dp[i][j] = A[i][j];
                } else {
                    int lastRow = dp[i - 1][j];
                    if (j - 1 >= 0) {
                        lastRow = Math.min(dp[i - 1][j - 1], lastRow);
                    }
                    if (j + 1 < size) {
                        lastRow = Math.min(dp[i - 1][j + 1], lastRow);
                    }
                    dp[i][j] = lastRow + A[i][j];
                }
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            minSum = Math.min(minSum, dp[size - 1][i]);
        }
        return minSum;
    }
}
