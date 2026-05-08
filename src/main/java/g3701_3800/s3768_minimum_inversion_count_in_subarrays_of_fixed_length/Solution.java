package g3701_3800.s3768_minimum_inversion_count_in_subarrays_of_fixed_length;

// #Hard #Array #Sliding_Window #Segment_Tree #Senior_Staff #Biweekly_Contest_171
// #2026_05_08_Time_181_ms_(75.47%)_Space_199.94_MB_(13.21%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long minInversionCount(int[] nums, int k) {
        int n = nums.length;

        int[] s = nums.clone();
        Arrays.sort(s);
        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for (int x : s) {
            if (!rank.containsKey(x)) {
                rank.put(x, r++);
            }
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = rank.get(nums[i]);
        }

        int mv = r + 1;
        Tree t = new Tree(mv);

        long inv = 0;
        for (int i = 0; i < k; i++) {
            inv += t.getQuery(c[i] + 1, mv);
            t.update(c[i], 1);
        }

        long mininv = inv;

        for (int i = k; i < n; i++) {
            t.update(c[i - k], -1);
            inv -= t.getQuery(1, c[i - k] - 1);

            inv += t.getQuery(c[i] + 1, mv);
            t.update(c[i], 1);

            mininv = Math.min(mininv, inv);
        }

        return mininv;
    }

    static class Tree {
        int[] t;
        int n;

        Tree(int size) {
            n = size;
            t = new int[n + 2];
        }

        void update(int i, int v) {
            while (i < t.length) {
                t[i] += v;
                i += i & -i;
            }
        }

        int query(int i) {
            int res = 0;
            while (i > 0) {
                res += t[i];
                i -= i & -i;
            }
            return res;
        }

        int getQuery(int l, int r) {
            if (l > r) {
                return 0;
            }
            return query(r) - query(l - 1);
        }
    }
}
