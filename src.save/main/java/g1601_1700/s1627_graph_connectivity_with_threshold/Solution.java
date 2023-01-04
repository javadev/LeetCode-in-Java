package g1601_1700.s1627_graph_connectivity_with_threshold;

// #Hard #Array #Math #Union_Find #2022_04_18_Time_7_ms_(98.45%)_Space_75.7_MB_(97.93%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> areConnected(int n, int threshold, int[][] queries) {
        if (n < 1 || queries == null || queries.length == 0) {
            return new ArrayList<>();
        }
        int i;
        int j;
        int k;
        int x;
        DisjointSetUnion set = new DisjointSetUnion(n + 1);
        int edges = queries.length;
        for (i = threshold + 1; i <= n; i++) {
            k = n / i;
            x = i;
            for (j = 2; j <= k; j++) {
                x = x + i;
                set.union(i, x);
            }
        }
        List<Boolean> result = new ArrayList<>(edges);
        for (int[] query : queries) {
            result.add(set.find(query[0]) == set.find(query[1]));
        }
        return result;
    }

    private static class DisjointSetUnion {
        private final int[] rank;
        private final int[] parent;

        public DisjointSetUnion(int n) {
            rank = new int[n];
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                this.rank[i] = 1;
                this.parent[i] = i;
            }
        }

        public int find(int u) {
            int x = u;
            while (x != parent[x]) {
                x = parent[x];
            }
            parent[u] = x;
            return x;
        }

        public void union(int u, int v) {
            if (u != v) {
                int x = find(u);
                int y = find(v);
                if (x != y) {
                    if (rank[x] > rank[y]) {
                        rank[x] += rank[y];
                        parent[y] = x;
                    } else {
                        rank[y] += rank[x];
                        parent[x] = y;
                    }
                }
            }
        }
    }
}
