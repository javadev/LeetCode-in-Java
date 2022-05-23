package g2001_2100.s2016_maximum_difference_between_increasing_elements;

// #Easy #Array #2022_05_23_Time_0_ms_(100.00%)_Space_41.4_MB_(94.03%)

public class Solution {
    public int maximumDifference(int[] nums) {
        int mini = nums[0];
        int ans = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < mini) {
                mini = nums[i];
            }
            if (nums[i + 1] - mini > ans) {
                ans = nums[i + 1] - mini;
            }
        }
        return ans <= 0 ? -1 : ans;
    }
}
