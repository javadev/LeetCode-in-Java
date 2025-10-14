package g3701_3800.s3715_sum_of_perfect_square_ancestors;

// #Hard #Array #Hash_Table #Math #Tree #Counting #Number_Theory #Depth_First_Search
// #Weekly_Contest_471 #2025_10_14_Time_122_ms_(98.09%)_Space_123.31_MB_(49.05%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final int MAX = 100000;
    // smallest prime factor
    private static final int[] SPF = new int[MAX + 1];

    // Precompute smallest prime factors for fast factorization
    static {
        for (int i = 2; i <= MAX; i++) {
            if (SPF[i] == 0) {
                for (int j = i; j <= MAX; j += i) {
                    if (SPF[j] == 0) {
                        SPF[j] = i;
                    }
                }
            }
        }
    }

    public long sumOfAncestors(int n, int[][] edges, int[] nums) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        // Map to count kernel frequencies along DFS path
        // kernel fits in int (<= nums[i])
        Map<Integer, Integer> freq = new HashMap<>();
        long total = 0L;
        total += dfs(0, -1, adj, nums, freq);
        return total;
    }

    private long dfs(
            int node, int parent, List<List<Integer>> adj, int[] nums, Map<Integer, Integer> freq) {
        // kernel <= nums[node] <= 1e5 fits int
        int key = (int) getKernel(nums[node]);
        int count = freq.getOrDefault(key, 0);
        long sum = count;
        freq.put(key, count + 1);
        for (int nei : adj.get(node)) {
            if (nei != parent) {
                sum += dfs(nei, node, adj, nums, freq);
            }
        }
        if (count == 0) {
            freq.remove(key);
        } else {
            freq.put(key, count);
        }
        return sum;
    }

    // Compute square-free kernel using prime factorization parity
    private long getKernel(int x) {
        long key = 1;
        while (x > 1) {
            int p = SPF[x];
            int c = 0;
            while (x % p == 0) {
                x /= p;
                // toggle parity
                c ^= 1;
            }
            if (c == 1) {
                key *= p;
            }
        }
        return key;
    }
}
