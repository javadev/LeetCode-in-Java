package g3301_3400.s3392_count_subarrays_of_length_three_with_a_condition;

// #Easy #2024_12_22_Time_1_ms_(100.00%)_Space_45.5_MB_(100.00%)

public class Solution {
    public int countSubarrays(int[] nums) {
        int window = 3;
        int cnt = 0;
        for (int i = 0; i <= nums.length - window; i++) {
            float first = nums[i];
            float second = nums[i + 1];
            float third = nums[i + 2];
            if (second / 2 == first + third) {
                cnt++;
            }
        }
        return cnt;
    }
}