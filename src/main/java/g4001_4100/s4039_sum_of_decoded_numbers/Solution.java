package g4001_4100.s4039_sum_of_decoded_numbers;

// #Medium #Array #Math #Simulation #Staff #Weekly_Contest_517
// #2026_11_25_Time_48_ms_(99.45%)_Space_78.74_MB_(98.35%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private static final int N = 16;
    private static final long[] POW_10 = new long[N];

    public int sumDecoded(long[] nums) {
        if (POW_10[0] == 0) {
            POW_10[0] = 1;
            for (int i = 1; i < N; ++i) {
                POW_10[i] = POW_10[i - 1] * 10;
            }
        }
        long sum = 0;
        for (long num : nums) {
            int w = (int) (num % 10);
            long v = num / 10;
            int len = 1;
            while (v >= POW_10[len]) {
                len++;
            }
            long base = POW_10[len - w];
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
