package g0601_0700.s0674_longest_continuous_increasing_subsequence;

// #Easy #Array #2022_03_22_Time_2_ms_(40.35%)_Space_45.9_MB_(35.43%)

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            } else {
                ans = max(count, ans);
                count = 1;
            }
        }
        return max(ans, count);
    }

    private int max(int n1, int n2) {
        return Math.max(n1, n2);
    }
}
