package g3401_3500.s3467_transform_array_by_parity;

// #Easy #2025_03_02_Time_2_ms_(100.00%)_Space_45.06_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
