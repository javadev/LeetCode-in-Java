package g0801_0900.s0882_reachable_nodes_in_subdivided_graph;

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path
// #2022_03_28_Time_28_ms_(95.85%)_Space_66.3_MB_(87.56%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        // Build graph
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            // how many nodes between u and v(inclusive)
            // vvvvvvvvvvvvvvv
            int u = edge[0];
            int v = edge[1];
            int w = edge[2] + 1;
            graph[u].add(new int[] {v, w});
            graph[v].add(new int[] {u, w});
        }
        // Do dijkstra
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE >> 1);
        dist[0] = 0;
        queue.add(new int[] {0, dist[0]});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int u = curr[0];
            int d = curr[1];
            if (d != dist[u]) {
                continue;
            }
            for (int[] next : graph[u]) {
                int v = next[0];
                int w = next[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    queue.add(new int[] {v, dist[v]});
                }
            }
        }
        // Count reachable nodes
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dist[i] <= maxMoves) {
                ans++;
            }
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            // Nodes can be extended from (u, v) in at most maxMoves steps
            // if maxMoves - dist[u] < 0, then l = 0
            int l = Math.max(0, maxMoves - dist[u]);
            int r = Math.max(0, maxMoves - dist[v]);
            // l + r shouldn't be greater than w
            ans += Math.min(w, l + r);
        }
        return ans;
    }
}
