package g3501_3600.s3530_maximum_profit_from_valid_topological_order_in_dag;

// #Hard #2025_04_27_Time_2055_ms_(100.00%)_Space_67.18_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int helper(
            int mask,
            int pos,
            int[] inDegree,
            List<List<Integer>> adj,
            int[] score,
            int[] dp,
            int n) {
        if (mask == (1 << n) - 1) {
            return 0;
        }
        if (dp[mask] != -1) {
            return dp[mask];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) == 0 && inDegree[i] == 0) {
                for (int ng : adj.get(i)) {
                    inDegree[ng]--;
                }
                int val =
                        pos * score[i]
                                + helper(mask | (1 << i), pos + 1, inDegree, adj, score, dp, n);
                res = Math.max(res, val);
                for (int ng : adj.get(i)) {
                    inDegree[ng]++;
                }
            }
        }
        dp[mask] = res;
        return res;
    }

    public int maxProfit(int n, int[][] edges, int[] score) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[n];
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            inDegree[e[1]]++;
        }
        int[] dp = new int[1 << n];
        Arrays.fill(dp, -1);
        return helper(0, 1, inDegree, adj, score, dp, n);
    }
}
