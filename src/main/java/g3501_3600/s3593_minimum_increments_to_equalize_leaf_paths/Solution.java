package g3501_3600.s3593_minimum_increments_to_equalize_leaf_paths;

// #Medium #2025_06_22_Time_18_ms_(100.00%)_Space_100.49_MB_(69.07%)

import java.util.Arrays;

public class Solution {
    public int minIncrease(int n, int[][] edges, int[] cost) {
        int[][] g = packU(n, edges);
        int[][] pars = parents(g);
        int[] par = pars[0];
        int[] ord = pars[1];
        long[] dp = new long[n];
        int ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            int cur = ord[i];
            long max = -1;
            for (int e : g[cur]) {
                if (par[cur] != e) {
                    max = Math.max(max, dp[e]);
                }
            }
            for (int e : g[cur]) {
                if (par[cur] != e && dp[e] != max) {
                    ret++;
                }
            }
            dp[cur] = max + cost[cur];
        }
        return ret;
    }

    private int[][] parents(int[][] g) {
        int n = g.length;
        int[] par = new int[n];
        Arrays.fill(par, -1);
        int[] depth = new int[n];
        depth[0] = 0;
        int[] q = new int[n];
        q[0] = 0;
        int p = 0;
        int r = 1;
        while (p < r) {
            int cur = q[p];
            for (int nex : g[cur]) {
                if (par[cur] != nex) {
                    q[r++] = nex;
                    par[nex] = cur;
                    depth[nex] = depth[cur] + 1;
                }
            }
            p++;
        }
        return new int[][] {par, q, depth};
    }

    private int[][] packU(int n, int[][] ft) {
        int[][] g = new int[n][];
        int[] p = new int[n];
        for (int[] u : ft) {
            p[u[0]]++;
            p[u[1]]++;
        }
        for (int i = 0; i < n; i++) {
            g[i] = new int[p[i]];
        }
        for (int[] u : ft) {
            g[u[0]][--p[u[0]]] = u[1];
            g[u[1]][--p[u[1]]] = u[0];
        }
        return g;
    }
}
