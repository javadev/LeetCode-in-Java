package g3201_3300.s3235_check_if_the_rectangle_corner_is_reachable;

// #Hard #Array #Math #Union_Find #Geometry #Depth_First_Search #Breadth_First_Search
// #2024_08_02_Time_95_ms_(59.46%)_Space_44.8_MB_(94.44%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    public boolean canReachCorner(int x, int y, int[][] circles) {
        int n = circles.length;
        DisjointSet ds = new DisjointSet(n + 5);

        // Special nodes for boundaries
        int leftBoundary = n + 3;
        int topBoundary = n;
        int rightBoundary = n + 1;
        int bottomBoundary = n + 2;

        int i = 0;
        for (int[] it : circles) {
            int xi = it[0];
            int yi = it[1];
            int ri = it[2];
            if (yi - ri >= y || xi - ri >= x) {
                continue;
            }
            if (((xi > (x + y) || yi > y) && (xi > x || yi > x + y))) {
                continue;
            }
            if (xi <= ri) {
                ds.dsu(i, leftBoundary);
            }
            if (yi <= ri) {
                ds.dsu(i, topBoundary);
            }
            if (x - xi <= ri) {
                ds.dsu(i, rightBoundary);
            }
            if (y - yi <= ri) {
                ds.dsu(i, bottomBoundary);
            }
            i++;
        }

        // Union circles that overlap
        for (i = 0; i < n; i++) {
            int x1 = circles[i][0];
            int y1 = circles[i][1];
            int r1 = circles[i][2];
            if (y1 - r1 >= y || x1 - r1 >= x) {
                continue;
            }
            if (((x1 > (x + y) || y1 > y) && (x1 > x || y1 > x + y))) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                int x2 = circles[j][0];
                int y2 = circles[j][1];
                int r2 = circles[j][2];
                double dist = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
                if (dist <= (r1 + r2)) {
                    ds.dsu(i, j);
                }
            }
        }

        // Check if left is connected to right or top is connected to bottom
        if (ds.findUpar(leftBoundary) == ds.findUpar(rightBoundary)
                || ds.findUpar(leftBoundary) == ds.findUpar(topBoundary)) {
            return false;
        }
        return ds.findUpar(bottomBoundary) != ds.findUpar(rightBoundary)
                && ds.findUpar(bottomBoundary) != ds.findUpar(topBoundary);
    }

    private static class DisjointSet {
        private final int[] parent;
        private final int[] size;

        public DisjointSet(int n) {
            size = new int[n + 1];
            Arrays.fill(size, 1);
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public int findUpar(int u) {
            if (u == parent[u]) {
                return u;
            }
            parent[u] = findUpar(parent[u]);
            return parent[u];
        }

        public void dsu(int u, int v) {
            int ulpu = findUpar(u);
            int ulpv = findUpar(v);
            if (ulpv == ulpu) {
                return;
            }
            if (size[ulpu] < size[ulpv]) {
                parent[ulpu] = ulpv;
                size[ulpv] += size[ulpu];
            } else {
                parent[ulpv] = ulpu;
                size[ulpu] += size[ulpv];
            }
        }
    }
}
