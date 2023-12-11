package g0001_0100.s0057_insert_interval;

// #Medium #Array #Level_2_Day_17_Interval #2023_08_11_Time_0_ms_(100.00%)_Space_43.7_MB_(95.60%)

import java.util.Arrays;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int l = 0;
        int r = n - 1;
        while (l < n && newInterval[0] > intervals[l][1]) {
            l++;
        }
        while (r >= 0 && newInterval[1] < intervals[r][0]) {
            r--;
        }
        int[][] res = new int[l + n - r][2];
        for (int i = 0; i < l; i++) {
            res[i] = Arrays.copyOf(intervals[i], intervals[i].length);
        }
        res[l][0] = Math.min(newInterval[0], l == n ? newInterval[0] : intervals[l][0]);
        res[l][1] = Math.max(newInterval[1], r == -1 ? newInterval[1] : intervals[r][1]);
        for (int i = l + 1, j = r + 1; j < n; i++, j++) {
            res[i] = intervals[j];
        }
        return res;
    }
}
