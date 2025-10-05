package g3701_3800.s3704_count_no_zero_pairs_that_sum_to_n;

// #Hard #Weekly_Contest_470 #2025_10_05_Time_4_ms_(97.37%)_Space_41.07_MB_(100.00%)

public class Solution {
    public long countNoZeroPairs(long n) {
        int m = 0;
        long base = 1;
        while (base <= n) {
            m++;
            base = base * 10;
        }
        int[] digits = new int[m];
        long c = n;
        for (int i = 0; i < m; i++) {
            digits[i] = (int) (c % 10);
            c = c / 10;
        }

        long total = 0;
        long[] extra = {1, 0};
        base = 1;
        for (int p = 0; p < m; p++) {
            long[] nextExtra = {0, 0};
            for (int e = 0; e <= 1; e++) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        if ((i + j + e) % 10 == digits[p]) {
                            nextExtra[(i + j + e) / 10] += extra[e];
                        }
                    }
                }
            }
            extra = nextExtra;
            base = base * 10;
            for (int e = 0; e <= 1; e++) {
                long left = n / base - e;
                if (left < 0) {
                    continue;
                }
                if (left == 0) {
                    total += extra[e];
                } else if (isGood(left)) {
                    total += 2 * extra[e];
                }
            }
        }

        return total;
    }

    private boolean isGood(long num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
