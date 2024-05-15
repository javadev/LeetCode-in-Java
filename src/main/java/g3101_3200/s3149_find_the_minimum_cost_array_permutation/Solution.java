package g3101_3200.s3149_find_the_minimum_cost_array_permutation;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2024_05_15_Time_105_ms_(88.11%)_Space_46.5_MB_(64.32%)

import java.util.Arrays;

public class Solution {
    private int findMinScore(int mask, int prevNum, int[] nums, int[][] dp) {
        int n = nums.length;
        if (Integer.bitCount(mask) == n) {
            return dp[mask][prevNum] = Math.abs(prevNum - nums[0]);
        }
        if (dp[mask][prevNum] != -1) {
            return dp[mask][prevNum];
        }
        int minScore = Integer.MAX_VALUE;
        for (int currNum = 0; currNum < n; currNum++) {
            if ((mask >> currNum & 1 ^ 1) == 1) {
                int currScore =
                        Math.abs(prevNum - nums[currNum])
                                + findMinScore(mask | 1 << currNum, currNum, nums, dp);
                minScore = Math.min(minScore, currScore);
            }
        }
        return dp[mask][prevNum] = minScore;
    }

    private int[] constructMinScorePermutation(int n, int[] nums, int[][] dp) {
        int[] permutation = new int[n];
        int i = 0;
        permutation[i++] = 0;
        for (int mask = 1, prevNum = 0; i < n; mask |= 1 << prevNum) {
            for (int currNum = 0; currNum < n; currNum++) {
                if ((mask >> currNum & 1 ^ 1) == 1) {
                    int currScore =
                            Math.abs(prevNum - nums[currNum]) + dp[mask | 1 << currNum][currNum];
                    int minScore = dp[mask][prevNum];
                    if (currScore == minScore) {
                        permutation[i++] = currNum;
                        prevNum = currNum;
                        break;
                    }
                }
            }
        }
        return permutation;
    }

    public int[] findPermutation(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[1 << n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        findMinScore(1, 0, nums, dp);
        return constructMinScorePermutation(n, nums, dp);
    }
}
