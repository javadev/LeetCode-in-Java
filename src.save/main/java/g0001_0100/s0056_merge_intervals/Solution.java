package g0001_0100.s0056_merge_intervals;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting
// #Data_Structure_II_Day_2_Array #2022_06_07_Time_7_ms_(97.44%)_Space_47.7_MB_(74.37%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int[] current = intervals[0];
        list.add(current);
        for (int[] next : intervals) {
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                list.add(current);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
