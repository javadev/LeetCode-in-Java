package g3501_3600.s3559_number_of_ways_to_assign_edge_weights_ii;

// #Hard #Array #Dynamic_Programming #Math #Depth_First_Search #Tree
// #2025_05_27_Time_138_ms_(64.66%)_Space_133.20_MB_(11.56%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int MOD = 1000000007;
    private List<List<Integer>> adj;
    private int[] level;
    private int[][] jumps;

    private void mark(int node, int par) {
        for (int neigh : adj.get(node)) {
            if (neigh == par) {
                continue;
            }
            level[neigh] = level[node] + 1;
            jumps[neigh][0] = node;
            mark(neigh, node);
        }
    }

    public int lift(int u, int diff) {
        while (diff > 0) {
            int rightmost = diff ^ (diff & (diff - 1));
            int jump = (int) (Math.log(rightmost) / Math.log(2));
            u = jumps[u][jump];
            diff -= rightmost;
        }
        return u;
    }

    private int findLca(int u, int v) {
        if (level[u] > level[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        v = lift(v, level[v] - level[u]);
        if (u == v) {
            return u;
        }
        for (int i = jumps[0].length - 1; i >= 0; i--) {
            if (jumps[u][i] != jumps[v][i]) {
                u = jumps[u][i];
                v = jumps[v][i];
            }
        }
        return jumps[u][0];
    }

    private int findDist(int a, int b) {

        return level[a] + level[b] - 2 * level[findLca(a, b)];
    }

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;
        adj = new ArrayList<>();
        level = new int[n];
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] i : edges) {
            adj.get(i[0] - 1).add(i[1] - 1);
            adj.get(i[1] - 1).add(i[0] - 1);
        }
        int m = (int) (Math.ceil(Math.log(n - 1.0) / Math.log(2))) + 1;
        jumps = new int[n][m];
        mark(0, -1);
        for (int j = 1; j < m; j++) {
            for (int i = 0; i < n; i++) {
                int p = jumps[i][j - 1];
                jumps[i][j] = jumps[p][j - 1];
            }
        }
        int[] pow = new int[n + 1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }
        int q = queries.length;
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int d = findDist(queries[i][0] - 1, queries[i][1] - 1);
            ans[i] = d > 0 ? pow[d - 1] : 0;
        }
        return ans;
    }
}
