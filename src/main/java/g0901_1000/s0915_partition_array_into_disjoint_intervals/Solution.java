package g0901_1000.s0915_partition_array_into_disjoint_intervals;

// #Medium #Array #2022_03_29_Time_2_ms_(99.81%)_Space_96.1_MB_(47.60%)

public class Solution {
    public int partitionDisjoint(int[] nums) {
        int res = 0;
        int leftMax = nums[0];
        int greater = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (greater <= nums[i]) {
                greater = nums[i];
            } else if (nums[i] < leftMax) {
                res = i;
                leftMax = greater;
            }
        }
        return res + 1;
    }
}
