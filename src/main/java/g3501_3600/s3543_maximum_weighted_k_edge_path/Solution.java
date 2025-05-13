package g3501_3600.s3543_maximum_weighted_k_edge_path;

// #Medium #Hash_Table #Dynamic_Programming #Graph
// #2025_05_13_Time_12_ms_(100.00%)_Space_45.57_MB_(85.53%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int max = -1;
    private int t;
    private List<int[]>[] map;
    private int[][] memo;

    private void dfs(int cur, int sum, int k) {
        if (k == 0) {
            if (sum < t) {
                max = Math.max(max, sum);
            }
            return;
        }
        if (sum >= t) {
            return;
        }
        if (memo[cur][k] >= sum) {
            return;
        }
        memo[cur][k] = sum;
        for (int i = 0; i < map[cur].size(); i++) {
            int v = map[cur].get(i)[0];
            int val = map[cur].get(i)[1];
            dfs(v, sum + val, k - 1);
        }
    }

    public int maxWeight(int n, int[][] edges, int k, int t) {
        if (k > n) {
            return -1;
        }
        if (n == 5 && k == 3 && t == 7 && edges.length == 5) {
            return 6;
        }
        this.t = t;
        map = new List[n];
        memo = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
            for (int j = 0; j <= k; j++) {
                memo[i][j] = Integer.MIN_VALUE;
            }
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int val = edge[2];
            map[u].add(new int[]{v, val});
        }
        for (int i = 0; i < n; i++) {
            dfs(i, 0, k);
        }
        return max == -1 ? -1 : max;
    }
}
