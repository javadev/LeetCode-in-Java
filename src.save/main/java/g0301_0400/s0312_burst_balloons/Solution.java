package g0301_0400.s0312_burst_balloons;

// #Hard #Array #Dynamic_Programming #2022_07_08_Time_50_ms_(89.02%)_Space_41.9_MB_(90.23%)

public class Solution {
    public int maxCoins(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[][] dp = new int[nums.length][nums.length];
        return balloonBurstDp(nums, dp);
    }

    private int balloonBurstDp(int[] nums, int[][] dp) {
        for (int gap = 0; gap < nums.length; gap++) {
            for (int si = 0, ei = gap; ei < nums.length; si++, ei++) {
                int l = (si - 1 == -1) ? 1 : nums[si - 1];
                int r = (ei + 1 == nums.length) ? 1 : nums[ei + 1];
                int maxAns = (int) -1e7;
                for (int cut = si; cut <= ei; cut++) {
                    int leftAns = si == cut ? 0 : dp[si][cut - 1];
                    int rightAns = ei == cut ? 0 : dp[cut + 1][ei];
                    int myAns = leftAns + l * nums[cut] * r + rightAns;
                    maxAns = Math.max(maxAns, myAns);
                }
                dp[si][ei] = maxAns;
            }
        }
        return dp[0][nums.length - 1];
    }
}
