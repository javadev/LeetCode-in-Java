package g3101_3200.s3196_maximize_total_cost_of_alternating_subarrays;

// #Medium #Array #Dynamic_Programming #2024_06_26_Time_1_ms_(100.00%)_Space_61.5_MB_(68.90%)

public class Solution {
    public long maximumTotalCost(int[] nums) {
        int n = nums.length;
        long addResult = nums[0];
        long subResult = nums[0];
        for (int i = 1; i < n; i++) {
            long tempAdd = Math.max(addResult, subResult) + nums[i];
            long tempSub = addResult - nums[i];
            addResult = tempAdd;
            subResult = tempSub;
        }
        return Math.max(addResult, subResult);
    }
}
