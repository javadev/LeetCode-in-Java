package g3701_3800.s3772_maximum_subgraph_score_in_a_tree;

// #Hard #Array #Dynamic_Programming #Tree #Senior_Staff #Weekly_Contest_479 #Depth_First_Search
// #2026_05_08_Time_35_ms_(100.00%)_Space_279.46_MB_(74.36%)

import java.util.Arrays;

public class Solution {
    public int[] maxSubgraphScore(int n, int[][] edges, int[] good) {
        int[] h = new int[n];
        int[] e = new int[2 * (n - 1)];
        int[] ne = new int[2 * (n - 1)];
        int idx = 0;
        Arrays.fill(h, -1);
        for (int[] ed : edges) {
            int a = ed[0];
            int b = ed[1];
            e[idx] = b;
            ne[idx] = h[a];
            h[a] = idx++;
            e[idx] = a;
            ne[idx] = h[b];
            h[b] = idx++;
        }
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = good[i] == 1 ? 1 : -1;
        }
        int[] dp = new int[n];
        int[] p = new int[n];
        int[] ord = new int[n];
        int top = 0;
        Arrays.fill(p, -1);
        int[] st = new int[n];
        int sp = 0;
        boolean[] vis = new boolean[n];
        st[sp++] = 0;
        vis[0] = true;
        while (sp > 0) {
            int u = st[--sp];
            ord[top++] = u;
            for (int i = h[u]; i != -1; i = ne[i]) {
                int w = e[i];
                if (!vis[w]) {
                    vis[w] = true;
                    p[w] = u;
                    st[sp++] = w;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            int u = ord[i];
            dp[u] = v[u];
            for (int j = h[u]; j != -1; j = ne[j]) {
                int w = e[j];
                if (p[w] == u && dp[w] > 0) {
                    dp[u] += dp[w];
                }
            }
        }
        int[] ans = new int[n];
        ans[0] = dp[0];
        for (int i = 1; i < n; i++) {
            int u = ord[i];
            int par = p[u];
            int pc = ans[par] - Math.max(0, dp[u]);
            ans[u] = dp[u] + Math.max(0, pc);
        }
        return ans;
    }
}
