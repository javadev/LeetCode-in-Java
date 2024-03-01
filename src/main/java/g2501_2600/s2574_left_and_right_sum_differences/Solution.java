package g2501_2600.s2574_left_and_right_sum_differences;

// #Easy #Array #Prefix_Sum #2023_08_21_Time_2_ms_(74.57%)_Space_43.7_MB_(76.84%)

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0;
        int rs = 0;
        for (int i : nums) {
            rs += i;
        }
        for (int i = 0; i < nums.length; ++i) {
            ls += nums[i];
            rs -= nums[i];
            nums[i] = Math.abs(rs - (ls - nums[i]));
        }
        return nums;
    }
}
