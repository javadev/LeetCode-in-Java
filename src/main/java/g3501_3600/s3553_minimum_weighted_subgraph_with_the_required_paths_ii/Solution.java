package g3501_3600.s3553_minimum_weighted_subgraph_with_the_required_paths_ii;

// #Hard #2025_05_18_Time_79_ms_(99.45%)_Space_109.90_MB_(66.85%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int p;
    private List<int[]>[] graph;
    private int[] euler;
    private int[] depth;
    private int[] firstcome;
    private int[][] sparseT;
    private int times;
    private long[] dists;

    public int[] minimumWeight(int[][] edges, int[][] queries) {
        p = 0;
        for (int[] e : edges) {
            p = Math.max(p, Math.max(e[0], e[1]));
        }
        p++;
        graph = new ArrayList[p];
        for (int i = 0; i < p; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            graph[u].add(new int[] {v, w});
            graph[v].add(new int[] {u, w});
        }
        int m = 2 * p - 1;
        euler = new int[m];
        depth = new int[m];
        firstcome = new int[p];
        Arrays.fill(firstcome, -1);
        dists = new long[p];
        times = 0;
        dfs(0, -1, 0, 0L);
        buildSparseTable(m);
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];
            long d1 = distBetween(a, b);
            long d2 = distBetween(b, c);
            long d3 = distBetween(a, c);
            answer[i] = (int) ((d1 + d2 + d3) / 2);
        }
        return answer;
    }

    private void dfs(int node, int parent, int d, long distSoFar) {
        euler[times] = node;
        depth[times] = d;
        if (firstcome[node] == -1) {
            firstcome[node] = times;
        }
        times++;
        dists[node] = distSoFar;
        for (int[] edge : graph[node]) {
            int nxt = edge[0];
            int w = edge[1];
            if (nxt == parent) {
                continue;
            }
            dfs(nxt, node, d + 1, distSoFar + w);
            euler[times] = node;
            depth[times] = d;
            times++;
        }
    }

    private void buildSparseTable(int length) {
        int log = 1;
        while ((1 << log) <= length) {
            log++;
        }
        sparseT = new int[log][length];
        for (int i = 0; i < length; i++) {
            sparseT[0][i] = i;
        }
        for (int k = 1; k < log; k++) {
            for (int i = 0; i + (1 << k) <= length; i++) {
                int left = sparseT[k - 1][i];
                int right = sparseT[k - 1][i + (1 << (k - 1))];
                sparseT[k][i] = (depth[left] < depth[right]) ? left : right;
            }
        }
    }

    private int rmq(int l, int r) {
        if (l > r) {
            int tmp = l;
            l = r;
            r = tmp;
        }
        int length = r - l + 1;
        int k = 31 - Integer.numberOfLeadingZeros(length);
        int left = sparseT[k][l];
        int right = sparseT[k][r - (1 << k) + 1];
        return (depth[left] < depth[right]) ? left : right;
    }

    private int lca(int u, int v) {
        int left = firstcome[u];
        int right = firstcome[v];
        int idx = rmq(left, right);
        return euler[idx];
    }

    private long distBetween(int u, int v) {
        int ancestor = lca(u, v);
        return dists[u] + dists[v] - 2 * dists[ancestor];
    }
}
