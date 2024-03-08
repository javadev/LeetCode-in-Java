package g1201_1300.s1266_minimum_time_visiting_all_points;

// #Easy #Array #Math #Geometry #2022_03_14_Time_1_ms_(80.97%)_Space_43.8_MB_(26.31%)

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        for (int i = 0; i < points.length - 1; i++) {
            minTime += chebyshevDistance(points[i], points[i + 1]);
        }
        return minTime;
    }

    private int chebyshevDistance(int[] pointA, int[] pointB) {
        return Math.max(Math.abs(pointA[0] - pointB[0]), Math.abs(pointA[1] - pointB[1]));
    }
}
