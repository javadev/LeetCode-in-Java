package g2001_2100.s2045_second_minimum_time_to_reach_destination;

// #Hard #Breadth_First_Search #Graph #Shortest_Path
// #2022_05_26_Time_65_ms_(74.03%)_Space_51.6_MB_(97.24%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int p = edge[0] - 1;
            int q = edge[1] - 1;
            adj[p].add(q);
            adj[q].add(p);
        }
        int[] dis1 = new int[n];
        int[] dis2 = new int[n];
        Arrays.fill(dis1, Integer.MAX_VALUE);
        Arrays.fill(dis2, Integer.MAX_VALUE);
        dis1[0] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int cur = temp[0];
            int path = temp[1];
            for (int node : adj[cur]) {
                int newPath = path + 1;
                if (newPath < dis1[node]) {
                    dis2[node] = dis1[node];
                    dis1[node] = newPath;
                    queue.offer(new int[] {node, newPath});
                } else if ((newPath > dis1[node]) && (newPath < dis2[node])) {
                    dis2[node] = newPath;
                    queue.offer(new int[] {node, newPath});
                }
            }
        }
        return helper(dis2[n - 1], time, change);
    }

    private int helper(int pathValue, int time, int change) {
        int sum = 0;
        for (int i = 0; i < pathValue; i++) {
            sum += time;
            if (i == pathValue - 1) {
                break;
            }
            if ((sum / change) % 2 != 0) {
                sum = (sum / change + 1) * change;
            }
        }
        return sum;
    }
}
