package g2401_2500.s2463_minimum_total_distance_traveled;

// #Hard #Array #Dynamic_Programming #Sorting #2023_01_07_Time_2_ms_(100.00%)_Space_40.3_MB_(98.21%)

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S3358")
public class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] f) {
        // sort factories :
        // 1. move all factories with 0-capacity to the end
        // 2. sort everything else by x-position in asc order
        Arrays.sort(f, (a, b) -> (a[1] == 0) ? 1 : (b[1] == 0) ? -1 : a[0] - b[0]);
        // Sort robots by x-position in asc order
        // As we don't know the implementation of the List that is passed, it is better to map it to
        // an array explicitly
        int[] r = new int[robot.size()];
        int i = 0;
        for (int x : robot) {
            r[i++] = x;
        }
        Arrays.sort(r);
        // An array to be used for tracking robots assigned to each factory
        int[][] d = new int[f.length][2];
        // For each robot starting from the rightmost find the most optimal destination factory
        // and add it's cost to the result.
        long res = 0;
        for (i = r.length - 1; i >= 0; i--) {
            res += pop(d, i, r, f);
        }
        return res;
    }

    private long pop(int[][] d, int i, int[] r, int[][] f) {
        long cost = Long.MAX_VALUE;
        int j;
        // try assigning robot to each factory starting from the leftmost
        for (j = 0; j < d.length; j++) {
            // cost of adding robot to the current factory
            long t = Math.abs(r[i] - f[j][0]);
            int tj = j;
            // if current factory is full calculate the cost of moving the rightmost robot in the
            // factory to the next one
            // and add the calculated cost to the current cost.
            // repeat the same action until we fit our robots to factories.
            while (tj < d.length && d[tj][1] == f[tj][1]) {
                // if we faced a factory with 0-capactity or the rightmost factory
                // it would mean we reached the end and cannot fit our robot to the current factory
                if (d[tj][1] == 0 || tj == d.length - 1) {
                    t = Long.MAX_VALUE;
                    break;
                }
                int l = d[tj][0] + d[tj][1] - 1;
                t += Math.abs(f[tj + 1][0] - r[l]) - Math.abs(f[tj][0] - r[l]);
                ++tj;
            }
            // if the cost for adding robot to the current factory is greater than the previous one
            // it means that the previous one was the most optimal
            if (t > cost) {
                break;
            }
            cost = t;
        }
        // assign current robot to the previous factory and move any non-fit robots to the right
        d[j - 1][0] = i;
        int tj = j - 1;
        while (d[tj][1] == f[tj][1]) {
            d[tj + 1][0] = d[tj][0] + d[tj][1];
            ++tj;
        }
        d[tj][1]++;
        return cost;
    }
}
