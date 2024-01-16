package g2601_2700.s2699_modify_graph_edge_weights;

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_09_14_Time_88_ms_(85.25%)_Space_49.9_MB_(85.25%)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings({"unchecked", "java:S135"})
public class Solution {
    public int[][] modifiedGraphEdges(
            int n, int[][] edges, int source, int destination, int target) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int[] e = edges[i];
            graph[e[0]].add(new int[] {e[1], i});
            graph[e[1]].add(new int[] {e[0], i});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(v -> v[1]));
        pq.add(new int[] {destination, 0});
        Integer[] distances = new Integer[n];
        processQueue(edges, source, pq, distances, graph);
        if (distances[source] > target) {
            return new int[][] {};
        }
        pq = new PriorityQueue<>(Comparator.comparingInt(v -> v[1]));
        if (distances[source] != target) {
            pq.add(new int[] {source, 0});
        }
        boolean[] visited = new boolean[n];
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            if (visited[c[0]]) {
                continue;
            }
            visited[c[0]] = true;
            if (c[0] == destination) {
                return new int[][] {};
            }
            for (int[] e : graph[c[0]]) {
                if (visited[e[0]] || distances[e[0]] == null) {
                    continue;
                }
                int dif = target - c[1] - distances[e[0]];
                if (Math.abs(edges[e[1]][2]) >= dif) {
                    continue;
                }
                if (edges[e[1]][2] == -1) {
                    edges[e[1]][2] = dif;
                    continue;
                }
                pq.add(new int[] {e[0], c[1] + edges[e[1]][2]});
            }
        }
        for (int[] e : edges) {
            if (e[2] == -1) {
                e[2] = 1;
            }
        }
        return edges;
    }

    private void processQueue(
            int[][] edges,
            int source,
            PriorityQueue<int[]> pq,
            Integer[] distances,
            List<int[]>[] graph) {
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            if (distances[c[0]] != null) {
                continue;
            }
            distances[c[0]] = c[1];
            if (c[0] == source) {
                continue;
            }
            for (int[] e : graph[c[0]]) {
                if (distances[e[0]] != null) {
                    continue;
                }
                pq.add(new int[] {e[0], c[1] + Math.abs(edges[e[1]][2])});
            }
        }
    }
}
