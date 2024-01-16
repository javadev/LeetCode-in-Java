package g2001_2100.s2017_grid_game;

// #Medium #Array #Matrix #Prefix_Sum #2022_05_24_Time_10_ms_(41.46%)_Space_95.2_MB_(32.32%)

public class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] cum0 = new long[n + 1];
        long[] cum1 = new long[n + 1];
        for (int i = 0; i < n; i++) {
            cum0[i + 1] = cum0[i] + grid[0][i];
            cum1[i + 1] = cum1[i] + grid[1][i];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, Math.max(cum0[n] - cum0[i + 1], cum1[i]));
        }
        return ans;
    }
}
