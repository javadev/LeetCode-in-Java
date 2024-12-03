package g3301_3400.s3373_maximize_the_number_of_target_nodes_after_connecting_trees_ii;

// #Hard #Tree #Depth_First_Search #Breadth_First_Search
// #2024_12_03_Time_26_ms_(98.75%)_Space_114.7_MB_(80.00%)

import java.util.Arrays;

public class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int[][] g1 = packU(n, edges1);
        int m = edges2.length + 1;
        int[][] g2 = packU(m, edges2);
        int[][] p2 = parents(g2);
        int[] eo2 = new int[2];
        for (int i = 0; i < m; i++) {
            eo2[p2[2][i] % 2]++;
        }
        int max = Math.max(eo2[0], eo2[1]);
        int[][] p1 = parents(g1);
        int[] eo1 = new int[2];
        for (int i = 0; i < n; i++) {
            eo1[p1[2][i] % 2]++;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = eo1[p1[2][i] % 2] + max;
        }
        return ans;
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
