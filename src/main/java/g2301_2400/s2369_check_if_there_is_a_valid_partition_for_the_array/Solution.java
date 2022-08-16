package g2301_2400.s2369_check_if_there_is_a_valid_partition_for_the_array;

// #Medium #Array #Dynamic_Programming #2022_08_16_Time_5_ms_(100.00%)_Space_52.1_MB_(90.91%)

public class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = false;
        // for n==2 check only for 1 condition
        dp[1] = nums[0] == nums[1];
        if (n == 2) {
            return dp[1];
        }
        // checking for all 3 conditions from question
        dp[2] =
                (nums[0] == nums[1] && nums[1] == nums[2]
                        || nums[0] + 1 == nums[1] && nums[2] == nums[1] + 1);
        for (int i = 3; i < n; i++) {
            dp[i] =
                    (dp[i - 2] && nums[i - 1] == nums[i])
                            || dp[i - 3]
                                    && (nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2]
                                            || nums[i - 2] + 1 == nums[i - 1]
                                                    && nums[i] == nums[i - 1] + 1);
        }
        return dp[n - 1];
    }
}
