package g0901_1000.s0962_maximum_width_ramp;

// #Medium #Array #Stack #Monotonic_Stack

public class Solution {
    public int maxWidthRamp(int[] nums) {
        int m = nums.length;
        int[] dp = new int[m];
        int minInd = 0, ramp = 0;
        for (int i = 0; i < m; i++) {
            int prInd = minInd;
            while (prInd > 0 && nums[i] >= nums[dp[prInd]]) {
                prInd = dp[prInd];
            }
            dp[i] = prInd;
            if (nums[i] >= nums[prInd]) {
                ramp = Math.max(ramp, i - prInd);
            }
            minInd = nums[i] < nums[minInd] ? i : minInd;
        }
        return ramp;
    }
}
