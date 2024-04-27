package g3101_3200.s3112_minimum_time_to_visit_disappearing_nodes;

// #Medium #Array #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_04_27_Time_10_ms_(100.00%)_Space_85.4_MB_(99.80%)

import java.util.Arrays;

public class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean exit = false;
        int i, src, dest, cost;
        dist[0] = 0;
        for (i = 0; i < n && !exit; ++i) {
            exit = true;
            for (int[] edge : edges) {
                src = edge[0];
                dest = edge[1];
                cost = edge[2];
                if (dist[src] != -1
                        && dist[src] != Integer.MAX_VALUE
                        && dist[src] < disappear[src]) {
                    if (dist[src] + cost < dist[dest]) {
                        exit = false;
                        dist[dest] = dist[src] + cost;
                    }
                }
                if (dist[dest] != -1
                        && dist[dest] != Integer.MAX_VALUE
                        && dist[dest] < disappear[dest]) {
                    if (dist[dest] + cost < dist[src]) {
                        exit = false;
                        dist[src] = dist[dest] + cost;
                    }
                }
            }
        }
        for (i = 0; i < dist.length; ++i) {
            if (dist[i] == Integer.MAX_VALUE || dist[i] >= disappear[i]) {
                dist[i] = -1;
            }
        }
        return dist;
    }
}
