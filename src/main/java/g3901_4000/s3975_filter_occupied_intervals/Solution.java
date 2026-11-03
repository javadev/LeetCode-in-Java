package g3901_4000.s3975_filter_occupied_intervals;

// #Medium #Array #Sorting #Senior #Weekly_Contest_508
// #2026_11_03_Time_63_ms_(99.08%)_Space_149.43_MB_(90.83%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public List<List<Integer>> filterOccupiedIntervals(
            int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<int[]> intervals = new ArrayList<>();
        for (int[] occupiedInterval : occupiedIntervals) {
            int first = occupiedInterval[0];
            int second = occupiedInterval[1];
            if (second < freeStart || first > freeEnd) {
                intervals.add(new int[] {first, second});
            } else {
                if (first < freeStart) {
                    intervals.add(new int[] {first, freeStart - 1});
                }
                if (second > freeEnd) {
                    intervals.add(new int[] {freeEnd + 1, second});
                }
            }
        }
        intervals.sort(Comparator.comparingInt(a -> a[0]));
        return getLists(intervals);
    }

    private static List<List<Integer>> getLists(List<int[]> intervals) {
        int index = 0;
        List<List<Integer>> res = new ArrayList<>();
        while (index < intervals.size()) {
            int first = intervals.get(index)[0];
            int second = intervals.get(index)[1];
            while (index + 1 < intervals.size() && second + 1 >= intervals.get(index + 1)[0]) {
                index++;
                second = Math.max(second, intervals.get(index)[1]);
            }
            List<Integer> temp = Arrays.asList(first, second);
            res.add(temp);
            index++;
        }
        return res;
    }
}
