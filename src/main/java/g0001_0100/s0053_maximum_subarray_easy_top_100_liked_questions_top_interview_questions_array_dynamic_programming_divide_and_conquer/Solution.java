package g0001_0100.s0053_maximum_subarray_easy_top_100_liked_questions_top_interview_questions_array_dynamic_programming_divide_and_conquer;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // calculating sub-array sum
            sum += nums[i];
            maxi = Math.max(sum, maxi);
            if (sum < 0) {
                // there is no point to carry a -ve subarray sum. hence setting to 0
                sum = 0;
            }
        }
        return maxi;
    }
}
