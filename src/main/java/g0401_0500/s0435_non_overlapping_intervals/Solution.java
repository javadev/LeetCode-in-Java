package g0401_0500.s0435_non_overlapping_intervals;

// #Medium #Array #Dynamic_Programming #Sorting #Greedy #Data_Structure_II_Day_4_Array
// #2022_07_16_Time_96_ms_(47.37%)_Space_106.6_MB_(6.15%)

import java.util.Arrays;

public class Solution {
    /*
     * This is sorting my starting time, the key here is that we'll want to update end time when an
     * erasure is needed: we use the smaller end time instead of the bigger one which is more likely
     * to overlap with others.
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int erasures = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                erasures++;
                end = Math.min(end, intervals[i][1]);
            } else {
                end = intervals[i][1];
            }
        }
        return erasures;
    }
}
