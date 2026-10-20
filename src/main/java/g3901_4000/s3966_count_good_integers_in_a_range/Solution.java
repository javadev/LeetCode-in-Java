package g3901_4000.s3966_count_good_integers_in_a_range;

// #Hard #Dynamic_Programming #Math #Senior_Staff #Biweekly_Contest_185
// #2026_10_20_Time_3_ms_(100.00%)_Space_42.43_MB_(100.00%)

public class Solution {
    private static final Long[][][][] DP = new Long[16][2][10][10];
    private final int[] digits = new int[16];

    public long goodIntegers(long l, long r, int k) {
        return calc(r, k) - calc(l - 1, k);
    }

    private long calc(long num, int k) {
        int len = 0;
        while (num > 0) {
            digits[len++] = (int) (num % 10);
            num /= 10;
        }
        return dfs(len - 1, 0, 1, true, k);
    }

    private long dfs(int index, int pre, int isLeadingZero, boolean isMaxDigit, int k) {
        if (index == -1) {
            return 1;
        }
        if (!isMaxDigit && DP[index][isLeadingZero][pre][k] != null) {
            return DP[index][isLeadingZero][pre][k];
        }
        int maxDigit = isMaxDigit ? digits[index] : 9;
        long result = 0;
        for (int d = 0; d <= maxDigit; d++) {
            if (isLeadingZero == 1 || Math.abs(d - pre) <= k) {
                result +=
                        dfs(
                                index - 1,
                                d,
                                isLeadingZero == 1 && d == 0 ? 1 : 0,
                                isMaxDigit && d == maxDigit,
                                k);
            }
        }
        if (!isMaxDigit) {
            DP[index][isLeadingZero][pre][k] = result;
        }
        return result;
    }
}
