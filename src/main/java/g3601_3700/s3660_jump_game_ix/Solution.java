package g3601_3700.s3660_jump_game_ix;

// #Medium #Weekly_Contest_464 #2025_08_29_Time_3_ms_(100.00%)_Space_66.47_MB_(70.03%)

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
