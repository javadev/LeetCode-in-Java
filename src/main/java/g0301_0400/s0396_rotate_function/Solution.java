package g0301_0400.s0396_rotate_function;

// #Medium #Dynamic_Programming #Math

public class Solution {
    /**
     * Reference: https://discuss.leetcode.com/topic/58459/java-o-n-solution-with-explanation
     */
    public int maxRotateFunction(int[] nums) {
        int allSum = 0;
        int len = nums.length;
        int f = 0;
        for (int i = 0; i < len; i++) {
            f += i * nums[i];
            allSum += nums[i];
        }
        int max = f;
        for (int i = len - 1; i >= 1; i--) {
            f = f + allSum - len * nums[i];
            max = Math.max(f, max);
        }
        return max;
    }
}
