package g3501_3600.s3600_maximize_spanning_tree_stability_with_upgrades;

// #Hard #2025_06_29_Time_52_ms_(93.75%)_Space_132.77_MB_(40.45%)

public class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        int low = 0;
        int high = 0;
        for (int[] edge : edges) {
            high = Math.max(high, edge[2]);
        }
        high *= 2;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (feasible(mid, n, edges, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean feasible(int t, int n, int[][] edges, int k) {
        int[] par = new int[n];
        int[] rnk = new int[n];
        int[] comp = new int[] {n};
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        UnionFind uf = new UnionFind(par, rnk, comp);
        int cost = 0;
        int half = (t + 1) / 2;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int s = edge[2];
            int m = edge[3];
            if (m == 1) {
                if (s < t || !uf.union(u, v)) {
                    return false;
                }
            }
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int s = edge[2];
            int m = edge[3];
            if (m == 0 && s >= t) {
                uf.union(u, v);
            }
        }
        if (comp[0] == 1) {
            return true;
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int s = edge[2];
            int m = edge[3];
            if (m == 0 && s >= half && s < t) {
                if (uf.union(u, v)) {
                    cost++;
                    if (cost > k) {
                        return false;
                    }
                }
            }
        }
        return comp[0] == 1;
    }

    private static class UnionFind {
        int[] par;
        int[] rnk;
        int[] comp;

        UnionFind(int[] par, int[] rnk, int[] comp) {
            this.par = par;
            this.rnk = rnk;
            this.comp = comp;
        }

        int find(int x) {
            if (par[x] != x) {
                par[x] = find(par[x]);
            }
            return par[x];
        }

        boolean union(int a, int b) {
            int ra = find(a);
            int rb = find(b);
            if (ra == rb) {
                return false;
            }
            if (rnk[ra] < rnk[rb]) {
                int temp = ra;
                ra = rb;
                rb = temp;
            }
            par[rb] = ra;
            if (rnk[ra] == rnk[rb]) {
                rnk[ra]++;
            }
            comp[0]--;
            return true;
        }
    }
}
