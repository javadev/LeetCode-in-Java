package g0001_0100.s0056_merge_intervals;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting #Acceptance_45.0%
// #Data_Structure_II_Day_2_Array #2022_02_19_Time_22_ms_(12.57%)_Space_55.1_MB_(18.63%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        // sorting
        // so that we can perform the task linearly
        Arrays.sort(
                intervals,
                (int[] a, int[] b) -> {
                    if (a[0] == b[0]) {
                        return Integer.compare(a[1], b[1]);
                    }
                    return Integer.compare(a[0], b[0]);
                });

        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        while (i < intervals.length) {
            // storing start
            int start = intervals[i][0];
            int end = intervals[i][1];
            i++;
            while (i < intervals.length && intervals[i][0] <= end) {
                // making sure range is not shrinking
                if (intervals[i][1] > end) {
                    end = intervals[i][1];
                }
                i++;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            list.add(temp);
        }
        int[][] arr = new int[list.size()][2];
        i = 0;
        for (List<Integer> l : list) {
            arr[i][0] = l.get(0);
            arr[i][1] = l.get(1);
            i++;
        }
        return arr;
    }
}
