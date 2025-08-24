package g3601_3700.s3659_partition_array_into_k_distinct_groups;

// #Medium #Weekly_Contest_464 #2025_08_24_Time_81_ms_(100.00%)_Space_62.78_MB_(100.00%)

import java.util.HashMap;

public class Solution {
    public boolean partitionArray(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int x : nums) {
            mpp.put(x, mpp.getOrDefault(x, 0) + 1);
        }
        for (int count : mpp.values()) {
            if (count > nums.length / k) {
                return false;
            }
        }
        return nums.length % k == 0;
    }
}
