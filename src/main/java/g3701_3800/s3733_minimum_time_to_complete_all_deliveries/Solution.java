package g3701_3800.s3733_minimum_time_to_complete_all_deliveries;

// #Medium #Math #Binary_Search #Weekly_Contest_474
// #2025_11_05_Time_1_ms_(100.00%)_Space_44.16_MB_(55.61%)

public class Solution {
    private boolean pos(long k, long n1, long n2, int p1, int p2, long lVal) {
        long kP1 = k / p1;
        long kP2 = k / p2;
        long kL = k / lVal;
        long s1 = kP2 - kL;
        long s2 = kP1 - kL;
        long sB = k - kP1 - kP2 + kL;
        long w1 = Math.max(0L, n1 - s1);
        long w2 = Math.max(0L, n2 - s2);
        return (w1 + w2) <= sB;
    }

    private long findGcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }

    public long minimumTime(int[] d, int[] r) {
        long n1 = d[0];
        long n2 = d[1];
        int p1 = r[0];
        int p2 = r[1];
        long g = findGcd(p1, p2);
        long l = (long) p1 * p2 / g;
        long lo = n1 + n2;
        long hi = (n1 + n2) * Math.max(p1, p2);
        long res = hi;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (pos(mid, n1, n2, p1, p2, l)) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }
}
