package g3501_3600.s3566_partition_array_into_two_equal_product_subsets;

// #Medium #2025_06_01_Time_0_ms_(100.00%)_Space_42.01_MB_(78.42%)

public class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        for (int num : nums) {
            if (target % (long) num != 0) {
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
