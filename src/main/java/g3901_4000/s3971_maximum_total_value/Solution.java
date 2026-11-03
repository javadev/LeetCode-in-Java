package g3901_4000.s3971_maximum_total_value;

// #Hard #Array #Math #Greedy #Binary_Search #Senior_Staff #Weekly_Contest_507
// #2026_11_03_Time_19_ms_(100.00%)_Space_106.00_MB_(7.14%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;

    public int maxTotalValue(int[] value, int[] decay, int m) {
        if (getCount(value, decay, m, 0) < m) {
            return getSum(value, decay, m, 0);
        }
        int max = 0;
        for (int x : value) {
            max = Math.max(max, x);
        }
        int left = 1;
        int right = max;
        while (left <= right) {
            int mid = left + right >> 1;
            if (getCount(value, decay, m, mid) >= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return getSum(value, decay, m, right);
    }

    private long getCount(int[] value, int[] decay, int m, int limit) {
        int n = value.length;
        long count = 0;
        for (int i = 0; i < n; ++i) {
            int x = value[i];
            int d = decay[i];
            if (x >= limit) {
                count += (x - limit) / d + 1;
            }
            if (count >= m) {
                break;
            }
        }
        return count;
    }

    private int getSum(int[] value, int[] decay, long m, int limit) {
        int n = value.length;
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            int x = value[i];
            int d = decay[i];
            if (x <= limit) {
                continue;
            }
            long c = (x - limit - 1) / d + 1L;
            sum += c * (x + x - (c - 1) * d);
            m -= c;
        }
        sum >>= 1;
        sum += m * limit;
        return (int) (sum % MOD);
    }
}
