package g2601_2700.s2642_design_graph_with_shortest_path_calculator;

// #Hard #Design #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_09_05_Time_94_ms_(81.68%)_Space_55.1_MB_(13.74%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Graph {
    private final Map<Integer, ArrayList<Pair<Integer, Integer>>> adj = new HashMap<>();

    public Graph(int n, int[][] edges) {
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            ArrayList<Pair<Integer, Integer>> uList = adj.get(u);
            uList.add(new Pair<>(v, cost));
            adj.put(u, uList);
        }
    }

    public void addEdge(int[] edge) {
        int u = edge[0];
        int v = edge[1];
        int cost = edge[2];
        ArrayList<Pair<Integer, Integer>> uList = adj.getOrDefault(u, new ArrayList<>());
        uList.add(new Pair<>(v, cost));
        adj.put(u, uList);
    }

    public int shortestPath(int node1, int node2) {
        PriorityQueue<Pair<Integer, Integer>> minHeap =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        int[] distance = new int[adj.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        minHeap.add(new Pair<>(node1, 0));
        distance[node1] = 0;
        while (!minHeap.isEmpty()) {
            Pair<Integer, Integer> nodeCost = minHeap.poll();
            int node = nodeCost.getKey();
            int cost = nodeCost.getValue();
            if (node == node2) {
                return cost;
            }
            if (cost > distance[node]) {
                continue;
            }
            ArrayList<Pair<Integer, Integer>> neighbors = adj.get(node);
            if (neighbors != null) {
                for (Pair<Integer, Integer> neighbor : neighbors) {
                    int next = neighbor.getKey();
                    int nextCost = neighbor.getValue();
                    if (cost + nextCost < distance[next]) {
                        distance[next] = cost + nextCost;
                        minHeap.add(new Pair<>(next, cost + nextCost));
                    }
                }
            }
        }
        return -1;
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

/*
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
