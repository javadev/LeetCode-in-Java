package g3801_3900.s3887_incremental_even_weighted_cycle_queries;

// #Hard #Union_Find #Senior_Staff #Graph_Theory #Weekly_Contest_495
// #2026_08_13_Time_18_ms_(100.00%)_Space_262.39_MB_(65.96%)

public class Solution {
    private int[] parent;
    private int[] parity;

    private int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        int p = parent[x];
        parent[x] = find(parent[x]);
        parity[x] ^= parity[p];
        return parent[x];
    }

    public int numberOfEdgesAdded(int n, int[][] edges) {
        parent = new int[n];
        int[] rank = new int[n];
        parity = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int ans = 0;
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            int ru = find(u);
            int rv = find(v);
            int pu = parity[u];
            int pv = parity[v];
            if (ru == rv) {
                if ((pu ^ pv) == w) {
                    ans++;
                }
            } else {
                if (rank[ru] < rank[rv]) {
                    int temp = ru;
                    ru = rv;
                    rv = temp;
                    temp = pu;
                    pu = pv;
                    pv = temp;
                }
                parent[rv] = ru;
                parity[rv] = pu ^ pv ^ w;
                if (rank[ru] == rank[rv]) {
                    rank[ru]++;
                }
                ans++;
            }
        }
        return ans;
    }
}
