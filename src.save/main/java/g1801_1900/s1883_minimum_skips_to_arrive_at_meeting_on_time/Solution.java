package g1801_1900.s1883_minimum_skips_to_arrive_at_meeting_on_time;

// #Hard #Array #Dynamic_Programming #2022_05_10_Time_70_ms_(73.08%)_Space_74.5_MB_(36.54%)

public class Solution {
    public int minSkips(int[] dist, int speed, int hoursBefore) {
        int len = dist.length;
        // dp[i][j] finish ith road, skip j times;
        int[][] dp = new int[len][len];
        dp[0][0] = dist[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = (dp[i - 1][0] + speed - 1) / speed * speed + dist[i];
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > 0) {
                    dp[i][j] = dp[i - 1][j - 1] + dist[i];
                }
                if (j <= i - 1) {
                    dp[i][j] =
                            Math.min(
                                    dp[i][j], (dp[i - 1][j] + speed - 1) / speed * speed + dist[i]);
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (dp[len - 1][i] <= (long) speed * hoursBefore) {
                return i;
            }
        }
        return -1;
    }
}
