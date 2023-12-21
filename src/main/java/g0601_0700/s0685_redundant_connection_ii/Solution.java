package g0601_0700.s0685_redundant_connection_ii;

// #Hard #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2022_03_22_Time_1_ms_(96.65%)_Space_44.6_MB_(25.00%)

public class Solution {
    private int[] par;

    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[] haspar = new int[n + 1];
        for (int[] edge : edges) {
            int v = edge[1];
            haspar[v]++;
        }
        par = new int[n + 1];
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (haspar[v] == 1) {
                int lu = find(u);
                int lv = find(v);
                if (lu != lv) {
                    par[lu] = lv;
                } else {
                    return edge;
                }
            }
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (haspar[v] > 1) {
                int lu = find(u);
                int lv = find(v);
                if (lu != lv) {
                    par[lu] = lv;
                } else {
                    return edge;
                }
            }
        }
        return new int[2];
    }

    private int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return find(par[x]);
    }
}
