package g0801_0900.s0847_shortest_path_visiting_all_nodes;

// #Hard #Dynamic_Programming #Breadth_First_Search #Bit_Manipulation #Graph #Bitmask
// #Graph_Theory_I_Day_10_Standard_Traversal #2022_03_24_Time_14_ms_(78.72%)_Space_45.2_MB_(71.96%)

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class Solution {
    public int shortestPathLength(int[][] graph) {
        int target = (1 << graph.length) - 1;
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < graph.length; ++i) {
            q.offer(new int[] {i, 1 << i});
        }
        int steps = 0;
        boolean[][] visited = new boolean[graph.length][target + 1];
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                int[] curr = q.poll();
                int currNode = Objects.requireNonNull(curr)[0];
                int currState = curr[1];
                if (currState == target) {
                    return steps;
                }
                for (int n : graph[currNode]) {
                    int newState = currState | 1 << n;
                    if (visited[n][newState]) {
                        continue;
                    }
                    visited[n][newState] = true;
                    q.offer(new int[] {n, newState});
                }
            }
            ++steps;
        }
        return -1;
    }
}
