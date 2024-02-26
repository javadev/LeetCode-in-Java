package g1801_1900.s1879_minimum_xor_sum_of_two_arrays;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2022_05_11_Time_15_ms_(63.49%)_Space_42.6_MB_(53.97%)

import java.util.Arrays;

public class Solution {
    public int minimumXORSum(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int[] dp = new int[1 << l];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return dfs(dp.length - 1, l, nums1, nums2, dp, l);
    }

    private int dfs(int state, int length, int[] nums1, int[] nums2, int[] dp, int totalLength) {
        if (dp[state] >= 0) {
            return dp[state];
        }
        int min = Integer.MAX_VALUE;
        int currIndex = totalLength - length;
        int i = 0;
        for (int index = 0; i < length; index++) {
            if (((state >> index) & 1) == 1) {
                int result = dfs(state ^ (1 << index), length - 1, nums1, nums2, dp, totalLength);
                min = Math.min(min, (nums2[currIndex] ^ nums1[index]) + result);
                i++;
            }
        }
        dp[state] = min;
        return min;
    }
}
