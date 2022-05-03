package g1701_1800.s1786_number_of_restricted_paths_from_first_to_last_node;

// #Medium #Dynamic_Programming #Heap_Priority_Queue #Graph #Topological_Sort #Shortest_Path
// #2022_04_30_Time_86_ms_(88.56%)_Space_73.5_MB_(85.34%)

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings("java:S1210")
public class Solution {
    private static class Pair implements Comparable<Pair> {
        int v;
        int cwt;

        Pair(int v, int cwt) {
            this.v = v;
            this.cwt = cwt;
        }

        public int compareTo(Pair o) {
            return this.cwt - o.cwt;
        }
    }

    private static class Edge {
        int v;
        int wt;

        Edge(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    private int[] dtl;
    private int[] dp;
    private static final int M = 1000000007;

    public int countRestrictedPaths(int n, int[][] edges) {
        List<List<Edge>> graph = buildGraph(n, edges);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[n + 1];
        dtl = new int[n + 1];
        pq.add(new Pair(n, 0));
        while (!pq.isEmpty()) {
            Pair rem = pq.remove();
            if (vis[rem.v]) {
                continue;
            }
            dtl[rem.v] = rem.cwt;
            vis[rem.v] = true;
            for (Edge edge : graph.get(rem.v)) {
                if (!vis[edge.v]) {
                    pq.add(new Pair(edge.v, rem.cwt + edge.wt));
                }
            }
        }
        dp = new int[n + 1];
        return dfs(graph, 1, new boolean[n + 1], n);
    }

    private int dfs(List<List<Edge>> graph, int vtx, boolean[] vis, int n) {
        if (vtx == n) {
            return 1;
        }
        long ans = 0;
        vis[vtx] = true;
        for (Edge edge : graph.get(vtx)) {
            if (!vis[edge.v] && dtl[edge.v] < dtl[vtx]) {
                int x = dfs(graph, edge.v, vis, n);
                ans = (ans + x) % M;
            } else if (dtl[edge.v] < dtl[vtx] && vis[edge.v]) {
                ans = (ans + dp[edge.v]) % M;
            }
        }
        dp[vtx] = (int) ans;
        return (int) ans;
    }

    private List<List<Edge>> buildGraph(int n, int[][] edges) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            graph.get(u).add(new Edge(v, wt));
            graph.get(v).add(new Edge(u, wt));
        }
        return graph;
    }
}
