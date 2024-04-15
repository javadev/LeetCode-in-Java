package g1001_1100.s1027_longest_arithmetic_subsequence;

// #Medium #Array #Hash_Table #Dynamic_Programming #Binary_Search
// #2022_02_26_Time_47_ms_(98.28%)_Space_50.8_MB_(93.45%)

import java.util.Arrays;

public class Solution {
    public int longestArithSeqLength(int[] nums) {
        int max = maxElement(nums);
        int min = minElement(nums);
        int diff = max - min;
        int n = nums.length;
        int[][] dp = new int[n][2 * diff + 2];
        for (int[] d : dp) {
            Arrays.fill(d, 1);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int difference = nums[i] - nums[j] + diff;
                int temp = dp[j][difference];
                dp[i][difference] = Math.max(dp[i][difference], temp + 1);
                if (ans < dp[i][difference]) {
                    ans = dp[i][difference];
                }
            }
        }
        return ans;
    }

    private int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (Integer e : arr) {
            if (max < e) {
                max = e;
            }
        }
        return max;
    }

    private int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (Integer e : arr) {
            if (min > e) {
                min = e;
            }
        }
        return min;
    }
}
