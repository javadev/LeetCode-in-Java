package g0301_0400.s0376_wiggle_subsequence;

// #Medium #Array #Dynamic_Programming #Greedy #Dynamic_Programming_I_Day_18
// #2022_07_12_Time_0_ms_(100.00%)_Space_42.4_MB_(6.74%)

public class Solution {
    public int wiggleMaxLength(int[] nums) {
        int lt = 1;
        int gt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                lt = gt + 1;
            } else if (nums[i - 1] > nums[i]) {
                gt = lt + 1;
            }
        }
        return Math.max(lt, gt);
    }
}
