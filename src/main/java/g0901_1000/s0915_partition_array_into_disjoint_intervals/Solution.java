package g0901_1000.s0915_partition_array_into_disjoint_intervals;

// #Medium #Array

public class Solution {
    public int partitionDisjoint(int[] nums) {
        int partition = 0;
        for (int i = 1, currentMax = nums[0], max = nums[0]; i < nums.length; i++)
            if (nums[i] < currentMax) {
                currentMax = max;
                partition = i;
            } else {
                max = Math.max(max, nums[i]);
            }

        return partition + 1;
    }
}
