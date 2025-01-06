package g3301_3400.s3397_maximum_number_of_distinct_elements_after_operations;

// #Medium #Array #Greedy #Distinct #Elements #Mathematics #Operations #Optimization
// #2024_12_22_Time_19_ms_(100.00%)_Space_57.8_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int next = nums[0] - k + 1;
        int n = nums.length;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] + k < next) {
                continue;
            }
            next = Math.max(next, nums[i] - k);
            ans++;
            next++;
        }
        return ans;
    }
}
