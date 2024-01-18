package g0701_0800.s0743_network_delay_time;

// #Medium #Depth_First_Search #Breadth_First_Search #Heap_Priority_Queue #Graph #Shortest_Path
// #2022_03_25_Time_3_ms_(99.87%)_Space_61.2_MB_(75.30%)

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] graph = new int[n + 1][n + 1];
        for (int[] g : graph) {
            Arrays.fill(g, -1);
        }
        for (int[] t : times) {
            graph[t[0]][t[1]] = t[2];
        }
        boolean[] visited = new boolean[n + 1];
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        Queue<Integer> spfa = new LinkedList<>();
        spfa.add(k);
        visited[k] = true;
        while (!spfa.isEmpty()) {
            int curr = spfa.poll();
            visited[curr] = false;
            for (int i = 1; i <= n; i++) {
                if (graph[curr][i] != -1 && dist[i] > dist[curr] + graph[curr][i]) {
                    dist[i] = dist[curr] + graph[curr][i];
                    if (!visited[i]) {
                        spfa.add(i);
                        visited[i] = true;
                    }
                }
            }
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = Math.max(dist[i], result);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
