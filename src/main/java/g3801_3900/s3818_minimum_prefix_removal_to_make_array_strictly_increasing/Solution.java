package g3801_3900.s3818_minimum_prefix_removal_to_make_array_strictly_increasing;

// #Medium #Array #Senior #Weekly_Contest_486
// #2026_06_09_Time_1_ms_(99.63%)_Space_119.92_MB_(80.97%)

public class Solution {
    public int minimumPrefixLength(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] < nums[i]) {
            --i;
        }
        return i;
    }
}
