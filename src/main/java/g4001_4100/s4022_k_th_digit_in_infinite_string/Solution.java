package g4001_4100.s4022_k_th_digit_in_infinite_string;

// #Medium #Math #Binary_Search #Staff #Biweekly_Contest_189
// #2026_11_25_Time_2_ms_(88.89%)_Space_42.48_MB_(52.78%)

public class Solution {
    public int kthDigit(long k) {
        if (k <= 9) {
            return (int) k;
        }
        long remaining = k - 9;
        long power10 = 10;
        int d = 2;
        while (true) {
            long firstBlock = power10 / 10;
            long lastBlock = power10 - 1;
            long numberOfBlocks = lastBlock - firstBlock + 1;
            long digitsPerBlock = 10L * d;
            long groupDigits = numberOfBlocks * digitsPerBlock;
            if (remaining > groupDigits) {
                remaining -= groupDigits;
                power10 *= 10;
                d++;
                continue;
            }
            long zeroBased = remaining - 1;
            long blockOffset = zeroBased / digitsPerBlock;
            long positionInBlock = zeroBased % digitsPerBlock;
            long b = firstBlock + blockOffset;
            long numberIndex = positionInBlock / d;
            int digitIndex = (int) (positionInBlock % d);
            long number;
            if (b % 2 == 0) {
                number = 10 * b + numberIndex;
            } else {
                number = 10 * b + 9 - numberIndex;
            }
            long divisor = 1;
            for (int i = 0; i < d - 1 - digitIndex; i++) {
                divisor *= 10;
            }
            return (int) ((number / divisor) % 10);
        }
    }
}
