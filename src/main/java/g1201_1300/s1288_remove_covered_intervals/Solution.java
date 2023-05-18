package g1201_1300.s1288_remove_covered_intervals;

// #Medium #Array #Sorting #2022_03_11_Time_6_ms_(78.87%)_Space_47.5_MB_(6.30%)

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Queue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for (int[] interval : intervals) {
            q.offer(interval);
        }
        int[] prev = q.poll();
        int count = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            if (curr[0] >= prev[0] && curr[1] <= prev[1]) {
                count++;
            } else {
                prev = curr;
            }
        }
        return intervals.length - count;
    }
}
