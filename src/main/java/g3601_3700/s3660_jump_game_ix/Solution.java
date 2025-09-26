package g3601_3700.s3660_jump_game_ix;

// #Medium #Array #Dynamic_Programming #Weekly_Contest_464
// #2025_09_26_Time_4_ms_(98.97%)_Space_70.98_MB_(7.99%)

public class Solution {
    public int[] maxValue(int[] nums) {
        int[] f = new int[nums.length];
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur = Math.max(cur, nums[i]);
            f[i] = cur;
        }
        int min = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (f[i] > min) {
                f[i] = Math.max(f[i], f[i + 1]);
            }
            min = Math.min(min, nums[i]);
        }
        return f;
    }
}
