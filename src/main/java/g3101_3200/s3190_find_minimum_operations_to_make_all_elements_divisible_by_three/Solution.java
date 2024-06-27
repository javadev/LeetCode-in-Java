package g3101_3200.s3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

// #Easy #Array #Math #2024_06_26_Time_0_ms_(100.00%)_Space_41.6_MB_(78.56%)

public class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
