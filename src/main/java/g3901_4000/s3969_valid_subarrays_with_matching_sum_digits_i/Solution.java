package g3901_4000.s3969_valid_subarrays_with_matching_sum_digits_i;

// #Medium #Array #Hash_Table #Prefix_Sum #Sliding_Window #Enumeration #Senior #Weekly_Contest_507
// #2026_11_03_Time_50_ms_(98.27%)_Space_46.22_MB_(95.95%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        if (x == 0) {
            return 0;
        }
        List<long[]> interval = new ArrayList<>();
        for (long p = 1; p <= pre[n]; p *= 10) {
            interval.add(new long[] {p * x, p * x + p - 1});
        }
        List[] isit = new List[10];
        for (int r = 0; r < 10; r++) {
            isit[r] = new ArrayList<>();
        }
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                long k = pre[i];
                int r = (int) (((k - x) % 10 + 10) % 10);
                List list = isit[r];
                for (long[] j : interval) {
                    long a = k - j[1];
                    long b = k - j[0];
                    if (b < 0) {
                        continue;
                    }
                    int high = upper(list, b);
                    int low = lower(list, a);
                    sum += high - low;
                }
            }
            isit[(int) (pre[i] % 10)].add(pre[i]);
        }
        return (int) sum;
    }

    private int lower(List<Long> list, long k) {
        int l = 0;
        int h = list.size();
        while (l < h) {
            int m = (l + h) >>> 1;
            if (list.get(m) < k) {
                l = m + 1;
            } else h = m;
        }
        return l;
    }

    private int upper(List<Long> list, long k) {
        int l = 0;
        int h = list.size();
        while (l < h) {
            int m = (l + h) >>> 1;
            if (list.get(m) <= k) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return l;
    }
}
