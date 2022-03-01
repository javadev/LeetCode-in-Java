package g0801_0900.s0805_split_array_with_same_average;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask

import java.util.Arrays;

public class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        int m = nums.length;
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        Arrays.sort(nums);
        for (int len = 1; len <= m / 2; len++) {
            if (sum * len % m == 0 && dfs(nums, sum * len / m, len, 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean dfs(int[] nums, int sum, int len, int idx) {
        if (len == 0) {
            return sum == 0;
        }
        if (sum < 0 || idx >= nums.length) {
            return false;
        }
        if (nums[idx] > sum / len) {
            return false;
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            if (dfs(nums, sum - nums[i], len - 1, i + 1)) {
                return true;
            }
        }
        return false;
    }
}
