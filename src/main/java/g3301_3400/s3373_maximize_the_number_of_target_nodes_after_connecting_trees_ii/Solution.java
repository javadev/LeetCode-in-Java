package g3301_3400.s3373_maximize_the_number_of_target_nodes_after_connecting_trees_ii;

// #Hard #2024_12_01_Time_447_ms_(100.00%)_Space_173.2_MB_(100.00%)

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    private int dfs(int a, HashMap<Integer, HashSet<Integer>> adj, boolean[] mark, int i) {
        int res = 0;
        mark[a] = true;
        if (i % 2 == 0) {
            res++;
        }
        for (int j : adj.get(a)) {
            if (!mark[j]) {
                res += dfs(j, adj, mark, i + 1);
            }
        }
        return res;
    }

    private void sol(
            int a,
            HashMap<Integer, HashSet<Integer>> adj,
            boolean[] mark,
            int i,
            int t,
            int n,
            int[] res) {
        mark[a] = true;
        if (i % 2 == 0) {
            res[a] = t;
        } else {
            res[a] = n - t;
        }
        for (int j : adj.get(a)) {
            if (!mark[j]) {
                sol(j, adj, mark, i + 1, t, n, res);
            }
        }
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;
        HashMap<Integer, HashSet<Integer>> adj1 = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> adj2 = new HashMap<>();
        for (int[] i : edges1) {
            if (adj1.get(i[0]) == null) {
                adj1.put(i[0], new HashSet<>());
            }
            adj1.get(i[0]).add(i[1]);
            if (adj1.get(i[1]) == null) {
                adj1.put(i[1], new HashSet<>());
            }
            adj1.get(i[1]).add(i[0]);
        }
        for (int[] i : edges2) {
            if (adj2.get(i[0]) == null) {
                adj2.put(i[0], new HashSet<>());
            }
            adj2.get(i[0]).add(i[1]);
            if (adj2.get(i[1]) == null) {
                adj2.put(i[1], new HashSet<>());
            }
            adj2.get(i[1]).add(i[0]);
        }
        boolean[] mark1 = new boolean[n];
        boolean[] mark2 = new boolean[m];
        int a = dfs(0, adj2, mark2, 0);
        int b = dfs(0, adj1, mark1, 0);
        mark1 = new boolean[n];
        int[] res = new int[n];
        sol(0, adj1, mark1, 0, b, n, res);
        for (int i = 0; i < res.length; i++) {
            if (res[i] != n) {
                res[i] += Math.max(a, m - a);
            } else {
                res[i] += a;
            }
        }
        return res;
    }
}
