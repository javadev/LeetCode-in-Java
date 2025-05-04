package g3501_3600.s3538_merge_operations_for_minimum_travel_time;

// #Hard #2025_05_04_Time_7_ms_(100.00%)_Space_45.31_MB_(79.31%)

@SuppressWarnings({"unused", "java:S1172"})
public class Solution {
    public int minTravelTime(int l, int n, int k, int[] position, int[] time) {
        int[][][] dp = new int[n][k + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                for (int m = 0; m <= k; m++) {
                    dp[i][j][m] = Integer.MAX_VALUE;
                }
            }
        }
        dp[0][0][0] = 0;
        for (int i = 0; i < n - 1; i++) {
            int currTime = 0;
            for (int curr = 0; curr <= k && curr <= i; curr++) {
                currTime += time[i - curr];
                for (int used = 0; used <= k; used++) {
                    if (dp[i][curr][used] == Integer.MAX_VALUE) continue;
                    for (int next = 0; next <= k - used && next <= n - i - 2; next++) {
                        int nextI = i + next + 1;
                        dp[nextI][next][next + used] =
                                Math.min(
                                        dp[nextI][next][next + used],
                                        dp[i][curr][used]
                                                + (position[nextI] - position[i]) * currTime);
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int curr = 0; curr <= k; curr++) {
            ans = Math.min(ans, dp[n - 1][curr][k]);
        }
        return ans;
    }
}
