package g3701_3800.s3715_sum_of_perfect_square_ancestors;

// #Hard #Weekly_Contest_471 #2025_10_12_Time_234_ms_(100.00%)_Space_113.24_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public long sumOfAncestors(int n, int[][] edges, int[] nums) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        long[] k = new long[n];
        for (int i = 0; i < n; i++) {
            k[i] = kernel(nums[i]);
        }
        Map<Long, Integer> freq = new HashMap<>();
        long[] ans = new long[1];
        dfs(0, -1, g, k, freq, ans);
        return ans[0];
    }

    private long kernel(long x) {
        long res = 1;
        for (long p = 2; p * p <= x; p++) {
            int odd = 0;
            while (x % p == 0) {
                x /= p;
                odd ^= 1;
            }
            if (odd == 1) {
                res *= p;
            }
        }
        if (x > 1) {
            res *= x;
        }
        return res;
    }

    private void dfs(
            int u, int p, List<List<Integer>> g, long[] k, Map<Long, Integer> freq, long[] ans) {
        long ku = k[u];
        ans[0] += freq.getOrDefault(ku, 0);
        freq.put(ku, freq.getOrDefault(ku, 0) + 1);
        for (int v : g.get(u)) {
            if (v != p) {
                dfs(v, u, g, k, freq, ans);
            }
        }
        int left = freq.get(ku) - 1;
        if (left == 0) {
            freq.remove(ku);
        } else {
            freq.put(ku, left);
        }
    }
}
