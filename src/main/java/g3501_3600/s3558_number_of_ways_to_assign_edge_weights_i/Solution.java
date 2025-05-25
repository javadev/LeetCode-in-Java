package g3501_3600.s3558_number_of_ways_to_assign_edge_weights_i;

// #Medium #2025_05_25_Time_118_ms_(100.00%)_Space_122.30_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    private static final int MOD = (int) 1e9 + 7;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int[] i : edges) {
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        int[] l = new int[n + 1];
        int max = 0;
        Arrays.fill(l, -1);
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[] {1, 0});
        l[1] = 0;
        while (!q.isEmpty()) {
            int curr = q.peek()[0];
            int level = q.peek()[1];
            if (l[max] < l[curr]) {
                max = curr;
            }
            q.remove();
            for (int next : adj.get(curr)) {
                if (l[next] != -1) {
                    continue;
                }
                q.offer(new int[] {next, level + 1});
                l[next] = level + 1;
            }
        }
        int[][] dp = new int[l[max]][2];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return solve(0, 0, dp);
    }

    private int solve(int ind, int odd, int[][] dp) {
        if (ind == dp.length) {
            if (odd == 1) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[ind][odd] != -1) {
            return dp[ind][odd];
        }
        dp[ind][odd] =
                (solve(ind + 1, odd, dp) % MOD + solve(ind + 1, (odd + 1) % 2, dp) % MOD) % MOD;
        return dp[ind][odd];
    }
}
