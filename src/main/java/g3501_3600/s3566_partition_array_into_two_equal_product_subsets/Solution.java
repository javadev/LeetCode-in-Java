package g3501_3600.s3566_partition_array_into_two_equal_product_subsets;

// #Medium #Array #Bit_Manipulation #Recursion #Enumeration
// #2025_06_03_Time_0_ms_(100.00%)_Space_42.45_MB_(36.66%)

public class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        for (int num : nums) {
            if (target % num != 0) {
                return false;
            }
        }
        long pro = 1;
        for (long n : nums) {
            pro *= n;
        }
        return pro == target * target;
    }
}
