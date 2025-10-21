package g3701_3800.s3721_longest_balanced_subarray_ii;

// #Hard #Weekly_Contest_472 #2025_10_21_Time_267_ms_(59.29%)_Space_61.94_MB_(28.32%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final class Segtree {
        int[] minsegtree;
        int[] maxsegtree;
        int[] lazysegtree;

        public Segtree(int n) {
            minsegtree = new int[4 * n];
            maxsegtree = new int[4 * n];
            lazysegtree = new int[4 * n];
        }

        private void applyLazy(int ind, int lo, int hi, int val) {
            minsegtree[ind] += val;
            maxsegtree[ind] += val;
            if (lo != hi) {
                lazysegtree[2 * ind + 1] += val;
                lazysegtree[2 * ind + 2] += val;
            }
            lazysegtree[ind] = 0;
        }

        public int find(int ind, int lo, int hi, int l, int r) {
            if (lazysegtree[ind] != 0) {
                applyLazy(ind, lo, hi, lazysegtree[ind]);
            }
            if (hi < l || lo > r) {
                return -1;
            }
            if (minsegtree[ind] > 0 || maxsegtree[ind] < 0) {
                return -1;
            }
            if (lo == hi) {
                return minsegtree[ind] == 0 ? lo : -1;
            }
            int mid = (lo + hi) / 2;
            int ans1 = find(2 * ind + 1, lo, mid, l, r);
            if (ans1 != -1) {
                return ans1;
            }
            return find(2 * ind + 2, mid + 1, hi, l, r);
        }

        public void update(int ind, int lo, int hi, int l, int r, int val) {
            if (lazysegtree[ind] != 0) {
                applyLazy(ind, lo, hi, lazysegtree[ind]);
            }
            if (hi < l || lo > r) {
                return;
            }
            if (lo >= l && hi <= r) {
                applyLazy(ind, lo, hi, val);
                return;
            }
            int mid = (lo + hi) / 2;
            update(2 * ind + 1, lo, mid, l, r, val);
            update(2 * ind + 2, mid + 1, hi, l, r, val);
            minsegtree[ind] = Math.min(minsegtree[2 * ind + 1], minsegtree[2 * ind + 2]);
            maxsegtree[ind] = Math.max(maxsegtree[2 * ind + 1], maxsegtree[2 * ind + 2]);
        }
    }

    public int longestBalanced(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        Segtree seg = new Segtree(n);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int prev = -1;
            if (mp.containsKey(x)) {
                prev = mp.get(x);
            }
            int change = x % 2 == 0 ? -1 : 1;
            seg.update(0, 0, n - 1, prev + 1, i, change);
            int temp = seg.find(0, 0, n - 1, 0, i);
            if (temp != -1) {
                ans = Math.max(ans, i - temp + 1);
            }
            mp.put(x, i);
        }
        return ans;
    }
}
