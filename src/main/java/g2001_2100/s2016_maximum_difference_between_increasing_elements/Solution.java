package g2001_2100.s2016_maximum_difference_between_increasing_elements;

// #Array
// #2022_05_23_Time_0ms_(100%)_Space_42.9_MB_(20.20%)

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
        if (ans <= 0) {
            return -1;
        }
        return ans;
    }
}
