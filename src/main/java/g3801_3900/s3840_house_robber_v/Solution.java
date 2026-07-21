package g3801_3900.s3840_house_robber_v;

// #Medium #Array #Dynamic_Programming #Staff #Biweekly_Contest_176
// #2026_07_21_Time_2_ms_(100.00%)_Space_153.66_MB_(42.76%)

public class Solution {
    public long rob(int[] nums, int[] colors) {
        int n = nums.length;
        long dp0 = 0;
        long dp1 = nums[0];
        for (int i = 1; i < n; i++) {
            long new0;
            long new1;
            if (colors[i] == colors[i - 1]) {
                new1 = dp0 + nums[i];
                new0 = Math.max(dp0, dp1);
            } else {
                new0 = Math.max(dp1, dp0);
                new1 = Math.max(dp0, dp1) + nums[i];
            }
            dp0 = new0;
            dp1 = new1;
        }
        return Math.max(dp0, dp1);
    }
}
