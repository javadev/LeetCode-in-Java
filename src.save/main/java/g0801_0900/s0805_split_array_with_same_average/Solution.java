package g0801_0900.s0805_split_array_with_same_average;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2022_08_19_Time_1_ms_(100.00%)_Space_41.6_MB_(95.76%)

import java.util.Arrays;

public class Solution {
    private int[] nums;
    private int[] sums;

    public boolean splitArraySameAverage(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return false;
        }
        Arrays.sort(nums);
        sums = new int[len + 1];
        for (int i = 0; i < len; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
        int sum = sums[len];
        this.nums = nums;
        for (int i = 1, stop = len / 2; i <= stop; i++) {
            if ((sum * i) % len == 0 && findSum(i, len, (sum * i) / len)) {
                return true;
            }
        }
        return false;
    }

    private boolean findSum(int k, int pos, int target) {
        if (k == 1) {
            while (true) {
                if (nums[--pos] <= target) {
                    break;
                }
            }
            return nums[pos] == target;
        }
        for (int i = pos; sums[i] - sums[i-- - k] >= target; ) {
            if (sums[k - 1] <= target - nums[i] && findSum(k - 1, i, target - nums[i])) {
                return true;
            }
        }
        return false;
    }
}
