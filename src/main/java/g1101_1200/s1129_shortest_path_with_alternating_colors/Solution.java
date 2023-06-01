package g1101_1200.s1129_shortest_path_with_alternating_colors;

// #Medium #Breadth_First_Search #Graph #Graph_Theory_I_Day_10_Standard_Traversal
// #2023_06_01_Time_4_ms_(96.63%)_Space_44.3_MB_(10.59%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    private static class Pair {
        int color;
        int node;

        Pair(int node, int color) {
            this.node = node;
            this.color = color;
        }
    }

    private void bfs(
            Queue<Integer> q,
            boolean[][] vis,
            List<List<Pair>> graph,
            boolean blue,
            int[] shortestPaths) {
        int level = 0;
        q.add(0);
        if (blue) {
            vis[0][1] = true;
        } else {
            vis[0][0] = true;
        }
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int curr = q.poll();
                shortestPaths[curr] = Math.min(level, shortestPaths[curr]);
                for (Pair nextNode : graph.get(curr)) {
                    if (nextNode.color == 1 && blue && !vis[nextNode.node][1]) {
                        q.add(nextNode.node);
                        vis[nextNode.node][1] = true;
                    }
                    if (!blue && nextNode.color == 0 && !vis[nextNode.node][0]) {
                        q.add(nextNode.node);
                        vis[nextNode.node][0] = true;
                    }
                }
            }
            blue = !blue;
            level++;
        }
    }

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : redEdges) {
            int a = edge[0];
            int b = edge[1];
            // red -> 0
            graph.get(a).add(new Pair(b, 0));
        }
        for (int[] edge : blueEdges) {
            int u = edge[0];
            int v = edge[1];
            // blue -> 1
            graph.get(u).add(new Pair(v, 1));
        }
        int[] shortestPaths = new int[n];
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(shortestPaths, Integer.MAX_VALUE);
        bfs(q, new boolean[n][2], graph, true, shortestPaths);
        bfs(q, new boolean[n][2], graph, false, shortestPaths);
        for (int i = 0; i < n; i++) {
            if (shortestPaths[i] == Integer.MAX_VALUE) {
                shortestPaths[i] = -1;
            }
        }
        return shortestPaths;
    }
}
