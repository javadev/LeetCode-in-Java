package g2001_2100.s2065_maximum_path_quality_of_a_graph;

// #Hard #Array #Graph #Backtracking #2022_05_29_Time_94_ms_(95.34%)_Space_67.9_MB_(59.84%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int maxQuality;

    static class Node {
        int i;
        int time;

        public Node(int i, int time) {
            this.i = i;
            this.time = time;
        }
    }

    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        List<List<Node>> graph = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int time = edge[2];
            Node node1 = new Node(u, time);
            Node node2 = new Node(v, time);
            graph.get(u).add(node2);
            graph.get(v).add(node1);
        }
        maxQuality = 0;
        dfs(graph, 0, 0, maxTime, values[0], values);

        return maxQuality;
    }

    private void dfs(
            List<List<Node>> graph,
            int start,
            int curTime,
            int maxTime,
            int curValue,
            int[] values) {
        if (curTime > maxTime) {
            return;
        }
        if (curTime == maxTime && start != 0) {
            return;
        }

        if (start == 0) {
            maxQuality = Math.max(maxQuality, curValue);
        }
        int tmp = values[start];
        if (tmp != 0) {
            values[start] = 0;
        }
        for (Node node : graph.get(start)) {
            int v = node.i;
            int time = node.time;
            int value = values[v];
            if (value != 0) {
                values[v] = 0;
            }
            dfs(graph, v, curTime + time, maxTime, curValue + value, values);
            if (value != 0) {
                values[v] = value;
            }
        }
        if (tmp != 0) {
            values[start] = tmp;
        }
    }
}
