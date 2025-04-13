package g0401_0500.s0452_minimum_number_of_arrows_to_burst_balloons;

// #Medium #Array #Sorting #Greedy #LeetCode_75_Intervals #Top_Interview_150_Intervals
// #2025_03_09_Time_52_ms_(89.91%)_Space_68.86_MB_(77.92%)

import java.util.Arrays;

public class Solution {
    /*
     * I'm glad to have come up with this solution on my own on 10/13/2021:
     * we'll have to sort the
     * balloons by its ending points, a counter case to this is below:
     * {{0, 6}, {0, 9}, {7, 8}}
     * if we sort by starting points, then it becomes:
     * {0, 6}, {0, 9}, {7, 8}
     * this way, if we shoot 9,
     * {0, 6} won't be burst however, if we sort by ending points, then it becomes:
     * {0, 6}, {7, 8}, {0, 9}, then we shoot at 6, then at 8, this gives us the result of bursting all balloons.
     */
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int minArrows = 1;
        long end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                minArrows++;
                end = points[i][1];
            }
        }
        return minArrows;
    }
}
