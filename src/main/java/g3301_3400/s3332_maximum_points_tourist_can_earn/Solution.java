package g3301_3400.s3332_maximum_points_tourist_can_earn;

// #Medium #Array #Dynamic_Programming #Matrix #2024_10_29_Time_53_ms_(100.00%)_Space_55_MB_(78.55%)

public class Solution {
    public int maxScore(int n, int k, int[][] stayScores, int[][] travelScores) {
        // dp[day][city]
        int[][] dp = new int[k + 1][n];
        int result = 0;
        for (int day = k - 1; day >= 0; day--) {
            for (int city = 0; city < n; city++) {
                int stayScore = stayScores[day][city] + dp[day + 1][city];
                int travelScore = 0;
                for (int nextCity = 0; nextCity < n; nextCity++) {
                    int nextScore = travelScores[city][nextCity] + dp[day + 1][nextCity];
                    travelScore = Math.max(nextScore, travelScore);
                }
                dp[day][city] = Math.max(stayScore, travelScore);
                result = Math.max(dp[day][city], result);
            }
        }
        return result;
    }
}
