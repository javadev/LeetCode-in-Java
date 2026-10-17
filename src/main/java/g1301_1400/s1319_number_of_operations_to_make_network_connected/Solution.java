package g1301_1400.s1319_number_of_operations_to_make_network_connected;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_8_Standard_Traversal #2026_10_17_Time_4_ms_(88.52%)_Space_65.60_MB_(82.35%)

public class Solution {
    private int[] parent;
    private int[] rank;
    private int components = 0;
    private int extra = 0;

    private int findPar(int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = findPar(parent[node]);
    }

    private void union(int u, int v) {
        int up = findPar(u);
        int vp = findPar(v);
        if (up == vp) {
            extra++;
            return;
        }
        components--;
        if (rank[up] < rank[vp]) {
            parent[up] = vp;
        } else if (rank[up] > rank[vp]) {
            parent[vp] = up;
        } else {
            parent[vp] = up;
            rank[up]++;
        }
    }

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        parent = new int[n];
        rank = new int[n];
        components = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge : connections) {
            union(edge[0], edge[1]);
        }
        return components - 1;
    }
}
