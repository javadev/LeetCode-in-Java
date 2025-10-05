package g3701_3800.s3701_compute_alternating_sum;

// #Easy #Weekly_Contest_470 #2025_10_05_Time_1_ms_(100.00%)_Space_44.28_MB_(66.67%)

public class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i % 2 == 0) sum += num;
            else sum -= num;
        }
        return sum;
    }
}
