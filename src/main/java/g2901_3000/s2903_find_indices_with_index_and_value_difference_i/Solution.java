package g2901_3000.s2903_find_indices_with_index_and_value_difference_i;

// #Easy #Array #2023_12_26_Time_1_ms_(99.89%)_Space_43.4_MB_(77.84%)

public class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (j - i >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
