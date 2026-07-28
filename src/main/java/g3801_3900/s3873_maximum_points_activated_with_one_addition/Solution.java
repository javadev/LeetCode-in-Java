package g3801_3900.s3873_maximum_points_activated_with_one_addition;

// #Hard #Array #Hash_Table #Senior_Staff #Weekly_Contest_493 #Union_Find
// #2026_07_28_Time_36_ms_(97.50%)_Space_210.60_MB_(92.50%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxActivated(int[][] points) {
        return maxEnergized(points);
    }

    private int maxEnergized(int[][] relays) {
        int n = relays.length;
        int[] parent = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        Map<Integer, Integer> firstInCol = new HashMap<>(n * 2);
        Map<Integer, Integer> firstInRow = new HashMap<>(n * 2);
        for (int i = 0; i < n; i++) {
            int col = relays[i][0];
            int row = relays[i][1];
            Integer c = firstInCol.putIfAbsent(col, i);
            if (c != null) {
                union(parent, size, c, i);
            }
            Integer r = firstInRow.putIfAbsent(row, i);
            if (r != null) {
                union(parent, size, r, i);
            }
        }

        int best1 = 0;
        int best2 = 0;
        for (int i = 0; i < n; i++) {
            if (find(parent, i) == i) {
                int s = size[i];
                if (s >= best1) {
                    best2 = best1;
                    best1 = s;
                } else if (s > best2) {
                    best2 = s;
                }
            }
        }
        return best1 + best2 + 1;
    }

    private int find(int[] parent, int x) {
        int root = x;
        while (parent[root] != root) {
            root = parent[root];
        }
        while (parent[x] != root) {
            int next = parent[x];
            parent[x] = root;
            x = next;
        }
        return root;
    }

    private void union(int[] parent, int[] size, int a, int b) {
        int ra = find(parent, a);
        int rb = find(parent, b);
        if (ra == rb) {
            return;
        }
        if (size[ra] < size[rb]) {
            int t = ra;
            ra = rb;
            rb = t;
        }
        parent[rb] = ra;
        size[ra] += size[rb];
    }
}
