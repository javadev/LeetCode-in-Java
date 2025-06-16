package g3501_3600.s3585_find_weighted_median_node_in_tree;

// #Hard #2025_06_16_Time_162_ms_(100.00%)_Space_141.58_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S2234")
public class Solution {
    private int log;
    private long[] dist;
    private int[] depth;
    private int[][] up;

    public int[] findMedian(int n, int[][] edges, int[][] queries) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new int[] {edge[1], edge[2]});
            adj.get(edge[1]).add(new int[] {edge[0], edge[2]});
        }
        dist = new long[n];
        depth = new int[n];
        log = 0;
        while (1 << log < n) {
            log++;
        }
        up = new int[n][log];
        for (int[] u : up) {
            Arrays.fill(u, -1);
        }
        dfs(0, -1, adj, 0, 0);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int first = query[0];
            int second = query[1];
            long distance = getDistance(first, second);
            long needed = (distance + 1) / 2;
            int mid = lca(first, second);
            if (getDistance(first, mid) < needed) {
                needed -= getDistance(first, mid);
                first = mid;
            } else {
                second = mid;
            }
            if (depth[first] <= depth[second]) {
                long curDistance = getDistance(first, second);
                for (int j = log - 1; j >= 0; j--) {
                    if (up[second][j] == -1
                            || curDistance - getDistance(up[second][j], second) < needed) {
                        continue;
                    }
                    curDistance -= getDistance(up[second][j], second);
                    second = up[second][j];
                }
                ans[i] = second;
            } else {
                long curDistance = 0;
                for (int j = log - 1; j >= 0; j--) {
                    if (up[first][j] == -1
                            || curDistance + getDistance(up[first][j], first) >= needed) {
                        continue;
                    }
                    curDistance += getDistance(up[first][j], first);
                    first = up[first][j];
                }
                ans[i] = up[first][0];
            }
        }
        return ans;
    }

    private long getDistance(int from, int to) {
        if (from == to) {
            return 0;
        }
        int ancesor = lca(from, to);
        return dist[from] + dist[to] - 2 * dist[ancesor];
    }

    private int lca(int first, int second) {
        if (depth[first] < depth[second]) {
            return lca(second, first);
        }
        for (int i = log - 1; i >= 0; i--) {
            if (depth[first] - (1 << i) >= depth[second]) {
                first = up[first][i];
            }
        }
        if (first == second) {
            return second;
        }
        for (int i = log - 1; i >= 0; i--) {
            if (depth[first] != -1 && up[first][i] != up[second][i]) {
                first = up[first][i];
                second = up[second][i];
            }
        }
        first = up[first][0];
        return first;
    }

    private void dfs(int current, int parent, List<List<int[]>> adj, long curDist, int curDepth) {
        up[current][0] = parent;
        for (int i = 1; i < log; i++) {
            if (up[current][i - 1] != -1) {
                up[current][i] = up[up[current][i - 1]][i - 1];
            }
        }
        dist[current] = curDist;
        depth[current] = curDepth;
        for (int[] next : adj.get(current)) {
            if (next[0] == parent) {
                continue;
            }
            dfs(next[0], current, adj, curDist + next[1], curDepth + 1);
        }
    }
}
