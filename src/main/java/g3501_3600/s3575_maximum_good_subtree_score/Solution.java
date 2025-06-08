package g3501_3600.s3575_maximum_good_subtree_score;

// #Hard #2025_06_08_Time_564_ms_(100.00%)_Space_45.22_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Solution {
    private long ans;
    private static final int MOD = 1_000_000_007;

    public int goodSubtreeSum(int[] vals, int[] par) {
        int n = vals.length;
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            adj[par[i]].add(i);
        }
        this.ans = 0;
        dfs(0, vals, adj);
        return (int) ((this.ans % MOD + MOD) % MOD);
    }

    private Map<Integer, Integer> dfs(int u, int[] vals, List<Integer>[] adj) {
        // du: The DP map for the subtree at node u.
        // Key: bitmask of digits. Value: max sum for that combination of digits.
        Map<Integer, Integer> du = new HashMap<>();
        // Base case: A sum of 0 is possible with an empty set of digits (mask 0).
        du.put(0, 0);
        // Process the current node's value.
        String s = String.valueOf(Math.abs(vals[u]));
        if (hasUniqueDigits(s)) {
            int mask = 0;
            for (char c : s.toCharArray()) {
                mask |= (1 << (c - '0'));
            }
            du.put(mask, vals[u]);
        }
        for (int v : adj[u]) {
            Map<Integer, Integer> dv = dfs(v, vals, adj);
            Map<Integer, Integer> duSnapshot = new HashMap<>(du);
            for (Map.Entry<Integer, Integer> entryV : dv.entrySet()) {
                int mv = entryV.getKey();
                int sv = entryV.getValue();
                for (Map.Entry<Integer, Integer> entryU : duSnapshot.entrySet()) {
                    int mu = entryU.getKey();
                    int su = entryU.getValue();
                    // If the digit sets are disjoint (no common bits in masks), we can combine
                    // them.
                    if ((mu & mv) == 0) {
                        int newMask = mu | mv;
                        int newSum = su + sv;
                        // Update `du` with the best possible sum for the new combined mask.
                        du.put(
                                newMask,
                                Math.max(du.getOrDefault(newMask, Integer.MIN_VALUE), newSum));
                    }
                }
            }
        }
        // After processing all children, the max value in `du` is the "good" sum for the subtree at
        // u.
        // Initialize with a very small number to correctly find the maximum, even if sums are
        // negative.
        int maxSubtreeSum = Integer.MIN_VALUE;
        for (int sum : du.values()) {
            maxSubtreeSum = Math.max(maxSubtreeSum, sum);
        }
        // Add this subtree's best sum to the total answer.
        // If du is empty (should not happen due to {0:0}), we add 0.
        this.ans += (maxSubtreeSum == Integer.MIN_VALUE ? 0 : maxSubtreeSum);
        return du;
    }

    private boolean hasUniqueDigits(String s) {
        Set<Character> digits = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!digits.add(c)) {
                return false;
            }
        }
        return true;
    }
}
