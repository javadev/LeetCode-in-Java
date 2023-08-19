package g2501_2600.s2552_count_increasing_quadruplets;

// #Hard #Array #Dynamic_Programming #Prefix_Sum #Enumeration #Binary_Indexed_Tree
// #2023_08_18_Time_48_ms_(97.29%)_Space_43_MB_(93.41%)

import java.util.Arrays;

public class Solution {
    public long countQuadruplets(int[] nums) {
        int n = nums.length;
        long[] dp = new long[n];
        Arrays.fill(dp, 0);
        long ret = 0;
        for (int i = 1; i < n; i++) {
            int choice = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    choice++;
                    ret += dp[j];
                } else if (nums[i] < nums[j]) {
                    dp[j] += choice;
                }
            }
        }
        return ret;
    }
}
