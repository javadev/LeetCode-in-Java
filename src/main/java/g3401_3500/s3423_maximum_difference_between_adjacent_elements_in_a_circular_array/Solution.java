package g3401_3500.s3423_maximum_difference_between_adjacent_elements_in_a_circular_array;

// #Easy #Array #2025_01_22_Time_1_ms_(99.86%)_Space_43.72_MB_(36.06%)

public class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            int nextIndex = (i + 1) % nums.length;
            int diff = Math.abs(nums[i] - nums[nextIndex]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}
