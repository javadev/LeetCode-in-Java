package g0901_1000.s0915_partition_array_into_disjoint_intervals;

// #Medium #Array

public class Solution {
    public int partitionDisjoint(int[] nums) {
        int partition = 0;
        for (int i = 1; i < nums.length; i++) {
            int currentMax = nums[0];
            if (nums[i] < currentMax) {
                partition = i;
            }
        }
        return partition + 1;
    }
}
