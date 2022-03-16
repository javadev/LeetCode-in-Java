package g0301_0400.s0377_combination_sum_iv;

// #Medium #Array #Dynamic_Programming #Dynamic_Programming_I_Day_21
// #2022_03_16_Time_1_ms_(91.72%)_Space_41.5_MB_(43.01%)

import java.util.Arrays;

public class Solution {
    int[] storage;

    public int combinationSum4(int[] nums, int target) {
        storage = new int[target + 1];
        Arrays.fill(storage, -1);
        return result(nums, target);
    }

    private int result(int[] nums, int target) {
        if (target < 0) {
            return 0;
        }
        if (target == 0) {
            return 1;
        }
        if (storage[target] != -1) {
            return storage[target];
        }
        int count = 0;
        for (int i : nums) {
            count += result(nums, target - i);
        }
        storage[target] = count;
        return count;
    }
}
