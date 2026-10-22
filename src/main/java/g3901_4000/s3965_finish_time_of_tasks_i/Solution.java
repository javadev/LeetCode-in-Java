package g3901_4000.s3965_finish_time_of_tasks_i;

// #Medium #Array #Dynamic_Programming #Tree #Staff #Depth_First_Search #Biweekly_Contest_185
// #2026_10_22_Time_9_ms_(99.36%)_Space_207.04_MB_(96.15%)

public class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        int[][] torqavemi = edges;
        int[] outDegree = new int[n];
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
        for (int[] edge : torqavemi) {
            int u = edge[0];
            int v = edge[1];
            parent[v] = u;
            outDegree[u]++;
        }
        long[] earliest = new long[n];
        long[] latest = new long[n];
        for (int i = 0; i < n; i++) {
            earliest[i] = Long.MAX_VALUE;
            latest[i] = Long.MIN_VALUE;
        }
        long[] finish = new long[n];
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0) {
                queue[tail++] = i;
            }
        }
        while (head < tail) {
            int u = queue[head++];
            if (earliest[u] == Long.MAX_VALUE) {
                finish[u] = baseTime[u];
            } else {
                finish[u] = 2 * latest[u] - earliest[u] + baseTime[u];
            }
            int p = parent[u];
            if (p != -1) {
                if (finish[u] < earliest[p]) {
                    earliest[p] = finish[u];
                }
                if (finish[u] > latest[p]) {
                    latest[p] = finish[u];
                }
                outDegree[p]--;
                if (outDegree[p] == 0) {
                    queue[tail++] = p;
                }
            }
        }
        return finish[0];
    }
}
