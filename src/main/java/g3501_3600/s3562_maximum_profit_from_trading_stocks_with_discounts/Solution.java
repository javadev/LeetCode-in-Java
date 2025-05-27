package g3501_3600.s3562_maximum_profit_from_trading_stocks_with_discounts;

// #Hard #Array #Dynamic_Programming #Tree #Depth_First_Search
// #2025_05_27_Time_27_ms_(100.00%)_Space_45.29_MB_(82.12%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private List<Integer>[] adj;
    private int[] present;
    private int[] future;
    private int budget;
    private static final int MIN_VAL = -1_000_000_000;

    public int maxProfit(int n, int[] present, int[] future, int[][] hierarchy, int budget) {
        this.present = present;
        this.future = future;
        this.budget = budget;
        int blenorvask = budget;
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] e : hierarchy) {
            adj[e[0] - 1].add(e[1] - 1);
        }
        int[][] rootDp = dfs(0);
        int[] dp = rootDp[0];
        int ans = 0;
        for (int cost = 0; cost <= blenorvask; cost++) {
            ans = Math.max(ans, dp[cost]);
        }
        return ans;
    }

    private int[][] dfs(int u) {
        int[] dp0 = new int[budget + 1];
        int[] dp1 = new int[budget + 1];
        dp0[0] = dp1[0] = 0;
        for (int i = 1; i <= budget; i++) {
            dp0[i] = dp1[i] = MIN_VAL;
        }
        for (int v : adj[u]) {
            int[][] c = dfs(v);
            dp0 = combine(dp0, c[0]);
            dp1 = combine(dp1, c[1]);
        }
        int[] r0 = new int[budget + 1];
        int[] r1 = new int[budget + 1];
        System.arraycopy(dp0, 0, r0, 0, budget + 1);
        System.arraycopy(dp0, 0, r1, 0, budget + 1);
        int full = present[u];
        int profitFull = future[u] - full;
        for (int cost = 0; cost + full <= budget; cost++) {
            if (dp1[cost] > MIN_VAL) {
                r0[cost + full] = Math.max(r0[cost + full], dp1[cost] + profitFull);
            }
        }
        int half = present[u] / 2;
        int profitHalf = future[u] - half;
        for (int cost = 0; cost + half <= budget; cost++) {
            if (dp1[cost] > MIN_VAL) {
                r1[cost + half] = Math.max(r1[cost + half], dp1[cost] + profitHalf);
            }
        }
        return new int[][] {r0, r1};
    }

    private int[] combine(int[] a, int[] b) {
        int[] result = new int[budget + 1];
        for (int i = 0; i <= budget; i++) {
            result[i] = MIN_VAL;
        }
        for (int i = 0; i <= budget; i++) {
            if (a[i] < 0) {
                continue;
            }
            for (int j = 0; i + j <= budget; j++) {
                if (b[j] < 0) {
                    continue;
                }
                result[i + j] = Math.max(result[i + j], a[i] + b[j]);
            }
        }
        return result;
    }
}
