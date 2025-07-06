package g3601_3700.s3608_minimum_time_for_k_connected_components;

// #Medium #2025_07_06_Time_34_ms_(99.90%)_Space_97.19_MB_(22.20%)

public class Solution {
    public int minTime(int n, int[][] edges, int k) {
        int maxTime = 0;
        for (int[] e : edges) {
            if (e[2] > maxTime) {
                maxTime = e[2];
            }
        }
        int lo = 0;
        int hi = maxTime;
        int ans = maxTime;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (countComponents(n, edges, mid) >= k) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private int countComponents(int n, int[][] edges, int t) {
        int[] parent = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        int comps = n;
        for (int[] e : edges) {
            if (e[2] > t) {
                int u = find(parent, e[0]);
                int v = find(parent, e[1]);
                if (u != v) {
                    if (size[u] < size[v]) {
                        int tmp = u;
                        u = v;
                        v = tmp;
                    }
                    parent[v] = u;
                    size[u] += size[v];
                    comps--;
                }
            }
        }
        return comps;
    }

    private int find(int[] parent, int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
}
