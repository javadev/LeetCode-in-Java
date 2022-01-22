package g0601_0700.s0684_redundant_connection;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find

public class Solution {
    private int[] par;

    public int[] findRedundantConnection(int[][] edges) {
        int[] ans = new int[2];
        int n = edges.length;
        par = new int[n + 1];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        for (int[] edge : edges) {
            int lx = find(edge[0]);
            int ly = find(edge[1]);
            if (lx != ly) {
                par[lx] = ly;
            } else {
                ans[0] = edge[0];
                ans[1] = edge[1];
            }
        }
        return ans;
    }

    private int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }
}
