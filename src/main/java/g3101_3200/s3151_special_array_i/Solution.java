package g3101_3200.s3151_special_array_i;

// #Easy #Array #2024_05_22_Time_0_ms_(100.00%)_Space_43.2_MB_(51.16%)

public class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 == 1 && nums[i] % 2 == 1) {
                return false;
            }
            if (nums[i - 1] % 2 == 0 && nums[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
