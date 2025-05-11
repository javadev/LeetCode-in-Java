package g3501_3600.s3543_maximum_weighted_k_edge_path;

// #Medium #2025_05_11_Time_1158_ms_(100.00%)_Space_284.01_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int[][][] dp;

    private static class Pair {
        int node;
        int wt;

        Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    public int maxWeight(int n, int[][] edges, int k, int t) {
        if (k == 0) {
            return 0;
        }
        dp = new int[n][k + 1][t + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
        }
        int ans = -1;
        for (int start = 0; start < n; start++) {
            int res = dfs(adj, start, k, t, 0);
            ans = Math.max(ans, res);
        }
        return ans;
    }

    private int dfs(List<List<Pair>> adj, int u, int stepsRemaining, int t, int currentSum) {
        if (currentSum >= t) {
            return -1;
        }
        if (stepsRemaining == 0) {
            return currentSum;
        }
        int memo = dp[u][stepsRemaining][currentSum];
        if (memo != Integer.MIN_VALUE) {
            return memo;
        }
        int best = -1;
        for (Pair p : adj.get(u)) {
            int res = dfs(adj, p.node, stepsRemaining - 1, t, currentSum + p.wt);
            best = Math.max(best, res);
        }
        dp[u][stepsRemaining][currentSum] = best;
        return best;
    }
}
