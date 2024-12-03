package g3301_3400.s3372_maximize_the_number_of_target_nodes_after_connecting_trees_i;

// #Medium #Tree #Depth_First_Search #Breadth_First_Search
// #2024_12_03_Time_50_ms_(99.49%)_Space_75.7_MB_(5.10%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    private ArrayList<Integer>[] getGraph(int[][] edges) {
        int n = edges.length + 1;
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        return graph;
    }

    private void dfs(ArrayList<Integer>[] graph, int u, int pt, int[][] dp, int k) {
        for (int v : graph[u]) {
            if (v == pt) {
                continue;
            }
            dfs(graph, v, u, dp, k);
            for (int i = 0; i < k; i++) {
                dp[u][i + 1] += dp[v][i];
            }
        }
        dp[u][0]++;
    }

    private void dfs2(
            ArrayList<Integer>[] graph, int u, int pt, int[] ptv, int[][] fdp, int[][] dp, int k) {
        fdp[u][0] = dp[u][0];
        for (int i = 1; i <= k; i++) {
            fdp[u][i] = (dp[u][i] + ptv[i - 1]);
        }
        for (int v : graph[u]) {
            if (v == pt) {
                continue;
            }
            int[] nptv = new int[k + 1];
            for (int i = 0; i < k; i++) {
                nptv[i + 1] = dp[u][i + 1] - dp[v][i] + ptv[i];
            }
            nptv[0] = 1;
            dfs2(graph, v, u, nptv, fdp, dp, k);
        }
    }

    private int[][] get(int[][] edges, int k) {
        ArrayList<Integer>[] graph = getGraph(edges);
        int n = graph.length;
        int[][] dp = new int[n][k + 1];
        int[][] fdp = new int[n][k + 1];
        dfs(graph, 0, -1, dp, k);
        dfs2(graph, 0, -1, new int[k + 1], fdp, dp, k);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                fdp[i][j] += fdp[i][j - 1];
            }
        }
        return fdp;
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int[][] a = get(edges1, k);
        int[][] b = get(edges2, k);
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n];
        int max = 0;
        for (int i = 0; k != 0 && i < m; i++) {
            max = Math.max(max, b[i][k - 1]);
        }
        for (int i = 0; i < n; i++) {
            ans[i] = a[i][k] + max;
        }
        return ans;
    }
}
