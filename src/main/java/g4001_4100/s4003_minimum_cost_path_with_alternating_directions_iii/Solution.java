package g4001_4100.s4003_minimum_cost_path_with_alternating_directions_iii;

// #Hard #Array #Matrix #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Senior_Staff
// #Weekly_Contest_512 #2026_11_17_Time_349_ms_(100.00%)_Space_139.73_MB_(84.00%)

import java.util.Comparator;

public class Solution {
    public long minCost(int m, int n, int[][] penalty) {
        long INF = Long.MAX_VALUE / 4;
        long[] dist = new long[m * n * 2];
        java.util.Arrays.fill(dist, INF);
        java.util.PriorityQueue<long[]> pq =
                new java.util.PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        dist[0] = 1;
        pq.add(new long[] {1, 0});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while (!pq.isEmpty()) {
            long[] top = pq.poll();
            int state = (int) top[1];
            if (top[0] > dist[state]) {
                continue;
            }
            int parity = state & 1, cell = state >> 1, i = cell / n, j = cell % n;
            if (i == m - 1 && j == n - 1) {
                return top[0];
            }
            int np = parity ^ 1;
            // wait
            long wait = top[0] + penalty[i][j];
            int ws = (cell << 1) | np;
            if (wait < dist[ws]) {
                dist[ws] = wait;
                pq.add(new long[] {wait, ws});
            }
            for (int d = 0; d < 4; d++) {
                int x = i + dx[d];
                int y = j + dy[d];
                if (x < 0 || y < 0 || x >= m || y >= n) {
                    continue;
                }
                // right/down
                boolean forward = d < 2;
                // parity 0: next action is odd-numbered
                boolean follows = (parity == 0) == forward;
                long c = top[0] + (long) (x + 1) * (y + 1) + (follows ? 0 : penalty[i][j]);
                int ns = ((x * n + y) << 1) | np;
                if (c < dist[ns]) {
                    dist[ns] = c;
                    pq.add(new long[] {c, ns});
                }
            }
        }
        return -1;
    }
}
