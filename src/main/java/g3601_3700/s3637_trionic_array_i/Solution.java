package g3601_3700.s3637_trionic_array_i;

// #Easy #Weekly_Contest_461 #2025_08_03_Time_1_ms_(100.00%)_Space_42.62_MB_(100.00%)

public class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 0;
        int q = 0;
        int n = nums.length;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i - 1] == nums[i]) {
                return false;
            }
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                if (p != 0) {
                    return false;
                }
                p = i;
            }
            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                if (p == 0 || q != 0) {
                    return false;
                }
                q = i;
            }
        }
        return q > 0;
    }
}
