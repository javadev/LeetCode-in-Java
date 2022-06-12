package g2201_2300.s2203_minimum_weighted_subgraph_with_the_required_paths;

// #Hard #Graph #Shortest_Path #2022_06_12_Time_241_ms_(50.34%)_Space_205.1_MB_(10.20%)

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
        Map<Integer, Integer>[] g1 = new Map[n];
        Map<Integer, Integer>[] g2 = new Map[n];
        for (int[] edge : edges) {
            int s1 = edge[0], s2 = edge[1], w = edge[2];
            if (g1[s1] == null) {
                g1[s1] = new HashMap<>();
            }
            g1[s1].put(s2, Math.min(w, g1[s1].getOrDefault(s2, Integer.MAX_VALUE)));

            if (g2[s2] == null) {
                g2[s2] = new HashMap<>();
            }
            g2[s2].put(s1, Math.min(w, g2[s2].getOrDefault(s1, Integer.MAX_VALUE)));
        }

        Long[] dist1 = dijkstra(g1, src1);
        Long[] dist2 = dijkstra(g1, src2);
        Long[] dist3 = dijkstra(g2, dest);

        Long res = null;
        for (int i = 0; i < n; i += 1) {
            if (dist1[i] != null && dist2[i] != null && dist3[i] != null) {
                long sum = dist1[i] + dist2[i] + dist3[i];
                if (res == null || res > sum) {
                    res = sum;
                }
            }
        }
        return res == null ? -1 : res;
    }

    private Long[] dijkstra(Map<Integer, Integer>[] graph, int start) {
        Long[] res = new Long[graph.length];
        PriorityQueue<State> q = new PriorityQueue<>(Comparator.comparingLong(a -> a.w));
        q.offer(new State(start, 0L));
        while (!q.isEmpty()) {
            State cur = q.poll();
            if (res[cur.id] != null) {
                continue;
            }
            res[cur.id] = (long) cur.w;
            if (graph[cur.id] != null) {
                for (int next : graph[cur.id].keySet()) {
                    if (res[next] == null) {
                        q.offer(new State(next, cur.w + graph[cur.id].get(next)));
                    }
                }
            }
        }
        return res;
    }
}

class State {
    long w;
    int id;

    State(int id, long w) {
        this.id = id;
        this.w = w;
    }
}
