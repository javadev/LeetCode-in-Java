package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph;

// #Medium #2025_01_12_Time_1014_(100.00%)_Space_114.21_(100.00%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings({"unused", "java:S1172"})
public class Solution {
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        int minW = Integer.MAX_VALUE;
        int maxW = 0;
        for (int[] e : edges) {
            minW = Math.min(minW, e[2]);
            maxW = Math.max(maxW, e[2]);
        }
        int ans = -1;
        int l = minW;
        int h = maxW;
        while (l <= h) {
            int mid = (l + h) >> 1;
            if (find(n, edges, mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    private boolean find(int n, int[][] edges, int maxi) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            if (e[2] <= maxi) {
                adj.get(e[0]).add(e[1]);
            }
        }
        return zero(n, adj);
    }

    public boolean zero(int n, List<List<Integer>> adj) {
        List<List<Integer>> rev = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rev.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int nb : adj.get(i)) {
                rev.get(nb).add(i);
            }
        }
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int cnt = 1;
        vis[0] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int nb : rev.get(curr)) {
                if (!vis[nb]) {
                    vis[nb] = true;
                    q.add(nb);
                    cnt++;
                }
            }
        }
        return cnt == n;
    }
}
