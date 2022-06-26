package g0801_0900.s0878_nth_magical_number;

// #Hard #Math #Binary_Search #2022_03_28_Time_0_ms_(100.00%)_Space_39_MB_(90.59%)

@SuppressWarnings("java:S3518")
public class Solution {
    private static final int MOD = 1_000_000_007;

    public int nthMagicalNumber(int n, int a, int b) {
        long c = lcm(a, b);
        long l = 2;
        long r = n * c;
        long ans = r;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long cnt = mid / a + mid / b - mid / c;
            if (cnt < n) {
                l = mid + 1;
            } else {
                ans = mid;
                r = mid - 1;
            }
        }
        return (int) (ans % MOD);
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {
        long t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
