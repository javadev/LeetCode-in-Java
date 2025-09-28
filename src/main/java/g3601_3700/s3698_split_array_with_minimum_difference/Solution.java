package g3601_3700.s3698_split_array_with_minimum_difference;

// #Medium #Weekly_Contest_469 #2025_09_28_Time_2_ms_(99.58%)_Space_62.78_MB_(7.35%)

public class Solution {
    public long splitArray(int[] nums) {
        int i = 1;
        int n = nums.length;
        long suml = nums[0];
        long sumr = 0;
        while (i < n && nums[i] > nums[i - 1]) {
            suml += nums[i];
            i++;
        }
        if (i == n) {
            return Math.abs(suml - nums[n - 1] - nums[n - 1]);
        }
        int pivot = nums[i] == nums[i - 1] ? 0 : nums[i - 1];
        sumr = nums[i];
        i += 1;
        while (i < n && nums[i] < nums[i - 1]) {
            sumr += nums[i];
            i++;
        }
        if (i != n) {
            return -1;
        }
        if (suml <= sumr) {
            return sumr - suml;
        } else {
            if (suml - sumr - 2 * pivot > 0) {
                return suml - sumr - 2 * pivot;
            } else {
                return Math.min(suml - sumr, Math.abs(suml - sumr - 2 * pivot));
            }
        }
    }
}
