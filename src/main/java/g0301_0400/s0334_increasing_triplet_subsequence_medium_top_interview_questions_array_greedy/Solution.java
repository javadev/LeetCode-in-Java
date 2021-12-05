package g0301_0400.s0334_increasing_triplet_subsequence_medium_top_interview_questions_array_greedy;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int i = 0;
        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        while (i < n) {
            if (low >= nums[i]) {
                low = nums[i++];
            } else if (high >= nums[i]) {
                high = nums[i++];
            } else {
                return true;
            }
        }
        return false;
    }
}
