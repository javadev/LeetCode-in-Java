package g3601_3700.s3674_minimum_operations_to_equalize_array;

// #Easy #Array #Bit_Manipulation #Brainteaser #Weekly_Contest_466
// #2025_09_26_Time_0_ms_(100.00%)_Space_43.29_MB_(90.84%)

public class Solution {
    public int minOperations(int[] nums) {
        for (int num : nums) {
            if (num != nums[0]) {
                return 1;
            }
        }
        return 0;
    }
}
