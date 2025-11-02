package g3701_3800.s3733_minimum_time_to_complete_all_deliveries;

// #Medium #Weekly_Contest_474 #2025_11_02_Time_2_ms_(100.00%)_Space_44.04_MB_(_%)

public class Solution {
    private boolean func(long mid, int[] d, int[] r) {
        long lcm = (long) r[0] * r[1] / gcd(r[0], r[1]);
        long a1 = mid / r[0];
        long a2 = mid / r[1];
        long a3 = mid / lcm;
        long b = mid - a1 - a2 + a3;
        long o1 = a2 - a3;
        long o2 = a1 - a3;
        long d0 = Math.max(d[0] - o1, 0);
        long d1 = Math.max(d[1] - o2, 0);
        return b >= d0 + d1;
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public long minimumTime(int[] d, int[] r) {
        long lo = 0;
        long hi = (long) 1e12;
        long ans = Long.MAX_VALUE;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (func(mid, d, r)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
