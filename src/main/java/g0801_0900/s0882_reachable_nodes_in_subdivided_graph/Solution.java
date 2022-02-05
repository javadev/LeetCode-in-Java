package g0801_0900.s0882_reachable_nodes_in_subdivided_graph;

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
    public int reachableNodesTle(int[][] edges, int maxMoves, int n) {
        Map<Integer, Map<Integer, boolean[]>> graph = new HashMap<>();
        Set<boolean[]> pathSet = new HashSet<>();
        for (int[] edge : edges) {
            boolean[] path = new boolean[edge[2]];
            pathSet.add(path);
            graph.computeIfAbsent(edge[0], k -> new HashMap<>()).put(edge[1], path);
            graph.computeIfAbsent(edge[1], k -> new HashMap<>()).put(edge[0], path);
        }
        Set<Integer> traceNodes = new HashSet<>(n);
        LinkedHashSet<Integer> router = new LinkedHashSet<>();
        getReachableNodes(graph, traceNodes, router, 0, maxMoves);
        int total = traceNodes.size();
        for (boolean[] val : pathSet) {
            for (boolean a : val) {
                if (a) {
                    total++;
                }
            }
        }
        return total;
    }

    public void getReachableNodes(
            Map<Integer, Map<Integer, boolean[]>> graph,
            Set<Integer> traceNodes,
            LinkedHashSet<Integer> router,
            Integer fromNode,
            int maxMoves) {
        traceNodes.add(fromNode);
        if (!graph.containsKey(fromNode)) {
            return;
        }
        if (maxMoves <= 0) {
            return;
        }
        Map<Integer, boolean[]> points = graph.get(fromNode);
        router.add(fromNode);
        for (Map.Entry<Integer, boolean[]> entry : points.entrySet()) {
            Integer nextNode = entry.getKey();
            boolean[] path = entry.getValue();

            if (path.length <= maxMoves - 1) {
                Arrays.fill(path, true);
                traceNodes.add(nextNode);
                getReachableNodes(graph, traceNodes, router, nextNode, maxMoves - 1 - path.length);
            } else {
                if (fromNode > nextNode) {
                    Arrays.fill(path, path.length - maxMoves, path.length, true);
                } else {
                    Arrays.fill(path, 0, maxMoves, true);
                }
            }
        }
        router.remove(fromNode);
    }

    public int reachableNodes(int[][] edges, int M, int N) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.computeIfAbsent(u, x -> new HashMap<>()).put(v, w);
            graph.computeIfAbsent(v, x -> new HashMap<>()).put(u, w);
        }
        // [node, dist]
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[] {0, 0});
        Map<Integer, Integer> dist = new HashMap<>();
        dist.put(0, 0);
        Map<Integer, Integer> used = new HashMap<>();
        int ans = 0;
        while (!pq.isEmpty()) {
            int[] nodeDist = pq.poll();
            int node = nodeDist[0];
            int d = nodeDist[1];
            if (d > dist.getOrDefault(node, 0)) {
                continue;
            }
            // Each node is only visited once.  We've reached
            // a node in our original graph.
            ans++;
            if (!graph.containsKey(node)) {
                continue;
            }
            for (int nei : graph.get(node).keySet()) {
                // M - d is how much further we can walk from this node;
                // weight is how many new nodes there are on this edge.
                // v is the maximum utilization of this edge.
                int weight = graph.get(node).get(nei);
                int v = Math.min(weight, M - d);
                used.put(N * node + nei, v);

                // d2 is the total distance to reach 'nei' (neighbor) node
                // in the original graph.
                int d2 = d + weight + 1;
                if (d2 < dist.getOrDefault(nei, M + 1)) {
                    pq.offer(new int[] {nei, d2});
                    dist.put(nei, d2);
                }
            }
        }
        // At the end, each edge (u, v, w) can be used with a maximum
        // of w new nodes: a max of used[u, v] nodes from one side,
        // and used[v, u] nodes from the other.
        // [We use the encoding (u, v) = u * N + v.]
        for (int[] edge : edges) {
            ans +=
                    Math.min(
                            edge[2],
                            used.getOrDefault(edge[0] * N + edge[1], 0)
                                    + used.getOrDefault(edge[1] * N + edge[0], 0));
        }
        return ans;
    }
}
