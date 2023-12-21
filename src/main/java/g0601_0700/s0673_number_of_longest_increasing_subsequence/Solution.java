package g0601_0700.s0673_number_of_longest_increasing_subsequence;

// #Medium #Array #Dynamic_Programming #Segment_Tree #Binary_Indexed_Tree
// #Algorithm_II_Day_16_Dynamic_Programming #2022_03_22_Time_25_ms_(68.75%)_Space_44.5_MB_(35.85%)

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        dp[0] = 1;
        count[0] = 1;
        int result = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            count[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[i] == dp[j] + 1) {
                        count[i] += count[j];
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (max < dp[i]) {
                result = count[i];
                max = dp[i];
            } else if (max == dp[i]) {
                result += count[i];
            }
        }
        return result;
    }
}
