package g3101_3200.s3105_longest_strictly_increasing_or_strictly_decreasing_subarray;

// #Easy #Array #2024_04_11_Time_1_ms_(98.13%)_Space_42.7_MB_(57.07%)

public class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc += 1;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec += 1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            res = Math.max(res, Math.max(inc, dec));
        }
        return res;
    }
}
