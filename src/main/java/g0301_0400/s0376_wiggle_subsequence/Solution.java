package g0301_0400.s0376_wiggle_subsequence;

// #Medium #Array #Dynamic_Programming #Greedy

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
