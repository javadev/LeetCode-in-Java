package g2901_3000.s2915_length_of_the_longest_subsequence_that_sums_to_target;

// #Medium #Array #Dynamic_Programming #2023_12_28_Time_23_ms_(91.30%)_Space_44.5_MB_(66.47%)

import java.util.List;

public class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[] dp = new int[target + 1];
        for (int i = 1; i <= target; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                if (dp[j - num] != -1) {
                    dp[j] = Math.max(dp[j], dp[j - num] + 1);
                }
            }
        }
        if (dp[target] == -1) {
            return -1;
        }
        return dp[target];
    }
}
