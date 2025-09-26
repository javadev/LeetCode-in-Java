package g3601_3700.s3677_count_binary_palindromic_numbers;

// #Hard #Math #Bit_Manipulation #Weekly_Contest_466
// #2025_09_26_Time_1_ms_(100.00%)_Space_40.82_MB_(77.82%)

public class Solution {
    private long makePalin(long left, boolean odd) {
        long ans = left;
        if (odd) {
            left = left >> 1;
        }
        while (left > 0) {
            ans = (ans << 1) | (left & 1);
            left = left >> 1;
        }
        return ans;
    }

    public int countBinaryPalindromes(long n) {
        if (n == 0) {
            return 1;
        }
        int len = 64 - Long.numberOfLeadingZeros(n);
        long count = 1;
        for (int i = 1; i < len; i++) {
            int half = (i + 1) / 2;
            count += 1L << (half - 1);
        }
        int half = (len + 1) / 2;
        long prefix = n >> (len - half);
        long palin = makePalin(prefix, len % 2 == 1);
        count += (prefix - (1L << (half - 1)));
        if (palin <= n) {
            ++count;
        }
        return (int) count;
    }
}
