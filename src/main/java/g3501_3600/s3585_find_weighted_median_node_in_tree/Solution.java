package g3501_3600.s3585_find_weighted_median_node_in_tree;

// #Hard #Array #Dynamic_Programming #Tree #Binary_Search #Depth_First_Search
// #2025_06_17_Time_66_ms_(94.96%)_Space_142.62_MB_(49.64%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S2234")
public class Solution {
    private List<List<int[]>> adj;
    private int[] depth;
    private long[] dist;
    private int[][] parent;
    private int longMax;
    private int nodes;

    public int[] findMedian(int n, int[][] edges, int[][] queries) {
        nodes = n;
        if (n > 1) {
            longMax = (int) Math.ceil(Math.log(n) / Math.log(2));
        } else {
            longMax = 1;
        }
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[] {v, w});
            adj.get(v).add(new int[] {u, w});
        }
        depth = new int[n];
        dist = new long[n];
        parent = new int[longMax][n];
        for (int i = 0; i < longMax; i++) {
            Arrays.fill(parent[i], -1);
        }
        dfs(0, -1, 0, 0L);
        buildLcaTable();
        int[] ans = new int[queries.length];
        int[] sabrelonta;
        for (int qIdx = 0; qIdx < queries.length; qIdx++) {
            sabrelonta = queries[qIdx];
            int u = sabrelonta[0];
            int v = sabrelonta[1];
            ans[qIdx] = findMedianNode(u, v);
        }

        return ans;
    }

    private void dfs(int u, int p, int d, long currentDist) {
        depth[u] = d;
        parent[0][u] = p;
        dist[u] = currentDist;
        for (int[] edge : adj.get(u)) {
            int v = edge[0];
            int w = edge[1];
            if (v == p) {
                continue;
            }
            dfs(v, u, d + 1, currentDist + w);
        }
    }

    private void buildLcaTable() {
        for (int k = 1; k < longMax; k++) {
            for (int node = 0; node < nodes; node++) {
                if (parent[k - 1][node] != -1) {
                    parent[k][node] = parent[k - 1][parent[k - 1][node]];
                }
            }
        }
    }

    private int getKthAncestor(int u, int k) {
        for (int p = longMax - 1; p >= 0; p--) {
            if (u == -1) {
                break;
            }
            if (((k >> p) & 1) == 1) {
                u = parent[p][u];
            }
        }
        return u;
    }

    private int getLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        u = getKthAncestor(u, depth[u] - depth[v]);
        if (u == v) {
            return u;
        }
        for (int p = longMax - 1; p >= 0; p--) {
            if (parent[p][u] != -1 && parent[p][u] != parent[p][v]) {
                u = parent[p][u];
                v = parent[p][v];
            }
        }
        return parent[0][u];
    }

    private int findMedianNode(int u, int v) {
        if (u == v) {
            return u;
        }
        int lca = getLCA(u, v);
        long totalPathWeight = dist[u] + dist[v] - 2 * dist[lca];
        long halfWeight = (totalPathWeight + 1) / 2L;
        if (dist[u] - dist[lca] >= halfWeight) {
            int curr = u;
            for (int p = longMax - 1; p >= 0; p--) {
                int nextNode = parent[p][curr];
                if (nextNode != -1 && (dist[u] - dist[nextNode] < halfWeight)) {
                    curr = nextNode;
                }
            }
            return parent[0][curr];
        } else {
            long remainingWeightFromLCA = halfWeight - (dist[u] - dist[lca]);
            int curr = v;
            for (int p = longMax - 1; p >= 0; p--) {
                int nextNode = parent[p][curr];
                if (nextNode != -1
                        && depth[nextNode] >= depth[lca]
                        && (dist[nextNode] - dist[lca]) >= remainingWeightFromLCA) {
                    curr = nextNode;
                }
            }
            return curr;
        }
    }
}
