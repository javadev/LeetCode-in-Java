package g3601_3700.s3608_minimum_time_for_k_connected_components;

// #Medium #Sorting #Binary_Search #Graph #Union_Find
// #2025_07_08_Time_29_ms_(100.00%)_Space_91.87_MB_(71.29%)

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
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int comps = n;
        for (int[] e : edges) {
            if (e[2] > t) {
                int u = find(parent, e[0]);
                int v = find(parent, e[1]);
                if (u != v) {
                    parent[v] = u;
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
