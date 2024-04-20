package g2801_2900.s2867_count_valid_paths_in_a_tree;

// #Hard #Dynamic_Programming #Math #Depth_First_Search #Tree #Number_Theory
// #2023_12_20_Time_26_ms_(97.33%)_Space_84.2_MB_(80.00%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private boolean[] isPrime;
    private List<Integer>[] treeEdges;
    private long r;

    private boolean[] preparePrime(int n) {
        // Sieve of Eratosthenes < 3
        boolean[] isPrimeLocal = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++) {
            isPrimeLocal[i] = true;
        }
        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2 * i; j < n + 1; j += i) {
                isPrimeLocal[j] = false;
            }
        }
        return isPrimeLocal;
    }

    private List<Integer>[] prepareTree(int n, int[][] edges) {
        List<Integer>[] treeEdgesLocal = new List[n + 1];
        for (int[] edge : edges) {
            if (treeEdgesLocal[edge[0]] == null) {
                treeEdgesLocal[edge[0]] = new ArrayList<>();
            }
            treeEdgesLocal[edge[0]].add(edge[1]);
            if (treeEdgesLocal[edge[1]] == null) {
                treeEdgesLocal[edge[1]] = new ArrayList<>();
            }
            treeEdgesLocal[edge[1]].add(edge[0]);
        }
        return treeEdgesLocal;
    }

    private long[] countPathDfs(int node, int parent) {
        long[] v = new long[] {isPrime[node] ? 0 : 1, isPrime[node] ? 1 : 0};
        List<Integer> edges = treeEdges[node];
        if (edges == null) {
            return v;
        }
        for (Integer neigh : edges) {
            if (neigh == parent) {
                continue;
            }
            long[] ce = countPathDfs(neigh, node);
            r += v[0] * ce[1] + v[1] * ce[0];
            if (isPrime[node]) {
                v[1] += ce[0];
            } else {
                v[0] += ce[0];
                v[1] += ce[1];
            }
        }
        return v;
    }

    public long countPaths(int n, int[][] edges) {
        isPrime = preparePrime(n);
        treeEdges = prepareTree(n, edges);
        r = 0;
        countPathDfs(1, 0);
        return r;
    }
}
