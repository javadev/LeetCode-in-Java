package g3101_3200.s3123_find_edges_in_shortest_paths;

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path #Depth_First_Search #Breadth_First_Search
// #2024_04_27_Time_24_ms_(100.00%)_Space_75.2_MB_(88.50%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    private int[] edge;
    private int[] weight;
    private int[] next;
    private int[] head;
    private int index;

    private void add(int u, int v, int w) {
        edge[index] = v;
        weight[index] = w;
        next[index] = head[u];
        head[u] = index++;
    }

    public boolean[] findAnswer(int n, int[][] edges) {
        int m = edges.length;
        edge = new int[m << 1];
        weight = new int[m << 1];
        next = new int[m << 1];
        head = new int[n];
        for (int i = 0; i < n; ++i) {
            head[i] = -1;
        }
        index = 0;
        for (int[] localEdge : edges) {
            int u = localEdge[0];
            int v = localEdge[1];
            int w = localEdge[2];
            add(u, v, w);
            add(v, u, w);
        }
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> a[1] < b[1] ? -1 : 1);
        long[] distances = new long[n];
        Arrays.fill(distances, (long) 1e12);
        pq.offer(new long[] {0, 0});
        distances[0] = 0;
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            int u = (int) cur[0];
            long distance = cur[1];
            if (distance > distances[u]) {
                continue;
            }
            if (u == n - 1) {
                break;
            }
            for (int index = head[u]; index != -1; index = next[index]) {
                int v = edge[index];
                int w = weight[index];
                long newDistance = distance + w;
                if (newDistance < distances[v]) {
                    distances[v] = newDistance;
                    pq.offer(new long[] {v, newDistance});
                }
            }
        }
        boolean[] ans = new boolean[m];
        if (distances[n - 1] >= (long) 1e12) {
            return ans;
        }
        dfs(distances, n - 1, -1, ans);
        return ans;
    }

    private void dfs(long[] distances, int u, int pre, boolean[] ans) {
        for (int index = head[u]; index != -1; index = next[index]) {
            int v = edge[index];
            int w = weight[index];
            int i = index >> 1;
            if (distances[v] + w != distances[u]) {
                continue;
            }
            ans[i] = true;
            if (v == pre) {
                continue;
            }
            dfs(distances, v, u, ans);
        }
    }
}
