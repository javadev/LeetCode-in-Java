package g3501_3600.s3502_minimum_cost_to_reach_every_position;

// #Easy #Array #2025_04_01_Time_1_ms_(97.59%)_Space_44.92_MB_(69.12%)

public class Solution {
    public int[] minCosts(int[] cost) {
        int min = cost[0];
        int[] ans = new int[cost.length];
        ans[0] = min;
        for (int i = 1; i < cost.length; i++) {
            min = Math.min(min, cost[i]);
            ans[i] = min;
        }
        return ans;
    }
}
