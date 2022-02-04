package g0801_0900.s0896_monotonic_array;

// #Easy #Array

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
