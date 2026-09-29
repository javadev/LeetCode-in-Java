package g3901_4000.s3928_minimum_cost_to_buy_apples_ii;

// #Hard #Array #Heap_Priority_Queue #Shortest_Path #Senior_Staff #Graph_Theory #Weekly_Contest_501
// #2026_09_29_Time_694_ms_(97.40%)_Space_49.62_MB_(84.42%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings("java:S1210")
public class Solution {
    public int[] minCost(int n, int[] prices, int[][] roads) {
        List<List<Edge>> adj = adjacency(n, roads);
        int[] ans = Arrays.copyOf(prices, n);
        for (int i = 0; i < n; ++i) {
            long[] forward = shortestPath(adj, i, prices[i], true);
            long[] backward = shortestPath(adj, i, prices[i], false);
            for (int j = 0; j < n; ++j) {
                if (j != i && forward[j] != Long.MAX_VALUE && backward[j] != Long.MAX_VALUE) {
                    long d = forward[j] + prices[j] + backward[j];
                    if (d < ans[i]) {
                        ans[i] = (int) d;
                    }
                }
            }
        }
        return ans;
    }

    private long[] shortestPath(List<List<Edge>> adj, int src, int maxPrice, boolean forward) {
        long[] dist = new long[adj.size()];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[src] = 0L;
        PriorityQueue<Distance> pq = new PriorityQueue<>();
        pq.offer(new Distance(src, dist[src]));
        while (!pq.isEmpty() && pq.peek().dist <= maxPrice) {
            Distance distance = pq.poll();
            if (distance.dist > dist[distance.node]) {
                continue;
            }
            for (Edge edge : adj.get(distance.node)) {
                long d = forward ? edge.forward : edge.backward;
                if (dist[edge.node] > dist[distance.node] + d) {
                    dist[edge.node] = dist[distance.node] + d;
                    pq.offer(new Distance(edge.node, dist[edge.node]));
                }
            }
        }
        return dist;
    }

    private List<List<Edge>> adjacency(int n, int[][] roads) {
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            adj.add(new ArrayList<>());
        }
        for (int[] r : roads) {
            long f = r[2];
            long b = f * r[3];
            adj.get(r[0]).add(new Edge(r[1], f, b));
            adj.get(r[1]).add(new Edge(r[0], f, b));
        }
        return adj;
    }

    private static final class Edge {
        private final int node;
        private final long forward;
        private final long backward;

        private Edge(int node, long forward, long backward) {
            this.node = node;
            this.forward = forward;
            this.backward = backward;
        }
    }

    private static final class Distance implements Comparable<Distance> {
        private final int node;
        private final long dist;

        private Distance(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Distance other) {
            return Long.compare(this.dist, other.dist);
        }
    }
}
