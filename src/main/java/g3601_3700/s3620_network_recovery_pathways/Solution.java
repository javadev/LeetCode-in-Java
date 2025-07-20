package g3601_3700.s3620_network_recovery_pathways;

// #Hard #2025_07_20_Time_18_ms_(100.00%)_Space_120.24_MB_(100.00%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    private int ans = -1;
    private int d;
    private long k = 0;

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;
        this.k = k;
        this.d = n - 1;
        ArrayList<P>[] g = new ArrayList[n];
        for (int i = 0; i < n; ++i) {
            g[i] = new ArrayList<>();
        }
        for (int[] i : edges) {
            if (online[i[0]] && online[i[1]]) {
                g[i[0]].add(new P(i[1], i[2]));
            }
        }
        dfs(g, 0, 0L, Integer.MAX_VALUE);
        return ans;
    }

    private void dfs(ArrayList<P>[] g, int s, long tc, int max) {
        if (s == d) {
            if (ans == -1) {
                ans = max;
            } else {
                ans = Math.max(ans, max);
            }
            return;
        }
        for (P i : g[s]) {
            long cost = tc + i.c;
            if (ans != -1 && ans >= max) {
                return;
            }
            if (cost <= k) {
                dfs(g, i.d, cost, Math.min(max, i.c));
            }
        }
    }

    private static final class P {
        int d;
        int c;

        P(int d, int c) {
            this.d = d;
            this.c = c;
        }
    }
}
