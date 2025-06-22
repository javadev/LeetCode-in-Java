package g3501_3600.s3588_find_maximum_area_of_a_triangle;

// #Medium #2025_06_22_Time_431_ms_(100.00%)_Space_166.06_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public long maxArea(int[][] coords) {
        Map<Integer, TreeSet<Integer>> xMap = new HashMap<>();
        Map<Integer, TreeSet<Integer>> yMap = new HashMap<>();
        TreeSet<Integer> allX = new TreeSet<>();
        TreeSet<Integer> allY = new TreeSet<>();
        for (int[] coord : coords) {
            int x = coord[0];
            int y = coord[1];
            xMap.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
            yMap.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
            allX.add(x);
            allY.add(y);
        }
        long ans = Long.MIN_VALUE;
        for (Map.Entry<Integer, TreeSet<Integer>> entry : xMap.entrySet()) {
            int x = entry.getKey();
            TreeSet<Integer> ySet = entry.getValue();
            if (ySet.size() < 2) {
                continue;
            }
            int minY = ySet.first();
            int maxY = ySet.last();
            int base = maxY - minY;
            int minX = allX.first();
            int maxX = allX.last();
            if (minX != x) {
                ans = Math.max(ans, (long) Math.abs(x - minX) * base);
            }
            if (maxX != x) {
                ans = Math.max(ans, (long) Math.abs(x - maxX) * base);
            }
        }

        for (Map.Entry<Integer, TreeSet<Integer>> entry : yMap.entrySet()) {
            int y = entry.getKey();
            TreeSet<Integer> xSet = entry.getValue();
            if (xSet.size() < 2) {
                continue;
            }
            int minX = xSet.first();
            int maxX = xSet.last();
            int base = maxX - minX;
            int minY = allY.first();
            int maxY = allY.last();
            if (minY != y) {
                ans = Math.max(ans, (long) Math.abs(y - minY) * base);
            }
            if (maxY != y) {
                ans = Math.max(ans, (long) Math.abs(y - maxY) * base);
            }
        }
        return ans == Long.MIN_VALUE ? -1 : ans;
    }
}
