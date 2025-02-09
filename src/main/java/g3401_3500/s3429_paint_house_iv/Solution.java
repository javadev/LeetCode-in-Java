package g3401_3500.s3429_paint_house_iv;

// #Medium #Array #Dynamic_Programming #2025_01_22_Time_5_ms_(100.00%)_Space_106.29_MB_(78.64%)

public class Solution {
    public long minCost(int n, int[][] cost) {
        long dp0 = 0;
        long dp1 = 0;
        long dp2 = 0;
        long dp3 = 0;
        long dp4 = 0;
        long dp5 = 0;
        for (int i = 0; i < n / 2; ++i) {
            long nextdp0 = Math.min(Math.min(dp2, dp3), dp4) + cost[i][0] + cost[n - i - 1][1];
            long nextdp1 = Math.min(Math.min(dp2, dp4), dp5) + cost[i][0] + cost[n - i - 1][2];
            long nextdp2 = Math.min(Math.min(dp0, dp1), dp5) + cost[i][1] + cost[n - i - 1][0];
            long nextdp3 = Math.min(Math.min(dp0, dp4), dp5) + cost[i][1] + cost[n - i - 1][2];
            long nextdp4 = Math.min(Math.min(dp0, dp1), dp3) + cost[i][2] + cost[n - i - 1][0];
            long nextdp5 = Math.min(Math.min(dp1, dp2), dp3) + cost[i][2] + cost[n - i - 1][1];
            dp0 = nextdp0;
            dp1 = nextdp1;
            dp2 = nextdp2;
            dp3 = nextdp3;
            dp4 = nextdp4;
            dp5 = nextdp5;
        }
        long ans = Long.MAX_VALUE;
        for (long x : new long[] {dp0, dp1, dp2, dp3, dp4, dp5}) {
            ans = Math.min(ans, x);
        }
        return ans;
    }
}
