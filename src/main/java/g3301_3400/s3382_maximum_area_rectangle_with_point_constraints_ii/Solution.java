package g3301_3400.s3382_maximum_area_rectangle_with_point_constraints_ii;

// #Hard #Array #Math #Sorting #Geometry #Segment_Tree #Binary_Indexed_Tree
// #2024_12_10_Time_320_ms_(95.35%)_Space_83.2_MB_(86.05%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Solution {
    public long maxRectangleArea(int[] xCoord, int[] yCoord) {
        if (xCoord.length < 4) {
            return -1;
        }
        Pair[] pair = new Pair[xCoord.length];
        for (int i = 0; i < xCoord.length; ++i) {
            int x0 = xCoord[i];
            int y0 = yCoord[i];
            pair[i] = new Pair(x0, y0);
        }
        Arrays.sort(pair);
        HashMap<Integer, Pair> map = new HashMap<>();
        TreeSet<Integer> yVals = new TreeSet<>();
        long best = -1;
        for (int i = 0; i < pair.length - 1; ++i) {
            if (!yVals.isEmpty()) {
                int y0 = pair[i].y;
                Integer y1 = yVals.floor(y0);
                while (y1 != null) {
                    Pair p1 = map.get(y1);
                    if (p1.y < y0) {
                        break;
                    }
                    if (y1 == y0 && pair[i + 1].x == pair[i].x && pair[i + 1].y == p1.y) {
                        long dY = p1.y - y0;
                        long dX = pair[i].x - p1.x;
                        best = Math.max(dY * dX, best);
                    }
                    if (p1.x != pair[i].x) {
                        yVals.remove(y1);
                    }
                    y1 = yVals.lower(y1);
                }
            }
            if (pair[i].x == pair[i + 1].x) {
                yVals.add(pair[i].y);
                map.put(pair[i].y, pair[i + 1]);
            }
        }
        return best;
    }

    private static class Pair implements Comparable<Pair> {
        private final int x;
        private final int y;

        public Pair(int xx, int yy) {
            x = xx;
            y = yy;
        }

        public int compareTo(Pair p) {
            return (x == p.x) ? y - p.y : x - p.x;
        }
    }
}
