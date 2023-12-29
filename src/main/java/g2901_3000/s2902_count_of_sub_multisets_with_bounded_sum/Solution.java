package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum;

// #Hard #Array #Hash_Table #Dynamic_Programming #Sliding_Window
// #2023_12_29_Time_17_ms_(100.00%)_Space_45.4_MB_(59.02%)

import java.util.List;

public class Solution {
    private static final int MOD = 1000000007;
    private static final int MAX = 20001;
    private static final IntMap INT_MAP = new IntMap();

    public int countSubMultisets(List<Integer> nums, int l, int r) {
        INT_MAP.clear();
        INT_MAP.add(0);
        int total = 0;
        for (int num : nums) {
            INT_MAP.add(num);
            total += num;
        }
        if (total < l) {
            return 0;
        }
        r = Math.min(r, total);
        final int[] cnt = new int[r + 1];
        cnt[0] = INT_MAP.map[0];
        int sum = 0;
        for (int i = 1; i < INT_MAP.size; i++) {
            final int val = INT_MAP.vals[i];
            final int count = INT_MAP.map[val];
            if (count > 0) {
                sum = Math.min(r, sum + val * count);
                update(cnt, val, count, sum);
            }
        }
        int res = 0;
        for (int i = l; i <= r; i++) {
            res = (res + cnt[i]) % MOD;
        }
        return res;
    }

    private static void update(final int[] cnt, final int n, final int count, final int sum) {
        if (count == 1) {
            for (int i = sum; i >= n; i--) {
                cnt[i] = (cnt[i] + cnt[i - n]) % MOD;
            }
        } else {
            for (int i = n; i <= sum; i++) {
                cnt[i] = (cnt[i] + cnt[i - n]) % MOD;
            }
            final int max = (count + 1) * n;
            for (int i = sum; i >= max; i--) {
                cnt[i] = (cnt[i] - cnt[i - max] + MOD) % MOD;
            }
        }
    }

    private static final class IntMap {
        final int[] map = new int[MAX];
        final int[] vals = new int[MAX];
        int size = 0;

        void add(int v) {
            if (map[v]++ == 0) {
                vals[size++] = v;
            }
        }

        void clear() {
            for (int i = 0; i < size; i++) {
                map[vals[i]] = 0;
            }
            size = 0;
        }
    }
}
