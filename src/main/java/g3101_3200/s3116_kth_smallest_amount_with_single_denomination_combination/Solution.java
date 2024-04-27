package g3101_3200.s3116_kth_smallest_amount_with_single_denomination_combination;

// #Hard #Array #Math #Binary_Search #Bit_Manipulation #Number_Theory #Combinatorics
// #2024_04_27_Time_2_ms_(100.00%)_Space_41.4_MB_(72.21%)

import java.util.Arrays;

public class Solution {
    public long findKthSmallest(int[] coins, int k) {
        int minC = Integer.MAX_VALUE;
        for (int c : coins) {
            minC = Math.min(minC, c);
        }
        long[] cc = coins(coins);
        long max = (long) minC * k;
        long min = max / coins.length;
        while (min < max) {
            long mid = (min + max) / 2;
            final long cnt = count(cc, mid);
            if (cnt > k) {
                max = mid - 1;
            } else if (cnt < k) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    private long count(long[] coins, long v) {
        long r = 0;
        for (long c : coins) {
            r += v / c;
        }
        return r;
    }

    private long[] coins(int[] coins) {
        Arrays.sort(coins);
        int len = 1;
        a:
        for (int i = 1; i < coins.length; i++) {
            final int c = coins[i];
            for (int j = 0; j < len; j++) {
                if (c % coins[j] == 0) {
                    continue a;
                }
            }
            coins[len++] = c;
        }
        coins = Arrays.copyOf(coins, len);
        long[] res = new long[(1 << coins.length) - 1];
        iterate(coins, res, 1, 0, 0, true);
        return res;
    }

    private int iterate(int[] coins, long[] res, long mult, int start, int idx, boolean positive) {
        for (int i = start; i < coins.length; i++) {
            long next = mult * coins[i] / gcd(mult, coins[i]);
            res[idx++] = positive ? next : -next;
            idx = iterate(coins, res, next, i + 1, idx, !positive);
        }
        return idx;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
