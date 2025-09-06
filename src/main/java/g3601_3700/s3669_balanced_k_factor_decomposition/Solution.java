package g3601_3700.s3669_balanced_k_factor_decomposition;

// #Medium #Weekly_Contest_465 #2025_09_06_Time_13_ms_(78.36%)_Space_45.64_MB_(10.38%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private int kGlobal;
    private int bestDiff = Integer.MAX_VALUE;
    private List<Integer> bestList = new ArrayList<>();
    private final List<Integer> current = new ArrayList<>();

    public int[] minDifference(int n, int k) {
        kGlobal = k;
        dfs(n, 1, 0);
        int[] ans = new int[bestList.size()];
        for (int i = 0; i < bestList.size(); i++) {
            ans[i] = bestList.get(i);
        }
        return ans;
    }

    private void dfs(int rem, int start, int depth) {
        if (depth == kGlobal - 1) {
            if (rem >= start) {
                current.add(rem);
                evaluate();
                current.remove(current.size() - 1);
            }
            return;
        }
        List<Integer> divs = getDivisors(rem);
        for (int d : divs) {
            if (d < start) {
                continue;
            }
            current.add(d);
            dfs(rem / d, d, depth + 1);
            current.remove(current.size() - 1);
        }
    }

    private void evaluate() {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int v : current) {
            mn = Math.min(mn, v);
            mx = Math.max(mx, v);
        }
        int diff = mx - mn;
        if (diff < bestDiff) {
            bestDiff = diff;
            bestList = new ArrayList<>(current);
        }
    }

    private List<Integer> getDivisors(int x) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int i = 1; i * (long) i <= x; i++) {
            if (x % i == 0) {
                small.add(i);
                if (i != x / i) {
                    large.add(x / i);
                }
            }
        }
        Collections.reverse(large);
        small.addAll(large);
        return small;
    }
}
