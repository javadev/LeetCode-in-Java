package g0601_0700.s0665_non_decreasing_array;

// #Medium #Array

public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (i - 2 >= 0 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
                count++;
            }
            if (count >= 2) {
                return false;
            }
        }
        return true;
    }
}
