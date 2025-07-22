package g3601_3700.s3620_network_recovery_pathways;

// #Hard #Biweekly_Contest_161 #2025_07_22_Time_158_ms_(64.00%)_Space_130.14_MB_(14.77%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    private List<Integer> topologicalSort(int n, List<List<Integer>> g) {
        int[] indeg = new int[n];
        for (int i = 0; i < n; ++i) {
            for (int adjNode : g.get(i)) {
                indeg[adjNode]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ts = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            ts.add(u);
            for (int v : g.get(u)) {
                indeg[v]--;
                if (indeg[v] == 0) {
                    q.offer(v);
                }
            }
        }
        return ts;
    }

    private boolean check(
            int x, int n, List<List<int[]>> adj, List<Integer> ts, boolean[] online, long k) {
        long[] d = new long[n];
        Arrays.fill(d, Long.MAX_VALUE);
        d[0] = 0;
        for (int u : ts) {
            // If d[u] is reachable
            if (d[u] != Long.MAX_VALUE) {
                for (int[] p : adj.get(u)) {
                    int v = p[0];
                    int c = p[1];
                    if (c < x || !online[v]) {
                        continue;
                    }
                    if (d[u] + c < d[v]) {
                        d[v] = d[u] + c;
                    }
                }
            }
        }
        return d[n - 1] <= k;
    }

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;
        // Adjacency list for graph with edge weights
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int c = e[2];
            adj.get(u).add(new int[] {v, c});
            g.get(u).add(v);
        }
        List<Integer> ts = topologicalSort(n, g);
        if (!check(0, n, adj, ts, online, k)) {
            return -1;
        }
        int l = 0;
        int h = 0;
        for (int[] e : edges) {
            h = Math.max(h, e[2]);
        }
        while (l < h) {
            int md = l + (h - l + 1) / 2;
            if (check(md, n, adj, ts, online, k)) {
                l = md;
            } else {
                h = md - 1;
            }
        }
        return l;
    }
}
