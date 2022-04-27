package g0401_0500.s0413_arithmetic_slices;

// #Medium #Array #Dynamic_Programming #Algorithm_II_Day_14_Dynamic_Programming
// #Dynamic_Programming_I_Day_10 #2022_03_18_Time_0_ms_(100.00%)_Space_41.5_MB_(70.83%)

public class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum = 0;
        int curr = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr++;
                sum += curr;
            } else {
                curr = 0;
            }
        }
        return sum;
    }
}
