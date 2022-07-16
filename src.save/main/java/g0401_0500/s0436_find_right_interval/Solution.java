package g0401_0500.s0436_find_right_interval;

// #Medium #Array #Sorting #Binary_Search #Binary_Search_II_Day_11
// #2022_07_16_Time_20_ms_(81.51%)_Space_59.1_MB_(5.83%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] findminmax(int[][] num) {
        int min = num[0][0];
        int max = num[0][0];
        for (int i = 1; i < num.length; i++) {
            min = Math.min(min, num[i][0]);
            max = Math.max(max, num[i][0]);
        }
        return new int[] {min, max};
    }

    public int[] findRightInterval(int[][] intervals) {
        if (intervals.length <= 1) {
            return new int[] {-1};
        }
        int n = intervals.length;
        int[] result = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(intervals[i][0], i);
        }
        int[] minmax = findminmax(intervals);
        for (int i = minmax[1] - 1; i >= minmax[0] + 1; i--) {
            map.computeIfAbsent(i, k -> map.get(k + 1));
        }
        for (int i = 0; i < n; i++) {
            result[i] = map.getOrDefault(intervals[i][1], -1);
        }
        return result;
    }
}
