package g3301_3400.s3332_maximum_points_tourist_can_earn;

// #Medium #2024_10_27_Time_305_ms_(100.00%)_Space_55.1_MB_(100.00%)

public class Solution {
    int days;
    int cities;
    Integer[][] dp;

    private int f(int day, int city, int[][] stayScore, int[][] travelScore) {
        if (day == days) {
            return 0;
        }
        if (dp[day][city] != null) {
            return dp[day][city];
        }
        int maxScore = 0;
        for (int desCity = 0; desCity < cities; desCity++) {
            int score;
            if (desCity == city) {
                score = stayScore[day][city];
            } else {
                score = travelScore[city][desCity];
            }
            maxScore = Math.max(maxScore, score + f(day + 1, desCity, stayScore, travelScore));
        }
        dp[day][city] = maxScore;
        return dp[day][city];
    }

    public int maxScore(int n, int k, int[][] stayScore, int[][] travelScore) {
        days = k;
        cities = n;
        int maxScore = 0;
        dp = new Integer[days + 1][cities + 1];
        for (int city = 0; city < cities; city++) {
            maxScore = Math.max(maxScore, f(0, city, stayScore, travelScore));
        }
        return maxScore;
    }
}
