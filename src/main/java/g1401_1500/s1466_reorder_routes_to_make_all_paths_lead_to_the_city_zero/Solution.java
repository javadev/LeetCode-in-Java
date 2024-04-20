package g1401_1500.s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #Graph_Theory_I_Day_10_Standard_Traversal #2022_03_29_Time_39_ms_(97.71%)_Space_65.2_MB_(94.87%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int minReorder(int n, int[][] connections) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] tup : connections) {
            adj.get(tup[0]).add(tup[1]);
            adj.get(tup[1]).add(-tup[0]);
        }
        q.offer(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int it : adj.get(node)) {
                if (!vis[Math.abs(it)]) {
                    vis[Math.abs(it)] = true;

                    if (it > 0) {
                        count++;
                    }
                    q.offer(Math.abs(it));
                }
            }
        }
        return count;
    }
}
