package g2301_2400.s2368_reachable_nodes_with_restrictions;

// #Medium #Array #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Graph
// #2022_08_16_Time_59_ms_(85.71%)_Space_89.6_MB_(85.71%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int src = edge[0];
            int dest = edge[1];
            graph[src].add(dest);
            graph[dest].add(src);
        }
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        q.offer(0);
        visited[0] = true;
        for (int node : restricted) {
            visited[node] = true;
        }
        int ans = 0;
        while (!q.isEmpty()) {
            int vertex = q.poll();
            ans++;
            for (int neighbour : graph[vertex]) {
                if (!visited[neighbour]) {
                    q.offer(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return ans;
    }
}
