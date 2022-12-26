package g0901_1000.s0924_minimize_malware_spread;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2022_04_29_Time_10_ms_(47.21%)_Space_55.1_MB_(83.27%)

public class Solution {
    private int[] size;
    private int[] par;

    public int minMalwareSpread(int[][] graph, int[] initial) {
        size = new int[graph.length];
        par = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            size[i] = 1;
            par[i] = i;
        }
        // create groups
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 1) {
                    int p1 = find(i);
                    int p2 = find(j);
                    merge(p1, p2);
                }
            }
        }
        // no of infected in group
        int[] infected = new int[graph.length];
        for (int e : initial) {
            int p = find(e);
            infected[p]++;
        }
        int currSize = -1;
        int ans = -1;
        for (int e : initial) {
            int p = find(e);
            if (infected[p] == 1 && size[p] >= currSize) {
                if (size[p] > currSize) {
                    ans = e;
                } else {
                    ans = Math.min(ans, e);
                }
                currSize = size[p];
            }
        }
        // all groups have more than 1 infected node then return min value from initial
        if (ans == -1) {
            ans = initial[0];
            for (int j : initial) {
                ans = Math.min(ans, j);
            }
        }
        return ans;
    }

    private void merge(int p1, int p2) {
        if (p1 != p2) {
            if (size[p1] > size[p2]) {
                par[p2] = p1;
                size[p1] += size[p2];
            } else {
                par[p1] = p2;
                size[p2] += size[p1];
            }
        }
    }

    private int find(int u) {
        if (par[u] == u) {
            return u;
        }
        par[u] = find(par[u]);
        return par[u];
    }
}
