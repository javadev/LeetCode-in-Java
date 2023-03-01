package g2301_2400.s2376_count_special_integers;

// #Hard #Dynamic_Programming #Math #2022_08_19_Time_0_ms_(100.00%)_Space_39.1_MB_(95.76%)

public class Solution {
    private int[] cntMap;
    // number n as an array, splitted by each digit
    private int[] digits;

    public int countSpecialNumbers(int n) {
        if (n < 10) {
            return n;
        }
        int len = (int) Math.log10(n) + 1;
        cntMap = new int[len - 1];
        int res = countUnbounded(len);
        digits = new int[len];
        for (int i = len - 1; i >= 0; i--, n /= 10) {
            digits[i] = n % 10;
        }
        return res + dfs(0, 0);
    }

    private int dfs(int i, int mask) {
        if (i == digits.length) {
            return 1;
        }
        int res = 0;
        for (int j = i == 0 ? 1 : 0; j < digits[i]; j++) {
            if ((mask & (1 << j)) == 0) {
                // unbounded lens left
                int unbounded = digits.length - 2 - i;
                res += unbounded >= 0 ? count(unbounded, 9 - i) : 1;
            }
        }
        if ((mask & (1 << digits[i])) == 0) {
            res += dfs(i + 1, mask | (1 << digits[i]));
        }
        return res;
    }

    private int count(int i, int max) {
        if (i == 0) {
            return max;
        }
        return (max - i) * count(i - 1, max);
    }

    private int countUnbounded(int len) {
        int res = 9;
        cntMap[0] = 9;
        for (int i = 0; i < len - 2; i++) {
            res += cntMap[i + 1] = cntMap[i] * (9 - i);
        }
        return res;
    }
}
