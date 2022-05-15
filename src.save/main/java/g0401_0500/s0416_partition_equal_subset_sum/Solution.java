package g0401_0500.s0416_partition_equal_subset_sum;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Acceptance_46.4%
// #2022_03_18_Time_1_ms_(99.87%)_Space_41.5_MB_(90.64%)

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        // if use primitive boolean array will make default value to false
        // we need the default value "null" to help us to do the memo
        Boolean[] dp = new Boolean[sum + 1];
        return sumTo(nums, sum, 0, dp);
    }

    private boolean sumTo(int[] nums, int sum, int index, Boolean[] dp) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0) {
            return false;
        }
        if (index == nums.length) {
            return false;
        }
        if (dp[sum] != null) {
            return dp[sum];
        }
        // use the number or not use the number
        dp[sum] = sumTo(nums, sum - nums[index], index + 1, dp) || sumTo(nums, sum, index + 1, dp);
        return dp[sum];
    }
}
