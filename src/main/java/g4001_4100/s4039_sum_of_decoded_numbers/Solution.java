package g4001_4100.s4039_sum_of_decoded_numbers;

// #Medium #Array #Math #Simulation #Staff #Weekly_Contest_517
// #2026_11_25_Time_50_ms_(98.90%)_Space_78.76_MB_(98.35%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private static final int N = 16;
    private final long[] pow10 = new long[N];

    public int sumDecoded(long[] nums) {
        if (pow10[0] == 0) {
            pow10[0] = 1;
            for (int i = 1; i < N; ++i) {
                pow10[i] = pow10[i - 1] * 10;
            }
        }
        long sum = 0;
        for (long num : nums) {
            int w = (int) (num % 10);
            long v = num / 10;
            int len = 1;
            while (v >= pow10[len]) {
                len++;
            }
            long base = pow10[len - w];
            long x = v / base;
            long y = v % base;
            sum += pow(x, y);
        }
        return (int) (sum % MOD);
    }

    private long pow(long x, long n) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return result;
    }
}
