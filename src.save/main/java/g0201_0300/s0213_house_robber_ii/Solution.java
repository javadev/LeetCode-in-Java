package g0201_0300.s0213_house_robber_ii;

// #Medium #Array #Dynamic_Programming #Algorithm_II_Day_12_Dynamic_Programming
// #Dynamic_Programming_I_Day_3 #Udemy_Dynamic_Programming
// #2022_07_02_Time_0_ms_(100.00%)_Space_41.6_MB_(40.58%)

public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (n == 3) {
            return Math.max(nums[0], Math.max(nums[1], nums[2]));
        }
        int max = Integer.MIN_VALUE;
        int[] inc = new int[n];
        int[] exc = new int[n];
        inc[0] = nums[0];
        exc[0] = 0;
        inc[1] = nums[0];
        exc[1] = nums[1];
        inc[2] = nums[2] + nums[0];
        exc[2] = nums[2];
        for (int i = 3; i < n - 1; i++) {
            inc[i] = Math.max(inc[i - 2], inc[i - 3]) + nums[i];
            exc[i] = Math.max(exc[i - 2], exc[i - 3]) + nums[i];
        }
        inc[n - 1] = inc[n - 2];
        exc[n - 1] = Math.max(exc[n - 3], exc[n - 4]) + nums[n - 1];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.max(inc[i], exc[i]));
        }
        return max;
    }
}
