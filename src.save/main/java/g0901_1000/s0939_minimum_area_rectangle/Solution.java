package g0901_1000.s0939_minimum_area_rectangle;

// #Medium #Array #Hash_Table #Math #Sorting #Geometry
// #2022_03_30_Time_63_ms_(94.31%)_Space_54.6_MB_(73.31%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int minAreaRect(int[][] points) {
        if (points.length < 4) {
            return 0;
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] p : points) {
            map.putIfAbsent(p[0], new HashSet<>());
            map.get(p[0]).add(p[1]);
        }
        Arrays.sort(
                points,
                (a, b) ->
                        (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                int[] p1 = points[i];
                int[] p2 = points[j];
                int area = Math.abs((p1[0] - p2[0]) * (p1[1] - p2[1]));
                if (area >= min || area == 0) {
                    continue;
                }
                if (map.get(p1[0]).contains(p2[1]) && map.get(p2[0]).contains(p1[1])) {
                    min = area;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
