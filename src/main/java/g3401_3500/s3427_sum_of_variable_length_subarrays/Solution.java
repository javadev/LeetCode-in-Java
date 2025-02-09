package g3401_3500.s3427_sum_of_variable_length_subarrays;

// #Easy #Array #Prefix_Sum #2025_01_22_Time_0_ms_(100.00%)_Space_43.77_MB_(58.41%)

public class Solution {
    public int subarraySum(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int j = i - nums[i] - 1;
            nums[i] += nums[i - 1];
            res += nums[i] - (j < 0 ? 0 : nums[j]);
        }
        return res;
    }
}
