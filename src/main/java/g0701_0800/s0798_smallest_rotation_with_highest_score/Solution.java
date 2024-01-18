package g0701_0800.s0798_smallest_rotation_with_highest_score;

// #Hard #Array #Prefix_Sum #2022_03_26_Time_9_ms_(78.22%)_Space_73.9_MB_(53.47%)

public class Solution {
    // nums[i] will be in the range [0, nums.length].
    // At which positions will we lose points? The answer is k = i - nums[i] + 1.
    // We need to accumulate points we have lost from previous rotations using prefix sum except one
    // we did not lose.
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int res = 0;
        int[] change = new int[n];
        for (int i = 0; i < n; i++) {
            change[(i - nums[i] + 1 + n) % n]--;
        }
        for (int i = 1; i < n; i++) {
            change[i] += change[i - 1] + 1;
            res = change[i] > change[res] ? i : res;
        }
        return res;
    }
}
