package g2801_2900.s2872_maximum_number_of_k_divisible_components;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree
// #2023_12_21_Time_24_ms_(93.51%)_Space_65.3_MB_(19.48%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int ans = 0;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            adj.get(start).add(end);
            adj.get(end).add(start);
        }
        boolean[] isVis = new boolean[n];
        isVis[0] = true;
        get(0, -1, adj, isVis, values, k);
        return ans;
    }

    private long get(
            int curNode,
            int parent,
            List<List<Integer>> adj,
            boolean[] isVis,
            int[] values,
            long k) {
        long sum = values[curNode];
        for (int ele : adj.get(curNode)) {
            if (ele != parent && !isVis[ele]) {
                isVis[ele] = true;
                sum += get(ele, curNode, adj, isVis, values, k);
            }
        }
        if (sum % k == 0) {
            ans++;
            return 0;
        } else {
            return sum;
        }
    }
}
