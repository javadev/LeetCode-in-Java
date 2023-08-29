package g2201_2300.s2294_partition_array_such_that_maximum_difference_is_k;

// #Medium #Array #Sorting #Greedy #2022_06_17_Time_35_ms_(94.09%)_Space_62.9_MB_(90.61%)

import java.util.Arrays;

public class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int partitions = 1;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[j] > k) {
                partitions++;
                j = i;
            }
        }
        return partitions;
    }
}
