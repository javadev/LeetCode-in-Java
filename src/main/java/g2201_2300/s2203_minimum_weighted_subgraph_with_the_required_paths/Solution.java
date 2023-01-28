package g2201_2300.s2203_minimum_weighted_subgraph_with_the_required_paths;

// #Hard #Graph #Shortest_Path #2022_06_12_Time_92_ms_(97.26%)_Space_93.5_MB_(99.32%)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    public long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
        List<int[]>[] graph = new List[n];
        long[][] weight = new long[3][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                weight[j][i] = Long.MAX_VALUE;
            }
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(new int[] {e[1], e[2]});
        }
        Queue<Node> queue = new PriorityQueue<>(Comparator.comparingLong(node -> node.weight));
        queue.offer(new Node(0, src1, 0));
        weight[0][src1] = 0;
        queue.offer(new Node(1, src2, 0));
        weight[1][src2] = 0;
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.vertex == dest && curr.index == 2) {
                return curr.weight;
            }
            for (int[] next : graph[curr.vertex]) {
                if (curr.index == 2 && weight[curr.index][next[0]] > curr.weight + next[1]) {
                    weight[curr.index][next[0]] = curr.weight + next[1];
                    queue.offer(new Node(curr.index, next[0], weight[curr.index][next[0]]));
                } else if (weight[curr.index][next[0]] > curr.weight + next[1]) {
                    weight[curr.index][next[0]] = curr.weight + next[1];
                    queue.offer(new Node(curr.index, next[0], weight[curr.index][next[0]]));
                    if (weight[curr.index ^ 1][next[0]] != Long.MAX_VALUE
                            && weight[curr.index][next[0]] + weight[curr.index ^ 1][next[0]]
                                    < weight[2][next[0]]) {
                        weight[2][next[0]] =
                                weight[curr.index][next[0]] + weight[curr.index ^ 1][next[0]];
                        queue.offer(new Node(2, next[0], weight[2][next[0]]));
                    }
                }
            }
        }
        return -1;
    }

    private static class Node {
        int index;
        int vertex;
        long weight;

        Node(int index, int vertex, long weight) {
            this.index = index;
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
