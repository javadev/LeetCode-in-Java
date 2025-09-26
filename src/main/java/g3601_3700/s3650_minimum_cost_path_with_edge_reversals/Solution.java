package g3601_3700.s3650_minimum_cost_path_with_edge_reversals;

// #Medium #Heap_Priority_Queue #Graph #Shortest_Path #Biweekly_Contest_163
// #2025_09_26_Time_47_ms_(99.80%)_Space_109.50_MB_(56.57%)

import java.util.Arrays;
import java.util.PriorityQueue;

@SuppressWarnings({"java:S1210", "java:S2234"})
public class Solution {
    private static final int INF = Integer.MAX_VALUE / 2 - 1;
    private int cnt;
    private int[] head;
    private int[] next;
    private int[] to;
    private int[] weight;

    private static class Dist implements Comparable<Dist> {
        int u;
        int d;

        public Dist(int u, int d) {
            this.u = u;
            this.d = d;
        }

        @Override
        public int compareTo(Dist o) {
            return Long.compare(d, o.d);
        }
    }

    private void init(int n, int m) {
        head = new int[n];
        Arrays.fill(head, -1);
        next = new int[m];
        to = new int[m];
        weight = new int[m];
    }

    private void add(int u, int v, int w) {
        to[cnt] = v;
        weight[cnt] = w;
        next[cnt] = head[u];
        head[u] = cnt++;
    }

    private int dist(int s, int t, int n) {
        PriorityQueue<Dist> queue = new PriorityQueue<>();
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        queue.add(new Dist(s, dist[s]));
        while (!queue.isEmpty()) {
            Dist d = queue.remove();
            int u = d.u;
            if (dist[u] < d.d) {
                continue;
            }
            if (u == t) {
                return dist[t];
            }
            for (int i = head[u]; i != -1; i = next[i]) {
                int v = to[i];
                int w = weight[i];
                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    queue.add(new Dist(v, dist[v]));
                }
            }
        }
        return INF;
    }

    public int minCost(int n, int[][] edges) {
        int m = edges.length;
        init(n, 2 * m);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            add(u, v, w);
            add(v, u, 2 * w);
        }
        int ans = dist(0, n - 1, n);
        return ans == INF ? -1 : ans;
    }
}
