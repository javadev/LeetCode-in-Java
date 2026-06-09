package g3801_3900.s3828_final_element_after_subarray_deletions;

// #Medium #Array #Math #Game_Theory #Brainteaser #Staff #Weekly_Contest_487
// #2026_06_09_Time_0_ms_(100.00%)_Space_114.36_MB_(5.56%)

public class Solution {
    public int finalElement(int[] nums) {
        return Math.max(nums[0], nums[nums.length - 1]);
    }
}
