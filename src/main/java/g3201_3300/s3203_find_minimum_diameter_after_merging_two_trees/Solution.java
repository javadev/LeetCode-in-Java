package g3201_3300.s3203_find_minimum_diameter_after_merging_two_trees;

// #Hard #Depth_First_Search #Breadth_First_Search #Tree #Graph
// #2024_07_04_Time_29_ms_(99.83%)_Space_110.9_MB_(86.36%)

import java.util.Arrays;

public class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int[][] g = packU(n, edges1);
        int m = edges2.length + 1;
        int[][] h = packU(m, edges2);
        int[] d1 = diameter(g);
        int[] d2 = diameter(h);
        int ans = Math.max(d1[0], d2[0]);
        ans = Math.max((d1[0] + 1) / 2 + (d2[0] + 1) / 2 + 1, ans);
        return ans;
    }

    private int[] diameter(int[][] g) {
        int n = g.length;
        int f0;
        int f1;
        int d01;
        int[] q = new int[n];
        boolean[] ved = new boolean[n];
        int qp = 0;
        q[qp++] = 0;
        ved[0] = true;
        for (int i = 0; i < qp; i++) {
            int cur = q[i];
            for (int e : g[cur]) {
                if (!ved[e]) {
                    ved[e] = true;
                    q[qp++] = e;
                }
            }
        }
        f0 = q[n - 1];
        int[] d = new int[n];
        qp = 0;
        Arrays.fill(ved, false);
        q[qp++] = f0;
        ved[f0] = true;
        for (int i = 0; i < qp; i++) {
            int cur = q[i];
            for (int e : g[cur]) {
                if (!ved[e]) {
                    ved[e] = true;
                    q[qp++] = e;
                    d[e] = d[cur] + 1;
                }
            }
        }
        f1 = q[n - 1];
        d01 = d[f1];
        return new int[] {d01, f0, f1};
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
