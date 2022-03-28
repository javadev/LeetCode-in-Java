package g0801_0900.s0896_monotonic_array;

// #Easy #Array #Programming_Skills_II_Day_1 #2022_03_28_Time_2_ms_(86.21%)_Space_94_MB_(5.42%)

public class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        for (; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                break;
            }
        }
        if (i == nums.length - 1) {
            return true;
        }
        i = 0;
        for (; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        return i == nums.length - 1;
    }
}
