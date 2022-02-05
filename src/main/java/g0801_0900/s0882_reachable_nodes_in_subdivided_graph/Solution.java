package g0801_0900.s0882_reachable_nodes_in_subdivided_graph;

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
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
            Set<Integer> router,
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
}
