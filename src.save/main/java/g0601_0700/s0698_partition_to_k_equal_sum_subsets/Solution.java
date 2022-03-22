package g0601_0700.s0698_partition_to_k_equal_sum_subsets;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask #Memoization
// #2022_03_22_Time_24_ms_(85.43%)_Space_51.3_MB_(21.34%)

import java.util.Arrays;

public class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }
        // sum of each subset = sum / k
        sum /= k;
        int[] dp = new int[1 << n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < (1 << n); i++) {
            if (dp[i] == -1) {
                continue;
            }
            int rem = sum - (dp[i] % sum);
            for (int j = 0; j < n; j++) {
                // bitmask
                int tmp = i | (1 << j);
                // skip if the bit is already taken
                if (tmp != i) {
                    // num too big for current subset
                    if (nums[j] > rem) {
                        break;
                    }
                    // cumulative sum
                    dp[tmp] = dp[i] + nums[j];
                }
            }
        }
        // true if total sum of all nums is the same
        return dp[(1 << n) - 1] == k * sum;
    }
}
