package g3201_3300.s3241_time_taken_to_mark_all_nodes;

// #Hard #Dynamic_Programming #Tree #Graph #Depth_First_Search
// #2024_08_06_Time_39_ms_(100.00%)_Space_115.8_MB_(83.90%)

import java.util.Arrays;

public class Solution {
    private int[] head;
    private int[] nxt;
    private int[] to;
    private int[] last;
    private int[] lastNo;
    private int[] second;
    private int[] ans;

    public int[] timeTaken(int[][] edges) {
        int n = edges.length + 1;
        head = new int[n];
        nxt = new int[n << 1];
        to = new int[n << 1];
        Arrays.fill(head, -1);
        int i = 0;
        int j = 2;
        while (i < edges.length) {
            int u = edges[i][0];
            int v = edges[i][1];
            nxt[j] = head[u];
            head[u] = j;
            to[j] = v;
            j++;
            nxt[j] = head[v];
            head[v] = j;
            to[j] = u;
            j++;
            i++;
        }
        last = new int[n];
        lastNo = new int[n];
        second = new int[n];
        ans = new int[n];
        dfs(-1, 0);
        System.arraycopy(last, 0, ans, 0, n);
        dfs2(-1, 0, 0);
        return ans;
    }

    private void dfs2(int f, int u, int preLast) {
        int e = head[u];
        int v;
        while (e != -1) {
            v = to[e];
            if (f != v) {
                int pl;
                if (v == lastNo[u]) {
                    pl = Math.max(preLast, second[u]) + ((u & 1) == 0 ? 2 : 1);
                } else {
                    pl = Math.max(preLast, last[u]) + ((u & 1) == 0 ? 2 : 1);
                }
                ans[v] = Math.max(ans[v], pl);
                dfs2(u, v, pl);
            }
            e = nxt[e];
        }
    }

    private void dfs(int f, int u) {
        int e = head[u];
        int v;
        while (e != -1) {
            v = to[e];
            if (f != v) {
                dfs(u, v);
                int t = last[v] + ((v & 1) == 0 ? 2 : 1);
                if (last[u] < t) {
                    second[u] = last[u];
                    last[u] = t;
                    lastNo[u] = v;
                } else if (second[u] < t) {
                    second[u] = t;
                }
            }
            e = nxt[e];
        }
    }
}
