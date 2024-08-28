package g3201_3300.s3266_final_array_state_after_k_multiplication_operations_ii;

// #Hard #2024_08_28_Time_26_ms_(100.00%)_Space_47_MB_(51.94%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if (multiplier == 1) {
            return nums;
        }
        int n = nums.length;
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        long[] a = new long[n];
        int left = k;
        boolean shouldExit = false;
        for (int i = 0; i < n && !shouldExit; i++) {
            long x = nums[i];
            while (x < mx) {
                x *= multiplier;
                if (--left < 0) {
                    shouldExit = true;
                    break;
                }
            }
            a[i] = x;
        }
        if (left < 0) {
            PriorityQueue<long[]> pq =
                    new PriorityQueue<>(
                            (p, q) ->
                                    p[0] != q[0]
                                            ? Long.compare(p[0], q[0])
                                            : Long.compare(p[1], q[1]));
            for (int i = 0; i < n; i++) {
                pq.offer(new long[] {nums[i], i});
            }
            while (k-- > 0) {
                long[] p = pq.poll();
                p[0] *= multiplier;
                pq.offer(p);
            }
            while (!pq.isEmpty()) {
                long[] p = pq.poll();
                nums[(int) p[1]] = (int) (p[0] % MOD);
            }
            return nums;
        }

        Integer[] ids = new Integer[n];
        Arrays.setAll(ids, i -> i);
        Arrays.sort(ids, (i, j) -> Long.compare(a[i], a[j]));
        k = left;
        long pow1 = pow(multiplier, k / n);
        long pow2 = pow1 * multiplier % MOD;
        for (int i = 0; i < n; i++) {
            int j = ids[i];
            nums[j] = (int) (a[j] % MOD * (i < k % n ? pow2 : pow1) % MOD);
        }
        return nums;
    }

    private long pow(long x, int n) {
        long res = 1;
        for (; n > 0; n /= 2) {
            if (n % 2 > 0) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
        }
        return res;
    }
}
